package programmers.java.exhaustive_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MathExample {


  public static int[] solution(int[] answers) {

    Player player1 = new Player(1, new int[]{1, 2, 3, 4, 5});
    Player player2 = new Player(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5});
    Player player3 = new Player(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

    player1.gradePlayerAnswerCount(answers);
    player2.gradePlayerAnswerCount(answers);
    player3.gradePlayerAnswerCount(answers);

    ArrayList<Player> players = new ArrayList<>();
    players.add(player1);
    players.add(player2);
    players.add(player3);

    // 1등인 사람 찾아야됨
    List<Player> collect = players.stream()
        .sorted(Comparator.comparing(Player::getAnswerCount).reversed())
        .collect(Collectors.toList());

    ArrayList<Player> results = new ArrayList<>();

    for (int i = 0; i<collect.size(); i++) {
      int answerCount = 0;
      answerCount = collect.get(i).getAnswerCount();
      results.add(collect.get(i));
      if (answerCount == collect.get(i + 1).getAnswerCount()) {
        results.add(collect.get(i + 1));
      } else {
        break;
      }
    };

    return results
        .stream()
        .sorted(Comparator.comparing(Player::getNum))
        .mapToInt(Player::getNum)
        .toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}))); // 1
    System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2}))); // 1,2,3
    System.out.println(Arrays.toString(
        solution(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5}))); // 1,2,3
    System.out.println(Arrays.toString(
        solution(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5}))); // 1,2,3
  }

  static class Player {

    private int num;
    private int answerCount;
    private int[] answerPattern;

    public Player(int num, int[] answerPattern) {
      this.num = num;
      this.answerPattern = answerPattern;
    }

    public void setNum(int num) {
      this.num = num;
    }

    public void setAnswerCount(int answerCount) {
      this.answerCount = answerCount;
    }

    public int[] getAnswerPattern() {
      return this.answerPattern;
    }

    public int getNum() {
      return this.num;
    }

    public int getAnswerCount() {
      return this.answerCount;
    }

    public void gradePlayerAnswerCount(int[] answers) {
      int i = 0;
      int playerAnswerCount = 0;

      for (int answer : answers) {
        if (i >= this.answerPattern.length) {
          i = 0;
        }
        if (answer == this.answerPattern[i]) {
          playerAnswerCount++;
        }
        i++;
      }
      this.answerCount = playerAnswerCount;
    }
  }

}