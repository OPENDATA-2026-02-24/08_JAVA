package Ch08.Team0.Impl.박형규;

import Ch08.Common.Information;
import Ch08.Team0.Interfaces.SumInterface;

public class SumImpl implements SumInterface,Information{

	@Override
	public void sum(int a, int b) {
		System.out.println("a와 b의 합 : " + (a+b));
		
	}

	@Override
	public void sum(int a, int b, int c) {
		System.out.println("a와 b와 c의 합 : " + (a+b+c));
		
	}

	@Override
	public void sum(int... arg) {
		int sum = 0;
		for(int i : arg) {
			sum += i;
		}
		System.out.println("arg의 합 : " + sum);
		
	}

	@Override
	public void sum(String... arg) {
		int result = 0;
		int i = 0;
		for(i=0; i<arg.length; i++) {
			String r = arg[i];
			result = Integer.parseInt(r); 
		}
		System.out.println("arg의 합 " + result);
	}

	@Override
	public String getTeamName() {
		
		return "1조";
	}

	@Override
	public String getUsername() {
		
		return "박형규";
	}
	
}
