
public class Main {

	public static void main(String[] args) {
		//Dizi i�erisindeki elemanlar�n tan�mlanmas�
		Kurslar kurs1=new Kurslar(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� ",150,"(C# + ANGULAR)");
		Kurslar kurs2=new Kurslar(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� ",250,"(JAVA + REACT)");
		Kurslar kurs3=new Kurslar(3,"Programlamaya Giri�",100,"Temel Kurs");
		
		//Tan�mlanm�� elemanlar� dizi i�erine yerle�tirme
		Kurslar[] kurslar= {kurs1,kurs2,kurs3};
		
		System.out.println(" ");
		System.out.println("-------For ile dizi i�inde gezinme-------");
		for(Kurslar kurs : kurslar) {
			System.out.println("Kursun Ad� : "+kurs.name);
			System.out.println("Fiyat� : "+kurs.Fiyati);
			System.out.println("Kursun A��klamas� : "+ kurs.Aciklama);
			System.out.println(" ");
		}
		
		//Metot �a�r�lmas�
		KursManager kurs=new KursManager();
		kurs.Add(kurs1);
		kurs.Update(kurs3);

	}

}
