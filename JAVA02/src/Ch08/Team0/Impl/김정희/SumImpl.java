package Ch08.Team0.Impl.김정희;

import Ch08.Common.Information;
import Ch08.Team0.Interfaces.SumInterface;

public class SumImpl implements SumInterface,Information {

	@Override
	public void sum(int a, int b) {
		System.out.println("a + b = "+ (a+b));
	}

	@Override
	public void sum(int a, int b, int c) {
		System.out.println("a + b + c = "+ (a+b+c));
		
	}

	@Override
	public void sum(int... arg) {
		int s=0;
		for(int numb : arg)
			s+=numb;
		System.out.println("총 합 : "+s);
	}

	@Override
	public void sum(String... arg) {
//		String s = "";
//		for(String sentence : arg)
//			s+=sentence;
		int s=0;
		for(String numb : arg)
			s+= Integer.parseInt(numb);
		System.out.println(s);
	}

	@Override
	public String getTeamName() {
		return "2조";
	}

	@Override
	public String getUsername() {
		return "김정희";
	}

	

}
