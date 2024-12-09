import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperaturas\n");
	System.out.print("Introduce el valor que quieras convertir : ");
	float value = scan.nextFloat();
	System.out.println("  Pulsa 1 para el conversor de Celsius a Fahrenheit....");
	System.out.println("  Pulsa 2 para el conversor de Farenheit a Celsius...");
	System.out.print("\nIntroduce tu valor aquí...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("Tu converscion está aquí.. "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Tu converscion está aquí.. "+value3+"�C");
		}
	System.out.println("\n\tGracias!!..");
	}
}
