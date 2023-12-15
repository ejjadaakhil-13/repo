
package e_commerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public Store() 
    {
        System.out.println("\nWelcome to the Store:\n");

        System.out.println("Select a section that you want to buy products\n");
       
        System.out.println(" \n -- 1.Fashion \n -- 2.Medical \n -- 3.Groceries \n -- 4.Electronics\n  \n");
        
        System.out.println("\nWe are using string methods to convert the selections to lowercase \n");

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        int secti = sc.nextInt();

        switch (secti) {
        
        case 1:
        	
                System.out.println("\nHere we created a constructor parametrized to display results through the constructor method  \n");
        
                System.out.println("\nHere the items are in private mode, but we access them through the getters and setters \n");

                products.add(new Product("1. Shirts", 25.99));
                
                products.add(new Product("2. Pants", 35.99));
                
                products.add(new Product("3. Coats", 89.99));

                System.out.println("\nThese values are stored in an ArrayList \n");
                
                System.out.println("Now please choose a product that you want to purchase \n");
                
                System.out.println("\n We currently have these things in stock:\n press the keys to buy the products \n");

                for (Product prod : products) {
                
                	prod.displayInfo();
                }
                
                int s=sc.nextInt();
                
                switch(s) {
                
                case 1:
                	
                	System.out.println("Shirts selected:");
                	
                	break;
                
                case 2:
                	
                	System.out.println("Pants selected");
                	
                	break;
                
                case 3:
                	
                	System.out.println("Coats Supplements selected");
                	
                	break;
                
                default:
                
                	System.out.println("sorry we don't have that product");
                	
                	new Store();
                }

              
                //products.get(0).select(); 
                
                break;

            case 2:
                System.out.println("\nHere we created a constructor parametrized to display results through the constructor method  \n");
                
                System.out.println("\nHere the items are in private mode, but we access them through the getters and setters \n");

                products.add(new Product("1. Body pains", 12.99));
                
                products.add(new Product("2. BP Tablets", 19.99));
                
                products.add(new Product("3. Vitamin Supplements", 29.99));

                System.out.println("\nThese values are stored in an ArrayList \n");
                
                System.out.println("Now please choose a product that you want to purchase \n");
                
                System.out.println("\n We currently have these things in stock:\n press the keys to buy the products \n");

                for (Product prod : products) {
                
                	prod.displayInfo();
                }
                
                int s1=sc.nextInt();
                
                switch(s1) {
                
                case 1:
                	
                	System.out.println("Body pains selected:");
                	
                	break;
                
                case 2:
                	
                	System.out.println("BP Tablets selected");
                	
                	break;
                
                case 3:
                	
                	System.out.println("Vitamin Supplements selected");
                	
                	break;
                
                default:
                
                	System.out.println("sorry we don't have that product");
                	
                	new Store();
                }

                
                //products.get(0).select(); 
                
                break;

            case 3:
               
            	System.out.println("\nHere we created a constructor parametrized to display results through the constructor method \n");
                
            	System.out.println("\nHere the items are in private mode, but we access them through the getters and setters \n");

                System.out.println("Now please choose a product that you want to purchase\n");
                
                products.add(new Product("1. Milk", 3.99));
                
                products.add(new Product("2. Soaps", 1.99));
                
                products.add(new Product("3. Washing Powder", 5.99));
                
                System.out.println("\n We currently have these things in stock:\n press the keys to buy the products \n");

                System.out.println("\nThese values are stored in an ArrayList  \n");

                for (Product prod : products) {
                   
                	prod.displayInfo();
                }
                
                int s2=sc.nextInt();
                
                switch(s2) {
                
                case 1:
                	
                	System.out.println("Milk selected:");
                	
                	break;
                
                case 2:
                	
                	System.out.println("Soaps selected");
                	
                	break;
                
                case 3:
                	
                	System.out.println("Washing powder selected");
                	
                	break;
                
                default:
                
                	System.out.println("sorry we don't have that product");
                	
                	new Store();
                }

              
                // products.get(0).select(); 
                
                break;

            case 4:
               
            	System.out.println("\n We currently have these things in stock:\n press the keys to buy the products \n");
                
            	System.out.println("\nHere we created a constructor parametrized to display results through the constructor method \n");
                
            	System.out.println("\nHere the items are in private mode, but we access them through the getters and setters  \n");

                products.add(new Product("1. Phones", 299.99));
                
                products.add(new Product("2. Tablets", 499.99));
                
                products.add(new Product("3. Laptops", 999.99));

                System.out.println("\nThese values are stored in an ArrayList \n");
                
                System.out.println("\n We currently have these things in stock:\n press the keys to buy the products \n");

                for (Product prod : products) {
                    
                	prod.displayInfo();
                }

                int s3 = sc.nextInt();
                
                switch(s3) {
                
                case 1:
                	
                	System.out.println("Phones selected:");
                	
                	break;
                
                case 2:
                	
                	System.out.println("Tablets selected");
                	
                	break;
                
                case 3:
                	
                	System.out.println("Laptops selected");
                	
                	break;
                
                default:
                
                	System.out.println("sorry we don't have that product");
                	
                	new Store();
                }
                
               // products.get(0).select(); 
                
                
                
                break;

            default:
            	
                System.out.println("Wrong selection");
                
                new Store();
               
                break;
        }
    
}
    }

/*
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

		public Store (){
        System.out.println("\n Welcome to the Store:"+"\n");
        
        System.out.println("Select a section that you want to buy products"+"\n");
        
        System.out.println("\t \t \t ------ 1.Fashion \n -- 2.Medical \n -- 3.Groceries \n -- 4.Electronics\n ------ \n");
        
        System.out.println("\n We are using string methods to convert the selections to lowercase \n");
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Product> products = new ArrayList<>();
        
        Product product=new Product(null, 0);
       
        int secti=sc.nextInt();
        
        switch(secti) {
       
        case 1:
        	        
            System.out.println("\n here we created a constructor paramarmized to display results throught the constructor method  \n");
            
            System.out.println("\n Here the items are in private mode but we access them through the geters and seters \n");
          
            products.add(new Product("Shirts", 25.99));
            
            products.add(new Product("Pants", 35.99));
            
            products.add(new Product("Coats", 89.99));

            System.out.println("\n These values are stored in a ArrayList \n");
            
            System.out.println("Now please choose a product that you want to purchase \n");
            
            System.out.println("We currently have these things in stock: \n");

            for (Product product : products) {
            
            	product.displayInfo();
            }
             
            Product product=new Product(null,0);
            
            product.select();
        	
            break;
          
        case 2:
            
            System.out.println("\n here we created a constructor paramarmized to display results throught the constructor method  \n");
            
            System.out.println("\n Here the items are in private mode but we access them through the geters and seters \n");
           
            products.add(new Product("Body pains", 12.99));
           
            products.add(new Product("BP Tablets", 19.99));
            
            products.add(new Product("Vitamin Supplements", 29.99));
            
            System.out.println("\n These values are stored in a ArrayList \n");
            
            System.out.println("Now please choose a product that you want to purchase \n");
            
            System.out.println("We currently have these things in stock:"+"\n");

            for (Product product1 : products) {
              
            	product1.displayInfo();
            }
            
           
            
            product.select();
            
            break;
          
        case 3:
        	
        	System.out.println("\n Here we created a constructor paramarmized to display results throught the constructor method \n");
            
            System.out.println("\n Here the items are in private mode but we access them through the geters and seters \n");

            System.out.println("Now please choose a product that you want to purchase\n");
            
            products.add(new Product("Milk", 3.99));
            
            products.add(new Product("Soaps", 1.99));
            
            products.add(new Product("Washing Powder", 5.99));
            
            System.out.println("\n These values are stored in a ArrayList  \n");
 
            for (Product product : products) {
              
            	product.displayInfo();
            }
            
            
            product.select();
               
          break;
          
        case 4:
        	
        	System.out.println("We currently have these things in stock: \n");
            
        	System.out.println("\n Here we created a constructor paramarmized to display results throught the constructor method \n");
            
        	System.out.println("\n Here the items are in private mode but we access them through the geters and seters  \n");
            
        	products.add(new Product("Phones", 299.99));
            
        	products.add(new Product("Tablets", 499.99));
            
        	products.add(new Product("Laptops", 999.99));

            System.out.println("\n These values are stored in a ArrayList \n");
            
            System.out.println("\n We currently have these things in stock: \n");
          

            for (Product product : products) {
                
            	product.displayInfo();
            }
            
            
            product.select();
               
          break;
          
        default:
            
        	System.out.println("wrong selection");
            
            new Store();
      }

        
        */
        
        
        
        
        
    /*    
        String section = (sc.nextLine()).toLowerCase();

        if (section.equals("fashion")) {
        
        	ArrayList<Product> products = new ArrayList<>();
            
            System.out.println("\n here we created a constructor paramarmized to display results throught the constructor method  \n");
            
            System.out.println("\n Here the items are in private mode but we access them through the geters and seters \n");
          
            products.add(new Product("Shirts", 25.99));
            
            products.add(new Product("Pants", 35.99));
            
            products.add(new Product("Coats", 89.99));

            System.out.println("\n These values are stored in a ArrayList \n");
            
            System.out.println("Now please choose a product that you want to purchase \n");
            
            System.out.println("We currently have these things in stock: \n");

            for (Product product : products) {
            
            	product.displayInfo();
            }
             
            Product product=new Product(null,0);
            
            product.select();
            
      } else if (section.equals("medical")) {
          
        	ArrayList<Product> products = new ArrayList<>();
           
            System.out.println("\n here we created a constructor paramarmized to display results throught the constructor method  \n");
            
            System.out.println("\n Here the items are in private mode but we access them through the geters and seters \n");
           
            products.add(new Product("Body pains", 12.99));
           
            products.add(new Product("BP Tablets", 19.99));
            
            products.add(new Product("Vitamin Supplements", 29.99));
            
            System.out.println("\n These values are stored in a ArrayList \n");
            
            System.out.println("Now please choose a product that you want to purchase \n");
            
            System.out.println("We currently have these things in stock:"+"\n");

            for (Product product : products) {
              
            	product.displayInfo();
            }
            
            Product product=new Product(null,0);
            
            product.select();
        } 
        else if (section.equals("groceries")) {
            
        	ArrayList<Product> products = new ArrayList<>();
            
            System.out.println("\n Here we created a constructor paramarmized to display results throught the constructor method \n");
            
            System.out.println("\n Here the items are in private mode but we access them through the geters and seters \n");

            System.out.println("Now please choose a product that you want to purchase\n");
            
            products.add(new Product("Milk", 3.99));
            
            products.add(new Product("Soaps", 1.99));
            
            products.add(new Product("Washing Powder", 5.99));
            
            System.out.println("\n These values are stored in a ArrayList  \n");
 
            for (Product product : products) {
              
            	product.displayInfo();
            }
            
            Product product=new Product(null,0);
            
            product.select();
            
        } else if (section.equals("electronics")) {
           
        	ArrayList<Product> products = new ArrayList<>();
            
        	System.out.println("We currently have these things in stock: \n");
            
        	System.out.println("\n Here we created a constructor paramarmized to display results throught the constructor method \n");
            
        	System.out.println("\n Here the items are in private mode but we access them through the geters and seters  \n");
            
        	products.add(new Product("Phones", 299.99));
            
        	products.add(new Product("Tablets", 499.99));
            
        	products.add(new Product("Laptops", 999.99));

            System.out.println("\n These values are stored in a ArrayList \n");
            
            System.out.println("\n We currently have these things in stock: \n");
          

            for (Product product : products) {
                
            	product.displayInfo();
            }
            
            Product product=new Product(null,0);
            
            product.select();
        
        } else {
            
        	System.out.println("Invalid section"+"\n");
        
        	new Store();
        
        sc.close();
    }
}}*/
