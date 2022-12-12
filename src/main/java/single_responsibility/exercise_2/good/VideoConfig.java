package single_responsibility.exercise_2.good;

import single_responsibility.exercise_2.good.format.VideoFormat;

public class VideoConfig extends MediaConfig {

    private final int fps;
    private final VideoFormat videoFormat;
    private final int videoDuration;

    public VideoConfig(String title, int fps, VideoFormat videoFormat, int videoDuration) {
        super(title);
        this.fps = fps;
        this.videoFormat = videoFormat;
        this.videoDuration = videoDuration;
    }

    public int getFps() {
        return fps;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public int getVideoDuration() {
        return videoDuration;
    }
}
