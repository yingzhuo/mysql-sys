package com.github.yingzhuo.mysqlsys.model.mapper;

import com.github.yingzhuo.mysqlsys.model.UnusedIndex;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UnusedIndexMapper {

    public List<UnusedIndex> findAll();

    public List<UnusedIndex> findBySchemaName(@Param("schemaName") String schemaName);
}
