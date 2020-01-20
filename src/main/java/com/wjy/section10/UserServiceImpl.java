package com.wjy.section10;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class UserServiceImpl implements UserService {
    private UserService userService;

    public UserServiceImpl setUserService(UserService userService) {
        this.userService = userService;
        return this;
    }

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    @SneakyThrows
    public int save(User user) {
        int update = jdbcTemplate.update("insert into user (name, age, sex) values (?,?,?)",
                new Object[]{user.getName(), user.getAge(), user.getSex()});
        /*if (1 == 1) {
            throw new RuntimeException();
//            throw new Exception("123");
        }*/
        return update;
    }

    @Override
    public User select(Integer id) {
        userService.save(new User().setName("gg"));
        User user = jdbcTemplate.query("select * from user where id = ?", new UserRowMapper(), id).get(0);
        return user;
    }
}
