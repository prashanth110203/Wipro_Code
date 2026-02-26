package TestNGMaven;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITest {

    @Test
    public void getUserTest() {

        get("https://dummyjson.com/products/2")
        
        .then()
        .statusCode(200)
        .body("id", equalTo(2));
    }
}
