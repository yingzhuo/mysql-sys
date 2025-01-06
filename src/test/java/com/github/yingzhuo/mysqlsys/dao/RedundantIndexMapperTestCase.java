package com.github.yingzhuo.mysqlsys.dao;

import com.github.yingzhuo.mysqlsys.model.mapper.RedundantIndexMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RedundantIndexMapperTestCase {

    @Autowired
    private RedundantIndexMapper mapper;

    @Test
    public void test1() {
        var list = mapper.findAll();
        list.forEach(System.out::println);
    }

}
