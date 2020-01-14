package com.wjy.section8;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User().setId(resultSet.getInt("id"))
                .setName(resultSet.getString("name"))
                .setAge(resultSet.getInt("age"))
                .setSex(resultSet.getString("sex"));
    }
}
