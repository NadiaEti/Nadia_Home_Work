package video_20_Home_Work;

import java.util.Scanner;

public class Scanner_H_W {

	
	
public static void main(String[] args) {
	
	 Scanner scan=new Scanner(System.in);
	 float SalesTax = 0.088f;
	 
	 System.out.println("\t\t\t\t EMTI SUPERMARKET \t\t\t ");
	 System.out.println("\t\t\t\t 165-24, Hillside ave \t\t\t ");
	 System.out.println("\t\t\t\t Jamaica, NY-11432	\t\t\t ");
	 System.out.println(" \t\t\t\t Tel- 9299901000 \t\t\t ");
	 System.out.println("\t\t\t\t------------------------	\t\t");
	
	 
	 System.out.println("Cashier:   ");
	 String name = scan.nextLine();
	 System.out.println("Cashier   " + name);
	 
	 System.out.println(" ");
	 
	 
	System.out.println("Qty of Green pepper");
	int QGreenPapper = scan.nextInt();
	System.out.println("Price per Green pepper packet:  " );
	double PGreenPapper = scan.nextDouble();
	double totalpapeer = QGreenPapper*PGreenPapper;
	System.out.println("Price for Green pepper : "+totalpapeer);
	

	System.out.println("Qty of Medjool Dates");
	int QDates = scan.nextInt();
	System.out.println("Price per Medjool Dates box:  " );
	double PDates = scan.nextDouble();
	double totalDates=QDates*PDates;
	System.out.println("Price for Medjool Dates : "+totalDates);
	
	
	System.out.println("Qty of Milk vitamin D");
	int QMilk = scan.nextInt();
	System.out.println("Price per galon vitamin D Milk:  " );
	double PMilk = scan.nextDouble();
	double totalMilk=QMilk*PMilk;
	System.out.println("Price for Milk vitamin D : "+totalMilk);
	
	
	System.out.println("Qty of Fresh Guava");
	int Qguava = scan.nextInt();
	System.out.println("Price per Fresh Guava boxes:  " );
	double Pguava = scan.nextDouble();
	double totalguava=Qguava*Pguava;
	System.out.println("Price for Fresh Guava : "+totalguava);
	
	
	double Subtotal = (totalpapeer + totalDates + totalMilk + totalguava);
	double TotalTax = (Subtotal*SalesTax);
	double TotalAfterSalesTax = (Subtotal + TotalTax);
	
	System.out.println();
	System.out.println();
	
	System.out.println("\t********************* Invoice***************\t\t");
	System.out.println("                                      ");
	System.out.println("\t\t Item \t\t Qty \t\t Price ");
	System.out.println("                                      ");
	System.out.println("	Green Papper	"+"\t"	+QGreenPapper+ "\t\t" + "$"+PGreenPapper);
	System.out.println("	Medjool Dates	"+"\t"	+QDates+ "\t\t" + "$"+PDates);
	System.out.println("	Milk vitamin D	"+"\t"	+QMilk+ "\t\t" + "$"+PMilk);
	System.out.println("	Fresh Guava	"+"\t"	+Qguava+ "\t\t" + "$"+Pguava);
	
	System.out.println("\t*****************--------------***************\t\t");
	
	System.out.printf("\t\t\t\t\t\t\t\t stotal = $ %.2f", + Subtotal  );
	System.out.println();
	System.out.printf("\t\t\t\t\t\t\t\t Sales Tax = $ %.3f", TotalTax);
	System.out.println();
	System.out.printf("\t\t\t\t\t\t\t\t---> Total = $ %.2f",TotalAfterSalesTax );
	
	scan.close();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
