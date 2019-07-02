package exception;

/**
 * @author yangc
 * @date 2019/7/2
 * @desc
 */
public class InvalidExpressionExceptions extends Exception{
  private static final long serialVersionUID = 1L;

  public InvalidExpressionExceptions(String expression) {
    super(String.format("Invalid expression: '%s'.", expression));
  }
}
