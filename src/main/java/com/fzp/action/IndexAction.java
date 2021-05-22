package com.fzp.action;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
    public String index(){
        System.out.println("测试struts2");
        return "index";
    }
}
