package exception;

/**
 * @author yangc
 * @date 2019/7/2
 * @desc 数值格式异常
 */
public class NumberFormatExceptions extends Exception{
  private static final long serialVersionUID = 1L;

  public NumberFormatExceptions(String numberString) {
    super(String.format("'%s' is not a valid floating-point number.", numberString));
  }
}
