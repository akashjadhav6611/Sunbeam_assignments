import java.util.Arrays;
import java.util.List;

public class MaxNum {

	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(78, 56, 87, 12, 65);
		List<Float> listFloat = Arrays.asList(45.03f, 89.34f, 68f, 78.35f, 15.11f);
		List<Double> listDouble = Arrays.asList(1.0, 2d, 3.78, 4.6, 56d);
		
		System.out.println("Integer max : "+max(listInt));
		System.out.println("Float max : "+max(listFloat));
		System.out.println("Double max : "+max(listDouble));
		

	}
	
	   public static <T extends Comparable<T>> T max(List<T> elements) {
		    T max = elements.get(0);
		    for (T element : elements) {
		        if (element.compareTo(max) > 0) {
		            max = element;
		        }
		    }
		    return max;
	   }
}
