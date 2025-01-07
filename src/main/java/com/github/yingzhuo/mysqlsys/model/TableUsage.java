package com.github.yingzhuo.mysqlsys.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 表使用情况
 *
 * @author 应卓
 * @since 0.1.0
 */
@Getter
@Setter
@ToString
public class TableUsage implements Serializable {

    private String tableSchema;

    private String tableName;

    private Long io;

}
