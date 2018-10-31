package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class AppSystem extends TheSystem {
	
    public AppSystem() throws FileNotFoundException {
    }
    
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
      //Fill the code here
       protected int items;
       protected int total;
    }
    
    public Boolean add(Item item) {
		return null;
      //Fill the code here
		if (item.equals(item.getItemName())) {
            System.out.println(item.getItemName() + " is already in the " + CartSystem());
            return false;
		}
    return null;
    }
}
