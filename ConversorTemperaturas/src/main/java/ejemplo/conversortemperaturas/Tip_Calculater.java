import java.util.Scanner;
public class Tip_Calculater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n¡Bienvenido a la Calculadora de Propinas!");
        System.out.println("\nIntroduce el monto total de la cuenta: ");
        int cuenta = scan.nextInt();

        System.out.println("¿Cuánta propina te gustaría dejar?");
        int propina = scan.nextInt();

        System.out.println("¿Entre cuántas personas se dividirá la cuenta?");
        int personas = scan.nextInt();

        int total = cuenta + propina;
        int porPersona = total / personas;

        System.out.println("El total de la cuenta es: $" + total);
        System.out.println("Cada persona debe pagar: $" + porPersona);
	}
}
