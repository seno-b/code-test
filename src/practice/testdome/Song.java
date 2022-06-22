package practice.testdome;

/*
*
*
* Q. A playlist is considered a repeating playlist if any of the songs contain a reference to a previous song in the playlist.
* Otherwise, the playlist will end with the last song which points to null.
* Implement a function isRepeatingPlaylist that, efficiently with respect to time used, returns true if a playlist is repeating or false if it is not.
* For example, the following code prints "true" as both songs point to each other
*
* 노래 중 하나라도 재생 목록의 이전 노래에 대한 참조를 포함하는 경우 재생 목록은 반복 재생 목록으로 간주됩니다.
* 그렇지 않으면 재생 목록이 마지막 노래로 끝나고 null을 가리 킵니다.
* 사용 된 시간과 관련하여 효율적으로 재생 목록이 반복되면 true를 반환하고 그렇지 않으면 false를 반환하는 isRepeatingPlaylist 함수를 구현합니다.
* 예를 들어 다음 코드는 두 노래가 서로를 가리킬 때 "true"를 인쇄합니다.
*
* */
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

        Song next = this.nextSong;
        Song nextNext = this.nextSong.nextSong;

        while(next != null){

        }

        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
