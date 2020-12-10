package fr.certification.tp2.acceptance.jbehave.stories.send_divide_operation;

import fr.certification.tp2.acceptance.steps.OperationsControllerSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DivideStory {
    @Steps
    private OperationsControllerSteps operationsControllerSteps;

    @Given("the user is on the form page")
    public void givenTheUserIsOnTheFormPage() {
    }

    @When("I divide two numbers $a and $b")
    public void whenDividingTwoNumbers(int a, int b) {
        operationsControllerSteps.whenDivide(a, b);
    }

    @Then("I get a division result")
    public void thenIGetTheResult() {
        operationsControllerSteps.divideUp();
    }

    @Then("I get a division error")
    public void thenIGetTheError() {
        operationsControllerSteps.divideByZero();
    }
}
