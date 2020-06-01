package org.bank.list.service.impl;

import org.bank.list.dao.DAOFactory;
import org.bank.list.model.Account;
import org.bank.list.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    @Override
    public Account getAccountById(String idStr) {
        int id = Integer.parseInt(idStr);
        return DAOFactory.getInstance().getAccountDAO().getById(id);
    }

    @Override
    public List<Account> getAllAccount() {
        return DAOFactory.getInstance().getAccountDAO().getAll();
    }

    @Override
    public Account getRichestAccount() {
        return DAOFactory.getInstance().getAccountDAO().getRichestAccount();
    }

    @Override
    public int getSumAccount() {
        return DAOFactory.getInstance().getAccountDAO().getSumAccount();
    }

}
