package org.bank.list.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
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
}
