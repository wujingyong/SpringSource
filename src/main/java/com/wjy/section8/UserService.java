package com.wjy.section8;

import java.util.List;

public interface UserService {
    int save(User user);

    List<User> getUsers();
}
