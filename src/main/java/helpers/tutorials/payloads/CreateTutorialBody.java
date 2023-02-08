package helpers.tutorials.payloads;

import org.json.JSONObject;

import java.util.function.Supplier;

import static utils.TestUtils.*;

public class CreateTutorialBody {

    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";


    private static final Supplier<JSONObject> body = () -> {
        final JSONObject requestBody = new JSONObject();
        requestBody.put(TITLE, FAKER.book().title());
        requestBody.put(DESCRIPTION, FAKER.backToTheFuture().quote());
        return requestBody;
    };

    public static JSONObject bodyBuilder(){
        return body.get();
    }

}
