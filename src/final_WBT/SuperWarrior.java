package final_WBT;

public class SuperWarrior extends Warrior {

	public SuperWarrior(String name) {
		noOfWarriors++;
		this.name = name;
		this.Immortal = false;
		this.mobility = true;
		this.binocular = new Binocular();
	}

	public synchronized void swim() {
		int x = getNode().getX();
		int y = getNode().getY();
		Node newNode = null;
		
		//See whether any lotus nearby using binocular
		if (!Immortal) {
			newNode = binocular.lookArround(getNode());
			if (newNode != null) {
				if (!newNode.setInhabitant(this)) {
					newNode = null;
				} else {
					grid[x][y].clearWarrior();
					setNode(newNode);
				}
			}
		}
		
		//If no lotus found, does usual movement
		if (newNode == null) {
			int randDirection = random.nextInt(2);
			switch (randDirection) {
			case 0:
				// move in y direction if random number is zero
				if (y < 5 && grid[x][y + 1].setInhabitant(this)) {
					this.setNode(grid[x][y + 1]);
					break;
				} else if (y > 5 && grid[x][y - 1].setInhabitant(this)) {
					this.setNode(grid[x][y - 1]);
					break;
				} else if (y < 10 && grid[x][y + 1].setInhabitant(this)) {
					this.setNode(grid[x][y + 1]);
					break;
				} else {
					randDirection = 1;
				}
			case 1:
				// move in x direction if random number is one
				if (x < 5 && grid[x + 1][y].setInhabitant(this)) {
					this.setNode(grid[x + 1][y]);
					break;
				} else if (x > 5 && grid[x - 1][y].setInhabitant(this)) {
					this.setNode(grid[x - 1][y]);
					break;
				} else if (x < 10 && grid[x + 1][y].setInhabitant(this)) {
					this.setNode(grid[x + 1][y]);
					break;
				} else if (x > 1 && grid[x - 1][y].setInhabitant(this)) {
					this.setNode(grid[x - 1][y]);
					break;
				} else {
					break;
				}
			}
		}
		sleep();
	}

	/*
	 * put each warrior for 1s after each movement to see their movements.
	 */
	public void sleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}
