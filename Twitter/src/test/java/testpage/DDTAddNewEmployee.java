package testpage;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DDTAddNewEmployee {
    @Test
    void postNewEmployees(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

        RequestSpecification httpReqeust = RestAssured.given();


        //Here we created data that we can send along with teh post request.
        JSONObject requestParams = new JSONObject();

        requestParams.put("name", "SeemaDevi");
        requestParams.put("salary", "100");
        requestParams.put("age", "30");

        //Add a header stating the request body is a JSON
        httpReqeust.header("Content-Type", "application/json");

        //Add the JSON to the body of the request
        httpReqeust.body(requestParams.toJSONString());

        //Post Request
        Response response = httpReqeust.request(Method.POST,"/create");

        //Capturing the response body ot perform validation
        String responseBody= response.getBody().asString();

        Assert.assertEquals(responseBody.contains("Devi"), true);
        Assert.assertEquals(responseBody.contains("100"), true);
        Assert.assertEquals(responseBody.contains("30"), true);

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }
}
