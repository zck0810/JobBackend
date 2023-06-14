package com.wms.controller;

import com.wms.entity.PositionInformation;
import com.wms.entity.Technology;
import com.wms.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/technologyController")
public class TechnologyController {
    @Autowired
    private TechnologyService technologyService;

    @RequestMapping(value = "getTechnicalFrequencyStatistics", method = RequestMethod.GET)
    @ResponseBody
    public List<Technology> getTechnicalFrequencyStatistics(){
        return technologyService.getTechnicalFrequencyStatistics();
    }
}
