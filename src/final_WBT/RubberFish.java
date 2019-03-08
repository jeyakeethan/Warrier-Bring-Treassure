package final_WBT;

public class RubberFish extends Fish {
	public RubberFish(String name) {
		this.setName(name);
	}

	/*
	 * Each Fish thread waits for warrior arrival If one come, immediately eat its
	 * fins, if that is not immortal
	 */
	public void attackWarrior(Node node) {
		Warrior warrior = node.getWarrior();
		if (warrior.mobility) {
			if (!warrior.isImmortal()) {
				warrior.setMobility(false);
				warrior.fin = null;
				System.out.println(String.format("%s has eaten fins of the %s => %s can't move anymore\n",
						this.getName(), node.getWarrior().getName(), node.getWarrior().getName()));
			} else {
				System.out.println(String.format("%s has escaped from %s as %s is immortal\n",
						node.getWarrior().getName(), this.getName(), node.getWarrior().getName()));
				node.setWarrior(null);
			}
		}
	}
}
