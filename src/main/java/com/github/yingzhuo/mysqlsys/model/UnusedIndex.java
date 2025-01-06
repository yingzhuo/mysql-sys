package com.github.yingzhuo.mysqlsys.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("schema_unused_indexes")
public class UnusedIndex implements Serializable {

    @TableField("object_schema")
    private String schemaName;

    @TableField("object_name")
    private String tableName;

    @TableField("index_name")
    private String indexName;

}
