package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class CustomerService implements Customerdao {
 public ArrayList< Products> displayElectronics( Products product)
    {
        ArrayList<Products>arrayList=new ArrayList<Products>();
        try {
        
        Connection con =ConnectionFactory.getConnection();
        Statement statement=con.createStatement();
        ResultSet  set=statement.executeQuery("SELECT * FROM product_info.electronics");
        System.out.println("-------------------------->ELECTRONICS SECTION>----------------------------------");
      while(set.next()) {
        Products pro=new  Products();

        pro.setCode(set.getInt(1));
        pro.setName(set.getString(2));
        pro.setQuantity(set.getInt(3));
       
        pro.setCost(set.getInt(4));
        arrayList.add(pro);

       }
 }
        catch(Exception e) {
        e.printStackTrace();
    }
        return arrayList;
    }
 public ArrayList< Products> displayClothes( Products product)
 {
     ArrayList<Products>arrayList=new ArrayList<Products>();
     try {
     
     Connection con =ConnectionFactory.getConnection();
     Statement statement=con.createStatement();
     ResultSet  set=statement.executeQuery("SELECT * FROM product_info.clothes");
     System.out.println("-------------------------->CLOTHES SECTION>----------------------------------");
   while(set.next()) {
     Products pro=new  Products();

     pro.setCode(set.getInt(1));
     pro.setName(set.getString(2));
     pro.setQuantity(set.getInt(3));
    
     pro.setCost(set.getInt(4));
     arrayList.add(pro);

    }
}
     catch(Exception e) {
     e.printStackTrace();
 }
     return arrayList;
 }
 public ArrayList< Products> displayKitchen( Products product)
 {
     ArrayList<Products>arrayList=new ArrayList<Products>();
     try {
     
     Connection con =ConnectionFactory.getConnection();
     Statement statement=con.createStatement();
     ResultSet  set=statement.executeQuery("SELECT * FROM product_info.kitchen");
     System.out.println("-------------------------->KITCHEN SECTION>----------------------------------");
   while(set.next()) {
     Products pro=new  Products();

     pro.setCode(set.getInt(1));
     pro.setName(set.getString(2));
     pro.setQuantity(set.getInt(3));
    
     pro.setCost(set.getInt(4));
     arrayList.add(pro);

    }
}
     catch(Exception e) {
     e.printStackTrace();
 }
     return arrayList;
 }
   public void addEmployee(Products product) {
        
        try {
            
            Connection con =ConnectionFactory.getConnection();
            Statement statement=con.createStatement();
            String query="insert into product_info.electronics(`code`, `name`, `quantity`, `cost`) VALUES('"+product.getCode()+"','"+product.getName() +"','"+product.getQuantity()+"','"+product.getCost()+"')";
            statement.executeUpdate(query);
            System.out.println("data inserted successfully");
            
        }catch(Exception e) {
            e.printStackTrace();
    }
    }
 
}