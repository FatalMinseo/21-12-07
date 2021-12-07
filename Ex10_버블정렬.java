package 과제2주차;

import java.util.Scanner;

public class Ex10_버블정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int c = 0; c <= arr.length - 1; c++) {
			System.out.print(c + 1 + "번째 수 입력 : ");
			arr[c] = sc.nextInt();
		}
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int pro = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = pro;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
