package ma.awb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<VideoMediaPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");
        // Now adding new Winamp player. If you uncomment below line,
        // it would give compile time error as can't add audio player in list of video players.
        // allPlayers.add(new WinampMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);
    }

    public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {

        for (VideoMediaPlayer player : allPlayers) {
            player.playVideo();
        }
    }
}
