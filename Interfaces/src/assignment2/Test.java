package assignment2;

import assignment2.music.Playable;
import assignment2.music.string.Veena;
import assignment2.music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable veena = new Veena();
		veena.play();

		Playable saxophone = new Saxophone();
		saxophone.play();
	}

}
