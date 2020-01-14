package com.wjy.section8;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserServiceImpl implements UserService {
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(User user) {
        int update = jdbcTemplate.update("insert into user (name, age, sex) values (?,?,?)",
                new Object[]{user.getName(), user.getAge(), user.getSex()});
        return update;
    }

    @Override
    public List<User> getUsers() {
        Long aLong = jdbcTemplate.queryForObject("select COUNT(*) from user", Long.class);
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }
}
