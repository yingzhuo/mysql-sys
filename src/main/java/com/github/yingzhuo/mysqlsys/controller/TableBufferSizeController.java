package com.github.yingzhuo.mysqlsys.controller;

import com.github.yingzhuo.mysqlsys.model.TableBufferSize;
import com.github.yingzhuo.mysqlsys.model.mapper.TableBufferSizeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/table-buffer")
@RequiredArgsConstructor
public class TableBufferSizeController {

    private final TableBufferSizeMapper tableBufferSizeMapper;

    @GetMapping
    public List<TableBufferSize> findAll() {
        return tableBufferSizeMapper.findAll();
    }

    @GetMapping("/{schemaName}")
    public List<TableBufferSize> findBySchemaName(@PathVariable("schemaName") String schemaName) {
        return tableBufferSizeMapper.findBySchemaName(schemaName);
    }

}
