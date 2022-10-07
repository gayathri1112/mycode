package database;

import java.util.List;

import java.util.ArrayList;



public interface Customerdao
{
  public ArrayList<Products> displayElectronics(Products product);
  public ArrayList<Products> displayClothes(Products product);
  public ArrayList<Products> displayKitchen(Products product);
  public void addEmployee(Products product);

}