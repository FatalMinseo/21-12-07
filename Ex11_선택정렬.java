package ����2����;

import java.util.Scanner;

public class Ex11_�������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int c = 0; c <= 4; c++) {
			System.out.print(c + 1 + "��° �� �Է� : ");
			arr[c] = sc.nextInt();
		}
		System.out.println("���� ��");
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
