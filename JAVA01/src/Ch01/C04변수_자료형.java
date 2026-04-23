package Ch01;

public class C04변수_자료형 {
	
	public static void main(String[] args) {

		int num1;					// int만큼 크기(4byte)의 공간 형성 + num1 이름 부여(변수 정의)
		num1 = 10;					// 10이라고 하는 값(리터럴 상수)를 상수POOL에 저장, num1 공간에 대입(복사)
		int num2 = 4;				// 4라는 값(리터럴 상수)를 상수POOL저장, 4byte정수 공간 num2 초기화
		int num3 = num1 + num2;		// num1 안의 값과 num2 안의 값의 덧셈 결과(CPU 가산 처리)를 byte 정수 공간 num3에 초기화
		System.out.println(num3);	// num3 안의 값을 println 메서드로 전달해서 내부적으로 표준 출력 처리
		
		//	Data(수,자료) : 선 저장 / 후 처리
		// 변수 : 개발자의 유지보수 측면에서 유리하도록 하기 위해 지정한 수(바뀔 예정인 수)
		// 변수명 : 저장되어져 있는 변수 공간에 접근하기 위한 문자 형태의 주소 
		// 자료형 : Data(수,자료)를 저장하기 위한 공간을 형성하고 저장 될 자료의 형태를 제환하는 예약어
		// =연산자 :
		// lv(공간) = rv(값) rv를 먼저 처리(저장 or 연산) 한 다음 lv에 대입
}
	
}
