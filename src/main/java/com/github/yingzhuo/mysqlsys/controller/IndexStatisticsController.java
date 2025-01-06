package com.github.yingzhuo.mysqlsys.controller;

import com.github.yingzhuo.mysqlsys.model.IndexStatistics;
import com.github.yingzhuo.mysqlsys.model.mapper.IndexStatisticsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index-statistics")
@RequiredArgsConstructor
public class IndexStatisticsController {

    private final IndexStatisticsMapper indexStatisticsMapper;

    @GetMapping
    public List<IndexStatistics> findAll() {
        return indexStatisticsMapper.findAll();
    }

    @GetMapping("/{schemaName}")
    public List<IndexStatistics> findBySchemaName(@PathVariable("schemaName") String schemaName) {
        return indexStatisticsMapper.findBySchemaName(schemaName);
    }

}
