package com.wjy.section8;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;
}
