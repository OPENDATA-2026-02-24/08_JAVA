package Ch08.Team0.Impl.박영준;

import Ch08.Common.Information;
import Ch08.Team0.Interfaces.SumInterface;

public class SumImpl implements SumInterface,Information{

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
		
		
	}

	@Override
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}

	@Override
	public void sum(int... arg) {
		int total=0;
		for(int i=0; i<arg.length;i++) {
			total+=arg[i];
		}
		System.out.println(total);
	}

	@Override
	public void sum(String... arg) {
		String result="";
		for(int i=0; i<arg.length;i++) {
			result+=arg[i];
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
		return "박영준";
	}



}
