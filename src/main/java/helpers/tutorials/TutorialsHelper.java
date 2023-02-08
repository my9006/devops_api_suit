package helpers.tutorials;

import helpers.BaseApiHelper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;

public class TutorialsHelper extends BaseApiHelper {

    private final static RequestSpecification spec = setupSpec("tutorials/");

    public static Response addTutorial(final JSONObject body){
        return given()
                .spec(spec)
                .body(body.toString())
                .post();
    }

}
