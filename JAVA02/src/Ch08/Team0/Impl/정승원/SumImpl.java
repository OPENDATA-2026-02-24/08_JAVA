package Ch08.Team0.Impl.정승원;

import Ch08.Common.Information;
import Ch08.Team0.Interfaces.SumInterface;

public class SumImpl implements SumInterface,Information {

	@Override
	public void sum(int a, int b) {
		System.out.println("두 수의 합 : " + (a + b));
		
	}

	@Override
	public void sum(int a, int b, int c) {
		System.out.println("세 수의 합 : " + (a + b + c));
		
	}

	@Override
	public void sum(int... arg) {
		int sum = 0;
		for (int n : arg) {
			sum += n;
		}
		System.out.println("모든 수의 합 : " + sum);
	}

	@Override
	public void sum(String... arg) {
		int sum = 0;
		for (String s : arg) {
			sum += Integer.parseInt(s);
		}
		System.out.println("모든 문자 수의 합 : " + sum);
	}

	@Override
	public String getTeamName() {
		// TODO Auto-generated method stub
		return "1조";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return "정승원";
	}
	
}
