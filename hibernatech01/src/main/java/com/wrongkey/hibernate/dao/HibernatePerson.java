package com.wrongkey.hibernate.dao;

import com.wrongkey.hibernate.entity.Person;
import com.wrongkey.hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author wrongkey
 * @version v1.0
 * @description 使用hibernate向数据库insert一个对象
 * @date 2014/11/14
 */
public class HibernatePerson implements PersionDAO{

    @Override
    public void save(Person person) {
        //获取SessionFactory
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        //打开Session
        Session session = sessionFactory.openSession();
        //开启事务Transaction
        Transaction transaction = session.beginTransaction();

        try {
            //sava对象p1
            session.save(person);
            //提交事务
            transaction.commit();
        } catch (Exception e) {
            //事务回滚
            transaction.rollback();
            e.printStackTrace();
        } finally {
            //关闭Session
            session.close();
        }
    }
}
