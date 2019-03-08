package final_WBT;

public class InnocentFish extends Fish {
	public InnocentFish(String name) {
		this.setName(name);
	}

	/*
	 * Each Fish thread waits for warrior arrival. It does nothing, just notifies
	 * that it is harmless.
	 */
	public synchronized void attackWarrior(Node node) {
		Warrior warrior = node.getWarrior();
		System.out.println(String.format("I don't make you anything. Calm Down!"));
		node.setWarrior(null);
	}
}
