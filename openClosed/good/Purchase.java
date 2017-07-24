package openClosed.good;

import openClosed.Item;
import openClosed.Payment;
import openClosed.Receipt;

import java.util.List;

public class Purchase {
    
    private List<Item> items;
    
    public void checkOut(Receipt receipt, PaymentMethod pm) {
        float total = 0l;
        for (Item item : items) {
          total += item.getPrice();
          receipt.addItem(item);
        }
        Payment p = pm.acceptPayment(total);
        receipt.addPayment(p);
    }

}
