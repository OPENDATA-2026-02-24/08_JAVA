package Ch05;

import java.util.Scanner;

public class C01IF {
	
	public static void main(String[] args) {
//		//-----------------------
//		//단순 IF	
//		//-----------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : " );
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//			
//		System.out.println("첫번째 IF 코드 블럭 종료..");
//		
//		if(age<8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 코드 블럭 종료..");	
//		System.out.println("프로그램을 종료합니다");
//		
//		sc.close();
		
		//-----------------------
		//IF-ELSE	
		//-----------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : " );
		int age = sc.nextInt();
		if(age >= 8)
			System.out.println("학교에 다닙니다.");
		else
			System.out.println("학교에 다니지 않습니다.");
		System.out.println("프로그램을 종료합니다");
		sc.close();
		
		//-----------------------
		//1 문제
		//-----------------------
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력 - 
		// 순서도도 그려보세요 - draw.io
		//-----------------------
		//2 문제
		//-----------------------
		// 두개의 정수를 입력받아 큰 수 출력
		//-----------------------
		//3 문제(☆)
		//-----------------------
//		// 세 개의 정수를 입력받아 큰 수 출력
//		//-----------------------
//		//4 문제
//		//-----------------------
//		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		//-----------------------
		//5 문제
		//-----------------------
//		입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
//		입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
	}
	
}
