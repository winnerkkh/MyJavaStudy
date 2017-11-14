package p08.arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] origin = { { 1, 2 }, { 3, 4 } };

		// 얕은 복제
		System.out.println("[얕은 복제 후 비교]");
		int[][] cloned1 = Arrays.copyOf(origin, origin.length);
		System.out.println("배열 번지 비교:" + origin.equals(cloned1));
		System.out.println("1차 배열 항목값 비교:" + Arrays.equals(origin, cloned1));
		System.out.println("중첩 배열 항목값 비교:" + Arrays.deepEquals(origin, cloned1));

		System.out.println("=======================================================");

		// 깊은 복제
		System.out.println("[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(origin, origin.length);
		cloned2[0] = Arrays.copyOf(origin[0], origin[0].length); // 깊은복제
		cloned2[1] = Arrays.copyOf(origin[1], origin[1].length); // 깊은복제
		System.out.println("배열 번지 비교: " + origin.equals(cloned2));

		System.out.println("1차 배열 항목값 비교:" + Arrays.equals(origin, cloned2));
		
		System.out.println("중첩 배열 항목값 비교:" + Arrays.deepEquals(origin, cloned2));
	}
}
