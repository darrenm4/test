package week4lab2;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		Item[] items = new Item[3];

		for(int x=0; x<=2 ;x++) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("please enter the name");
			String name =in.nextLine();
			System.out.println("please enter the type");
			String type =in.nextLine();
			System.out.println("please enter the date");
			String manufactureDate =in.nextLine();
			System.out.println("please enter the price");
			double price = in.nextDouble();
			System.out.println("please enter the status");
			char status = in.next().charAt(0);
			
			Item i = new Item(name,type,manufactureDate,price,status);
			
			if(x==1)i.statusUpdate();
			
			items[x]=i;
			
			System.out.println("No. of items created" + Item.getNoOfSales());
			
			
		}//end for loop
		
		for(Item i: items)System.out.println(i);

	}//end main

}
