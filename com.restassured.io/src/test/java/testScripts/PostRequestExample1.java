package testScripts;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestExample1 {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

		RequestSpecification httpRequest = RestAssured.given();

		JSONObject payloadBody = new JSONObject();
		payloadBody.put("userId", "test_shareef");
		payloadBody.put("isbn", "123456789");

		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(payloadBody.toJSONString());

		Response httpResponce = httpRequest.post("/BookStoreV1BooksPost");

		System.out.println(httpResponce.getStatusCode());

		System.out.println(httpResponce.getStatusLine());

	}

}
