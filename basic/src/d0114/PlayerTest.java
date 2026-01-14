package d0114;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player py = new Player();
		py.play(1);
		py.upgradeLevel(new AdvancedLevel());
		py.play(1);
		py.upgradeLevel(new SuperLevel());
		py.play(1);
	}

}

	