package interview.socar;

import java.util.ArrayList;
import java.util.Stack;

public class Test1 {

  public static int solution(String s) {

    String reverseBracket = makeReverseBracket(s);
    Stack<String> stack = new Stack<>();
    String[] split = s.split("");

    ArrayList<String> addStacks = new ArrayList<>();

    for (String s1 : split) {
      stack.push(s1);

      if (stack.size() > 1) {
        while (stack.empty()) {
          String pop = stack.pop();
        }
      }
    }

    return 0;
  }

  private static String makeReverseBracket(String s) {
    String[] split = s.split("");

    for (int i = 0; i < split.length; i++) {
      for (int j = 0; j < split.length; j++) {
        String bracket = split[j];
        if (!bracket.equals("NONE") && isReverseBracket(split[i], bracket)) {
          split[i] = "NONE";
          split[j] = "NONE";
          break;
        }
      }
    }

    for (String s1 : split) {
      if (!getReverseBracket(s1).equals("")) {
        return getReverseBracket(s1);
      }
    }
    return "";
  }

  public static boolean isReverseBracket(String str, String target) {
    if (str.equals("{") && target.equals("}") || str.equals("}") && target.equals("{")) {
      return true;
    } else if (str.equals("[") && target.equals("]") || str.equals("]") && target.equals("[")) {
      return true;
    } else if (str.equals("(") && target.equals(")") || str.equals(")") && target.equals("(")) {
      return true;
    }
    return false;
  }

  public static String getReverseBracket(String bracket) {
    if (bracket.equals("NONE")) {
      return "";
    }

    if (bracket.equals("{")) {
      return "}";
    } else if (bracket.equals("}")) {
      return "{";
    } else if (bracket.equals("[")) {
      return "]";
    } else if (bracket.equals("]")) {
      return "[";
    } else if (bracket.equals("(")) {
      return ")";
    } else if (bracket.equals(")")) {
      return "(";
    }

    return "";
  }

  public static void main(String[] args) {
    System.out.println(solution("()[[]"));
//    System.out.println(solution("[]([[]){}"));
  }
}
