package com.github.yingzhuo.mysqlsys.model;

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
public class IndexStatistics implements Serializable {

    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long rowsSelected;

    private Long rowsInserted;

    private Long rowsUpdated;

    private Long rowsDeleted;

}
