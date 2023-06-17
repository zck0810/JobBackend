package com.wms.controller;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @RequestMapping(value = "getSalary", method = RequestMethod.GET)
    @ResponseBody
    public List<PositionInformation> getSalary() {
        return positionInformationService.getSalary();
    }
    @RequestMapping(value = "getCityAndCityCount", method = RequestMethod.GET)
    @ResponseBody
    public List<PositionInformation> getCityAndCityCount() {
        return positionInformationService.getCityAndCityCount();
    }

    @RequestMapping(value = "getCityFromHottestPosition", method = RequestMethod.GET)
    @ResponseBody
    public List<PositionInformation> getCityFromHottestPosition(){
        List list = positionInformationService.getCityFromHottestPosition();
        return list;
    }

    @RequestMapping(value = "getPositionInformationAll", method = RequestMethod.GET)
    @ResponseBody
    public IPage<PositionInformation> getPositionInformationAll(@RequestParam(defaultValue = "0") int page,
                                                                @RequestParam(defaultValue = "10") int size,
                                                                PositionInformation positionInformation) {
        Page<PositionInformation> pageNo = new Page<>(page,size);
        return  positionInformationService.getPositionInformationAll(pageNo,positionInformation);
    }

    @RequestMapping(value = "fullTextSearch", method = RequestMethod.POST)
    @ResponseBody
    public IPage<PositionInformation> fullTextSearch(@RequestParam String inputValue ,@RequestParam(defaultValue = "0") int page,
                                                                @RequestParam(defaultValue = "10") int size,
                                                                PositionInformation positionInformation) {
        Page<PositionInformation> pageNo = new Page<>(page,size);
        System.out.println(inputValue);
        return  positionInformationService.fullTextSearch(inputValue,pageNo,positionInformation);
    }


}
