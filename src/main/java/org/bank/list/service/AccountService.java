package org.bank.list.service;

import org.bank.list.model.Account;

import java.util.List;

public interface AccountService {
    Account getAccountById(String idStr);

    List<Account> getAllAccount();

    Account getRichestAccount();

    int getSumAccount();

}
