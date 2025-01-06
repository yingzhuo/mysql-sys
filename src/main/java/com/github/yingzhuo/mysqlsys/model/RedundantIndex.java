package com.github.yingzhuo.mysqlsys.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("schema_redundant_indexes")
public class RedundantIndex implements Serializable {

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("redundant_index_name")
    private String redundantIndexName;

    @TableField("redundant_index_columns")
    private String redundantIndexColumns;

    @TableField("redundant_index_non_unique")
    private Boolean redundantIndexNonUnique;

    @TableField("dominant_index_name")
    private String dominantIndexName;

    @TableField("dominant_index_columns")
    private String dominantIndexColumns;

    @TableField("dominant_index_non_unique")
    private Boolean dominantIndexNonUnique;

    @TableField("subpart_exists")
    private Boolean subpartExists;

    @TableField("sql_drop_index")
    private String sqlDropIndex;

}

