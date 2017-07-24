package openClosed.bad;

import openClosed.Item;
import openClosed.Payment;
import openClosed.Receipt;

import java.util.List;

public class Purchase {
    
    private List<Item> items;
    
    public void checkOut(Receipt receipt, boolean isCredit) {
        float total = 0l;
        for (Item item : items) {
          total += item.getPrice();
          receipt.addItem(item);
        }
        Payment p;
        if(isCredit) {
            p = acceptCredit(total);
        } else {
            p = acceptCash(total);
        }
        receipt.addPayment(p);
    }

    private Payment acceptCash(float total) {
        // Just an example
        return null;
    }
    
    private Payment acceptCredit(float total) {
        // Just an example
        return null;
    }

}
