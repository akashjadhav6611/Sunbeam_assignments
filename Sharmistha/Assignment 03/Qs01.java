package Assignment03;



		// TODO Auto-generated method stub
	class tt {
	    int length;
	    int breath;

	    tt(int l, int b) {
	        this.length = l;
	        this.breath = b;
	    }

	    public int area()
	    {
	        return length * breath;
	    }
	}

public class Qs01 {
	    public static void main(String[] args) {
	        tt obj = new tt(4,5);
	        tt obj1 = new tt(5,8);

	        System.out.println("Area of first rectangle = "+(obj.area()));
	        System.out.println("Area of second rectangle = "+(obj1.area()));

	    }

	}


