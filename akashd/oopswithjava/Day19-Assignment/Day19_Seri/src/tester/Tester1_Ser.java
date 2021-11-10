package tester;

import static utils.SerUtils.*;
import static utils.StudentCollectionUtils.*;

import java.io.IOException;
import java.util.Scanner;

public class Tester1_Ser {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name to serialize");
			storeStudentDetails(populateMap(populateList()), sc.nextLine());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("Serialization complete");
	}
}
