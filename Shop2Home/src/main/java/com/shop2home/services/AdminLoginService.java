package com.shop2home.services;

import com.shop2home.exceptions.LoginException;
import com.shop2home.models.AdminLoginDTO;

public interface AdminLoginService {

	public String logIntoAccount(AdminLoginDTO dto) throws LoginException;

	public String logOutFromAccount(String key) throws LoginException;

}
