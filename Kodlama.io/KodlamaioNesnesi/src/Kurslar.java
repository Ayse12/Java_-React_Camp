
public class Kurslar {
	public Kurslar() {
		System.out.println("Ben Kurslar i�in �al��t�m");
	}
	
	//Main'de eleman tan�mlamas� i�in constructor tan�mlad�k.
	public Kurslar(int id, String name, double Fiyati, String Aciklama){
		this();
		this.id=id;
		this.name=name;
		this.Fiyati =Fiyati;
		this.Aciklama=Aciklama;
	}
	
	//�zellikler
	int id;
	String name;
	Double Fiyati;
	String Aciklama;
}
