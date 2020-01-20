package com.wjy.section10;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    @Transactional(propagation = Propagation.REQUIRED/*, rollbackFor = Exception.class*/)
    int save(User user);

    @Transactional
    User select(Integer id);
}
