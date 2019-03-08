package final_WBT;

public class KillerFish extends Fish {

	public KillerFish(String name) {
		this.setName(name);
	}

	/*
	 * Each Fish thread waits for warrior arrival If one come, immediately eat that
	 * if that is not immortal
	 */
	public void attackWarrior(Node node) {
		Warrior warrior = node.getWarrior();
		if (!warrior.isImmortal()) {
			warrior.setMobility(false);
			node.setWarrior(null);
			System.out.println(String.format(this.getName() + " has killed " + warrior.getName() + "\n"));
		} else {
			node.setWarrior(null);
			System.out.println(String.format("%s has escaped from %s as %s is an immortal\n", warrior.getName(),
					this.getName(), warrior.getName() + "\n"));
		}
	}
}