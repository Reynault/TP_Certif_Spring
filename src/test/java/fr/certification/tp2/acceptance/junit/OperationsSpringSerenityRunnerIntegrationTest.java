package fr.certification.tp2.acceptance.junit;

import fr.certification.tp2.acceptance.steps.OperationsControllerSteps;
import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringIntegrationSerenityRunner.class)
public class OperationsSpringSerenityRunnerIntegrationTest {
    @Steps
    private OperationsControllerSteps steps;

    @Test
    public void given_a_10_and_a_5_when_add_then_right_sum() {
        // WHEN
        steps.whenAdd(10, 5);
        // THEN
        steps.addUp();
    }

    @Test
    public void given_a_10_and_a_5_when_divide_then_right_divide() {
        // WHEN
        steps.whenDivide(10, 5);
        // THEN
        steps.divideUp();
    }

    @Test
    public void given_a_10_and_a_0_when_divide_then_division_error() {
        // WHEN
        steps.whenDivide(10, 0);
        // THEN
        steps.divideByZero();
    }

    @Test
    public void given_a_10_and_a_5_when_subtract_then_right_subtract() {
        // WHEN
        steps.whenSubstract(10, 5);
        // THEN
        steps.substractUp();
    }

    @Test
    public void given_a_10_and_a_5_when_multiply_then_right_multiply() {
        // WHEN
        steps.whenMultiply(10, 5);
        // THEN
        steps.multiplyUp();
    }
}
