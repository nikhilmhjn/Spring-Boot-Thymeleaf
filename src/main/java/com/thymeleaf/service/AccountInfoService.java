package com.thymeleaf.service;

import com.thymeleaf.model.Person;

public interface AccountInfoService {
	Person getAccountInfo(String accountId);
}
