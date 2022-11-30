package com.shop2home.services;

import com.shop2home.exceptions.LoginException;
import com.shop2home.models.CustomerLoginDTO;

public interface CustomerLoginService {

	public String logIntoAccount(CustomerLoginDTO dto) throws LoginException;

	public String logOutFromAccount(String key) throws LoginException;

}
