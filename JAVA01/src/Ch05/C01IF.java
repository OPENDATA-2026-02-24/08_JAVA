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
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : " );
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("프로그램을 종료합니다");
//		sc.close();
		
		//-----------------------
		//1 문제
		//-----------------------
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 "3의 배수이면서 5의 배수입니다." 출력 - 
		// 순서도도 그려보세요 - draw.io
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 한 개를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if (num % 3 == 0 && num % 5 == 0) {
//		System.out.println("3의 배수이면서 5의 배수입니다.");
//	}
//		else if(num % 3  == 0) {
//		System.out.println("입력한 수" + num);
//	}
//		sc.close();
		
		//-----------------------
		//2 문제
		//-----------------------
		// 두개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫 번째 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두 번째 정수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		if (num1>num2) {
//			System.out.println("큰 수 " + num1);
//		}
//			else if (num2>num1) {
//				System.out.println("큰 수 " + num2);
//			}
//				else {
//					System.out.println("두 수는 같습니다.");
//				}
//				
//				sc.close();
//			}
//		
		
		
		//-----------------------
		//3 문제(☆)
		//-----------------------
//		// 세 개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("세 개의 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int max = num1;
//		
//		if (num2 > max) {
//			max = num2;
//		}
//		
//		if (num3 > max) {
//			max = num3;
//		}
//		
//		System.out.println("가장 큰 수는 " + max + "입니다." );
//		
//		sc.close();
		
		
		
		
//		//-----------------------
//		//4 문제
//		//-----------------------
//		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("세 개의 정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		
//		double avg = sum / 3.0;
//		
//		System.out.println("합 : " + sum);
//		System.out.println("평균 : " + avg);
//		
//		sc.close();
//		
		
		//-----------------------
		//5 문제
		//-----------------------
//		입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
//		입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		if(num%2==0)
//		{
//			//짝수
//			if(num%3==0) {
//				//짝수&&3의배수
//			}
//		}
//		else
//		{
//			//홀수
//			if(num%5==0) {
//				//홀수&&5의배수
//			}
//		}
//		sc.close();
		
		//-------------------------
		//IF - ELSE IF - ELSE
		// ------------------------
		//과목1,2,3,4 중 하나라도 40점 미만이면 불합격
		//과목 평균이 100점 만점 기준으로 60점 미만이면 불합격
		//아니면 합격
		//국어, 영어, 수학, 과학 하나라도 40점 미만이거나 평균 60점 미만이면 불합격
		// 그 외 : 합격
//		Scanner sc = new Scanner(System.in);
//		
//		int 국어 = sc.nextInt();
//		int 영어 = sc.nextInt();
//		int 수학 = sc.nextInt();
//		int 과학 = sc.nextInt();
//		double 평균 = (double)(국어+영어+수학+과학)/4;
//		
//		if(국어<40)
//			System.out.println("불합격");
//			else if(영어<40) //국어>=40 && 영어<40
//				System.out.println("불합격");
//			else if(수학<40) //국어>=40 && 영어>=40 && 수학<40
//				System.out.println("불합격");
//			else if(과학<40) //국어>=40 && 영어>=40 && 수학>=40 && 과학<40
//				System.out.println("불합격");
//			else if(평균<60) //국어>=40 && 영어>=40 && 수학>=40 && 과학>=40 && 평균<60
//				System.out.println("불합격");
//			else //국어>=40 && 영어>=40 && 수학>=40 && 과학>=40 && 평균>=60
//				System.out.println("합격");	
//		
//		if(국어>=40 && 영어>=40 && 수학>=40 && 과학>=40 && 평균>=60) {
//			System.out.println("합격");	
//		}else {
//			System.out.println("불합격");
//		}
//		
//		if(국어<40||영어<40||수학<40||과학<40||평균<60) {
//			System.out.println("불합격");
//		}else {
//			System.out.println("합격");
//		}
//		
//		sc.close();
		
		
		//문제
		
		//시험 점수를 입력 받아
		//90 ~ 100점은 A,		-> 점수>=90
		//80 ~ 89점은  B,		-> 점수<90 && 점수>=80
		//80 ~ 89점은  C,		-> 점수<80 && 점수>=70
		//80 ~ 89점은  D,		-> 점수<70 && 점수>=60
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오. 점수<60
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : " );
		int s = sc.nextInt();
		
		if (s>=90) {
			System.out.println("A");
		}
		else if (s >= 80) {
			System.out.println("B");
		}
		else if (s >= 70) {
			System.out.println("C");
		}
		else if (s >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		sc.close();
		
		
		
	}
}











