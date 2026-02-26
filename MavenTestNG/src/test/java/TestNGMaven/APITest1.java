package TestNGMaven;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITest1 {

    // 1️⃣ GET Single Product
    @Test
    public void getSingleProduct() {

        get("https://dummyjson.com/products/2")
        .then()
        .statusCode(200)
        .body("id", equalTo(2));
    }

    // 2️⃣ GET All Products
    @Test
    public void getAllProducts() {

        get("https://dummyjson.com/products")
        .then()
        .statusCode(200)
        .body("products.size()", greaterThan(0));
    }

    // 3️⃣ POST - Create Product
    @Test
    public void createProduct() {

        given()
        .header("Content-Type", "application/json")
        .body("{ \"title\": \"New Product\" }")
        .when()
        .post("https://dummyjson.com/products/add")
        .then()
        .statusCode(200)
        .body("title", equalTo("New Product"));
    }

    // 4️⃣ PUT - Update Product
    @Test
    public void updateProduct() {

        given()
        .header("Content-Type", "application/json")
        .body("{ \"title\": \"Updated Product\" }")
        .when()
        .put("https://dummyjson.com/products/2")
        .then()
        .statusCode(200)
        .body("title", equalTo("Updated Product"));
    }

    // 5️⃣ DELETE Product
    @Test
    public void deleteProduct() {

        delete("https://dummyjson.com/products/2")
        .then()
        .statusCode(200)
        .body("isDeleted", equalTo(true));
    }
}
