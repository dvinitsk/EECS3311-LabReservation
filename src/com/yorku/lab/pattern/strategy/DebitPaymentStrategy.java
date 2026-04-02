package com.yorku.lab.pattern.strategy;
import com.yorku.lab.model.PaymentTransaction;
import com.yorku.lab.enums.PaymentType;
import com.yorku.lab.enums.PaymentMethod;
import com.yorku.lab.enums.PaymentStatus;
public class DebitPaymentStrategy implements PaymentStrategy {

    @Override
    public PaymentTransaction pay(double amount){
        String transactionId = java.util.UUID.randomUUID().toString();
        PaymentTransaction tx = new PaymentTransaction(
            transactionId, amount, PaymentType.FINAL_CHARGE, PaymentMethod.DEBIT, null 
        );
        tx.setStatus(PaymentStatus.AUTHORIZED);
        return tx;
    }
}
