package com.github.yingzhuo.mysqlsys.model.mapper;

import com.github.yingzhuo.mysqlsys.model.TableBufferSize;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TableBufferSizeMapper {

    public List<TableBufferSize> findAll();

    public List<TableBufferSize> findBySchemaName(@Param("schemaName") String schemaName);

}
