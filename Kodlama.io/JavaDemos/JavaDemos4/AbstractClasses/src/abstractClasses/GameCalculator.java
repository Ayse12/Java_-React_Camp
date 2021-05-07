package abstractClasses;

//Bir s�n�f�n abstract olabilmesi i�in abstract ile tanmlanm�� olmas� gerekmektedir.
public abstract class GameCalculator {
	
	//abstract -> Kim kullan�yorsa kendi hesapla methodunu yazmak zorundad�r. DEFAULT B�R DE�ER� BULUNMAMAKTADIR.
	public abstract void hesapla(); 
	
	//final -> GameCalculator'� kim kullan�yorsa gameOver '� oldu�u gibi kullanmak zorundad�r.
	public final void gameOver() {
		System.out.println("Oyun Bitti!");
	}
}
