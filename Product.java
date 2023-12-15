package e_commerce;

import java.util.*;

public class Product{
	
    private String name;
    
    private double price;
    
    public Product() {
    
    	this.name = name;
        
    	this.price = price;
    }
    
    public String getName() {
    
    	return name;
    }
    
    public double getPrice() {
    
    	return price;
    }
    public void displayInfo() {
        
    	System.out.println(name + " - $" + price);
    }
    
    public void select() {
    	
    	Scanner sc =new Scanner(System.in); 	
    	
    	sc.nextLine();	
    	
    	System.out.println("Press \n '1 .ADD TO CART' \n ' 2. PAYMENT' "+"\n");
    	
    	int sec=sc.nextInt();
    	
    	switch(sec) {
    	  
    		case 1:
    			
    			new Cart();
    		  
    	    break;
    	    
    		case 2:
    	    
    			new Payment();
    			
    		break;
    	  
    		default:
    	    
    			System.out.println("\n Invalid selection \n");
    			
    			select();
    	}

    	
    	
    	
    	/*
    	
    	String mode_payment=(sc.nextLine()).toLowerCase();
    	
    	if(mode_payment.equals("add to cart")) {
    	
    		new Cart();
    	} 	
    	
    	else if (mode_payment.equals("payment"))   		
    
    	{
    		new Payment();
    	}
    	 	*/
    	sc.close();
    	
    }
}
