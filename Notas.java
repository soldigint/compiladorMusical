package Musical;

public class Notas {
int duracion;
double frecuencia;
	
	Notas (){
		duracion=0;
		frecuencia=0;
	}
	
	 byte [] generaNota(int d, double f){
		 byte aux[]=new byte[d]; 
         for (int n=0;n < aux .length;n++){ 
              aux[n]=(byte)(Math.sin(f*n*Math.PI*2/22000)*127);//definicion e onda
          }
		 
		 return aux;
	 }
}
