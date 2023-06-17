package com.wms.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.PositionInformation;
import com.wms.mapper.PositionInformationMapper;
import com.wms.service.PositionInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionInformationServiceImpl extends ServiceImpl<PositionInformationMapper, PositionInformation>  implements PositionInformationService {
    @Resource
    private PositionInformationMapper positionInformationMapper;

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


    public IPage<PositionInformation> getPositionInformationAll(Page<PositionInformation> page, PositionInformation positionInformation) {
        return positionInformationMapper.getPositionInformationAll(page,positionInformation);
    }
    public IPage<PositionInformation> fullTextSearch(String inputValue ,Page<PositionInformation> page, PositionInformation positionInformation) {
        return positionInformationMapper.fullTextSearch(inputValue,page,positionInformation);
    }



}


