package ma.awb;

public class WinampMediaPlayer extends MediaPlayer {

    // Play video is not supported in Winamp player
    public void playVideo() throws Exception {
        throw new Exception();
    }
}