
public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal �CustomerDal) {
		this.customerDal = �CustomerDal;
	}

	public void add() {
		//�� Kodlar�
		customerDal.Add();
	}
}
