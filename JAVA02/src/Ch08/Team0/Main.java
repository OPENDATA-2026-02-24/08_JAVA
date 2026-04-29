package Ch08.Team0;


import Ch08.Common.Information;
import Ch08.Team0.Interfaces.SumInterface;

public class Main {
	
    static SumInterface 정승원_sum;
    static SumInterface 박한결_sum;
    static SumInterface 김선길_sum;
    static SumInterface 박형규_sum;
    static SumInterface 강현욱_sum;
    static SumInterface 김정희_sum;
    static SumInterface 박영준_sum;
	
	
	public static void init () {
//        정승원_sum = new Ch08.Team0.impl.정승원.SumImpl();
//        박한결_sum = new Ch08.Team0.impl.박한결.SumImpl();
//        김선길_sum = new Ch08.Team0.impl.김선길.SumImpl();
//        박형규_sum = new Ch08.Team0.impl.박형규.SumImpl();
//        강현욱_sum = new Ch08.Team0.impl.강현욱.SumImpl();
//        김정희_sum = new Ch08.Team0.impl.김정희.SumImpl();
//        박영준_sum = new Ch08.Team0.impl.박영준.SumImpl();
//	}
	public static void test_sum(SumInterface sumImpl) {
		Information info = (Information)sumImpl;
		System.out.printf("======= %s========\n", info.getTeamName());
		System.out.printf("======= %s========\n", info.getUsername());
		System.out.println("sum(int a,int b)"); 
		sumImpl.sum(10,20);
		System.out.println("sum(int a,int b,int c)");
		sumImpl.sum(10,20,30,40);
		System.out.println("sum(int ...a)");
		sumImpl.sum(10,20,30,40,50);
		System.out.println("sum(String ...args)");
		sumImpl.sum("11","22","33","44");
	}
	public static void main(String[] args) {
        init();

        SumInterface[] impls = {
            정승원_sum, 박한결_sum, 김선길_sum, 박형규_sum,
            강현욱_sum, 김정희_sum, 박영준_sum
        };

        for (SumInterface impl : impls) {
        	System.out.println();
            test_sum(impl);
            System.out.println();
        }
		
	}
}
