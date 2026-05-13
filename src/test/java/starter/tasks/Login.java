package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Login implements Task {

    private final String usuario;
    private final String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Login conCredenciales(String usuario, String clave) {
        return Tasks.instrumented(Login.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(usuario).into(By.id("user-name")),
            Enter.theValue(clave).into(By.id("password")),
            Click.on(By.id("login-button"))
        );
    }
}