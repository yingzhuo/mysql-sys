package com.github.yingzhuo.mysqlsys.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 索引使用情况统计
 *
 * @author 应卓
 * @since 0.1.0
 */
@Getter
@Setter
@ToString
@TableName("schema_index_statistics")
public class IndexStatistics implements Serializable {

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("index_name")
    private String indexName;

    @TableField("rows_selected")
    private Long rowsSelected;

    @TableField("rows_inserted")
    private Long rowsInserted;

    @TableField("rows_updated")
    private Long rowsUpdated;

    @TableField("rows_deleted")
    private Long rowsDeleted;

}
