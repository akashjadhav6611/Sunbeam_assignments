public class Box {
        private double width, depth, height;
        private String color;

        public Box(double width, double d, double height) {

            this.width = width;
            depth = d;
            this.height = height;
        }
        
        public Box(double width, double d, double height, String color) {
            this(width, d, height);
            this.color = color;
        }

        public String getBoxDimensions() {
            return "Box dims " + width + " " + depth + " " + height;
        }

        public double getBoxVolume() {
            return width * height * depth;
        }

        public boolean isEqual(Box anotherBox) {
            return width == anotherBox.width && depth == anotherBox.depth && height == anotherBox.height;
        }

        public Box createNewBox(double wOff, double dOff, double hOff, String col) {
            Box newBox = new Box(width + wOff, this.depth + dOff, this.height + hOff, col);
            return newBox;
        }

        public String getColor() {
            return color;
        }
}
