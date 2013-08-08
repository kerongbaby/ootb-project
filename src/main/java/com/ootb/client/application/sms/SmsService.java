package com.ootb.client.application.sms;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import com.google.gwt.json.client.JSONValue;

public interface SmsService extends RestService {
	@GET
	@Path("rest/sms/{limit}/{offset}/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void getSMS(@PathParam("limit") int limit,  @PathParam("offset") int offset,
			MethodCallback<JSONValue> callback);
}
