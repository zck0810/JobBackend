package com.wms.service.impl;

import com.wms.entity.ExperienceInformation;
import com.wms.entity.PositionInformation;
import com.wms.mapper.ExperienceInformationMapper;
import com.wms.mapper.PositionInformationMapper;
import com.wms.service.ExperienceInformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gis502
 * @since 2023-06-15
 */
@Service
public class ExperienceInformationServiceImpl extends ServiceImpl<ExperienceInformationMapper, ExperienceInformation> implements ExperienceInformationService {
    @Resource
    private ExperienceInformationMapper experienceInformationMapper;

    @Override
    public List<ExperienceInformation> getSalaryAll() {
        return  experienceInformationMapper.getSalaryAll();
    }
}
