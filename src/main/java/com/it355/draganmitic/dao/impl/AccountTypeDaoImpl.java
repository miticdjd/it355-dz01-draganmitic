package com.it355.draganmitic.dao.impl;

import com.it355.draganmitic.dao.AccountTypeDao;
import com.it355.draganmitic.mapper.AccountTypeMapper;
import com.it355.draganmitic.model.AccountType;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * AccontType DAO implementation
 */
public class AccountTypeDaoImpl implements AccountTypeDao {
 
    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<AccountType> getAllAccountTypes() {
        String sql = "SELECT * FROM account_type";
        List<AccountType> accountTypes = jdbcTemplate.query(sql, new AccountTypeMapper());
        return accountTypes;
    }

    @Override
    public AccountType getAccountType(Integer id) {
        String sql = "SELECT * FROM account_type WHERE account_type_id = " + id;
        AccountType accountType = jdbcTemplate.queryForObject(sql, new AccountTypeMapper());
        return accountType;
    }

    @Override
    public boolean addAccountType(AccountType accountType) {
        String sql = "INSERT INTO account_type (name) VALUES (?)";
        jdbcTemplate.update(sql, new Object[]{accountType.getName()});
        return true;
    }

    @Override
    public boolean updateAccountType(AccountType accountType) {
        String sql = "UPDATE account_type SET name = ? WHERE account_type_id = ?";
        jdbcTemplate.update(sql, new Object[]{accountType.getName(), accountType.getId()});
        return true;
    }

    @Override
    public boolean removeAccountType(Integer id) {
        String sql = "DELETE FROM account_type WHERE account_type_id = " + id;
        jdbcTemplate.execute(sql);
        return true;
    }
    
}
