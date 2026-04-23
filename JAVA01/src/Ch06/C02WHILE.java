//package Ch06;
//
//import java.util.Scanner;
//
//public class C02WHILE {
//	
//	public static void main(String[] args) {
		
		// 2 - 9 단 출력
		
//		dan		i
//		2		1
//				2
//				..
//				9
//		--------------------
//		dan=2		i=1
//		dan++		i++
//		dan<10		i<10
		
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
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
//		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan = n;
//		while(dan<(m+1)) {
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
		

		// N - M 단 출력 거꾸로 9 x 9 , 9 x 8 ....
	
//		dan		i
//		n , m(n<m)
//		m		9
//				8
//				..
//				1
//		m-1		1
//				2
//				..
//				9
//
//		n		9
//				8
//				..
//				1
//		--------------------
//		dan=m		i=9
//		dan--		i--
//		dan>n-1		i>0
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
//		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan = m;
//		while(dan>n-1) {
//			
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			
//			System.out.println();
//			dan--;
//		}
//		sc.close();
		
		// 1) 고정높이 
				// *****
				// *****
				// *****
				// *****
//		int i = 0;
//		while(i<4) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
				
				// 2)
				// 높이 : 4 
				// *****
				// *****
				// *****
				// *****
//			Scanner sc = new Scanner(System.in);
//			int h = sc.nextInt();
//			int i=0;
//			while(i<h) {
//			
//			int j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//			sc.close();
		

				// 3) 고정높이
				// * 
				// ** 
				// *** 
				// ****
//				int i = 0;
//				while(i < 4) {
//				int j = 0;
//				
//				while(j<=i) {
//					System.out.print("*");
//					j++;
//				}
//				System.out.println();
//				i++;
//			}
				
				// 4)
				// 높이 : 4 
				// * 
				// ** 
				// *** 
				// ****
//				Scanner sc = new Scanner(System.in);
//				System.out.print("높이 : ");
//				int height = sc.nextInt();
//				
//				int i = 0;
//				while(i < height) {
//					int j = 0;
//					
//					while(j<=i) {
//						System.out.print("*");
//						j++;
//					}
//					System.out.println();
//					i++;
//				}
//					sc.close();
				
				// 5) 
				//높이 : 4
				//****
				//***
				//**
				//*
//				Scanner sc = new Scanner(System.in);
//				System.out.print("높이 : ");
//				int height = sc.nextInt();
//		
//				int i = 0;
//				while(i < height) {
//					int j = 0;
//			
//					while(j <height -i) {
//						System.out.print("*");
//						j++;
//					}
//					System.out.println();
//					i++;
//				}
//				sc.close();
				
				//6)
				//높이 : 4
				//   *
				//  ***
				// *****
				//*******
//			Scanner sc = new Scanner(System.in);
//			System.out.print("높이 : ");
//			int height = sc.nextInt();
//
//			int i = 0;
//			while(i < height) {
//			int j = 0;
//	
//			while(j <height -i - 1) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k < 2 * i + 1) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();
		

				//7)
				//높이 : 4
				//*******
				// *****
				//  ***
				//   *
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int height = sc.nextInt();
//
//		int i = 0;
//		while(i < height) {
//		int j = 0;
//
//		while(j < i) {
//			System.out.print(" ");
//			j++;
//		}
//		int k = 0;
//		while(k < (2 * (height - i)) -1) {
//			System.out.print("*");
//			k++;
//		}
//		System.out.println();
//		i++;
//	}
//	sc.close();

				//8) 고정높이
				//   *
				//  ***
				// *****
				//*******
				// *****
				//  ***
				//   *
//				int height = 4;
//				
//				int i = 0;
//				while(i < height) {
//					
//					int j = 0;
//					while(j < height -i -1) {
//						System.out.print(" ");
//						j++;
//					}
//					int k = 0;
//					while(k < 2 * i + 1) {
//						System.out.print("*");
//						k++;
//				}
//					System.out.println();
//					i++;
//			}
//				i = height -2;
//				while(i>=0) {
//					int j = 0;
//					while(j < height -i -1) {
//						System.out.print(" ");
//						j++;
//					}
//					int k = 0;
//					while(k < 2 * i + 1) {
//						System.out.print("*");
//						k++;
//				}
//					System.out.println();
//					i--;
//			}
				
				
				//9)
				//높이 : 7
				//   *
				//  ***
				// *****
				//*******
				// *****
				//  ***
				//   *
//				Scanner sc = new Scanner(System.in);
//				int height;
//				
//				while (true) {
//					System.out.print("높이 : ");
//					height = sc.nextInt();
//				
//				if (height < 3) {
//					System.out.println("3 이상 입력하세요 ");
//				}	else if(height % 2 == 0) {
//						System.out.println("홀수만 입력하세요 ");
//					}
//					else{
//						break;
//					}
//	}
//				
//				int mid = height / 2;
//				
//				int i = 0;
//				while(i<=mid) {
//					
//					int j = 0;
//					while(j < mid -i) {
//					System.out.print(" ");
//					j++;
//				}
//				int k = 0;
//				while(k < 2 * i + 1) {
//					System.out.print("*");
//					k++;
//				}
//				System.out.println();
//				i++;
//	}
//				
//				i = mid -1;
//				while(i>=0) {
//					int j = 0;
//					while(j < mid - i) {
//						System.out.print(" ");
//						j++;
//					}
//					int k = 0;
//					while(k < 2 * i + 1) {
//						System.out.print("*");
//						k++;
//					}
//					System.out.println();
//					i--;
//					
//				}

				
				
				
				// 10)
				// 높이 : 7
				//*******
				// *****
				//  ***
				//   *
				//  ***
				// *****
				//*******
//				Scanner sc = new Scanner(System.in);
//				int height;
//		
//				while (true) {
//					System.out.print("높이 : ");
//					height = sc.nextInt();
//		
//					if (height < 3) {
//						System.out.println("3 이상 입력하세요 ");
//					} else if(height % 2 == 0) {
//						System.out.println("홀수만 입력하세요 ");
//					} else{
//						break;
//					}
//				}
//					int mid = height / 2;
//					
//					int i = 0;
//					while(i<=mid) {
//						
//						int j = 0;
//						while(j < i) {
//						System.out.print(" ");
//						j++;
//					}
//						
//					int k = 0;
//					while(k < height - 2 * i) {
//						System.out.print("*");
//						k++;
//					}
//					
//					System.out.println();
//					i++;
//		}
//					
//					i = mid -1;
//					while(i>=0) {
//						int j = 0;
//						while(j < i) {
//							System.out.print(" ");
//							j++;
//						}
//						
//						int k = 0;
//						while(k < height - 2 * i) {
//							System.out.print("*");
//							k++;
//						}
//						System.out.println();
//						i--;
//						
//					}
//				sc.close();
//
//		}
//	}