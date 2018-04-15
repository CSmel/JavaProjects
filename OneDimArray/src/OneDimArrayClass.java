// This application has three separate arrays that interacts with a specific statement.
// The first statement will only display 10 empty elements.
// The second statement will only display 15 original elements and then add one value to it from the bonus array.
// The third statement will only display the 5 elements from the bestScores array.

public class OneDimArrayClass {

	public static void main(String[] args) {
		int[] counts = new int [10]; // 
		int[] bonus = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87, 70, 80, 90, 100, 90};
		int[] bestScores = {100, 80, 90, 70, 100};
		int newBonus = 0;
		System.out.printf("========================================%n");
		System.out.printf("counts Array%n");
		System.out.printf("========================================%n");
		System.out.printf("The zero value is assigned to each element%n");
		System.out.printf("%s%8s%n", "Index", "Value");
		// there are 10 elements within the counts array, however, each value is set to 0
		for (int counter = 0; counter < counts.length; counter++) {
			// the instructions doesn't mention to display the values, but I do so anyways.
			System.out.printf("%5d%8d%n", counter, counts[counter]);
		}
		System.out.printf("========================================%n");
		System.out.printf("bonus Array%n");
		System.out.printf("========================================%n");
		System.out.printf("Add one to each of the fifthteen elements%n");
		System.out.printf("%s%8s%n", "Orginal", "New");
		// this next statement will add 1 to each element in the bonus array.
		// the instructions doesn't mention to display the values, but I do so anyways.
		for (int counter = 0; counter < bonus.length; counter++) {
			newBonus = bonus[counter] + 1;
			System.out.printf("%8d%8d%n", bonus[counter], newBonus);
	}
		System.out.printf("========================================%n");
		System.out.printf("bestScores Array%n");
		System.out.printf("========================================%n");
		System.out.printf("Display the top five scores%n");
		System.out.printf("%s%8s%n", "Index ", "Top Scores");
		// this next statement will add 1 to each element in the bonus array.
		// the instructions doesn't mention to display the values, but I do so anyways.
		for (int counter = 0; counter < bestScores.length; counter++) {
	
			System.out.printf("%5d%8d%n",counter, bestScores[counter]);

}
}}
