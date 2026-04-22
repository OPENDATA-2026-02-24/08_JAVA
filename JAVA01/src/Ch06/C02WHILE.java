package Ch06;

import java.util.Scanner;

public class C02WHILE {
	
	public static void main(String[] args) {
		
		// 2 - 9 단 출력
//		int dan = 2;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
		
		// N - 9 단 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int dan = n;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		
		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
			System.out.print("n,m 다시 입력 : ");
			n = sc.nextInt();
			m = sc.nextInt();
		}
		
		int dan = n;
		while(dan<(m+1)) {
			
			int i=1;
			while(i<10) {
				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
				i++;
			}
			
			System.out.println();
			dan++;
		}
		sc.close();
		
		// N - M 단 출력 거꾸로 2 x 9 , 2 x 8 ....
		
		
		// 1) 고정높이 
		// *****
		// *****
		// *****
		// *****
		
		// 2)
		// 높이 : 4 
		// *****
		// *****
		// *****
		// *****

		// 3) 고정높이
		// * 
		// ** 
		// *** 
		// **** 
		
		// 4)
		// 높이 : 4 
		// * 
		// ** 
		// *** 
		// **** 		
		
		// 5) 
		//높이 : 4
		//****
		//***
		//**
		//*		
		
		//6)
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******

		//7)
		//높이 : 4
		//*******
		// *****
		//  ***
		//   *

		//8) 고정높이
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		//9)
		//높이 : 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *	
		
		// 10)
		// 높이 : 7
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
	}
	
}
