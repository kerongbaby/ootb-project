package com.ootb.client.application.sms;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import com.google.gwt.json.client.JSONValue;

public interface SmsService extends RestService {
	@GET
	@Path("rest/sms/{limit}/{offset}/")
	@Produces("application/json")
	public void getSMS(@PathParam("limit") int limit,  @PathParam("offset") int offset,
			MethodCallback<JSONValue> callback);
}
