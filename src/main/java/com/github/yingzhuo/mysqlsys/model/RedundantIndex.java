package com.github.yingzhuo.mysqlsys.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 冗余索引
 *
 * @author 应卓
 * @since 0.1.0
 */
@Getter
@Setter
@ToString
public class RedundantIndex implements Serializable {

    private String tableSchema;

    private String tableName;

    private String redundantIndexName;

    private String redundantIndexColumns;

    private Boolean redundantIndexNonUnique;

    private String dominantIndexName;

    private String dominantIndexColumns;

    private Boolean dominantIndexNonUnique;

    private Boolean subpartExists;

    private String sqlDropIndex;

}
