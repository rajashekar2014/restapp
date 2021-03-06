package com.moksamedia.jerseytest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Root {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() { 
		return "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> "; 
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayTextHello() {
		return "Hello";
	}

}