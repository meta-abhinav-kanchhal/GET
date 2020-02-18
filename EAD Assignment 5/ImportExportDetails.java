package com.abhinav.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abhinav.facade.Functionality;
import com.abhinav.utility.DBConnection;
import com.abhinav.view.OptionChosen;

public class ImportExportDetails {

	public void showCart() {
		OptionChosen oc = new OptionChosen();
		try{
			Connection conn = DBConnection.initializeDatabase();  //Initialized the DB
			PreparedStatement st = conn.prepareStatement("select * from cart");
			ResultSet rs = st.executeQuery();
			System.out.println("Your Cart Carries");
			System.out.println();
			while (rs.next()) {
				int code = rs.getInt(1);
				String type = rs.getString(2);
				String name = rs.getString(3);
				int price = rs.getInt(4);
				int quantity = rs.getInt(5);
				System.out.println(code+" "+type+" "+name+" "+price+" "+quantity);
			}
			st.close();
			conn.close();
		} catch(Exception ex) {
			System.out.println("Error! Cart is Empty");
			oc.chooseOption();
		}
	}

	public void addToCart(int code) {
		try {
			String type="", name="";
			int price=0;
			Connection conn = DBConnection.initializeDatabase();  //Initialized the DB
			PreparedStatement ps = conn.prepareStatement("select * from item where code ="+code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				code = rs.getInt(1);
				type = rs.getString(2);
				name = rs.getString(3);
				price = rs.getInt(4);
				ps.close();
				PreparedStatement st = conn.prepareStatement("insert into cart (code,type,name,price,quantity) values( ?, ?, ?, ?, ?)");
				st.setInt(1, code);
				st.setString(2, type);
				st.setString(3, name);
				st.setInt(4, price);
				st.setInt(5, 1);
				st.executeUpdate();
				st.close();
				conn.close();
			} else {
				Functionality fun = new Functionality();
				System.out.println("Choose code which is present in item list");
				fun.addItems();
			}
		} catch(Exception ex) {
			Functionality fun = new Functionality();
			System.out.println(ex);
			fun.addItems();
		}
	}

	public void deleteFromCart(int code) {
		Functionality fun = new Functionality();
		try {
			Connection conn = DBConnection.initializeDatabase();  //Initialized the DB
			PreparedStatement ps = conn.prepareStatement("select code from cart where code = "+code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				PreparedStatement st = conn.prepareStatement("delete from cart where code ="+code);
				st.executeUpdate();
				st.close();
				conn.close();
			} else {
				System.out.println("Item is not present in Database");
				fun.deleteItems();
			}
		} catch(Exception ex) {
			System.out.println("Error! Please enter correct input");
			fun.deleteItems();
		}
	}

	public void editQuantity(int code, int quantity) {
		Functionality fun = new Functionality();
		try {
			Connection conn = DBConnection.initializeDatabase();  //Initialized the DB
			PreparedStatement ps = conn.prepareStatement("select code from cart where code = "+code);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ps.close();
				PreparedStatement st = conn.prepareStatement("update cart set quantity="+quantity+" where code="+code);
				st.executeUpdate();
				st.close();
				conn.close();
			} else {
				System.out.println("Entered item is not available");
				fun.editQuantity();
			}
		} catch(Exception ex) {
			System.out.println("Error! Please enter correct input");
			fun.editQuantity();
		}
	}

	public void showInventory() {
		try {
			Connection conn = DBConnection.initializeDatabase();
			PreparedStatement ps = conn.prepareStatement("select * from item");
			ResultSet rs = ps.executeQuery();
			System.out.println("code type name price");
			while(rs.next()) {
				int code = rs.getInt(1);
				String type = rs.getString(2);
				String name = rs.getString(3);
				int price = rs.getInt(4);
				System.out.println(code+" "+type+" "+name+" "+price);
			}
			System.out.println("\n");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

