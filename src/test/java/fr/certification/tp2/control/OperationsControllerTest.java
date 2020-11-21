package fr.certification.tp2.control;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

@SpringBootTest
class OperationsControllerTest {

    @Test
    void add_success() {
        // Prepare data
        int a = 5;
        int b = 3;
        int c = a + b;

        // test
        when().get("/adder/add?a=" + a + "&b=" + b).then().assertThat()
                .body("c", equalTo(c));
    }

    @Test
    void divide_success() {
        // Prepare data
        int a = 4;
        int b = 2;
        int c = a / b;

        // test
        when().get("/adder/divide?a=" + a + "&b=" + b).then().assertThat()
                .body("c", equalTo(c));
    }

    @Test
    void divide_by_zero() {
        // Prepare data
        int a = 5;
        int b = 0;

        // test
        when().get("/adder/divide?a=" + a + "&b=" + b).then().assertThat()
            .body("error", equalTo("Division by Zero"));
    }

    @Test
    void substract_success() {
        // Prepare data
        int a = 5;
        int b = 3;
        int c = a - b;

        // test
        when().get("/adder/substract?a=" + a + "&b=" + b).then().assertThat()
                .body("c", equalTo(c));
    }

    @Test
    void multiply_success() {
        // Prepare data
        int a = 5;
        int b = 3;
        int c = a * b;

        // test
        when().get("/adder/multiply?a=" + a + "&b=" + b).then().assertThat()
                .body("c", equalTo(c));
    }
}