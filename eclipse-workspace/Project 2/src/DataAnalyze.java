import java.util.Scanner;
public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the sample size: ");
		int sample = input.nextInt();
		int[] trial0 = new int[sample];
		int[] trial1 = new int[sample];
		int[] trial2 = new int[sample];
		int[] trial3 = new int[sample];
		int[][] allTrials = new int[][] {trial0, trial1, trial2, trial3};
		int[] totals = new int[4];

		for (int k = 0; k < 4; ++k) {
			System.out.println("\nEnter numbers for Trial " + k);
			for (int i = 0; i < sample; ++i) {
				System.out.print("Enter sample #" + i + ": ");
				allTrials[k][i] = input.nextInt();
				totals[k] += allTrials[k][i];
			}
		}

		System.out.println("\nSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4"); 
		for (int j = 0; j < sample; ++j) {
			System.out.println("\t" + j + "\t" + trial0[j] + "\t" + trial1[j] + "\t" + trial2[j] + "\t" + trial3[j]);
		}
		System.out.println("------------------------------------------------");
		System.out.print("Averages:");
		for(int m = 0; m < 4; ++m) {
			totals[m] = (totals[m] / sample);
			System.out.print("\t" + totals[m]);
		}

		int max = 0;
		int min = totals[0];
		for (int n = 0; n < 4; ++n) {
			if(totals[n] > max) 
				max = totals[n];
			if(totals[n] < min)
				min = totals[n];
		}
		System.out.println("\n\nMax Average: "+ max);
		System.out.println("Min Average: "+ min);

		if (min == max)
			System.out.println("\nThe trials match EXACTLY!");

		else if (max < min * 2)
			System.out.println("\nThe trials concur with each other!");

		else
			System.out.println("\nThe trials do not concur!");

		input.close();
	}

}
