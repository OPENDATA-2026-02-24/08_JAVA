package Ch06;

import java.util.Scanner;

public class C04FOR {
	public static void main(String[] args) {
	
		
//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
		

		//02WHILE.java 의 while문을 모두 for문으로 바꾸세요
		
		//1-10까지합
//		for(int i=0;i<10;i++) {
//			System.out.println("HELLOWORLD");
//		}
		
		//1-N까지합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		int sum = 0;
//		for(int i=1;i<=n;i++) {
//			sum+=i;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,n,sum);
//		
//		sc.close();
		
		//N-M까지합(N<M)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//SWAP
		if(n>m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		
//		int i=n;
//		int sum = 0;
//		while(i<=m) {
//			System.out.println("i : "+ i);
//			sum+=i;
//			i++;
//		}

//		int sum = 0;
//		for(int i=n;i<=m;i++) {
//			System.out.println("i : "+ i);
//			sum+=i;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,n,sum);
//		
//		sc.close();
		
		//2단 구구간
		//N단 구구단(2<=N<=9)
		//2-9 구구단
		//2-N 구구단
		//N-M 구구단
		//별찍기
		
	}
}
