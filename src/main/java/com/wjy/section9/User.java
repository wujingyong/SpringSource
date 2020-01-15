package com.wjy.section9;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
