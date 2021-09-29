class rectangle {
	    int length;
	    int breath;

	    rectangle(int l, int b) {
	        this.length = l;
	        this.breath = b;
	    }

	    public int area()
	    {
	        return length * breath;
	    }
	}

public class Que_1 {
	    public static void main(String[] args) {
	    	
	    	rectangle Rect1 = new rectangle(4,5);
	    	rectangle Rect2 = new rectangle(6,7);

	        System.out.println("Area of First Rectangle = " + (Rect1.area()));
	        System.out.println("Area of Second Rectangle = " + (Rect2.area()));

	    }

	}