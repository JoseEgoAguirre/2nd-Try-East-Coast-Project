package GroupProject01;

public class GroupTask07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Maximum and minimum number in the array?
		 */
		
		
		int[] num = { 10, 20, 98, 40, 240 };

		int largest = 0;
		int smallest = num[0];
		for (int i = 1; i < num.length; i++) {

			if (num[i] > largest) {
				largest = num[i];

			}

			if (num[i] < smallest) {
				smallest = num[i];
			}
		}

		System.out.println(largest);
		System.out.println("-------");
		System.out.println(smallest);

	}
}
