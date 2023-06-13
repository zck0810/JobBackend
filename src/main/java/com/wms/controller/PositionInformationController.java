package com.wms.controller;

import com.wms.common.Result;
import com.wms.entity.PositionInformation;
import com.wms.service.PositionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/positionInformation")
public class PositionInformationController {

    @Autowired
    private PositionInformationService positionInformationService;

    @RequestMapping(value = "getPositionInformationAll", method = RequestMethod.GET)
    @ResponseBody
    public String getPositionInformationAll() {
        return "123456789";
    }




}
