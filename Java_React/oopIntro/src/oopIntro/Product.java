package oopIntro;

public class Product {
	
	//Constructor----> Bu class �al��t���nda al��mas� gereken kodlar�m� yazd���m kod blo�udur.
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	//Ayn� isimde birden fazla metot bulunabilir buna overloading denir.
	public Product(int id, String name, double unitPrice, String detail){
		this();
		this.id=id;
		this.name=name;
		this.unitPrice =unitPrice;
		this.detail=detail;
	}
	int id;
	String name;
	double unitPrice;
	String detail;
}
