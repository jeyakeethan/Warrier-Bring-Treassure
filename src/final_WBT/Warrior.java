package final_WBT;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class Warrior implements Inhabitant, Runnable {
	public static int noOfWarriors = 0;
	protected volatile boolean treasureGrabbed = false;
	protected static Random random = new Random();
	protected Node node;

	protected String name;
	protected boolean Immortal;
	protected boolean mobility;
	protected Treasure treasure;
	protected Fin fin = new Fin();
	protected Binocular binocular;
	protected Node[][] grid;

	public abstract void swim();

	public abstract void sleep();

	/*
	 * run each warrior's thread until the treasure is grabbed, the warrior dies or
	 * the warrior become immobile.
	 */
	public void run() {
		while (!treasureGrabbed && mobility)
			this.swim();
	}

	/*
	 * A common eating method for both Super and Normal warrior. but, lotus is
	 * visible to Super Warrior only.
	 */
	public void eatLotus(Lotus lotus) {
		if (!isImmortal() && lotus.getPetalAvailability()) {
			this.setImmortal(true);
		}
		lotus.decrementPetal();
		System.out.println(String.format("%s has eaten a lotus petal and become immortal\n", name));
	}

	/*--- Getter setter section ---*/
	public void grabTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNoOfWarriors() {
		return noOfWarriors;
	}

	public Node getNode() {
		return node;
	}

	public boolean isImmortal() {
		return Immortal;
	}

	public void setImmortal(boolean Immortal) {
		this.Immortal = Immortal;
	}

	public void setMobility(boolean mobility) {
		this.mobility = mobility;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public void setTreasureGrabbed(boolean treasureGrabbed) {
		this.treasureGrabbed = treasureGrabbed;
	}

	public void setGrid(Node[][] grid) {
		this.grid = grid;
	}
}