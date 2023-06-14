package com.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Mappronum;
import com.wms.entity.PositionInformation;

import java.util.List;

public interface MappronumService extends IService<Mappronum> {

    List<Mappronum> getmapnum();
}
