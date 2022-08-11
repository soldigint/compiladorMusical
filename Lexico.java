package Musical;

public class Lexico {

Lista	codigoFuente;
		
    Lexico(String archivoFuente){
    	
    	Lista salida=new Lista();
		 try
	       {   
	        Archivos fuente=new Archivos();
	   	   salida=fuente.abrirArchivo(archivoFuente); 
	  	    }catch( Exception ex )
	       {  
	       System.out.println(ex);
	       }
			 
		 codigoFuente=salida;
	
}
	
	public Lista analizadorLexico ()
	{	
		Gramatica g=new Gramatica();
		String [] voca=g.getVocabulario();
		
		
		if(codigoFuente.nodoinicial!=null)
		{
	 		Nodo auxiliar;
	 		Boolean esta=false;
			auxiliar=codigoFuente.nodoinicial;
			while(auxiliar.siguiente != null)
			{
				//System.out.println("Compara "+auxiliar.dato);
				for (int i=0;i<voca.length;i++)
				{
					if (voca[i].equals(auxiliar.dato))
						{ esta=true;  
					//	  System.out.println("Si esta "+auxiliar.dato);
						}
				}
				if (esta==true)
				{
					 //System.out.println("Si esta "+auxiliar.dato);
						esta=false;
				}else
				{  //System.out.println("No esta "+auxiliar.dato);
				 }
			
				auxiliar=auxiliar.siguiente;
				
			}	
			//System.out.println(auxiliar.dato);
			
		}
		
		//codigoFuente.mostrar();
				
		
		
		return codigoFuente;
	}
	
	
	
}
