package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.PositionInformation;
import com.wms.entity.Technology;
import com.wms.mapper.TechnologyMapper;
import com.wms.service.TechnologyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TechnologyServiceImpl extends ServiceImpl<TechnologyMapper, Technology> implements TechnologyService {
    @Resource
    private TechnologyMapper technologyMapper;

    @Override
    public List<Technology> getTechnicalFrequencyStatistics() {
        return  technologyMapper.getTechnicalFrequencyStatistics();
    }
}
