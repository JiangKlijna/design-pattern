
class Bean {
    public Bean(int width, int height, String shape, String color) {
        this.width = width;
        this.height = height;
        this.shape = shape;
        this.color = color;
    }

    private int width, height;
    private String shape, color;

    @Override
    public String toString() {
        return "Bean{" + "width=" + width + ", height=" + height + ", shape='" + shape + '\'' + ", color='" + color + '\'' + '}';
    }

    public static class Build {
        private int width, height;
        private String shape, color;

        public Build width(int width) {
            this.width = width;
            return this;
        }

        public Build height(int height) {
            this.height = height;
            return this;
        }

        public Build shape(String shape) {
            this.shape = shape;
            return this;
        }

        public Build color(String color) {
            this.color = color;
            return this;
        }

        public Bean build() {
            return new Bean(width, height, shape, color);
        }
    }
}

public class Builder {

    public static void main(String[] args) {
        Bean bean = new Bean.Build()
                .width(10)
                .height(10)
                .shape("ball")
                .color("red")
                .build();
        System.out.println(bean);
    }
}
