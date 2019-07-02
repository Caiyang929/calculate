package exception;

/**
 * @author yangc
 * @date 2019/7/2
 * @desc
 */
public class UnknownOperatorExceptions extends Exception{
  private static final long serialVersionUID = 1L;

  public UnknownOperatorExceptions(char operator) {
    super(String.format("'%c' is not a valid operator.", operator));
  }
}
