package com.github.yingzhuo.mysqlsys.controller;

import com.github.yingzhuo.mysqlsys.model.UnusedIndex;
import com.github.yingzhuo.mysqlsys.model.mapper.UnusedIndexMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/unused-index")
@RequiredArgsConstructor
public class UnusedIndexController {

    private final UnusedIndexMapper unusedIndexMapper;

    @GetMapping
    public List<UnusedIndex> findAll() {
        return unusedIndexMapper.findAll();
    }

    @GetMapping("/{schemaName}")
    public List<UnusedIndex> findBySchemaName(@PathVariable("schemaName") String schemaName) {
        return unusedIndexMapper.findBySchemaName(schemaName);
    }

}
