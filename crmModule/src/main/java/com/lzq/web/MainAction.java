package com.lzq.web;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 主页面Action
 */
public class MainAction extends ActionSupport {

    public String execute() throws Exception {
        return SUCCESS;
    }
    //对应页面顶部
    public String top(){
        return "top";
    }
    //对应页面左侧菜单栏
    public String menu(){
        return "menu";
    }
    //对应页面右边内容
    public String index(){
        return "index";
    }

    public String test(){
        return "test";
    }
}
