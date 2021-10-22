import java.util.Scanner;
class Average
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Numbers:");
if(sc.hasNextDouble())
{
    double n1= sc.nextDouble();
    if(sc.hasNextDouble())
    {
    double n2= sc.nextDouble();
    System.out.printf("Average: %.3f",(n1+n2)/2.0);
}
else
{
    System.out.println("Second Number is Not a Double");
}

}
else
{
    System.out.println("First Number is Not a Double");
}
sc.close();
    }
}