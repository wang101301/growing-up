package com.wang.growing.dto;

import java.io.Serializable;

/**
 * @author wangyuanyuan@zto.com
 * @Description: 12
 * @date 2018/8/30/17:08
 */

public class SwaggerRequest implements Serializable {
    private String userName;
    private String userCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
