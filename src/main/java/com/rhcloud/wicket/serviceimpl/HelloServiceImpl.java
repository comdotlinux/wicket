package com.rhcloud.wicket.serviceimpl;

import org.springframework.stereotype.Service;

import com.rhcloud.wicket.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String getMessage() {
		return "String : Hello world";
	}

}
