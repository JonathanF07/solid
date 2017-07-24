package open_closed.good;

import open_closed.Payment;

public interface PaymentMethod {
    
    Payment acceptPayment(float total);

}
