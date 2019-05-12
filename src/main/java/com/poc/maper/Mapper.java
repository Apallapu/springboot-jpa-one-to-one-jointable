package com.poc.maper;

import org.springframework.stereotype.Component;

import com.poc.model.Address;
import com.poc.model.User;
import com.poc.model.UserRequest;

@Component
public class Mapper {

	public User createUser(UserRequest userRequest) {
		User user = new User();
		user.setAge(userRequest.getAge());
		user.setName(userRequest.getName());
		user.setAddress(createAddressList(userRequest, user));
		return user;
	}

	private Address createAddressList(UserRequest userRequest, User user) {
		Address addresses =new Address();
		addresses.setName(userRequest.getName());
		return addresses;
	}

	
}
