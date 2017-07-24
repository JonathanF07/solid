package open_closed.good;

import open_closed.Item;
import open_closed.Payment;
import open_closed.Receipt;

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
