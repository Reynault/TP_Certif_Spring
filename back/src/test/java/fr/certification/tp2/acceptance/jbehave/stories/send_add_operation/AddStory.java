package fr.certification.tp2.acceptance.jbehave.stories.send_add_operation;

import fr.certification.tp2.acceptance.steps.OperationsControllerSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AddStory {
    @Steps
    private OperationsControllerSteps operationsControllerSteps;

    @Given("the user is on the form page")
    public void givenTheUserIsOnTheFormPage() {
    }

    @When("I add two numbers $a and $b")
    public void whenAddingTwoNumbers(int a, int b) {
        operationsControllerSteps.whenAdd(a, b);
    }

    @Then("I get an addition result")
    public void thenIGetAResult() {
        operationsControllerSteps.addUp();
    }
}
