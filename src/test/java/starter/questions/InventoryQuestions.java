package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class InventoryQuestions {

    // Este es el localizador del texto "Products" que sale después de loguearse
    public static final Target TITLE = Target.the("título de la página de inventario")
            .locatedBy(".title");

    public static Question<String> value() {
        return actor -> Text.of(TITLE).answeredBy(actor);
    }
}