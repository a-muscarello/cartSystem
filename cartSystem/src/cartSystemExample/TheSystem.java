package cartSystemExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;
    protected TheSystem() throws FileNotFoundException {
        itemCollection = new HashMap<String, Item>();

        if (getClass().getSimpleName().equals("AppSystem")) {
        	
        	File file = new File ("C:\\Users\\Students\\Desktop");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while ((line = br.readLine()) != null) {
            	String []lines = line.split("  ");
            	Item item = new Item ();
            	//Item item = new Item (lines[0], lines[1], lines[2], lines[3]);
            	//itemCollection.add(item);
            	
            	item.setItemName(lines[0]);	
            	item.setItemDesc(lines[1]);
            	item.setItemPrice(lines[2]);
            	item.setAvailableQuantity(lines[3]);	
            }   
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
    	//Fill the code here
    	
//    	getItemCollection = new HashMap<String, Item>();
    	itemCollection = new HashMap<String, Item>();
    	itemCollection.put(line, item);
		return itemCollection;
		
    }
    
    public void setItemCollection(HashMap<String, Item> copy ){
      //Fill the code here
    	copy = itemCollection;
    }
    
    public Boolean add(Item item) {
      //Fill the code here
		for (setItemCollection(itemCollection)) {
			return false;
			
		}
		return itemCollection.add(item);
    }
    
    public Item remove(String itemName) {
        Item item = null;
      //Fill the code here
//        this.quantity = this.quantity - item;
        for (int i = 0; i < itemCollection.size(); i++) {
        	Item newitem = itemCollection.get(item);
	        if (itemName.equals(item.getItemName())) {
	        	item.remove(i);
	        }
	        else {
	        	System.out.println();
	        }
        
		return itemCollection.remove(item);
    }
    
    public Boolean checkAvailability(Item item, Integer current) {
		return null;
      //Fill the code hereitem
		
		
    }
}
