package project1_AlgorithmPerformance;

import java.util.Arrays;
import java.util.List;

public class Main {
	static void main(String[] args) {

		/*-----Permutation Generator Tests-------*/
		PermutationGenerator generator = new PermutationGenerator();

		System.out.println("Base Array from n");
		int[] n = generator.createBaseArray(6);
		System.out.println(Arrays.toString(n));
		System.out.println();

		System.out.println("All permutations");
		List<int[]> result = generator.findAllPermutations(n);
		result.forEach(array -> System.out.println(Arrays.toString(array)));
	}
}
