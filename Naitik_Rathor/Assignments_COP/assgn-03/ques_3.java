import java.util.Scanner;

class emp{
	String name;
	int sallary;
	int doj;
	Scanner sc = new Scanner(System.in);
	void in_data() {
		System.out.print("Enter Your Name: ");
		this.name=sc.next();
		System.out.print("Enter Your Sallary: ");
		this.sallary=sc.nextInt();
		System.out.print("Enter Your Date Of Joining: ");
		this.doj=sc.nextInt();
		
	}
	void out_data() {
		System.out.printf("%-10s%-10d%-10d\n",this.name,this.sallary,this.doj);
	}
	

}

public class ques_3 {
	public static void main(String[] args) {
		emp e[] = new emp[10];
		int i=0;
		while(i!=10) {
			e[i]=new emp();
			e[i].in_data();
			i++;
		}
		System.out.println("   Name      Sallary   Date");
		for(i=0;i<10;i++) {
			System.out.print((i+1)+").   ");
			e[i].out_data();
		}
		
		
	}

}
