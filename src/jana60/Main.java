package jana60;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	    Random random = new Random();

	    boolean finito = false; 
	    
	    while (!finito) {
	        System.out.println(
	            "Cosa vuoi fare? 1 per comprare uno smartphone, 2 per comprare un televisore, 3 per comprare delle cuffie, 4 per uscire");
	        String scelta = scan.nextLine();
	        
	        switch (scelta) {
	        case "1":
	        	System.out.println("Inserisci codice:");
	            int codiceInput = Integer.parseInt(scan.nextLine());
	            System.out.println("Inserisci nome:");
	            String nomeInput = scan.nextLine();
	            System.out.println("Inserisci marca:");
	            String marcaInput = scan.nextLine();
	            System.out.println("Inserisci prezzo:");
	            double prezzoInput = Double.parseDouble(scan.nextLine());
	            System.out.println("Inserisci iva:");
	            int ivaInput = Integer.parseInt(scan.nextLine());
	            String imei ="codiceIMEI:" + (random.nextInt(100000)+ 1);
	            System.out.println(imei);
	            System.out.println("Inserisci Memoria:");
	            int memoriaInput = Integer.parseInt(scan.nextLine());
	            Smartphone s = new Smartphone (codiceInput, nomeInput, marcaInput, prezzoInput, ivaInput,imei, memoriaInput);
	            
	            System.out.println("Perfetto, hai salvato il tuo prodotto 'Smartphone' in memoria! Dati prodotto:");
	            System.out.println(s);
	            break;
	        case "2":
	 	        System.out.println("Inserisci codice:");
	 	        int codiceInput1 = Integer.parseInt(scan.nextLine());
	 	        System.out.println("Inserisci nome:");
	 	        String nomeInput1 = scan.nextLine();
	 	        System.out.println("Inserisci marca:");
	 	        String marcaInput1 = scan.nextLine();
	 	        System.out.println("Inserisci prezzo:");
	 	        double prezzoInput1 = Double.parseDouble(scan.nextLine());
	 	        System.out.println("Inserisci iva:");
	 	        int ivaInput1 = Integer.parseInt(scan.nextLine());
	 	        System.out.println("Inserisci dimensioni:");
	 	        int dimensioniInput = Integer.parseInt(scan.nextLine());
	 	        System.out.println("La televisione è smart?:");
	 	        String opzione;
	 	        boolean smart = false;
	 	        do {
	 	        opzione = scan.nextLine();
	 	        if (!opzione.equalsIgnoreCase("si")&& !opzione.equalsIgnoreCase("no")) {
	 	        	System.out.println("ATTENZIONE! Gli unici valori consentiti sono 'si' e 'no'");
	 	        }
	 	        }while(!opzione.equalsIgnoreCase("si")&& !opzione.equalsIgnoreCase("no")); 
	 	        
	 	        if (opzione.equalsIgnoreCase("si")) {
	 	        	smart = true;
	 	        }
	 	        Televisori t = new Televisori (codiceInput1, nomeInput1, marcaInput1, prezzoInput1, ivaInput1, dimensioniInput, smart);   
	        
	 	       System.out.println("Perfetto, hai salvato il tuo prodotto 'Televisore' in memoria! Dati prodotto:");
	 	       System.out.println(t);
	 	       break;
	        case "3":
	        	System.out.println("Inserisci codice:");
	 	        int codiceInput2 = Integer.parseInt(scan.nextLine());
	 	        System.out.println("Inserisci nome:");
	 	        String nomeInput2 = scan.nextLine();
	 	        System.out.println("Inserisci marca:");
	 	        String marcaInput2 = scan.nextLine();
	 	        System.out.println("Inserisci prezzo:");
	 	        double prezzoInput2 = Double.parseDouble(scan.nextLine());
	 	        System.out.println("Inserisci iva:");
	 	        int ivaInput2 = Integer.parseInt(scan.nextLine());
	 	        System.out.println("Inserire colore:");
	 	        String coloreInput = scan.nextLine();
	 	        System.out.println("Le cuffie sono wireless?:");
	 	        String opzione1;
	 	        boolean wireless = false;
	 	        do {
	 	        opzione1 = scan.nextLine();
	 	        if (!opzione1.equalsIgnoreCase("si")&& !opzione1.equalsIgnoreCase("no")) {
	 	        	System.out.println("ATTENZIONE! Gli unici valori consentiti sono 'si' e 'no'");
	 	        }
	 	        }while(!opzione1.equalsIgnoreCase("si")&& !opzione1.equalsIgnoreCase("no")); 
	 	        
	 	        if (opzione1.equalsIgnoreCase("si")) {
	 	        	wireless = true;}
	 	        Cuffie c = new Cuffie(codiceInput2, nomeInput2, marcaInput2, prezzoInput2, ivaInput2, coloreInput, wireless);
                
	 	       System.out.println("Perfetto, hai salvato il tuo prodotto 'Cuffie' in memoria! Dati prodotto:");
	 	       System.out.println(c);
	 	       break;
	        case "4":
	            System.out.println("Va bene, Arrivederi!");
	        	finito = true;
	            break;
	        default:
	        	System.out.println("Scelta non valida");
	            break;
	 	    }
	        	        	
	    }
		scan.close();
	}
	
}
