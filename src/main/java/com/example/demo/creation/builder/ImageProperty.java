package com.example.demo.creation.builder;

public class ImageProperty {
    private final int width;
    private final int height;
    private final int quality;
    private final int ratio;
    private final int frame;
    private final String imagePath;
    private final String imageFormat;

    public ImageProperty(final int width,
                         final int height,
                         final int quality,
                         final int ratio,
                         final int frame,
                         final String imagePath,
                         final String imageFormat) {
        this.width = width;
        this.height = height;
        this.quality = quality;
        this.ratio = ratio;
        this.frame = frame;
        this.imagePath = imagePath;
        this.imageFormat = imageFormat;
    }

    public static class builder {

        // 필수 인자
        private final int width;
        private final int height;
        private final String imagePath;

        // 선택적 인자
        private int frame = 0;
        private int quality = 85;
        private int ratio = 1;
        private String imageFormat;

        private builder(final int width, final int height, final String imagePath) {
            this.width = width;
            this.height = height;
            this.imagePath = imagePath;
        }

        public builder ratio(final int ratio) {
            this.ratio = ratio;
            return this;
        }

        public builder quality(final int quality) {
            this.quality = quality;
            return this;
        }

        public builder format(final String format) {
            this.imageFormat = format;
            return this;
        }

        public builder frame(final int frame) {
            this.frame = frame;
            return this;
        }

        public ImageProperty build() {
            return new ImageProperty(this);
        }
    }

    private ImageProperty(final builder builder) {
        this.width = builder.width;
        this.height = builder.height;
        this.ratio = builder.ratio;
        this.quality = builder.quality;
        this.frame = builder.frame;
        this.imagePath = builder.imagePath;
        this.imageFormat = builder.imageFormat;
    }

    public static builder Builder(final int width, final int height, final String imagePath) {
        return new builder(width, height, imagePath);
    }
}
