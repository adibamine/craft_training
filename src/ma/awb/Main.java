package ma.awb;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        List<MediaPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");

        allPlayers.add(new WinampMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);
    }

    public static void playVideoInAllMediaPlayers(List<MediaPlayer> allPlayers) throws Exception {

        for (MediaPlayer player : allPlayers) {
            player.playVideo();
        }
    }
}
