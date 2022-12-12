package single_responsibility.exercise_2.good;

import single_responsibility.exercise_2.good.format.AudioFormat;
import single_responsibility.exercise_2.good.format.VideoFormat;

public class AudioConfig extends MediaConfig {

    private final AudioFormat audioFormat;
    private final int audioDuration;

    public AudioConfig(String title, int fps, VideoFormat videoFormat, int videoDuration, AudioFormat audioFormat, int audioDuration) {
        super(title);
        this.audioFormat = audioFormat;
        this.audioDuration = audioDuration;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public int getAudioDuration() {
        return audioDuration;
    }
}
