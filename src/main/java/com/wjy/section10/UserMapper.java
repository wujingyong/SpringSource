package com.wjy.section10;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User().setId(rs.getInt("id"))
                .setName(rs.getString("name"))
                .setAge(rs.getInt("age"))
                .setSex(rs.getString("sex"));
    }
}
