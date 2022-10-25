package advantage_demo.exceptions;

public class FailedGetTextException extends AssertionError {

  public static final String FAILED_GET_TEXT = "El usuario a encontrado no corresponde al esperado";

  public FailedGetTextException(String message, Throwable cause) {
    super(message, cause);
  }
}
