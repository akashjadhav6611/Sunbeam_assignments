package tester;


import java.util.Scanner;

import utils.DeSerUtils;

public class Tester1_DeSer {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Enter file name");
			System.out.println(DeSerUtils.restoreProducts(sc.nextLine()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
{dac-004=Student rollNo=dac-004, name=shekhar, dob=1991-12-13, subject=DBT, gpa=8.9adr : Address [city=nagpur, state=MH, phoneNo=852446], dac-003=Student rollNo=dac-003, name=meeta, dob=1993-12-13, subject=DBT, gpa=7.9adr : Address [city=pune, state=MH, phoneNo=692446], dac-002=Student rollNo=dac-002, name=priya, dob=1990-02-23, subject=JAVA, gpa=7.7adr : Address [city=indore, state=MP, phoneNo=752446], dac-001=Student rollNo=dac-001, name=ravi, dob=1990-12-13, subject=ANGULAR, gpa=7.0adr : Address [city=pune, state=MH, phoneNo=452446], dac-008=Student rollNo=dac-008, name=sameer, dob=1991-12-06, subject=JAVA, gpa=8.2adr : Address [city=chennai, state=TN, phoneNo=862446], dac-007=Student rollNo=dac-007, name=kiran, dob=1993-02-13, subject=DBT, gpa=8.1adr : Address [city=mumbai, state=MH, phoneNo=672446], dac-009=Student rollNo=dac-009, name=riya, dob=1992-12-13, subject=REACT, gpa=6.9adr : Address [city=pune, state=MH, phoneNo=652446]}


*/