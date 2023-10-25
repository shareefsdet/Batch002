package testScripts;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetRequestExample1 {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";

		RequestSpecification httpRequest = RestAssured.given();

		Response httpResponce = httpRequest.request(Method.GET, "");

		System.out.println(httpResponce.getStatusCode());

		System.out.println(httpResponce.getStatusLine());

		Headers allHeaders = httpResponce.getHeaders();

		for (Header header : allHeaders) {
			System.out.println(header);
		}

//		System.out.println(httpResponce.prettyPrint());

		ResponseBody body = httpResponce.getBody();
		System.out.println(body.asString());

		JsonPath val = httpResponce.jsonPath();
		System.out.println(val.get("title"));

	}

}
