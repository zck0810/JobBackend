package com.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.PositionInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositionInformationService extends IService<PositionInformation> {

    List<PositionInformation> getPositionInformationAll();

    List<PositionInformation> getCityFromHottestPosition();
//
//    List<PositionInformation> getHottestJob();
//
//    List<PositionInformation>getCityByHottestJob(String hottestJob);
    List<PositionInformation> getSalary();
    List<PositionInformation> getCityAndCityCount();
}
