
abstract class Game {
	protected abstract void initialize();

	protected abstract void startPlay();

	protected abstract void endPlay();

	public final void play() {
		initialize();

		startPlay();

		endPlay();
	}
}

class Cricket extends Game {

	@Override
	protected void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	protected void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	protected void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}
}

class Football extends Game {

	@Override
	protected void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	protected void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	protected void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}

public class Template {

	public static void main(String[] args) {
		Game g1 = new Cricket();
		g1.play();
		Game g2 = new Football();
		g2.play();
	}

}
