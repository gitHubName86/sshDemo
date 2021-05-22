package com.fzp.action;

import com.fzp.model.entity.SyOrgUser;
import com.fzp.service.SyOrgUserService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class IndexAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private SyOrgUserService userService;

    public void setUserService(SyOrgUserService userService) {
        this.userService = userService;
    }

    public String index(){
//        System.out.println("测试struts2");
        List<SyOrgUser> listUser = userService.getUsers();
        System.out.println(listUser);
        return "index";
    }
}
