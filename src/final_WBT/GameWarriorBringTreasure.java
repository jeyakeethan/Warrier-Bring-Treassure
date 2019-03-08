package final_WBT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * This is the main class having all objects(Composition). Game is started in
 * this class
 * 
 */
public class GameWarriorBringTreasure {
	public static ArrayList<Fish> fishList = new ArrayList<>();
	public static ArrayList<Warrior> warriorList = new ArrayList<>();

	public static ArrayList<Inhabitant> inhabitantList = new ArrayList<>();

	public static Thread[] warriorThreads;
	public static Thread[] fishThreads;

	public static void main(String[] args) {
		GUI gui = new GUI();
		Grid.setGui(gui);
		Grid.generateNodes();
		Grid.fillGridWithNode();

		/*
		 * Four Warrior objects are created and set them into one side of the grid.
		 */
		Warrior normalWarrior1 = new NormalWarrior("Warrior A");
		Warrior normalWarrior2 = new NormalWarrior("Warrior B");
		Warrior superWarrior1 = new SuperWarrior("Super Warrior A");
		Warrior superWarrior2 = new SuperWarrior("Super Warrior B");
		Grid.setInhabitantPosition(0, 0, normalWarrior1);
		Grid.setInhabitantPosition(3, 0, normalWarrior2);
		Grid.setInhabitantPosition(6, 0, superWarrior1);
		Grid.setInhabitantPosition(10, 0, superWarrior2);
		inhabitantList.add(normalWarrior1);
		inhabitantList.add(normalWarrior2);
		inhabitantList.add(superWarrior1);
		inhabitantList.add(superWarrior2);
		warriorList.add(normalWarrior1);
		warriorList.add(normalWarrior2);
		warriorList.add(superWarrior1);
		warriorList.add(superWarrior2);

		/*
		 * Six Fish objects are created and randomly set to the grid locations.
		 */
		Fish rubberFish1 = new RubberFish("Rubber Fish A");
		Fish rubberFish2 = new RubberFish("Rubber Fish B");
		Fish killerFish1 = new KillerFish("Killer Fish A");
		Fish killerFish2 = new KillerFish("Killer Fish B");
		Fish innocentFish1 = new InnocentFish("Innocent Fish A");
		Fish innocentFish2 = new InnocentFish("Innocent Fish B");
		Grid.setInhabitantPosition(rubberFish1);
		Grid.setInhabitantPosition(rubberFish2);
		Grid.setInhabitantPosition(killerFish1);
		Grid.setInhabitantPosition(killerFish2);
		Grid.setInhabitantPosition(innocentFish1);
		Grid.setInhabitantPosition(innocentFish2);
		inhabitantList.add(rubberFish1);
		inhabitantList.add(rubberFish2);
		inhabitantList.add(killerFish1);
		inhabitantList.add(killerFish2);
		inhabitantList.add(innocentFish1);
		inhabitantList.add(innocentFish2);
		fishList.add(rubberFish1);
		fishList.add(rubberFish2);
		fishList.add(killerFish1);
		fishList.add(killerFish2);
		fishList.add(innocentFish1);
		fishList.add(innocentFish2);

		/*
		 * Five lotus objects are created and randomly set to the grid locations.
		 */
		Lotus lotus1 = new Lotus("lotus A");
		Lotus lotus2 = new Lotus("lotus B");
		Lotus lotus3 = new Lotus("lotus C");
		Lotus lotus4 = new Lotus("lotus D");
		Lotus lotus5 = new Lotus("lotus E");
		Grid.setInhabitantPosition(lotus1);
		Grid.setInhabitantPosition(lotus2);
		Grid.setInhabitantPosition(lotus3);
		Grid.setInhabitantPosition(lotus4);
		Grid.setInhabitantPosition(lotus5);

		/*
		 * Treasure is fixed and the only at 5,5 in this game and warriors know it.
		 */
		Treasure treasure1 = new Treasure("TheTreasure");
		Grid.setInhabitantPosition(5, 5, treasure1);

		/*
		 * Print out all the inhabitant objects
		 */
		for (Inhabitant i : inhabitantList) {
			System.out.println(i.getClass().getName() + " : " + i.getName() + " @ " + i.getNode().toString());
		}
		System.out.println();

		/*
		 * Create and start threads for all warriors.
		 */
		warriorThreads = new Thread[warriorList.size()];
		int count = 0;
		for (Warrior warrior : warriorList) {
			warriorThreads[count] = new Thread(warrior);
			warriorThreads[count].start();
			treasure1.registerWarrior(warrior);
			count++;
		}

		/*
		 * Create and start threads for all fishes.
		 */
		fishThreads = new Thread[fishList.size()];
		count = 0;
		for (Fish fish : fishList) {
			fishThreads[count] = new Thread(fish);
			fishThreads[count].start();
			count++;
		}
	}

	/*
	 * Stop all fish threads after treasure has been grabbed.
	 */
	public static void stopGame() {
		for (Thread fish : fishThreads) {
			fish.interrupt();
		}
	}
}
