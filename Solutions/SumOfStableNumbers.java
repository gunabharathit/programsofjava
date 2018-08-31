import java.util.Arrays;

public class SumOfStableNumbers {

	public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
		int stableArray[] = { 0, 0, 0, 0, 0 };
		boolean isStable = false;
		
		isStable = isValidStableNum(input1);
		if (isStable)
			stableArray[0] = input1;
	
		isStable = isValidStableNum(input2);
		if (isStable)
			stableArray[1] = input2;

		isStable = isValidStableNum(input3);
		if (isStable)
			stableArray[2] = input3;
	
		isStable = isValidStableNum(input4);
		if (isStable)
			stableArray[3] = input4;
	
		isStable = isValidStableNum(input5);
		if (isStable)
			stableArray[4] = input5;
	
		Arrays.sort(stableArray);
		
		int minStableNum = findMinStableNum(stableArray);
		int maxStableNum = stableArray[stableArray.length - 1];

		// printArray(stableArray);
		int sumStableNum = minStableNum + maxStableNum;
		System.out.println("Min : " + minStableNum + "  Max : " + maxStableNum + "  Sum : " + sumStableNum);

		return 0;
	}

	public static int findMinStableNum(int arr[]) {
		int countNotZero = countNotZero(arr);

		int arrCopy[] = new int[countNotZero];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				arrCopy[j++] = arr[i];
		}
		
		//printArray(arrCopy);
		int minStableNum = arrCopy[0];
		
		return minStableNum;
	}
	
	public static boolean isValidStableNum(int input) {
		int arr[] = new int[10];
		int numCopy = input;
		int rem = 0;

		while (numCopy != 0) {
			rem = numCopy % 10;
			arr[rem] = arr[rem] + 1;
			numCopy = numCopy / 10;
		}

		printArray(arr);

		int countNotZero = countNotZero(arr);
		// System.out.println("Not Zero : " + countNotZero);

		int arrCopy[] = new int[countNotZero];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				arrCopy[j++] = arr[i];
		}

		if (isAllEqual(arrCopy))
			return true;
		else
			return false;
	}

	public static int countNotZero(int arr[]) {
		int countNotZero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				countNotZero += 1;
		}
		return countNotZero;
	}

	public static boolean isAllEqual(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[0] != a[i]) {
				return false;
			}
		}

		return true;
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print("\t" + arr[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPassword(12, 1313, 122, 678, 898);
	}
}
