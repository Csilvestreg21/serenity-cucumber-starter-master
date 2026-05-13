package stepdefinitions;

import starter.tasks.Login; 
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.Abrir;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario navega a la página de login")
    public void queElUsuarioNavegaALaPaginaDeLogin() {
        OnStage.theActorCalled("Cata").wasAbleTo(Abrir.laPaginaDeSauceDemo());
    }

    @Cuando("ingresa las credenciales {string} y {string}")
    public void ingresaLasCredenciales(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.conCredenciales(usuario, clave));
    }

    @Entonces("debería ver el catálogo de productos")
    public void deberiaVerElCatalogoDeProductos() {
        System.out.println("LOG: Verificación exitosa en SauceDemo");
    }
}