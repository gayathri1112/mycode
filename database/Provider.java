package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
public class Provider {
	static int f_bill;
    public  static  void addData() {
        Scanner sc=new Scanner(System.in);
        Products product=new  Products();
        System.out.println("enter the details(code,name,quantity,cost)");
        product.setCode(sc.nextInt());
        product.setName(sc.next());
        product.setQuantity(sc.nextInt());
        product.setCost(sc.nextInt());
       
        CustomerService employeeservice=new CustomerService();
        employeeservice.addEmployee(product);
        
    }
    public   static void displayData() {
    	Scanner sc=new Scanner(System.in);
    	Products product=new Products();
        CustomerService cse=new CustomerService();
         ArrayList<Products> l=cse.displayElectronics(product);
        for(Products e :l) {
        	System.out.print(e.getCode()+"\t");
            System.out.print(e.getName()+"\t");
            System.out.print(e.getQuantity()+"\t");
            System.out.println(e.getCost()+"\n");
        }
        while(true) {
        System.out.println("enter the code to purchase");
        
        int c=sc.nextInt();
        for(Products y:l)
        {
        	int d=y.getCode();      
        	if(c==d)
        	{
        		System.out.println("how many u require?");
        		int x=sc.nextInt();
        		f_bill+=x*y.getCost();
        		System.out.println("the prize is:"+f_bill);
        		int n=y.getQuantity();
        		
        		int pass=n-x;
        		String query="UPDATE `product_info`.`electronics` SET `quantity` = '"+pass+"'  WHERE (`code` = '"+c+"')";
        		try {
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info", "root", "root");
					
					Statement statement= connection.createStatement();
					
							statement.executeUpdate(query);
							
				} catch (SQLException e1) {
					System.out.println(e1);
				}
        	}
        }
        
        System.out.println("enter 1 to continue or 0 to exit this section");
        int c_choice=sc.nextInt();
        if(c_choice==0)
        	break;
        	
        }


   }
    public   static void displayData1() {
    	Products product=new Products();
        CustomerService cse=new CustomerService();
         ArrayList<Products> l=cse.displayClothes(product);
        for(Products e :l) {
        	System.out.print(e.getCode()+"\t");
            System.out.print(e.getName()+"\t");
            System.out.print(e.getQuantity()+"\t");
            System.out.println(e.getCost()+"\n");
        }
        System.out.println("enter the code to purchase");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        for(Products y:l)
        {
        	 int d=y.getCode();      
        	if(c==d)
        	{
        		System.out.println("how many u require?");
        		int x=sc.nextInt();
//        		System.out.println("the prize is:"+(x*y.getCost()));
        		int n=y.getQuantity();
        		f_bill+=x*y.getCost();
        		System.out.println("the prize is:"+f_bill);
        		int pass=n-x;
        		System.err.println(pass);
        		String query="UPDATE `product_info`.`clothes` SET `quantity` = '"+pass+"'  WHERE (`code` = '"+d+"')";
        		try {
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info", "root", "root");
					
					Statement statement= connection.createStatement();
					
							statement.executeUpdate(query);
							
				} catch (SQLException e1) {
					System.out.println(e1);
				}
        	}

            System.out.println("enter 1 to continue or 0 to exit this section");
            int c_choice=sc.nextInt();
            if(c_choice==0)
            	break;
        }
        
        


        	
   }
    public   static void displayData2() {
    	Products product=new Products();
        CustomerService cse=new CustomerService();
         ArrayList<Products> l=cse.displayKitchen(product);
        for(Products e :l) {
        	System.out.print(e.getCode()+"\t");
            System.out.print(e.getName()+"\t");
            System.out.print(e.getQuantity()+"\t");
            System.out.println(e.getCost()+"\n");
        }
        System.out.println("enter the code to purchase");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        for(Products y:l)
        {
        	int d=y.getCode();      
        	if(c==d)
        	{
        		System.out.println("how many u require?");
        		int x=sc.nextInt();
        		f_bill+=x*y.getCost();
        		System.out.println("the prize is:"+f_bill);
        		int n=y.getQuantity();
        		int pass=n-x;
        		String query="UPDATE `product_info`.`kitchen` SET `quantity` = '"+pass+"'  WHERE (`code` = '"+c+"')";
        		try {
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info", "root", "root");
					
					Statement statement= connection.createStatement();
					
							statement.executeUpdate(query);
							
				} catch (SQLException e1) {
					System.out.println(e1);
				}
        	}
        
        System.out.println("enter 1 to continue or 0 to exit this section");
        int c_choice=sc.nextInt();
        if(c_choice==0)
        	break;
        

        }

   }

    public static void main(String[] args) //controller class
    {
    	
    	
    	Scanner sc=new Scanner(System.in);
    	

      while(true)
      {
    	  
    	  System.out.println("enter the number");
    	  System.out.println("1:ELECTRONICS \n2:CLOTHES \n3:KITCHEN");
    	  int choice=sc.nextInt();
    	  if(choice==1) {
    		  displayData();
    	  
    	  }
    	  else if(choice==2)  {
    		  displayData1();
    		
    	  }
    	  else if(choice==3)
    	  {
    	  displayData2();
    	 
    	  }
    	  else
    		  System.out.println("choose valid no:");
      }
        
    

        
        



   }



}