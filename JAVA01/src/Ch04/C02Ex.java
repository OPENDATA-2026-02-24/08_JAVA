package Ch04;

import java.util.Scanner;

public class C02EX {

	public static void main(String[] args) {
		//1. 문제(삼항연산자 + 논리연산자)
		// 키보드로 국어/영어/수학 점수를 입력 받아 각각의 부분 점수가 40점 이상이고
		// 총 점수 합의 평균이 70점 이상이면 '합격'
		// 미만이면 '불합격'을 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 점수 입력 : ");
//		int kor = sc.nextInt();
//		
//		System.out.print("영어 점수 입력 : ");
//		int eng = sc.nextInt();
//		
//		System.out.print("수학 점수 입력 : ");
//		int mat = sc.nextInt();
//		
//		int total = kor + eng + mat;
//		double avg = total / 3.0;
//		
//		String result = (kor >= 40 && eng>=40 && mat>=40 && avg >= 70) ? "합격" : "불합격";
//		
//		System.out.println("\n---결과---");
//		System.out.println("평균 점수 : " + avg);
//		System.out.println("판정 결과 : " + result);
//		
//		sc.close();
//		
		
		
		
		// 2. 미니문제(%연산자) - N%2==0
		//키보드로부터 정수값 2개를 입력 받아
		//두 수의 합이 짝수이면 "짝수입니다"
		//홀수이면 "홀수입니다"를 출력하세요 ~
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		String result = (sum % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println("두 수의 합은 " + result);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
