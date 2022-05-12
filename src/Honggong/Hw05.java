package Honggong;
public class Hw05 {
	public static void main(String[] args) {
//	다음 배열에서 최댓값과 최솟값을 구하시오.
//	{38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
		int[] array = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (maxNum < array[i]) {
				maxNum = array[i];
			}
			if (minNum > array[i]) {
				minNum = array[i];
			}
		}
		System.out.println("최대값: " + maxNum);
		System.out.println("최소값: " + minNum);
	}
}
