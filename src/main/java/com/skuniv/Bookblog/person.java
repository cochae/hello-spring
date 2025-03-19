package com.skuniv.Bookblog;

import lombok.Getter;
import lombok.Setter;

public class person {
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private Integer age;

    public void plusAge() {
        this.age = age+1;
    }
    public void 나이설정(Integer age){
        if(age < 100)
        {
            this.age = age;
        }
    }
}
