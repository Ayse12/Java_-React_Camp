package inheritance2;

public class LogManager {
	//Log lama i�leminin yap�laca�� class
	public void log(int logType) {
		//enum mant���
		if(logType==1) {
			System.out.println("Veritaban�na logland�");
		}else if (logType==2) {
			System.out.println("Dosyaya logland�.");
		}else {
			System.out.println("Maile logland�");
		}
		
	}
}


//1 - Database
//2 - File
//3 - Email