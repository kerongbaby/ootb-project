package com.ootb.client.application.restdispatch;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.gwtplatform.dispatch.shared.Action;
import com.gwtplatform.dispatch.shared.NoResult;
import com.gwtplatform.dispatch.shared.rest.RestService;

interface SmsService extends RestService {
	@GET
	@Path("/sms/{limit}/{offsert}")
	public  Action<NoResult> getSMS(@QueryParam("limit") int limit, @QueryParam("offset") int offset);
}
