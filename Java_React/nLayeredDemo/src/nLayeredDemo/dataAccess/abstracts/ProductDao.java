package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	//id 'ye g�re �r�n getirme
	Product get (int id);
	
	//Array mant���yla �r�nleri listeleme
	List<Product> getAll();
}
