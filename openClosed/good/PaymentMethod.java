package openClosed.good;

import openClosed.Payment;

public interface PaymentMethod {
    
    Payment acceptPayment(float total);

}
