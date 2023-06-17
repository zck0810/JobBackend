package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.PositionInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Mapper
public interface PositionInformationMapper extends BaseMapper<PositionInformation> {



    List<PositionInformation> getCityFromHottestPosition();

    List<PositionInformation> getSalary();
    List<PositionInformation> getCityAndCityCount();

//    Page<PositionInformation> getPositionInformationAll(Pageable pageable);

    IPage<PositionInformation> getPositionInformationAll(Page<PositionInformation> page, @Param("projectBiddVO") PositionInformation positionInformation);

    IPage<PositionInformation> fullTextSearch(String inputValue, Page<PositionInformation> page, PositionInformation positionInformation);
}

