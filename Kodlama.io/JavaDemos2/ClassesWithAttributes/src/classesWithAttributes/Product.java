package classesWithAttributes;

public class Product {
	//Constructor
	public Product(int id,String name,String description,double price, int stockAmount) {
		System.out.println("Constructor �al���yor");
		this.id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
	}
	public Product() {
		System.out.println("Constructor �al���yor");
	}
	private int id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	
	//Get-->Getter yani getir al demektir. Okumaya y�nelik i�lemlerdir.
	//Set-->Setter yani kurmak vermek olarak d���n�lebilir. Bir de�er atamaya yarar.
	
	//id okuma
	public int getId() {
		return id;
	}
	
	//SET-->Bir de�er atanmas� gerkmektedir bu y�zden void  metodu kullan�l�r ve d��ar�dan bir de�er girilmesi beklenilir.
	public void setId(int id) {
		this.id=id;
	}
	//This benim i�erisinde bulundu�um class anlam�na gelir.

	
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	
}
