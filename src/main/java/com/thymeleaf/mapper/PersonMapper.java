package com.thymeleaf.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

import org.springframework.stereotype.Component;

import com.thymeleaf.model.AccountResponse;
import com.thymeleaf.model.PersonDto;

@Component
public class PersonMapper extends ConfigurableMapper {	
	public void configure(MapperFactory factory) {
		factory.classMap(AccountResponse.class, PersonDto.class)
	    .field("accountInfo.firstName", "firstName")
	    .field("accountInfo.middleName", "middleName")
	    .field("accountInfo.lastName", "lastName")
	    
	    /**
	     * We can add customer mapper as below
	     */
	    /*.customize(new CustomMapper<AccountResponse, PersonDto>() {
	    		public void mapAtoB(AccountResponse response, PersonDto personDto){
	    			personDto.setStates(Arrays.asList(StateEnum.values()).stream().filter
	    					(
	    						state -> (personDto.getCountry().equals(state.getCountryCode()))
	    					).collect(Collectors.toList()));
	    		}
	    })*/
	    .mapNulls(false)
	    .byDefault()
	    .register();
	}
}
