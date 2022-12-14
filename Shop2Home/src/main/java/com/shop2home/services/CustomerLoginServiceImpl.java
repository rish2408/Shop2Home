package com.shop2home.services;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop2home.exceptions.LoginException;
import com.shop2home.models.CurrentCustomerSession;
import com.shop2home.models.Customer;
import com.shop2home.models.CustomerLoginDTO;
import com.shop2home.repositories.CustomerDao;
import com.shop2home.repositories.CustomerSessionDao;

import net.bytebuddy.utility.RandomString;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	private CustomerDao cDao;

	@Autowired
	private CustomerSessionDao sDao;

	@Override
	public String logIntoAccount(CustomerLoginDTO dto) throws LoginException {

		Customer existingCustomer = cDao.findByEmail(dto.getEmail());

		if (existingCustomer == null) {

			throw new LoginException("Please Enter a valid Email");

		}

		Optional<CurrentCustomerSession> validCustomerSessionOpt = sDao.findById(existingCustomer.getCustomerId());

		if (validCustomerSessionOpt.isPresent()) {

			throw new LoginException("User already Logged In with this Email");

		}

		if (existingCustomer.getPassword().equals(dto.getPassword())) {

			String key = RandomString.make(6);

			CurrentCustomerSession currentUserSession = new CurrentCustomerSession(existingCustomer.getCustomerId(),
					key, LocalDateTime.now());

			sDao.save(currentUserSession);

			return currentUserSession.toString();
		} else
			throw new LoginException("Please Enter a valid password");

	}

	@Override
	public String logOutFromAccount(String key) throws LoginException {

		CurrentCustomerSession validCustomerSession = sDao.findByUuid(key);

		if (validCustomerSession == null) {
			throw new LoginException("User Not Logged In with this Email");

		}

		sDao.delete(validCustomerSession);

		return "Logged Out !";

	}

}
