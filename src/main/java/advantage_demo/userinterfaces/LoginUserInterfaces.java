package advantage_demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUserInterfaces {

    public static final Target LBL_USERNAME =
            Target.the("Opción campo username").locatedBy("//input[@name='username']");

    public static final Target LBL_PASSWORD =
            Target.the("Opción campo password").locatedBy("//input[@name='password']");

    public static final Target BTN_SING_IN =
            Target.the("Botón iniciar sesión")
                    .locatedBy("//button[@id='sign_in_btnundefined']");

    private LoginUserInterfaces() {
    }
}
