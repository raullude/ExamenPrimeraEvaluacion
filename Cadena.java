
public class Cadena {

	public static void main(String[] args) {
		String cadenaExamen = "adios";
		String cadenaExamenMayuscula = cadenaExamen.toUpperCase();
		String cadenaExamenMinuscula = cadenaExamen.toLowerCase();
		System.out.printf("Cadena: %s%s%n",cadenaExamenMayuscula, cadenaExamenMinuscula);
		
		int contador = 0;
		for (int i = 0; i < cadenaExamen.length(); i++) {
			if ((cadenaExamen.charAt(i)== 'á')||(cadenaExamen.charAt(i)== 'é')||(cadenaExamen.charAt(i)== 'í')||(cadenaExamen.charAt(i)== 'ó')||(cadenaExamen.charAt(i)== 'ú')) {
				contador++;
			}
		}
		System.out.printf("Contiene %d vocales acentuadas%n", contador);
		
		// A partir de este punto no he tenido en cuenta las vocales acentuadas
		
		if((cadenaExamen.endsWith("a"))||(cadenaExamen.endsWith("e"))||(cadenaExamen.endsWith("i"))||(cadenaExamen.endsWith("o"))||(cadenaExamen.endsWith("u"))) {
			System.out.printf("La cadena %s acaba por vocal%n", cadenaExamen);
		}else {
			System.out.printf("La cadena %s acaba por consonante%n", cadenaExamen);
		}
		
		if((cadenaExamen.startsWith("a"))||(cadenaExamen.startsWith("e"))||(cadenaExamen.startsWith("i"))||(cadenaExamen.startsWith("o"))||(cadenaExamen.startsWith("u"))) {
			System.out.printf("La cadena %s empieza por vocal%n", cadenaExamen);
		}
		
		String cadenaExamenReemplazada = cadenaExamen.replace('o', '1');
		cadenaExamenReemplazada = cadenaExamenReemplazada.replace('a', '2');
		System.out.printf("%s%n", cadenaExamenReemplazada);
	}
	
}


