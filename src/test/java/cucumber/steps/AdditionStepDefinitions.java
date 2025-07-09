package cucumber.steps;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionStepDefinitions {

    Integer actualResult;

    // just to hold values passed by step
    Integer i1, i2;

    @Given("two integers {int} and {int}")
    public void givenTwoIntegers(Integer i1, Integer i2) {
        // save values passed
        this.i1 = i1;
        this.i2 = i2;
        // received correct params
        System.out.println("Taking the integers: " + i1 + " and " + i2);
    }

    @When("I add them")
    public void whenAddingThem() {
        // performing addition
        System.out.println("And adding them");
        // add i1 and i2
        actualResult = i1+i2;
    }

    @Then("I get {int}")
    public void thenResultIs(int expected) {
        // assert addition produces correct result
        assertEquals(actualResult, i1+i2);
        // print result
        System.out.println("Gives us: " + expected);
    }

}

