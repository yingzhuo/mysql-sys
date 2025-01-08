package com.github.yingzhuo.mysqlsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 入口类
 *
 * @author 应卓
 * @since 0.1.0
 */
@SpringBootApplication
@MapperScan(basePackages = PackageConstants.MYBATIS_MAPPER_BASE)
public class ApplicationBoot {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args);
    }

}
