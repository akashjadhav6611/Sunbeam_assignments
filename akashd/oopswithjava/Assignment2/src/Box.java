class Box {
    private double width, depth, height;
    String color;

    Box(double width, double depth, double height, String color) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.color = color;
    }
    
    void printDetails() {
        System.out.println("This box measures: " + width + " " + depth + " " + height);
    }

    boolean isEqual(Box anotherBox) {
        if(this.width == anotherBox.width && this.depth == anotherBox.depth && this.height == anotherBox.height) {
            return true;
        } else {
            return false;
        }
    }

    Box createNewBox(double widthOffset, double depthOffset, double heightOffset) {
        return new Box(this.width + widthOffset, this.depth + depthOffset, this.height + heightOffset, this.color);
    }

    double getVolume() {
        return width *depth * height; 
    }

    String getColor() {
        return color;
    }
}

/*
4.2. Add a method to Box class to compare equality of 2 boxes & test it.
Hint : 2 boxes are equal if & only if , their dimensions are exactly the same.
eg : box1 : 10 20 30
box2 : 20 10 30
What should be method declaration in Box class ?
boolean isEqual(Box anotherBox)
{
 ......
}
From Tester class 
box1 , box2
How to invoke the method ?
box1.isEqual(box2)


4.3 Add a method to Box class to return a new Box with modified offset in dimensions & test it with the tester.
eg : Suppose client has ordered 1st Box : 10 20 30
Clnt orders another new box : with ref to 1st box : 3 -4 -2
App should create another NEW BOX :13 16 28
eg : Box box1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
sop("Enter the offsets w.r.t 1st box: width offset d offset h offset");
Box box2=box1.createNewBox(....);


4.4 Display color of the box , having larger volume.
Hint : add color as state + add getter

*/