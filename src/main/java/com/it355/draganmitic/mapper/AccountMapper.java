package com.it355.draganmitic.mapper;

import com.it355.draganmitic.model.Account;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * AccountTypeMapper
 */
public class AccountMapper implements RowMapper<Account> {
    
    @Override
    public Account mapRow(ResultSet rs, int arg1) throws SQLException {
        Account account = new Account();
        account.setId(rs.getInt("account_id"));
        account.setAmount(rs.getInt("amount"));
        account.setNumber(rs.getString("number"));
        
        return account;
    }
    
}
