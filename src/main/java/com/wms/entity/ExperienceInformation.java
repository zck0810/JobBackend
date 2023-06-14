package com.wms.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author gis502
 * @since 2023-06-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ExperienceInformation对象", description="")
public class ExperienceInformation implements Serializable {

    private static final long serialVersionUID = 1L;

    private String experience;

    private Double avgSalaryMin;

    private Double avgSalaryMax;

    private Double avgCombined;


}
