package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.ExperienceInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author gis502
 * @since 2023-06-15
 */
@Mapper
public interface ExperienceInformationMapper extends BaseMapper<ExperienceInformation> {
    List<ExperienceInformation> getSalaryAll();
}
