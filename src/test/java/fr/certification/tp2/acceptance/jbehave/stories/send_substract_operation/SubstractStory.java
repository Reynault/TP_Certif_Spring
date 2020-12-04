package fr.certification.tp2.acceptance.jbehave.stories.send_substract_operation;

import fr.certification.tp2.acceptance.steps.OperationsControllerSteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import net.thucydides.core.annotations.Steps;

public class SubstractStory {
    @Steps
    private OperationsControllerSteps operationsControllerSteps;

    @Given("the user is on the form page")
    public void givenTheUserIsOnTheFormPage(){
    }

    @When("I substract two numbers $a and $b")
    public void whenAddingTwoNumbers(int a, int b){
        operationsControllerSteps.whenSubstract(a, b);
    }

    @Then("I get a substraction result")
    public void thenIGetTheSum(){
        operationsControllerSteps.substractUp();
    }
}
