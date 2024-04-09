package eccezioni;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class myMain {
	
	public static void main(String[] args) throws IOException {
		
		divisione div = new divisione();
		System.out.println(div.dividi(0,0));
		
		
	   BufferedReader objReader = new BufferedReader(new FileReader("C:\\Users\\Rick\\Desktop\\workshopEsercitazioni\\Esercitazione08Aprile2024\\src\\eccezioni\\myFile.txt"));
	   //BufferedReader objReader = new BufferedReader(new FileReader("myFile.txt"));

	   String strCurrentLine;
	   while ((strCurrentLine = objReader.readLine()) != null) {

	    String[] elementiInterni = strCurrentLine.split(",");
	    for(int i=0; i<elementiInterni.length; i++) {
	    	System.out.println(elementiInterni[i]);
	    }
	   }
		
	   
	   //BufferedReader objReader2;
	/*
	    * Migliore classico try-catch
	    */
	   BufferedReader objReader2 = null;
	   try {
		   objReader2 = new BufferedReader(new FileReader("C:\\Users\\Rick\\Desktop\\workshopEsercitazioni\\Esercitazione08Aprile2024\\src\\eccezioni\\myFile.txt"));
		   while ((strCurrentLine = objReader.readLine()) != null) {

			    String[] elementiInterni = strCurrentLine.split(",");
			    for(int i=0; i<elementiInterni.length; i++) {
			    	System.out.println(elementiInterni[i]);
			    }
			   }
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	   finally{
		   if(objReader2!=null) {
		   objReader2.close();
		   }
	   }
	   
	   /*
	    * Decisamente Meglio try with resources
	    */
	   //BufferedReader objReader2 = null;
	   try (BufferedReader objReader3 = new BufferedReader(new FileReader("C:\\Users\\Rick\\Desktop\\workshopEsercitazioni\\Esercitazione08Aprile2024\\src\\eccezioni\\myFile.txt"))) {
		   while ((strCurrentLine = objReader.readLine()) != null) {

			    String[] elementiInterni = strCurrentLine.split(",");
			    for(int i=0; i<elementiInterni.length; i++) {
			    	System.out.println(elementiInterni[i]);
			    }
			    throw new myException("Eccezione"); 
			}
		} catch (myException exc) {
		    exc.printStackTrace();
		}
	   
	}
	
}
