package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.PositionInformation;
import com.wms.mapper.PositionInformationMapper;
import com.wms.service.PositionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionInformationServiceImpl extends ServiceImpl<PositionInformationMapper, PositionInformation>  implements PositionInformationService {
    @Resource
    private PositionInformationMapper positionInformationMapper;

    @Override
    public List<PositionInformation> getPositionInformationAll() {
        return  positionInformationMapper.getPositionInformationAll();
    }

    @Override
    public List<PositionInformation> getSalary() {
        return  positionInformationMapper.getSalary();
    }
    @Override
    public List<PositionInformation> getCityAndCityCount() {
        return  positionInformationMapper.getCityAndCityCount();
    }

    @Override
    public List<PositionInformation> getCityFromHottestPosition() {
        return positionInformationMapper.getCityFromHottestPosition();
    }

//    @Autowired
//    public List<PositionInformation> getHottestJob(){
//        return positionInformationMapper.getHottestJob();
//    }
//
//    public List<PositionInformation>getCityByHottestJob(String hottestJob){
//        return positionInformationMapper.getCityByHottestJob(hottestJob);
//    }



}


