package Ch06;

import java.util.Scanner;

public class C01WHILE {

	public static void main(String[] args) {
		// 00 기본 문법
		
	//	while(조건식) {
	//		조건식이 true 인 동안 실행되는 종속문장
	//	}

		//01 HELLOWORLD 10회 출력
		//탈출용 변수 	: i=0
		//탈출 조건식	: i<10
		//탈출 연산식  : i++

//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
		
		//02 HELLOWORLD N회 출력(N>0)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<0) {
//			System.out.println("N은 0보다 커야 합니다.");
//			System.exit(-1);
//		}
//		
//		int i=0;
//		while(i<n) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}	
//		sc.close();
		
		//03 1 부터 10까지 합 구하기
		
		int i=1;
		int sum = 0;
		while(i<=10) {
			System.out.println("i : "+ i);
			sum+=i;
			i++;
		}
		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,10,sum);
		
		// 1 부터 N까지의 합
		// N 부터 M까지의 합(N<M)
		// N 부터 M까지 범위에서 짝수의 합과 홀수의 합 구해서 출력 (N<M)
		// 구구단 2 x 1 = 1 , 2 x 9 = 18 찍기
		// 구구단 N단 받아서 찍어보기
	}

}






