package helpers;

import configs.Config;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseApiHelper {

    protected static RequestSpecification setupSpec(final String basePath){
        return new RequestSpecBuilder()
                .setBaseUri(Config.BASE_URI)
                .setBasePath(basePath)
                .setContentType(ContentType.JSON)
                .build();
    }


}
