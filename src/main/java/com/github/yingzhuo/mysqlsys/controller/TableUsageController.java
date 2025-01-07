package com.github.yingzhuo.mysqlsys.controller;

import com.github.yingzhuo.mysqlsys.model.TableUsage;
import com.github.yingzhuo.mysqlsys.model.mapper.TableUsageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/table-usage")
@RequiredArgsConstructor
public class TableUsageController {

    private final TableUsageMapper tableUsageMapper;

    @GetMapping
    public List<TableUsage> findAll() {
        return tableUsageMapper.findAll();
    }

    @GetMapping("/{schemaName}")
    public List<TableUsage> findBySchemaName(@PathVariable("schemaName") String schemaName) {
        return tableUsageMapper.findBySchemaName(schemaName);
    }

}
