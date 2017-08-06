package com.thymeleaf.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thymeleaf.enums.StateEnum;
import com.thymeleaf.model.Person;
import com.thymeleaf.service.AccountInfoService;

@Controller
public class PersonController {
	@Autowired
	AccountInfoService accountInfoService;

	@RequestMapping("/")
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public String getAccountInfo(Model model, 
								@RequestParam(value = "accountId", required = true) String accountId){

		Person person = accountInfoService.getAccountInfo(accountId);
		model.addAttribute("person", person);			
		return "index";
	}
	
	/**
	 * 
	 * @param country
	 * @return
	 */
	@RequestMapping(value = "/states")
    @ResponseBody
	public String getStates(@RequestParam String country) {
		StringBuilder option = new StringBuilder();
		Arrays.asList(StateEnum.values())
				.stream()
				.filter(state -> (country.equals(state.getCountryCode())))
				.forEach(
						state -> option.append("<option value = '"
								+ state.getCode() + "' >" + state.getState()
								+ "</option>"));
		System.out.println(option.toString());
		return option.toString();
	}	
}
