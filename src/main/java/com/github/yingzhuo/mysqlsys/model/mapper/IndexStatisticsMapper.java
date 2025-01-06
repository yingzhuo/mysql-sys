package com.github.yingzhuo.mysqlsys.model.mapper;

import com.github.yingzhuo.mysqlsys.model.IndexStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IndexStatisticsMapper {

    public List<IndexStatistics> findAll();

    public List<IndexStatistics> findBySchemaName(@Param("schemaName") String schemaName);

}
