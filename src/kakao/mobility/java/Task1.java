package kakao.mobility.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Task1 {

  public static String solution(String names, String companyName) {
    // write your code in Java SE 8

    String[] nameSplit = names.split(", ");
    StringBuilder builder = new StringBuilder();
    HashMap<String, Integer> emailMaps = new HashMap<>();

    for (String s : nameSplit) {

      String mailAddress = getMailAddress(s.replaceAll("-", ""));
      String emails = String.format("<%s@%s.com>", getDuplicateMailAddress(mailAddress, emailMaps),
          companyName.toLowerCase());
      builder.append(s + " ");
      builder.append(emails + ", ");
    }

    return builder.delete(builder.lastIndexOf(","), builder.length()).toString();
  }

  private static String getDuplicateMailAddress(String mailAddress,
      HashMap<String, Integer> emailMaps) {

    Integer getNumber = emailMaps.getOrDefault(mailAddress, 0);
    if (getNumber != 0) {
      emailMaps.put(mailAddress, getNumber + 1);
    } else {
      emailMaps.put(mailAddress, 2);
    }

    return mailAddress + (getNumber == 0 ? "" : getNumber);
  }

  private static String getMailAddress(String name) {

    String[] names = name.split("\\s");
    String newName = "";

    for (int i = 0; i < names.length; i++) {
      if (names.length - 1 == i) {
        if (names[i].length() > 8) {
          newName += names[i].substring(0, 8).toLowerCase();
        } else {
          newName += names[i].toLowerCase();
        }
      } else {
        newName += names[i].substring(0, 1).toLowerCase();
      }
    }

    return newName;
  }

  public static void main(String[] args) {
    System.out.println(solution(
        "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker",
        "Example"));
  }

}
