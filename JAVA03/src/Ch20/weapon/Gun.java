package Ch20.weapon;

import Ch20.unit.Unit;

public abstract class Gun {
	
	int maxBuillitCnt;
	int curBuillitCnt;
	int power;
	
	abstract void fire(Unit unit);
	abstract void reload(int bullit);

}
