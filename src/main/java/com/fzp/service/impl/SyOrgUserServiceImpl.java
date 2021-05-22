package com.fzp.service.impl;

import com.fzp.dao.SyOrgUserDao;
import com.fzp.model.entity.SyOrgUser;
import com.fzp.service.SyOrgUserService;

import java.util.List;

public class SyOrgUserServiceImpl implements SyOrgUserService {
    private SyOrgUserDao userDao;

    public void setUserDao(SyOrgUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<SyOrgUser> getUsers() {
        List<SyOrgUser> listUser = userDao.getUsers();
        return listUser;
    }
}
