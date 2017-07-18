package com.it355.draganmitic.mapper;

import com.it355.draganmitic.model.AccountType;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * AccountTypeMapper
 */
public class AccountTypeMapper implements RowMapper<AccountType> {
    
    @Override
    public AccountType mapRow(ResultSet rs, int arg1) throws SQLException {
        AccountType user = new AccountType();
        user.setId(rs.getInt("account_type_id"));
        user.setName(rs.getString("name"));
        
        return user;
    }
    
}
