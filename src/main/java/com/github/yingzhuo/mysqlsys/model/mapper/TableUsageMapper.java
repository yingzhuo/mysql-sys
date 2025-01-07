package com.github.yingzhuo.mysqlsys.model.mapper;

import com.github.yingzhuo.mysqlsys.model.TableUsage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TableUsageMapper {

    public List<TableUsage> findAll();

    public List<TableUsage> findBySchemaName(@Param("schemaName") String schemaName);

}
