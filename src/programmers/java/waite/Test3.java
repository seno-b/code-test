package programmers.java.waite;

public class Test3 {

  private static boolean[][] visited;

  public static int solution(int[][] board, int removeCost) {

    boolean[][] visited = new boolean[board.length][board[0].length];
    int[][] distance = new int[board.length][board[0].length];
    int START_X = 0, START_Y = 0;

    // 시작위치 설정 및 가중치 배열 생성
    for (int y = 0; y < board.length; y++) {
      for (int x = 0; x < board[y].length; x++) {
        if (board[y][x] == 2) {
          START_X = x;
          START_Y = y;
          visited[y][x] = true;
        }
        distance[y][x] = makeCost(board[y][x], removeCost);
      }
    }

    // 다익스트라 길찾기
    // 가중치로 비교해서 인접한 노드들 순회

    return 0;
  }

  private static int makeCost(int type, int removeCost) {
    if (type == 1) {
      return removeCost * 1;
    } else if (type == 4) {
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[][]{
        {0, 0, 0, 0, 2, 0, 0, 0, 0, 0},
        {0, 0, 1, 1, 1, 1, 1, 0, 0, 0},
        {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
        {0, 0, 1, 1, 1, 1, 1, 0, 1, 0},
        {0, 0, 1, 1, 1, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 3, 0, 0, 0, 1, 0}}, 1) == 9);
  }

}