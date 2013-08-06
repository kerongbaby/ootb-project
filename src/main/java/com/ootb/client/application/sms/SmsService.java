package com.ootb.client.application.sms;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

public interface SmsService extends RestService {
	@GET
	@Path("rest/sms/{limit}/{offset}/")
	public void getSMS(@PathParam("limit") int limit,  @PathParam("offset") int offset, MethodCallback<String> callback);
}
