	import java.util.Collections;
	import java.util.List;
	import java.util.ArrayList;

	public class TestMax2 {
		public static void main(String[] args) {
			List<Integer> numbers = new ArrayList<>();
			numbers.add(10);
			numbers.add(20);
			numbers.add(5);
			numbers.add(30);
			numbers.add(15);

			// Get the maximum value
			int maxValue = Collections.max(numbers);

			System.out.println("The maximum value is: " + maxValue);

			int max2 = numbers.stream().min(Integer :: compareTo)
					.orElseThrow();

			System.out.println("The maximum value is: " + max2);
		}
	}
