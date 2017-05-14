package com.vektorel.rest;

import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/merhaba")
public class Merhaba {
	
	
	@GET
	@Path("/selamcak")
	@Produces(MediaType.TEXT_PLAIN)
	public String selamCak(){
		return "merhaba";
	}
	
	@GET
	@Path("/selamcak/{param1}/{param2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String toplama(@PathParam("param1") String veri1, 
			@PathParam("param2") String veri2){
		int toplam = Integer.parseInt(veri1) + Integer.parseInt(veri2); 
		return String.valueOf(toplam);
	}
	
	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public String person(){
		List<Person> myList = new ArrayList<>();
		Person person = new Person(1, "mustafa");
		myList.add(person);
		myList.add(person);
		Gson son = new Gson();
		String json = son.toJson(myList);
//		String s = {"id":+id}
		return json;
	}

}
