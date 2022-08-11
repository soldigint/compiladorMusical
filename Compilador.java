package Musical;

public class Compilador {

	public static void main(String[] args) {
		Lexico analizador=new Lexico("/Users/laura/Desktop/musica.txt");
		
		analizador.analizadorLexico();
	
        Semantico generador=new Semantico("/Users/laura/Desktop/musica.txt");
		
		generador.generarSalida();
		
	}

}
