package com.wms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.PositionInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PositionInformationService extends IService<PositionInformation> {


    List<PositionInformation> getCityFromHottestPosition();

    List<PositionInformation> getSalary();
    List<PositionInformation> getCityAndCityCount();

//    Page<PositionInformation> getPositionInformationAll(Pageable pageable);
    IPage<PositionInformation> getPositionInformationAll(Page<PositionInformation> page, PositionInformation positionInformation);
}
