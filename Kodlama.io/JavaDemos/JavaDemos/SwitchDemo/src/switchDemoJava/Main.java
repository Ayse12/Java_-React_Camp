package switchDemoJava;

public class Main {

	public static void main(String[] args) {
		char grade='A';
		switch(grade) {
		case 'A':
			System.out.println("M�kemmel :Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok G�zel : Ge�tiniz");
			break;
		case 'C':
			System.out.println("�yi : Ge�tiniz.");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�timiz");
			break;
		case 'F':
			System.out.println("Malesef Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz Not girdiniz.");
		}

	}

}
