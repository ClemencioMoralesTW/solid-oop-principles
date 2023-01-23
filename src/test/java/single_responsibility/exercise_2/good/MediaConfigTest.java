package single_responsibility.exercise_2.good;

import org.junit.jupiter.api.Test;
import single_responsibility.exercise_2.good.format.AudioFormat;
import single_responsibility.exercise_2.good.format.ImageFormat;
import single_responsibility.exercise_2.good.format.VideoFormat;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MediaConfigTest {

    @Test
    public void itShouldAllowAudioConfigAsBaseClass() {
        final MediaConfig audioConfig = new AudioConfig("avi", 60, VideoFormat.AVI,
                30, AudioFormat.MP3, 30);
        assertTrue(audioConfig instanceof MediaConfig);
    }

    @Test
    public void itShouldAllowImageConfigAsBaseClass() {
        final MediaConfig imageConfig = new ImageConfig("pic", 60, VideoFormat.AVI,
                30, 30, AudioFormat.MP3, 30, 40,
                ImageFormat.BMP, 3400);
        assertTrue(imageConfig instanceof MediaConfig);
    }

    @Test
    public void itShouldAllowVideoConfigAsBaseClass() {
        final MediaConfig videoConfig = new VideoConfig("mov", 30, VideoFormat.MOV,
                30);
        assertTrue(videoConfig instanceof MediaConfig);
    }

}