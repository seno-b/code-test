package programmers.java;

import java.util.ArrayList;
import java.util.Collections;

public class LongReverseOrder {

  /*
  * 문제 설명
    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
    n은 1이상 8000000000 이하인 자연수입니다.
  * */

  public static long solution(long n) {
    if (n < 1) {
      return 0;
    }

    String temp = String.valueOf(n);
    String[] split = temp.split("");

    ArrayList<Long> strings = new ArrayList<>();

    for (String string : split) {
      strings.add(Long.valueOf(string));
    }

    Collections.sort(strings, Collections.reverseOrder());
    String answer = "";

    for (Long string : strings) {
      answer += String.valueOf(string);
    }

    return Long.parseLong(answer);
  }

  public static void main(String[] args) {
    System.out.println(solution(118372));
  }

}
