package fr.certification.tp2.acceptance.jbehave.stories.send_multiply_operation;

import fr.certification.tp2.acceptance.steps.OperationsControllerSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MultiplyStory {
    @Steps
    private OperationsControllerSteps operationsControllerSteps;

    @Given("the user is on the form page")
    public void givenTheUserIsOnTheFormPage() {
    }

    @When("I multiply two numbers $a and $b")
    public void whenAddingTwoNumbers(int a, int b) {
        operationsControllerSteps.whenMultiply(a, b);
    }

    @Then("I get a multiplication result")
    public void thenIGetTheSum() {
        operationsControllerSteps.multiplyUp();
    }
}
