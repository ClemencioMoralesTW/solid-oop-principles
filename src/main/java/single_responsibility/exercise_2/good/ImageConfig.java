package single_responsibility.exercise_2.good;

import single_responsibility.exercise_2.good.format.AudioFormat;
import single_responsibility.exercise_2.good.format.ImageFormat;
import single_responsibility.exercise_2.good.format.VideoFormat;

public class ImageConfig extends MediaConfig {
    private final int imageHeight;
    private final int imageWidth;
    private final ImageFormat imageFormat;
    private final int imageResolution;

    public ImageConfig(String title, int fps, VideoFormat videoFormat, int audioDuration, int videoDuration, AudioFormat audioFormat, int imageHeight, int imageWidth, ImageFormat imageFormat, int imageResolution) {
        super(title);
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.imageFormat = imageFormat;
        this.imageResolution = imageResolution;
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
}
