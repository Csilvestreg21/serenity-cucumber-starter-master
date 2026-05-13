package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.SauceDemoHomePage;

public class Abrir implements Task {
    private SauceDemoHomePage sauceDemoPage;

    public static Abrir laPaginaDeSauceDemo() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(sauceDemoPage));
    }
}