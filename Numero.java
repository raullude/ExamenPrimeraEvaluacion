import java.util.Scanner;

/**
 * Clase en la que introduces por teclado
 * dos numeros y nos indica cual es el mayor
 * nos da sus multiplos de 3
 * y nos dice si es capicua o no
 * @author Raul Luque Delgado
 * @version 1.0
 *
 */
public class Numero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.printf("Introduce el primer numero%n");
		String primerNumeroCadena = sc.next();
		int primerNumero = Integer.parseInt(primerNumeroCadena);
		System.out.printf("Introduce el segundo numero%n");
		String segundoNumeroCadena = sc.next();
		int segundoNumero = Integer.parseInt(segundoNumeroCadena);
		sc.close();
		if ((primerNumero < 0)||(primerNumero > 1000)|| (segundoNumero < 0)||(segundoNumero > 1000)) {
			System.out.printf("Numeros introducidos no validos%n");
			System.exit(0);	
		}
		DevolverNumeroMayor(primerNumero, segundoNumero);
		MostrarMultiplosDe3(primerNumero);
		
	}
	/**
	 * Metodo para saber que numero es mayor
	 * @param primerNumero Primer numero introducido por teclado
	 * @param segundoNumero Segundo numero introducido por teclado
	 */
	public static void DevolverNumeroMayor(int primerNumero, int segundoNumero) {
		if(primerNumero > segundoNumero) {
			System.out.printf("El numero mas grande es el: %d%n",primerNumero);
		}else if (segundoNumero > primerNumero) {
			System.out.printf("El numero mas grande es el: %d%n",segundoNumero);	
		}else {
			System.out.printf("Los numeros son iguales: %d%n", primerNumero);
		}	
	}
	
	/**
	 * Metodo para mostrar los 10 primeros multiplos de 3 del primer numero
	 * @param numero entero al cual queremos sacarle sus 10 primeros digitos
	 */
	public static void MostrarMultiplosDe3(int numero){
		for (int i = 1; i <= 10; i++) {
			int multiplos = i * 3 * numero;
			System.out.printf("%d%n", multiplos);
			
		}
		
	}
	
	/**
	 * Metodo para averiguar si el numero es capicua
	 * @param segundoNumero segundo numero introducido por teclado
	 * @param SegundoNumeroCadena segundo numero introducido por teclado sin ser convertido en cadena
	 * @return capicua nos devuelve true si el numero es capicua, false si no lo es
	 */
	public static boolean MostrarNumeroCapicua (int segundoNumero, String segundoNumeroCadena) {
		boolean capicua = false;
		for (int i = segundoNumeroCadena.length(); i >= 0; i -= 1) {
			
		}
		
		return capicua;
	}
	
	

}
