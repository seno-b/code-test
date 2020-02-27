package testdome.java;

/*

Q. A playlist is considered a repeating playlist if any of the songs contain a reference to a previous song in the playlist. Otherwise, the playlist will end with the last song which points to null.
Implement a function isRepeatingPlaylist that, efficiently with respect to time used, returns true if a playlist is repeating or false if it is not.
For example, the following code prints "true" as both songs point to each other.

Q. 노래 중 하나라도 재생 목록의 이전 노래에 대한 참조를 포함하는 경우 재생 목록은 반복 재생 목록으로 간주됩니다.
그렇지 않으면 재생 목록이 마지막 노래로 끝나고 null을 가리 킵니다.

사용 된 시간과 관련하여 효율적으로 재생 목록이 반복되면 true를 반환하고 그렇지 않으면 false를 반환하는 isRepeatingPlaylist 함수를 구현합니다.

예를 들어 다음 코드는 두 노래가 서로를 가리킬 때 "true"를 인쇄합니다.

Hint 1: A data structure can be used to identify if a song appears twice in a playlist.
힌트 1 : 데이터 구조를 사용하여 노래가 재생 목록에 두 번 나타나는지 식별 할 수 있습니다.

 */

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        //throw new UnsupportedOperationException("Waiting to be implemented.");

        Song next = nextSong;
        Song nextNext = next == null ? null : next.nextSong;

        System.out.println("현재곡 = " + this.name);
        System.out.println("다음곡 = " + next.name);
        System.out.println("다 다음곡 = " + nextNext.name);
        System.out.println("다 다 다음곡 = " + nextNext.nextSong.name);
        System.out.println("다 다 다 다음곡 = 없음");

        while(nextNext != null){

            if(this.name.equals(next.name)){
                System.out.println("this.name.equals(next.name)");
                System.out.println(this.name);
                System.out.println(next.name);
                return true;
            }

            if (next == nextNext){
                System.out.println("next == nextNext");
                System.out.println(next.name);
                System.out.println(nextNext.name);
                return true;
            }

            next = next.nextSong;
            nextNext = nextNext.nextSong;

            if( nextNext != null){
                nextNext = nextNext.nextSong;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        Song third = new Song("totototo");

        first.setNextSong(second);
        second.setNextSong(third);
        third.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}