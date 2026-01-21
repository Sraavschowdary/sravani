
abstract class Instrument {

	abstract void play();

}

public class Flute {
	void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}
public class Guitar {
	void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}
public class Piano {
	void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}
public class poly {

	public static void main(String[] args) {
		Flute f=new Flute();
		f.play();
		Piano p=new Piano();
		p.play();
		Guitar g=new Guitar();
		g.play();

	}

}