package inheritance2;

public class Main {

	public static void main(String[] args) {
		// Birbirinin alternatifleri i�in if kodu yaz�lmaz.
		//badCodeLog();
		CodeLog();

	}
	public static void badCodeLog() {
		LogManager logManager = new LogManager();
		logManager.log(1);
	}
	
	public static void CodeLog() {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add(new FileLogger());
	}

}
