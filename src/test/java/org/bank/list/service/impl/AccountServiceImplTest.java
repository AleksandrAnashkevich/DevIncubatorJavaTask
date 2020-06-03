package org.bank.list.service.impl;

import junit.framework.TestCase;
import org.bank.list.model.Account;
import org.bank.list.model.User;
import org.bank.list.service.AccountService;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImplTest extends TestCase {


    public void testGetRichestAccount() {
        User user1=new User(1,"James","Cunningham");
        User user2=new User(2,"Evan","Redgrave");
        User user3=new User(3,"Albert","DeSalvo");
        Account account1=new Account(1,50,user1.getUserId(),user1);
        Account account2=new Account(2,100,user2.getUserId(),user2);
        Account account3=new Account(3,90,user3.getUserId(),user3);
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        AccountService service= new AccountServiceImpl();
        Account expected= service.getRichestAccount(accountList);
        Account actual=accountList.get(0);
        for(Account account:accountList){
            if (account.getAccount()>=actual.getAccount()){
                actual=account;
            }
        }
        Assert.assertEquals(expected,actual);
    }

    public void testGetSumAccount() {
        User user1=new User(1,"James","Cunningham");
        User user2=new User(2,"Evan","Redgrave");
        User user3=new User(3,"Albert","DeSalvo");
        Account account1=new Account(1,50,user1.getUserId(),user1);
        Account account2=new Account(2,100,user2.getUserId(),user2);
        Account account3=new Account(3,90,user3.getUserId(),user3);
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        AccountService service= new AccountServiceImpl();
        int expected= service.getSumAccount(accountList);
        int actual=0;
        for(Account account:accountList){
            actual+=account.getAccount();
        }
        Assert.assertEquals(expected,actual);
    }
}