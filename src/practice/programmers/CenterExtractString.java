package practice.programmers;

public class CenterExtractString {

  /*
  * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
  *
  * 입출력 예
    s   	return
  "abcde"	 "c"
  "qwer"	 "we"
*
  * */

  public static String solution(String s) {
    String answer = "";

    int length = s.length();

    if (length == 0) {
      return "";
    }

    int evenOrOddNumber = length / 2;

    if (length % 2 == 0) {
      answer = s.substring(evenOrOddNumber-1, evenOrOddNumber+1);
    } else {
      answer = s.substring(evenOrOddNumber, evenOrOddNumber+1);
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(solution("abcde"));
    System.out.println(solution("qwer"));
  }

}
