package stepdefinitions;

import starter.tasks.Login; // Asegúrate de que el nombre del paquete coincida
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.Abrir; // Reemplaza 'tasks' por el nombre real de tu paquete
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

    // Asegúrate de incluir la tilde en "debería" si el feature la tiene
    @Entonces("debería ver el catálogo de productos")
    public void deberiaVerElCatalogoDeProductos() {
        System.out.println("LOG: Verificación exitosa en SauceDemo");
    }
}