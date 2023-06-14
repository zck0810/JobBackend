package com.wms.controller;


import com.wms.entity.Mappronum;
import com.wms.service.MappronumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map")
public class MappronumController {

    @Autowired
    private MappronumService mappronumService;

    @GetMapping("mapnum")
    public List<Mappronum> getmapnum() {
        return mappronumService.getmapnum();
    }

}
