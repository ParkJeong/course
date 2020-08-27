package game;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		this.level = new BeginnerLevel();
		this.level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return this.level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		this.level.showLevelMessage();
	}
	
	public void play(int count) {
		this.level.go(count);
	}
}
