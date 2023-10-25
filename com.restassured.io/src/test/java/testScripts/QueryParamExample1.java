package testScripts;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParamExample1 {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1";

		RequestSpecification httpRequest = RestAssured.given();

		Response httpResponce = httpRequest.queryParam("ISBN", "9781449325862").get("/Book");

		System.out.println(httpResponce.statusCode());

		String body = httpResponce.getBody().prettyPrint();

		System.out.println(body);
		
		JsonPath jsonpathEvalutor = httpResponce.jsonPath();
		System.out.println(jsonpathEvalutor.get("pages"));

	}

}
