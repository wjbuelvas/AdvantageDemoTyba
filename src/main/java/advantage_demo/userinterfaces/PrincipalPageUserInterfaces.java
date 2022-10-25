package advantage_demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPageUserInterfaces {

  public static final Target POPULAR_ITEMS =
      Target.the("Opcion Popular Items")
          .locatedBy("//*[@class='nav-li-Links'][contains(.,'POPULAR ITEMS')]");
  public static final Target USER_BUTTON =
      Target.the("Opcion User").locatedBy("//*[@id='menuUser']");

  public static final Target OPC_CREATE_NEW_ACCOUNT =
      Target.the("Opcion crear nueva cuenta")
          .locatedBy("//*[@class='create-new-account ng-scope'][contains(.,'CREATE NEW ACCOUNT')]");
  public static final Target LBL_USER =
      Target.the("Label usuario").locatedBy("//*[@id=\"menuUserLink\"]/span");

  private PrincipalPageUserInterfaces() {}
}
