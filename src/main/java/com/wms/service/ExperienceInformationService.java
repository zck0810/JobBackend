package com.wms.service;

import com.wms.entity.ExperienceInformation;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gis502
 * @since 2023-06-15
 */
public interface ExperienceInformationService extends IService<ExperienceInformation> {
    List<ExperienceInformation> getSalaryAll();
}
