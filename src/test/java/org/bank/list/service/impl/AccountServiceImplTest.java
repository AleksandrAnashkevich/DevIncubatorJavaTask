package org.bank.list.service.impl;

import junit.framework.TestCase;
import org.bank.list.dao.DAOFactory;
import org.bank.list.model.Account;
import org.junit.Assert;

import java.util.List;

public class AccountServiceImplTest extends TestCase {

    public void testGetAccountById() {
        int id=1;
        Account expected= DAOFactory.getInstance().getDAO(Account.class).getById(id);
        List<Account> accountList=DAOFactory.getInstance().getDAO(Account.class).getAll();

        Account actual=null;
        for(Account account:accountList){
            if (account.getAccountId()==id){
                actual=account;
            }
        }
        Assert.assertEquals(expected,actual);
    }

    public void testGetRichestAccount() {
        Account expected= DAOFactory.getInstance().getDAO(Account.class).getRichestAccount();
        List<Account> accountList=DAOFactory.getInstance().getDAO(Account.class).getAll();
        Account actual=accountList.get(0);
        for(Account account:accountList){
            if (account.getAccount()>=actual.getAccount()){
                actual=account;
            }
        }
        Assert.assertEquals(expected,actual);
    }

    public void testGetSumAccount() {
        int expected= DAOFactory.getInstance().getDAO(Account.class).getSumAccount();
        List<Account> accountList=DAOFactory.getInstance().getDAO(Account.class).getAll();
        int actual=0;
        for(Account account:accountList){
            actual+=account.getAccount();
        }
        Assert.assertEquals(expected,actual);
    }
}