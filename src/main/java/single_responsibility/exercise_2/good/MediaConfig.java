package single_responsibility.exercise_2.good;

import single_responsibility.exercise_2.good.format.AudioFormat;
import single_responsibility.exercise_2.good.format.ImageFormat;
import single_responsibility.exercise_2.good.format.VideoFormat;

public abstract class MediaConfig {

    private final String title;

    public MediaConfig(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
