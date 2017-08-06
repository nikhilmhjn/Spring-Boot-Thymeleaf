package com.thymeleaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.thymeleaf.mapper.PersonMapper;
import com.thymeleaf.model.AccountRequest;
import com.thymeleaf.model.AccountResponse;
import com.thymeleaf.model.Person;
import com.thymeleaf.model.PersonDto;
import com.thymeleaf.service.AccountInfoService;

@Service
public class AccountInfoServiceImpl implements AccountInfoService{
	
	private RestTemplate restTemplate = new RestTemplate();

	@Value("${account.service.url}")
	private String url;

	@Autowired
	PersonMapper personMapper;
	@Override
	public Person getAccountInfo(String accountId) {
		PersonDto personDto = new PersonDto();
		Person person = new Person();
		try {
			AccountRequest request = new AccountRequest();
			request.setAccountId(accountId);
			AccountResponse response = restTemplate.postForObject(url, request, AccountResponse.class);
			personDto = personMapper.map(response, PersonDto.class);
			person = personMapper.map(personDto, Person.class);
			System.out.println(response);
		}catch(Exception e) {
			e.printStackTrace();
		}
 		return person;	
	}
}
