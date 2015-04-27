package org.first.market.server.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/app")  
public class AppRestApi {
	@GET
	@Path("/list")
	public String list() {
		return "123";
	}
}
