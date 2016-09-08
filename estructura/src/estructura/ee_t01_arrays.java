import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ee_t01_arrays{


	private static int numeros[];
	
        
public static void ascendente(int []a){
    	int aux;
        for(int i=0; i<numeros.length; i++){
    	for(int j=i+1; j<numeros.length; j++){
    		if(numeros[i]<numeros[j]){
    			aux=numeros[i];
    			numeros[i]=numeros[j];
    			numeros[j]=aux;
    		}
    	 }
     }
     for(int y=0; y<numeros.length; y++){
    	 System.out.println(numeros[y]);
     }
    }
	 

public static void main(String [] args)throws FileNotFoundException, IOException{
    String texto;
              
    String archivo=("Numeros.txt");
    System.out.println("Entrada\n");
    FileReader f=new FileReader(archivo);
    BufferedReader b=new BufferedReader(f);		  
    texto=b.readLine();		  
    System.out.println(texto);
    Integer tamano=Integer.parseInt(texto);		  
    numeros=new int[tamano];
    Integer a=0;
    while((texto=b.readLine())!=null){
    System.out.println(texto);
    int dato=Integer.parseInt(texto);  
    if(numeros[a]<tamano){
        numeros[a]=dato;
    }
    a++;	 
    } 		  
    b.close();		 
    System.out.println("\nSalida\n");
    ascendente(numeros);
	 }
}
