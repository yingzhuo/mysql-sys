package com.github.yingzhuo.mysqlsys.model.mapper;

import com.github.yingzhuo.mysqlsys.model.FullTableScan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FullTableScanMapper {

    public List<FullTableScan> findAll();

    public List<FullTableScan> findBySchemaName(@Param("schemaName") String schemaName);
}
