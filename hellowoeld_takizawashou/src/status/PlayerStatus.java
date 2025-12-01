package status;

import java.util.Random;

public class PlayerStatus extends Status {

	public PlayerStatus(String name) {
		super(name);

		Random rand = new Random();

		// 毎回ランダム
		setHp(rand.nextInt(900) + 100); // 100～999
		setMp(rand.nextInt(900) + 100);
		setAttack(rand.nextInt(900) + 100);
		setSpeed(rand.nextInt(900) + 100);
		setDefense(rand.nextInt(900) + 100);
	}
}