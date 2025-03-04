package com.github.yingzhuo.mysqlsys.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 未使用的索引
 *
 * @author 应卓
 * @since 0.1.0
 */
@Getter
@Setter
@ToString
public class UnusedIndex implements Serializable {

    private String schemaName;

    private String tableName;

    private String indexName;

}
