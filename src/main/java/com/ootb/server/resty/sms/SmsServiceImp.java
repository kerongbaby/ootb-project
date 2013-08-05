package com.ootb.server.resty.sms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SmsServiceImp  {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public void getSMS() {
		System.out.println("Call getSMS");
	}

}
