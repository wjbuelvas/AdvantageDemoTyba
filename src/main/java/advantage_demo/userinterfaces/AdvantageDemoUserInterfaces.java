package advantage_demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdvantageDemoUserInterfaces {
  public static final Target LBL_USERNAME =
      Target.the("Campo Username")
          .locatedBy("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input");

  public static final Target LBL_EMAIL =
      Target.the("Campo Email")
          .locatedBy("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input");

  public static final Target LBL_PASSWORD =
      Target.the("Campo Password")
          .locatedBy("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input");

  public static final Target LBL_PASSWORD_CONFIRM =
      Target.the("Campo Password Confirm")
          .locatedBy("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input");

  public static final Target LBL_FIRSTNAME =
      Target.the("Campo Firstname")
          .locatedBy("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input");

  public static final Target LBL_LASTNAME =
      Target.the("Campo Lastname")
          .locatedBy("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input");

  public static final Target LBL_PHONENUMBER =
      Target.the("Campo PhoneNumber")
          .locatedBy("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input");

  public static final Target LIST_COUNTRY =
      Target.the("Campo Country")
          .locatedBy("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select");

  public static final Target LBL_CITY =
      Target.the("Campo City")
          .locatedBy("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input");

  public static final Target LBL_ADDRESS =
      Target.the("Campo Address")
          .locatedBy("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input");

  public static final Target LBL_STATE =
      Target.the("Campo State")
          .locatedBy("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input");

  public static final Target LBL_POSTAL =
      Target.the("Campo Postal code")
          .locatedBy("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input");

  public static final Target CHK_AGREE =
      Target.the("Check acuerdo").locatedBy("//*[@id=\"formCover\"]/sec-view/div/input");

  public static final Target BTN_REGISTER =
      Target.the("Botón Registrar").locatedBy("//button[@id=\"register_btnundefined\"]");

  public static final Target LBL_USER =
      Target.the("Label usuario").locatedBy("//*[@id=\"menuUserLink\"]/span");

  private AdvantageDemoUserInterfaces() {}
}
