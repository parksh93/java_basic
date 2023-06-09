package poly.inheri;

abstract public class Monster {
	private String name;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public boolean isInactive() {
		return hp <= 0 ? true : false;
	}
	public boolean isAttackedInactive() {
		return hp <= 0 ? true : false;
	}
	
	public void isAttackeMonster(int userAtk) {
		hp -= (userAtk - def);
	}
	
	public int showCounterAtk(int userDef, int userHp) {
		if (atk > 0 && atk - userDef < 1) {
			userHp -= 1;
		}else if(atk == 0){
			return userHp;
		}else {
			userHp -= (atk - userDef);
		}
		return userHp;
	}
	
}
