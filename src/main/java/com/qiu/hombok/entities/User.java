package com.qiu.hombok.entities;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    @ApiModelProperty(value = "唯一标识")
    private Integer id;
    @ApiModelProperty(value="用户名")
    private String username;
    @ApiModelProperty(value = "密码")
    private String password;
//    @ApiModelProperty(hidden = true)
    private String roles;
    private String email;
}
