package com.wms.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="technology对象", description="")
public class Technology {
    private String technology;
    private  String count;
}
