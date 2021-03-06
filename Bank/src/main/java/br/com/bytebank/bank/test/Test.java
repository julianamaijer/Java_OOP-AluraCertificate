package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.ReferencesKeeper;

public class Test {

    public static void main(String[] args) {

        ReferencesKeeper keeper = new ReferencesKeeper();

        Account cc = new CheckingAccount(22,11);
        keeper.add(cc);

        Account cc2 = new CheckingAccount(22,11);
        keeper.add(cc2);

        int size = keeper.getElementsAmount();
        System.out.println(size);

        Account ref = keeper.getReference(0);
        System.out.println(ref.getNumber());


    }
}
