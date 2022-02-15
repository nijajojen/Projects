package com.api.test.item;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class CreateItems {

	

	@Test
	public void createItem() {
		RestAssured.baseURI="http://localhost:8080/version/namespace/items";
		RequestSpecification httpRequest= RestAssured.given();
		
		JSONObject requestParams= new JSONObject();
		requestParams.put("itemName", "Balloon");
		requestParams.put("itemPrice", "5");
		httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		
		Response response= httpRequest.post();
		int statusCode= response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		
//Validate if Response Body Contains a Specific String
		ResponseBody body= response.getBody();
		String  bodyValue= body.asString();
		System.out.println(bodyValue);
		//Assert.assertTrue(bodyValue.contains("Dream Catcher"), "The body contains item Dream Catcher");
		
		
//Validate Specific JSON Element
		JsonPath jsonPathEval= response.jsonPath();
		String itemName= jsonPathEval.get("itemName");
		//Assert.assertTrue(itemName.equals("Dream Catcher"), "itemName is not required one"); 

//	Testing header
		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: " + contentType);
		
		String serverType= response.header("Server");
		System.out.println("serverValue "+serverType);
		
		String acceptLanguage= response.header("Content-Encoding");
		System.out.println("acceptLanguage:"+acceptLanguage);
	}
	
	@Test
	public void getItem() {
		RestAssured.baseURI="http://localhost:8080/version/namespace/items";
		
		RequestSpecification httprequest= RestAssured.given();
		Response response= httprequest.get("/1");
		ResponseBody respBody=response.getBody();
		System.out.println(respBody.asString());
		
		
		
	}
	
	
}
