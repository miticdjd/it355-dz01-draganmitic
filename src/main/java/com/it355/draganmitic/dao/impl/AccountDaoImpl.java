package com.it355.draganmitic.dao.impl;

import com.it355.draganmitic.dao.AccountDao;
import com.it355.draganmitic.mapper.AccountMapper;
import com.it355.draganmitic.model.Account;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Account DAO implementation
 */
public class AccountDaoImpl implements AccountDao {
 
    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Account> getAllAccounts() {
        String sql = "SELECT * FROM account";
        List<Account> accounts = jdbcTemplate.query(sql, new AccountMapper());
        return accounts;
    }

    @Override
    public Account getAccount(Integer id) {
        String sql = "SELECT * FROM account WHERE account_id = " + id;
        Account account = jdbcTemplate.queryForObject(sql, new AccountMapper());
        return account;
    }

    @Override
    public boolean addAccount(Account account) {
        String sql = "INSERT INTO account (amount, number) VALUES (?, ?)";
        jdbcTemplate.update(sql, new Object[]{account.getAmount(), account.getNumber()});
        return true;
    }

    @Override
    public boolean updateAccount(Account account) {
        String sql = "UPDATE account SET amount = ?, number = ? WHERE account_id = ?";
        jdbcTemplate.update(sql, new Object[]{account.getAmount(), account.getNumber(), account.getId()});
        return true;
    }

    @Override
    public boolean removeAccount(Integer id) {
        String sql = "DELETE FROM account WHERE account_id = " + id;
        jdbcTemplate.execute(sql);
        return true;
    }
    
}
