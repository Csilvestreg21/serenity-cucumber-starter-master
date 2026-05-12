package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginStepDefinitions {

    @Dado("que el usuario está en la página de inicio")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        System.out.println("LOG: El usuario llegó a la página");
    }

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales() {
        System.out.println("LOG: El usuario ingresó usuario y contraseña");
    }

    @Entonces("deberia ver el titulo de la pagina de productos")
    public void deberiaVerElTituloDeLaPaginaDeProductos() {
        System.out.println("LOG: Verificación exitosa");
    }
}