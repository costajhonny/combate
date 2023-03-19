package packegeExercises;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armoor;

	public Champion(String name, int life, int attack, int armoor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armoor = armoor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmoor() {
		return armoor;
	}

	int damage;

	public void takeDamange(Champion other) {
		damage = other.getAttack() - this.armoor;

		if (damage < 1) {
			damage = 1;
		}

		this.life -= damage;

		if (this.life < 0) {
			this.life = 0;
		}
	}

	public String status() {
		if (this.life == 0) {
			return this.name + " : " + this.life + " de vida (morreu)";

		} else {
			return this.name + " : " + this.life + " de vida ";
		}

	}
}
