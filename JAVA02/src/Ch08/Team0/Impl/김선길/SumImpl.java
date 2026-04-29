package Ch08.Team0.Impl.김선길;

import Ch08.Common.Information;
import Ch08.Team0.Interfaces.SumInterface;

public class SumImpl implements SumInterface,Information {

	@Override
	public void sum(int a, int b) {
		System.out.println(a + b);
		
	}

	@Override
	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
		
	}

	@Override
	public void sum(int... arg) {
		int total = 0;
		
		for (int num : arg) {
			total += num;
		}
		
		System.out.println(total);
		
	}
	
	@Override
	public void sum(String... arg) {
		int total = 0;
		
		for (String s : arg) {
			total += Integer.parseInt(s);
		}
		
		System.out.println(total);
		
	}

	@Override
	public String getTeamName() {
		// TODO Auto-generated method stub
		return "1조";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return "김선길";
	}

}
