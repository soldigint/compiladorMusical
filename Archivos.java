package Musical;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Archivos {
	
			Archivos(){}
			
public Lista abrirArchivo(String ruta)
	{
		Lista codigo=new Lista();
	   	FileReader fr = null;
	    BufferedReader br = null;
	     try
	     
	      {   
	        fr = new FileReader(ruta);
	        br = new BufferedReader( fr );
	        int i=0;
	        String aux=br.readLine();
	        Nodo n=new Nodo(aux);
	        codigo.AgregarNodoAlFinal(n);
	        while (aux!=null)
	        {    
	        	   i++;
	        aux=br.readLine();
	        Nodo n1=new Nodo(aux);
	        codigo.AgregarNodoAlFinal(n1);
	        }       
	     	   }catch( Exception ex ){  }
	        		
	    	         return	codigo;
		}

	public void guardarArchivo(String ruta, String[] chiquero, 
					int no_puercos )
		{
			File fil;
			fil= new File(ruta);
			  try
			     { 
			        FileWriter write = new FileWriter(fil);
			        BufferedWriter bw = new     		
					BufferedWriter( write );
			        PrintWriter wr= new PrintWriter(bw);
			       	wr.append("guarda archivo");
			        for(int i=0;i<no_puercos; i++)
			        {
	             	wr.append(chiquero[i]+"\n");
      	              }
		             wr.close();
		             bw.close(); 
		                 }catch( Exception ex ){  }
			 	}
 }

