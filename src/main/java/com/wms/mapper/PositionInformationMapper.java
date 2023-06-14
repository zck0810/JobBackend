package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.PositionInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionInformationMapper extends BaseMapper<PositionInformation> {


    List<PositionInformation> getPositionInformationAll();

    List<PositionInformation> getTechnicalFrequencyStatistics();
}
