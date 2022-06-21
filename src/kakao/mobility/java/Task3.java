package kakao.mobility.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Task3 {

  // 짝수 위치의 모든 숫자가 같고 홀수 위치의 모든 숫자가 같으면 배열 스위칭이라고 합니다.

  public static int solution(int[] A) {
    // write your code in Java SE 8

    if (A.length == 1 || A.length == 2) {
      return 1;
    }

    int result = 0;
    for (int i = 0; i < A.length; i++) {
      int i1 = A[i];
      int i2 = A[i + 1];

      // 두개씩 묶어 비교
      if (i1 == A[i + 2] && i2 == A[i + 3]) {
        result += 2;
      }

      if (A.length % 2 == 1) {

      }
    }

    return result;
  }

  public static void main(String[] args) {

//    System.out.println(solution(new int[]{3, -7, 3, -7, 3}) == 5);
//    System.out.println(solution(new int[]{3}) == 1);
//    System.out.println(solution(new int[]{5, 5, 4, 5, 4}) == 0);
    System.out.println(solution(new int[]{7, -5, -5, -5, 7, -1, 7}) == 3);
  }

}
