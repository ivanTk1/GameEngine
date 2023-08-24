package Project2games;

public abstract class Game {
	
	public abstract void ExplainRules();
	
	public abstract void Setup(int levelCount);
	
	public abstract void UsePlayerInput(int levelCount);
		
	public abstract String CanPlayAgain(int levelCount);
	
	
	
	
}
