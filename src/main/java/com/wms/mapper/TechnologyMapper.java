package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.PositionInformation;
import com.wms.entity.Technology;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TechnologyMapper extends BaseMapper<Technology> {
    List<Technology> getTechnicalFrequencyStatistics();
}
