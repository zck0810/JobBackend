package com.wms.controller;


import com.wms.entity.ExperienceInformation;
import com.wms.service.ExperienceInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gis502
 * @since 2023-06-15
 */
@RestController
@RequestMapping("/positionInformation")
public class ExperienceInformationController {
    @Autowired
    private ExperienceInformationService experienceInformationService;

    @RequestMapping(value="getSalaryAll",method = RequestMethod.GET)
    @ResponseBody
    public List<ExperienceInformation> getSalaryAll(){
        return experienceInformationService.getSalaryAll();
    }


}
