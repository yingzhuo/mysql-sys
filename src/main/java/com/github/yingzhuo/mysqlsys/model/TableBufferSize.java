package com.github.yingzhuo.mysqlsys.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class TableBufferSize implements Serializable {

    private String schemaName;
    private String tableName;
    private String allocated;
    private String data;

}
