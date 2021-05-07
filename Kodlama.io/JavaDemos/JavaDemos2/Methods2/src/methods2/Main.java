package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bug�n Hava �ok G�zel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(mesaj);
		System.out.println(sayi);
		g�ncelle();
		System.out.println(" ");
		
		/////////Variable arguments////////////
		int toplam= topla2(2,3,2,5);
		System.out.println(toplam);

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void g�ncelle() {
		System.out.println("G�ncellendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static int topla(int sayi1,int sayi2) {
		return 5;
	}
	public static String sehirVer() {
		return "Diyarbak�r";
	}
	
	//Variables Arguments ->> int sonras� ... koymak birden fazla int de�eri tan�mlanaca��n� belirlemek i�in kullan�yoruz. Yani int veri tpinde array g�nderilmi� gibi d���n�llebilir
	public static int topla2(int...sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
