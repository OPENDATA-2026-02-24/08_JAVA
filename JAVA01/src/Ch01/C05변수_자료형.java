package Ch01;

public class C05변수_자료형 {

	public static void main(String[] args) {
		// -------------------------------
		//정수 int - 4byte 정수 부호 o
		// -------------------------------
//		int n1 = 0b10101101;
//		int n2 = 173;
//		int n3 = 0255;
//		int n4 = 0xad;
//		System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);
		
		//----------------------------
		//정수 byte - 1byte 정수 부호 o
		// ---------------------------
//		byte n5 = (byte)-129;			//
//		byte n6 = -30;			
//		byte n7 = 30;
//		byte n8 = 127;		
//		byte n9 = (byte)129;			//
//		System.out.println("n6 : " + n6);
//		System.out.println("n6 : " + n9);
//		System.out.println(Integer.toBinaryString(129));
		
		
		//---------------------------
		//정수 short-2byte정수 부호o | char-2byte정수 부호x(양수만)
		//---------------------------
		
//		char n1 = 65535; //		(0~2^16-1)	(0~65535)
//		short n2 = 32767; //	(-2^15 ~ +2^15-1)(-32768 ~ + 32767)
//		
//		System.out.printf("n1 : ", + n1);	//왜 0이 나올까요?
//		short n4 = (short)n1; //문제발생... 왜??
//		
//		System.out.printf("%d\n",n4);
//		System.out.println(Integer.toBinaryString(65535));
		
		//--------------------------
		//정수 long-8byte 정수 부호o
		//--------------------------
//
//		long n1 = 1000000000;	//10억
//		long n2 = 20;	//L,l (리터럴접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 1000000000;//문제발생
//		long n4 = 1000000000;

		
		//---------------------
		//실수
		//---------------------
		//유리수와 무리수의 통칭
		//소숫점 이하값을 가지는 수 123.456
		//float : 4byte 실수(6-9자리)
		//double : 8byte 실수(15-18자리), 기본자료형
		
//		//정밀도 확인
//		float n1 = 0.123456789123456789F; //f,F:float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		
//		//오차 확인
//		float num = 0.1F;
//		for(int i=0;i<=1E5;i++) {
//			num=num+0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num : " + num);
		
		
		//-----------------------
		//단일문자 char 2byte 정수
		//-----------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1);
//		System.out.println(Integer.toBinaryString(ch1));
//		System.out.println("------------------------");
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2);
//		System.out.println(Integer.toBinaryString(ch2));
//		System.out.println("------------------------");
//		
//		char ch3 = 'b' + 1;
//		System.out.println(ch3);
//		System.out.println((int)ch3);
//		System.out.println(Integer.toBinaryString(ch3));
//		
//		System.out.println((char)0b1010110000000000);
//		char ch4 = 0xac02;
//		System.out.println(ch4);
//		System.out.println((int)ch4);
//		System.out.println(Integer.toBinaryString(ch4));
		
//		System.out.println("----------------");
//		// \\u : 유니코드 이스케이프 문자
//		System.out.printf("%c\n", 0xac03);
//		System.out.printf("%c\n", '\uac03');
		
		//--------------------
		//boolean : 논리형(true/false 저장)
		//--------------------
//			boolean flag = (10>11);		// 참(긍정)
//			if(flag)
//			{
//				System.out.prinln("참인 경우 실행");
//			}
//			else
//			{
//				System.out.println("거짓인 경우 실행");
//			}
		
		//-------------------
		//문자열 : String (클래스자료형)
		//-------------------
		//기본자료형(원시타입)
		//byte n1;
		//short n2;
		//double n3;
		//long n4;
		
		//클래스 자료형
		//클래스 자료형으로 만든 변수는 '참조변수'라고 하고
		//참조 변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		int n1 = 10;
		byte n2 = 20;
		char n3 = 40;
		
		String name = "홍길동";
		String job = "프로그래머";
		
		
		
		
		
		}
		
	}
