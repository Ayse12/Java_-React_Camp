package kodlamaionesnesi;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.getName()+" "+"Kullanıcı eklendi.");
	}

	public void Delete(User user) {
		System.out.println(user.getName()+" "+"Kullanıcı silindi.");
	}

	public void Update(User user) {
		System.out.println(user.getName()+" "+"Kullanıcı güncellendi.");
	}
}
