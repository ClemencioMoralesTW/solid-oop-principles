package single_responsibility.exercise_2.bad;

public class MediaConfig {

    private String title;
    private int imageHeight;
    private int imageWidth;
    private ImageFormat imageFormat;
    private int imageResolution;
    private int fps;
    private VideoFormat videoFormat;
    private int duration; //duration of the song or video, in milliseconds
    private AudioFormat audioFormat;

    public MediaConfig(String title,
                       int imageHeight,
                       int imageWidth,
                       ImageFormat imageFormat,
                       int imageResolution, int fps,
                       VideoFormat videoFormat,
                       int duration,
                       AudioFormat audioFormat) {
        this.title = title;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.imageFormat = imageFormat;
        this.imageResolution = imageResolution;
        this.fps = fps;
        this.videoFormat = videoFormat;
        this.duration = duration;
        this.audioFormat = audioFormat;
    }

    public String getTitle() {
        return title;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public ImageFormat getImageFormat() {
        return imageFormat;
    }

    public int getImageResolution() {
        return imageResolution;
    }

    public int getFps() {
        return fps;
    }

    public VideoFormat getVideoFormat() {
        return videoFormat;
    }

    public int getDuration() {
        return duration;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }
}
