package Musical;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
public class Semantico {
JFrame ventana;
Lista codigoFuente;
	
	Semantico(String ruta){
		
		Lista salida=new Lista();
		 try
	       {   
	        Archivos fuente=new Archivos();
	   	   salida=fuente.abrirArchivo(ruta); 
	  	    }catch( Exception ex )
	       {  
	       System.out.println(ex);
	       }
			 
		 codigoFuente=salida;
		 
		 
			
	}
	
	
	void generarSalida()
	{
		 
		Reproductor  reproduce= new Reproductor( codigoFuente);
		reproduce.tocarMusica();

	}
}
