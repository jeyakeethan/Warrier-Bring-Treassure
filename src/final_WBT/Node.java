package final_WBT;

public class Node extends Grid {
	private Fish fish;
	private Warrior warrior;
	private Lotus lotus;
	private Treasure treasure;
	private int x, y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		setFish(null);
		setWarrior(null);
		setLotus(null);
		setTreasure(null);
	}

	/*
	 * Set an inhabitant to a suitable variable in a particular node with which it
	 * called When initially assign inhabitants When warrior move to one node from
	 * another also handle the GUI accordingly
	 */
	public synchronized boolean setInhabitant(Inhabitant inhabitant) {
		if (inhabitant instanceof Warrior) {
			if (getWarrior() == null) {
				inhabitant.getNode().clearWarrior();
				setWarrior((Warrior) inhabitant);
				if (lotus == null && fish == null && treasure == null) {
					if (inhabitant instanceof SuperWarrior)
						gui.setSuperlWarrior(x, y);
					else
						gui.setNormalWarrior(x, y);
				}
				notifyAll();
				if (lotus != null) {
					gui.setEatLotus(x, y);
					((Warrior) inhabitant).eatLotus(lotus);
				} else if (fish != null) {
					if (fish instanceof KillerFish)
						gui.setKillWarrior(x, y);
					else if (fish instanceof RubberFish)
						gui.setEatFin(x, y);
					else
						gui.setCompassion(x, y);
				}
				if (treasure != null) {
					gui.setGrabTreasure(x, y);
					((Warrior) inhabitant).grabTreasure(treasure);
					treasure.notifyTreasureIsGrabbed(((Warrior) inhabitant));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					gui.setGameFinished();
				}
			} else {
				return false;
			}
		} else if (inhabitant instanceof Fish) {
			this.setFish((Fish) inhabitant);
			this.getFish().setNode(this);
			if (inhabitant instanceof InnocentFish)
				gui.setInnocentFish(x, y);
			else if (inhabitant instanceof RubberFish)
				gui.setRubberFish(x, y);
			else
				gui.setKillerFish(x, y);
		} else if (inhabitant instanceof Lotus) {
			this.setLotus((Lotus) inhabitant);
			gui.setLotus(x, y);
		} else if (inhabitant instanceof Treasure) {
			this.setTreasure((Treasure) inhabitant);
			gui.setTreasure(x, y);
		}
		return true;
	}

	/*
	 * Warrior call this when he leaves a node Always called with Warriors' threads
	 */
	public synchronized void clearWarrior() {
		setWarrior(null);
		if (lotus != null)
			gui.setLotus(x, y);
		else if (fish != null) {
			if (fish instanceof KillerFish)
				gui.setKillerFish(x, y);
			else if (fish instanceof RubberFish)
				gui.setRubberFish(x, y);
			else
				gui.setInnocentFish(x, y);
		} else {
			gui.resetNode(x, y);
		}
	}

	/*
	 * Wait until any warrior entering into this node. For to call by Fishes This
	 * will call attackWarrior This notification are handled with fishes' threads
	 */
	public synchronized void lookArround() {
		while (getWarrior() == null) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		getFish().attackWarrior(this);
	}

	/*--- Getter and Setter Section ---*/
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private void setCordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
	}

	public Warrior getWarrior() {
		return warrior;
	}

	public void setWarrior(Warrior warrior) {
		this.warrior = warrior;
	}

	public Lotus getLotus() {
		return lotus;
	}

	public void setLotus(Lotus lotus) {
		this.lotus = lotus;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}
}