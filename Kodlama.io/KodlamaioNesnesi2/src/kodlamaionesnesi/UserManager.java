package kodlamaionesnesi;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.getName()+" "+"Kullan�c� eklendi.");
	}

	public void Delete(User user) {
		System.out.println(user.getName()+" "+"Kullan�c� silindi.");
	}

	public void Update(User user) {
		System.out.println(user.getName()+" "+"Kullan�c� g�ncellendi.");
	}
}
