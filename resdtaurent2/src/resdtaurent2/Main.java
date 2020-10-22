package resdtaurent2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static int val; 

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 char reponse = 'O';
		 char reponse1 = 'O';
		 int prix=0;
		 int prixr=0;
		 int prixjus=0;
		 int prixplat = 0;
		 System.err.println("Bienvenue au restaurant KAYY LEKK \n");

		 		
				List<Integer> list = new ArrayList<Integer>();
		 		
				List<Integer> rafraiche = new ArrayList<Integer>();
		 		 System.out.println("Voici les plats au menu que nous proposons :\n"
							+ "0:pour ne pas commande de plat \n"
							+ "1:Yassa au poulet\n"
							+ "2:Riz au poisson\n"
							+ "3:Maffé\n"
							+ "4:Soupe \n"
							+ "5:caldou\n"
							+"6:Lakhou bissap");
		 do { 
			
			 val = sc.nextInt();
			 list.add(val);
			 System.out.println("Voulez-vous faire une autre commande ? (O/N)");
			 reponse = sc.next().charAt(0);
		}
		while(reponse =='O');
		 System.out.println("Voici les rafraichissement que nous proposons :\n"
				 + "0:pour ne pas commande de rafraichissement \n"
					+ "1:Eau minérale\n"
					+ "2:Boisson gazeuse\n"
					+ "3:Biére\n"
					+ "4:Soda \n"
					+ "5:Vin rouge\n"
					+"6:Jus bissap");
		 do {
			 val = sc.nextInt();
			 rafraiche.add(val);
			 System.out.println("Voulez-vous faire une autre commande ? (O/N)");
			 reponse1 = sc.next().charAt(0);
		 }while(reponse1 =='O');
		 if(list.isEmpty()) {
			 prixplat =0;
		 }else{
		 for(int i=0;i<list.size();i++) {
			 switch(list.get(i)) {
			 case 1:
				 prix = 2500;
				 break;
			 case 2:
				 prix = 1000;
				 break;
			 case 3:
				 prix = 1500;
				 break;
			 case 4:
				 prix = 3000;
				 break;
			 case 5:
				 prix = 800;
				 break;
			 case 6:
				 prix = 4000;
				 break;
			 default:
				 prix = 0;
			 }
			 prixplat+=prix;
			// System.out.println("voici le chois numero "+i+" :"+prix);
		 }
		 }
		 if(rafraiche.isEmpty()) {
			 prixjus =0;
		 }else{
		 for(int i=0;i<rafraiche.size();i++) {
			 switch(rafraiche.get(i)) {
			 case 1:
				 prixr = 1000;
				 break;
			 case 2:
				 prixr = 1000;
				 break;
			 case 3:
				 prixr = 1500;
				 break;
			 case 4:
				 prixr = 3000;
				 break;
			 case 5:
				 prixr = 800;
				 break;
			 case 6:
				 prixr = 500;
				 break;
			 default:
				 prixr = 0;
			 } prixjus+=prixr;
			
		 }
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
