package Ch08.Team0.Impl.박한결;


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
		int i = 0;
		for (int num: arg){
			i += num;
		System.out.println(i);		
		}
	}

	@Override
	public void sum(String... arg) {
		int i = 0;
		for (String num: arg){
			int val = Integer.parseInt(num);
			i += val;
		System.out.println(i);		
		}
		
	}

	@Override
	public String getTeamName() {
		System.out.println("1조");
		return null;
	}

	@Override
	public String getUsername() {
		System.out.println("박한결");
		return null;
	}

}
