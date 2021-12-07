package tests;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.context.TestContext;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import org.testng.annotations.Test;

public class FirstTestGetUser extends TestNGCitrusTestRunner {

    @Test(description = "Получение информации о пользователе", enabled = true)
    @CitrusTest
    public void getTestActions() {
        TestContext context = citrus.createTestContext();

        context.setVariable("value", "superValue");
        echo("Property \"value\" = " + context.getVariable("value"));

        echo("We used userId = " + context.getVariable("userId"));
        echo("Property \"userId\" = " + "${userId}");

        variable("now", "citrus:currentDate()");
        echo("Today is: ${now}");


    }

}
