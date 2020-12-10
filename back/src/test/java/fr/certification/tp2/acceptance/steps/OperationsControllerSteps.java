package fr.certification.tp2.acceptance.steps;

import fr.certification.tp2.service.OperationsService;
import io.restassured.path.json.JsonPath;
import org.springframework.test.context.ContextConfiguration;

import static io.restassured.RestAssured.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration(classes = OperationsService.class)
public class OperationsControllerSteps {

    private int a;
    private int b;
    private int c;
    private boolean error;

    public void whenAdd(int a, int b) {
        JsonPath response = when().get("/adder/add?a=" + a + "&b=" + b).getBody().jsonPath();
        extractResponse(response);
    }

    public void whenDivide(int a, int b) {
        JsonPath response = when().get("/adder/divide?a=" + a + "&b=" + b).getBody().jsonPath();
        extractResponse(response);
    }

    public void whenSubstract(int a, int b) {
        JsonPath response = when().get("/adder/substract?a=" + a + "&b=" + b).getBody().jsonPath();
        extractResponse(response);
    }

    public void whenMultiply(int a, int b) {
        JsonPath response = when().get("/adder/multiply?a=" + a + "&b=" + b).getBody().jsonPath();
        extractResponse(response);
    }

    public void addUp() {
        assertEquals(a + b, c);
    }

    public void divideUp() {
        assertEquals(a / b, c);
    }

    public void divideByZero() {
        assertTrue(error);
    }

    public void substractUp() {
        assertEquals(a - b, c);
    }

    public void multiplyUp() {
        assertEquals(a * b, c);
    }

    private void extractResponse(JsonPath response){
        if (response.get("a") != null && response.get("b") != null && response.get("c") != null) {
            this.a = response.get("a");
            this.b = response.get("b");
            this.c = response.get("c");
        }
        if(response.get("error") != null){
            this.error = true;
        }
    }
}
