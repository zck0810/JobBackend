package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PositionInformation对象", description="")
public class PositionInformation {
    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @ApiModelProperty(value = "职位名称")
    private String job;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "薪资")
    private String salary;

    @ApiModelProperty(value = "薪资最大值")
    private String salaryMax;

    @ApiModelProperty(value = "薪资最小值")
    private String salaryMin;

    @ApiModelProperty(value = "工作经验")
    private String experience;

    @ApiModelProperty(value = "学历")
    private String education;

    @ApiModelProperty(value = "职位描述")
    private String positionStatement;

    @ApiModelProperty(value = "福利")
    private String welfare;

    @ApiModelProperty(value = "插入时间")
    private Date insertTime;
}
