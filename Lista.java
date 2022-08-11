package Musical;
public class Lista {
	Nodo nodoinicial;
	Lista()
	{
		nodoinicial=null;
	}
	
	void AgregarNodoAlFinal(Nodo algunnodo)
	{
		if(nodoinicial==null)
		{
			nodoinicial=algunnodo;
		}	
		else
		{
			Nodo auxiliar;
			auxiliar=nodoinicial;
			while(auxiliar.siguiente != null)
			{
				auxiliar=auxiliar.siguiente;
			}	
			auxiliar.siguiente=algunnodo;
		}

	}
	
	
	void EliminarNodoAlFinal()
	{
			Nodo auxiliar,auxiliaranterior=null;
			auxiliar=nodoinicial;
			while(auxiliar.siguiente != null)
			{  auxiliaranterior=auxiliar;
				auxiliar=auxiliar.siguiente;
				}	
			auxiliaranterior.siguiente=null;
		
	}
	
	void EliminarNodoAlInicio()
	{
			Nodo auxiliar;
			auxiliar=nodoinicial.siguiente;
			nodoinicial=auxiliar;
			
	}
	
	
	void AgregarNodoAlInicio(Nodo algunnodo)
	{
		if(nodoinicial==null)
		{
			nodoinicial=algunnodo;
		}	
		else
		{
			
			algunnodo.siguiente=nodoinicial;
			nodoinicial=algunnodo;
		}
	}

Lista getLista()
{
return this;	
}
	void mostrar ()
	{
		
		if(nodoinicial!=null)
		{
	 		Nodo auxiliar;
			auxiliar=nodoinicial;
			while(auxiliar.siguiente != null)
			{
				System.out.println("Mostrar lista "+auxiliar.dato);
				auxiliar=auxiliar.siguiente;
				
			}	
			System.out.println(auxiliar.dato);
			
		}
	}
	
}
