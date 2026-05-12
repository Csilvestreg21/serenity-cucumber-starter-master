package starter.tasks;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Task;

public class OpenPage {
    public static Task sauceDemo() {
        return Task.where("{0} abre la pagina",
                Open.url("https://www.saucedemo.com/")
        );
    }
}