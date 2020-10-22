import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val;
		String val1;
		int prix=0;
		 int prixr=0;
		 int prixjus=0;
		 int prixplat = 0;
		 char reponse = 'O';
		 System.err.println("Entrez vos choix séparer par  une virgule  exemple: 1,2 \n");
		 System.out.println("Voici les plats au menu que nous proposons :\n"
					+ "0:pour ne pas commande de plat \n"
					+ "1:Yassa au poulet\n"
					+ "2:Riz au poisson\n"
					+ "3:Maffé\n"
					+ "4:Soupe \n"
					+ "5:caldou\n"
					+"6:Lakhou bissap");
		 val = sc.nextLine();
		 
		 System.out.println("Voici les rafraichissement que nous proposons :\n"
				 + "0:pour ne pas commande de rafraichissement \n"
					+ "1:Eau minérale\n"
					+ "2:Boisson gazeuse\n"
					+ "3:Biére\n"
					+ "4:Soda \n"
					+ "5:Vin rouge\n"
					+"6:Jus bissap");
		 	val1= sc.nextLine();
	        String[] arrOfStr = val.split(","); 
	        String[] arrOfStr1 = val1.split(","); 
	        
	        for (String a : arrOfStr) { 
	        	switch(a) {
				 case "1":
					 prix = 2500;
					 break;
				 case "2":
					 prix = 1000;
					 break;
				 case "3":
					 prix = 1500;
					 break;
				 case "4":
					 prix = 3000;
					 break;
				 case "5":
					 prix = 800;
					 break;
				 case "6":
					 prix = 4000;
					 break;
				 default:
					 prix = 0;
				 }
	        	prixplat+=prix;
	        }
	        for (String a : arrOfStr1) { 
	        	 switch(a) {
				 case "1":
					 prixr = 100000;
					 break;
				 case "2":
					 prixr = 1000;
					 break;
				 case "3":
					 prixr = 1500;
					 break;
				 case "4":
					 prixr = 3000;
					 break;
				 case "5":
					 prixr = 800;
					 break;
				 case "6":
					 prixr = 500;
					 break;
				 default:
					 prixr = 0;
				 } prixjus+=prixr;
	        }
	        int total = prixjus+prixplat;
	        if(total>50000) {
	        	int reduct = (total*10)/100;
	        	int newMontant = total - reduct;
	        	System.out.println("le total est de :" +newMontant );
	        	
	        }else {
	        	System.out.println("le total est de :" +total);
	        }
			
		 }
	
	
		
}
	
