package inheritance;

public class CustomerManager {
	public void Add(Customer customer) {
		System.out.println(customer.customerNumber+" kaydedildi.");
	}
	//Bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer: customers) {
			Add(customer);
		}
	}
}
//SOLID-Open Closed Principle -Mevcutta bulunana hi�bir kodu de�i�tiremezsin ve yeni kodu sadece ekleyerek g�ncellersin.