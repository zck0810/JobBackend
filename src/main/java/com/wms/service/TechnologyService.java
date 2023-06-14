package com.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Technology;

import java.util.List;

public interface TechnologyService extends IService<Technology> {

    List<Technology> getTechnicalFrequencyStatistics();
}
