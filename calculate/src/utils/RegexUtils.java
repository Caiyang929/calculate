package utils;

import java.util.regex.Pattern;

/**
 * @author yangc
 * @date 2019/7/2
 * @desc
 */
public class RegexUtils {
  private final static Pattern PATTERN = Pattern.compile("^(-?\\d+)(\\.\\d+)?$");

  public static boolean isValue(String str){
    return PATTERN.matcher(str).matches();
  }
}
