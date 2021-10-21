class Assignment2 {
    public static void main(String[] args) {
        Box b1 = new Box(10, 50, 40, "black");
        Box b2 = new Box(10, 20, 30, "red");
        System.out.println(b1.isEqual(b2));
        Box b3 = b2.createNewBox(3, -4, -2);
        b3.printDetails();
        if(b1.getVolume() > b2.getVolume()) {
            System.out.println("Box b1 is bigger than box b2, and b1's color is " + b1.getColor());
        } else {
            System.out.println("Box b1 is bigger than box b2" + b2.getColor());
        }
    }
}