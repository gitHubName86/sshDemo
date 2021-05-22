package com.fzp.dao.impl;

import com.fzp.dao.SyOrgUserDao;
import com.fzp.model.entity.SyOrgUser;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.math.BigInteger;
import java.util.List;

public class SyOrgUserDaoImpl extends HibernateDaoSupport implements SyOrgUserDao {
    private SessionFactory sessionFactory;

    @Override
    public List<SyOrgUser> getUsers() {
        // 方式1
//        List<SyOrgUser> listUser = getUsersOne();
        // 方式2
        List<SyOrgUser> listUser = getUsersTwo();
        // 方式3
//        List<SyOrgUser> listUser = getUsersThree();
        return listUser;
    }

    public List<SyOrgUser> getUsersOne(){
        String hqlStr = "from SyOrgUser u where u.uid=:uid";
        Session session = sessionFactory.openSession();
        // 获取事务
        session.beginTransaction();
        Query query = session.createQuery(hqlStr);
        query.setBigInteger("uid", BigInteger.valueOf(1)); // 绑定参数
        List<SyOrgUser> listUser = query.list();
        // 提交事务
        session.getTransaction().commit();
        // 关闭session
        session.close();
        return listUser;
    }

    public List<SyOrgUser> getUsersTwo(){
        HibernateTemplate hibernateTemplate = getHibernateTemplate();
        SyOrgUser syOrgUser = new SyOrgUser();
        syOrgUser.setSex("1");
        List<SyOrgUser> listUser = hibernateTemplate.findByExample(syOrgUser, 0, 10);
//        String sqlStr = "select uid, name, sex, telphone, mail from sy_org_user where uid=:uid";
//        Session session = sessionFactory.openSession();
//        Query query = session.createSQLQuery(sqlStr).addScalar("uid", StandardBasicTypes.INTEGER);
//        query.setParameter("uid", 1);
//        List<SyOrgUser> listUser = query.list();
        return listUser;
    }

    public List<SyOrgUser> getUsersThree(){
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(SyOrgUser.class);
        criteria.add(Restrictions.eq("uid", 1));
        List<SyOrgUser> listUser = criteria.list();
        return listUser;
    }
}
