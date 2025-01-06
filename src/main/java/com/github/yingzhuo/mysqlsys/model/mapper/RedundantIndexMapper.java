package com.github.yingzhuo.mysqlsys.model.mapper;

import com.github.yingzhuo.mysqlsys.model.RedundantIndex;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RedundantIndexMapper {

    public List<RedundantIndex> findAll();

    public List<RedundantIndex> findBySchemaName(@Param("schemaName") String schemaName);

}
