
public class Main {

	public static void main(String[] args) {
		//interfaces();
		interfacesPolymorphism();
		
		
	}
	
	public static void interfaces() {
		//�nterfaces newlenemez.
		//Birden fazla class'� iplement edebilirsiniz.
		//Extends edilemez.
		ICustomerDal customerDal = new MySqlCustomerDal();
		customerDal.Add();
	}
	
	public static void interfacesPolymorphism() {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
