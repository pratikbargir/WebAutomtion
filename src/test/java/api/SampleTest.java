package api;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SampleTest {
    @Test
    public void testGetUsers() {

        RestAssured.baseURI = "https://reqres.in";

        given()
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(401)
                .body("page", equalTo(null));

    }
}
