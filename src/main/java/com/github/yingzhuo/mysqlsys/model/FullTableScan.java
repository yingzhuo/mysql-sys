package com.github.yingzhuo.mysqlsys.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 应卓
 * @since 0.1.0
 */
@Getter
@Setter
@ToString
public class FullTableScan implements Serializable {

    private String query;

    private String schemaName;

    private Long execCount;

    private String totalLatency;

    private Long noIndexUsedCount;

    private Long noGoodIndexUsedCount;

}
