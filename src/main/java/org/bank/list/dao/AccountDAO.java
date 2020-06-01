package org.bank.list.dao;

import org.bank.list.model.Account;
import org.bank.list.model.User;

import java.util.List;

public interface AccountDAO {
    Account getById(int id);

    List<Account> getAll();

    Account getRichestAccount();

    int getSumAccount();


}
