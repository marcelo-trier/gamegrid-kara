package scenario26;


import kara.gamegrid.actor.KaraSokoban;
import kara.gamegrid.world.GameScreen;


/**
 * MyKara is a subclass of KaraSokoban. Therefore, it inherits all methods of KaraSokoban <p>
 * <i>MyKara ist eine Unterklasse von KaraSokoban. Sie erbt damit alle Methoden der Klasse KaraSokoban</i> <p>
 */
public class MyKara extends KaraSokoban {
	
    /**
     * In the 'act()' method you can write your program for Kara <br>
     * <i>In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden</i>
     */
	public void act() {
		
	}
	
	
	
	
	/**
	 * The main-method is the start of the program where the Kara world is loaded <br>
	 * <i>Die main-Methode ist der Start des Programms, wo die Kara Welt geladen wird</i>
	 */
	public static void main(String[] args) {
		GameScreen game = new GameScreen("Levels.txt", MyKara.class);
		game.setDeveloperMode(true);
		game.setHighscoreEnabled(false);
		game.show();
	}
}
