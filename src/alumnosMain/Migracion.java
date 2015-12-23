package alumnosMain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Migracion {

	static final String FICHERO_PERSONAS = "data/personas10.txt";
	
	
	public static void main(String[] args) {
		System.out.println("Comenzamos migracion...");
		
		//leer fichero data/personas10.txt y mostrar por pantalla
	
		String fichero = "data/personas10.txt";
		    try {
		      FileInputStream fis = new FileInputStream(fichero);
		      InputStreamReader isr = new InputStreamReader(fis,"utf8");
		      BufferedReader br = new BufferedReader(isr);
		 
		      String linea;
		      while((linea = br.readLine()) != null)
		        System.out.println(linea);
		 
		      fis.close();
		    }
		    catch(Exception e) {
		      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
		    }
}}