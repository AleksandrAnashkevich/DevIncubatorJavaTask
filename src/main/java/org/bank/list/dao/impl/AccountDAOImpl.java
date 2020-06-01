package org.bank.list.dao.impl;

import org.bank.list.dao.AccountDAO;
import org.bank.list.dao.ConnectorDB;
import org.bank.list.model.Account;
import org.bank.list.model.User;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

    @Override
    public Account getById(int id) {

        Account account = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement = connection.prepareStatement(getAccountByIdQuery())) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                account = new Account(
                        rs.getInt("accountid"),
                        rs.getInt("account"),
                        rs.getInt("userid"),
                        new User(
                                rs.getInt("userid"),
                                rs.getString("name"),
                                rs.getString("surename")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }

    @Override
    public List<Account> getAll() {

        List<Account> accountList = new ArrayList<>();
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(getAllAccountsQuery());
            while (rs.next()) {
                accountList.add(new Account(
                        rs.getInt("accountid"),
                        rs.getInt("account"),
                        rs.getInt("userid"),
                        new User(
                                rs.getInt("userid"),
                                rs.getString("name"),
                                rs.getString("surename")
                        )
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountList;
    }

    @Override
    public Account getRichestAccount() {
        Account account = null;
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(getRichestAccountsQuery());
            while (rs.next()) {
                account = new Account(
                        rs.getInt("accountid"),
                        rs.getInt("account"),
                        rs.getInt("userid"),
                        new User(
                                rs.getInt("userid"),
                                rs.getString("name"),
                                rs.getString("surename")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }

    @Override
    public int getSumAccount() {
        try (Connection connection = ConnectorDB.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(getSumAccountsQuery());
            while (rs.next()) {
                return rs.getInt("sum");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    private String getAccountByIdQuery() {
        return "SELECT a.accountid, a.account, u.userid, u.name, u.surename " +
                "FROM account a INNER JOIN user u " +
                "where u.userid=a.userid AND u.userid=?";
    }

    private String getAllAccountsQuery() {
        return "SELECT a.accountid, a.account, u.userid, u.name, u.surename " +
                "FROM account a INNER JOIN user u " +
                "WHERE u.userid=a.userid";
    }

    private String getRichestAccountsQuery() {
        return "SELECT a.accountid, a.account, u.userid, u.name, u.surename " +
                "FROM account a INNER JOIN user u " +
                "where u.userid=a.userid AND " +
                "a.account=(SELECT MAX(account) FROM account)";
    }

    private String getSumAccountsQuery() {
        return "SELECT " + "SUM(account) sum " + " FROM account";
    }
}
