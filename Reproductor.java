
package Musical;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;



public class Reproductor {
	static Lista codigoFuente;
	
	Reproductor(Lista l)
	{
	codigoFuente=l;	
	}

	 void tocarMusica ( ) {
	
		 Gramatica datosf=new Gramatica();
		 
			if(codigoFuente.nodoinicial!=null)
			{
		 		Nodo auxiliar;
		 		String tono="grave";
		 		int indicef=0;
		 		int indicet=0;
		 		
		 		frecuencias frec=new frecuencias();
		 		
				auxiliar=codigoFuente.nodoinicial;
				while(auxiliar.siguiente != null)
				{
					
					
					String nota=auxiliar.dato;
					if (nota.compareTo("do")==0) indicef=0;
					if (nota.compareTo("re")==0) indicef=1;
					if (nota.compareTo("mi")==0) indicef=2;
					if (nota.compareTo("fa")==0) indicef=3;
					if (nota.compareTo("sol")==0) indicef=4;
					if (nota.compareTo("la")==0) indicef=5;
				    if (nota.compareTo("si")==0) indicef=6;
					
				    indicet=0;
				    
				    auxiliar=auxiliar.siguiente;
				    int d=0;// Reconocer la nota
					 nota=auxiliar.dato;
					if (nota.compareTo("0")==0) d=0;
					if (nota.compareTo("1")==0) d=1;
					if (nota.compareTo("2")==0) d=2;
					if (nota.compareTo("3")==0) d=3;
					if (nota.compareTo("4")==0) d=4;
					
							Notas notas=new Notas();
							TocarNota tocar=new TocarNota();
							
							byte [] doo=notas.generaNota(datosf.duracion[d],frec.frecuencia[indicet][indicef]);
							
							 tocar.Tocar(doo);  
						
					auxiliar=auxiliar.siguiente;
					
			 }
	 }
	 
	 }
		
}			
		
		  
/*	      byte [] do1_=nota.generaNota(22000, 2093);
			byte [] do2_=nota.generaNota(22000, 2217);
			byte [] re_=nota.generaNota(22000, 2349);
			byte [] re1_=nota.generaNota(22000, 2489);
			byte [] mi_=nota.generaNota(22000, 2637);
			byte [] fa_=nota.generaNota(22000, 2793);
			byte [] fa1_=nota.generaNota(22000, 2959);
			byte [] sol_=nota.generaNota(22000, 3135);
			byte [] sol2_=nota.generaNota(22000, 3322);
			byte [] la_=nota.generaNota(22000, 3520);
			byte [] la2_=nota.generaNota(22000, 3729);
			byte [] si_=nota.generaNota(22000, 3951);
*/	
