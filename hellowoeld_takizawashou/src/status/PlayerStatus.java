package status;

import java.util.Random;

public class PlayerStatus extends Status {

	public PlayerStatus(String name) {
		super(name);

		Random rand = new Random();

		// 毎回ランダム
		setHp(rand.nextInt(1000)); // 100～999
		setMp(rand.nextInt(1000));
		setAttack(rand.nextInt(1000));
		setSpeed(rand.nextInt(1000));
		setDefense(rand.nextInt(1000));
	}
}