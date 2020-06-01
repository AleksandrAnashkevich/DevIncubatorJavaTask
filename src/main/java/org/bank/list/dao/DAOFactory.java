package org.bank.list.dao;

import org.bank.list.dao.impl.AccountDAOImpl;
import org.bank.list.model.Account;
import org.bank.list.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DAOFactory {

    private static DAOFactory instance = new DAOFactory();

    Map<Class, Supplier<AccountDAO>> daoSupplier = new HashMap<>();

    private DAOFactory() {
        daoSupplier.put(Account.class,AccountDAOImpl::new);
    }


    public AccountDAO getDAO(Class<Account> tClass) {
        Supplier<AccountDAO> supplier=daoSupplier.get(tClass);
        AccountDAO dao = supplier.get();
        return dao;
    }

    public static DAOFactory getInstance() {
        return instance;
    }

}