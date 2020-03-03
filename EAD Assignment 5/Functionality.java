package com.abhinav.facade;

import java.util.Scanner;

import com.abhinav.dao.ImportExportDetails;
import com.abhinav.view.OptionChosen;

public class Functionality {
	
	public void showItems() {
		ImportExportDetails obj = new ImportExportDetails();
		OptionChosen oc = new OptionChosen();
		obj.showCart();
		oc.chooseOption();
	}

	public void addItems() {
		ImportExportDetails obj = new ImportExportDetails();
		OptionChosen oc = new OptionChosen();
		System.out.println("Enter code of item you want to add");
		Scanner input = new Scanner(System.in);
		int code = input.nextInt();
		obj.addToCart(code);
		oc.chooseOption();
	}
	
	public void deleteItems() {
		ImportExportDetails obj = new ImportExportDetails();
		OptionChosen oc = new OptionChosen();
		System.out.println("Enter code of item you want to delete");
		Scanner input = new Scanner(System.in);
		int code = input.nextInt();
		obj.deleteFromCart(code);
		showItems();
		oc.chooseOption();
	}

	public void editQuantity() {
		ImportExportDetails obj = new ImportExportDetails();
		OptionChosen oc = new OptionChosen();
		System.out.println("Enter item code");
		Scanner input = new Scanner(System.in);
		int code = input.nextInt();
		System.out.println("Enter quantity");
		Scanner inputTwo = new Scanner(System.in);
		int quantity = inputTwo.nextInt();
		obj.editQuantity(code, quantity);
		showItems();
		oc.chooseOption();
	}

}

