package com.github.yingzhuo.mysqlsys.controller;

import com.github.yingzhuo.mysqlsys.model.FullTableScan;
import com.github.yingzhuo.mysqlsys.model.mapper.FullTableScanMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/full-table-scan")
@RequiredArgsConstructor
public class FullTableScanController {

    private final FullTableScanMapper fullTableScanMapper;

    @GetMapping
    public List<FullTableScan> findAll() {
        return fullTableScanMapper.findAll();
    }

    @GetMapping("/{schemaName}")
    public List<FullTableScan> findBySchemaName(@PathVariable("schemaName") String schemaName) {
        return fullTableScanMapper.findBySchemaName(schemaName);
    }

}
