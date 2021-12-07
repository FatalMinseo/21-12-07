package 과제2주차;

import java.util.Scanner;

public class Ex11_선택정렬 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int c = 0; c <= 4; c++) {
			System.out.print(c + 1 + "번째 수 입력 : ");
			arr[c] = sc.nextInt();
		}
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int pro = arr[i];
					arr[i] = arr[j];
					arr[j] = pro;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			}
		sc.close();
		}
		
	}
