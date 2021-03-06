package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CalculateTax;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.LifeInsurance;

public class TestTaxable {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(222, 333);
        checkingAccount.deposit(100);

        LifeInsurance lifeInsurance = new LifeInsurance();

        CalculateTax calculateTax = new CalculateTax();
        calculateTax.register(checkingAccount);
        calculateTax.register(lifeInsurance);

        System.out.println(calculateTax.getTaxValue());
    }
}
