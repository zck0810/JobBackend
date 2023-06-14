package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.Mappronum;
import com.wms.entity.PositionInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MappronumMapper extends BaseMapper<Mappronum> {

    List<Mappronum> getmapnum();
}
