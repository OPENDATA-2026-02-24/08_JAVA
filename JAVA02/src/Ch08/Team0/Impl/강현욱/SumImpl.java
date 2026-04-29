package Ch08.Team0.Impl.강현욱;

import Ch08.Common.Information;
import Ch08.Team0.Interfaces.SumInterface;

public class SumImpl implements SumInterface,Information {

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + b);
	}

	@Override
	public void sum(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println(a+b+c);
	}

	@Override
	public void sum(int... arg) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<arg.length; i++) {
			sum += arg[i];
		}
		System.out.println(sum);
	}

	@Override
	public void sum(String... arg) {
		// TODO Auto-generated method stub
		String []sumArray = new String[arg.length];
		int result = 0;
		for(int i=0; i<arg.length; i++) {
			sumArray[i] = arg[i];
			result += Integer.parseInt(sumArray[i]);
		}
		System.out.println(result);
	}

	@Override
	public String getTeamName() {
		// TODO Auto-generated method stub
		return "2조";
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return "강현욱";
	}
	
}
