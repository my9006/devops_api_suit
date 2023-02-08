package tutorials;

import helpers.tutorials.TutorialsHelper;
import helpers.tutorials.payloads.CreateTutorialBody;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.apache.http.HttpStatus.*;
import static org.hamcrest.Matchers.*;
public class CreateTutorialsTest {

    @Test
    public void createTutorial(){
        final JSONObject body = CreateTutorialBody.bodyBuilder();
        TutorialsHelper.addTutorial(body)
                .then()
                .statusCode(SC_OK)
                .body("title", is(body.getString(CreateTutorialBody.TITLE)))
                .body("description", is(body.getString(CreateTutorialBody.DESCRIPTION)));
    }

}
