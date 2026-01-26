
abstract class Instrument {

	abstract void play();

}

public class Flute extends Instrument{
	void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}
public class Guitar extends Instrument{
	void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}
public class Piano extends Instrument{
	void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}
public class poly {

	public static void main(String[] args) {
		Instrument f=new Flute();
		f.play();
		Instrument p=new Piano();
		p.play();
		Instrument g=new Guitar();
		g.play();

	}

}
