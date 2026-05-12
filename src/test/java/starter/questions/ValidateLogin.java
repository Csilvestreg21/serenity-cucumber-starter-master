package starter.questions;

import net.serenitybdd.screenplay.Question;
import starter.ui.LoginPage;

public class ValidateLogin {

    public static Question<Boolean> success() {
        return actor -> LoginPage.LOGIN_BUTTON.resolveFor(actor).isVisible();
    }
}