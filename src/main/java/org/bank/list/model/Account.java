package org.bank.list.model;

import java.util.Objects;

public class Account {

    private int accountId;
    private int account;
    private int userId;
    private User user;

    public Account() {
    }

    public Account(int accountsId, int account, int userId, User user) {
        this.accountId = accountsId;
        this.account = account;
        this.userId = userId;
        this.user = user;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountsId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return accountId == account1.accountId &&
                account == account1.account &&
                userId == account1.userId &&
                user.equals(account1.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, account, userId, user);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountsId=" + accountId +
                ", account=" + account +
                ", userId=" + userId +
                ", user=" + user +
                '}';
    }
}
