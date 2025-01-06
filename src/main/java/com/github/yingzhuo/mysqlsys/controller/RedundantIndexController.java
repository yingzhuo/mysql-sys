package com.github.yingzhuo.mysqlsys.controller;

import com.github.yingzhuo.mysqlsys.model.RedundantIndex;
import com.github.yingzhuo.mysqlsys.model.mapper.RedundantIndexMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/redundant-index")
@RequiredArgsConstructor
public class RedundantIndexController {

    private final RedundantIndexMapper redundantIndexMapper;

    @GetMapping
    public List<RedundantIndex> findAll() {
        return redundantIndexMapper.findAll();
    }

    @GetMapping("/{schemaName}")
    public List<RedundantIndex> findBySchemaName(@PathVariable("schemaName") String schemaName) {
        return redundantIndexMapper.findBySchemaName(schemaName);
    }

}
