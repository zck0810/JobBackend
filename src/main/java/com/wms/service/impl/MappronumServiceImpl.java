package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Mappronum;
import com.wms.entity.PositionInformation;
import com.wms.mapper.MappronumMapper;
import com.wms.mapper.PositionInformationMapper;
import com.wms.service.MappronumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MappronumServiceImpl extends ServiceImpl<MappronumMapper, Mappronum> implements MappronumService {

    @Resource
    private MappronumMapper mappronumMapper;

    @Override
    public List<Mappronum> getmapnum() {
        return  mappronumMapper.getmapnum();
    }
}
