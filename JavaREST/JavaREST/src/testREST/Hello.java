package testREST;


import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import javax.ws.rs.core.Response;


/*
@Path(value = "hello")

public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML()
	{
		String resource = "<? xml version'1.0' ?>" + "<hello> Hey Kartik, This is XML block!</hello>";

		return resource;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON()
	{
		String resource = null;
	    	
		return resource;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML()
	{
		String resource = "<h1> Hey Kartik, This is XML block!</h1>";
	    	
		return resource;
	}*/
	
	@Path("/users")
	public class Hello {

		@GET
		public Response getUser() {

			return Response.status(200).entity("getUser is called").build();

		}

		@GET
		@Path("/vip")
		public Response getUserVIP() {

			return Response.status(200).entity("getUserVIP is called").build();

		}
	
	
	
}
