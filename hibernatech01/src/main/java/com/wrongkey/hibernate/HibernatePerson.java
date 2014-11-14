package com.wrongkey.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;

/**
 *@author wrongkey
 *@description
 *@date 2014/11/14
 *@version v1.0
 *
 */
public class HibernatePerson {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setId(4);
        p1.setLastName("yanjun");
        p1.setFirstName("Song");
        p1.setAddress("guojiaqiao street");
        p1.setCity("Chengdu");
        //获取配置信息
        Configuration configuration = new Configuration().configure("com.wrongkey.hibernate/hibernatech01.cfg.xml");
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        StandardServiceRegistryImpl registry = (StandardServiceRegistryImpl) builder.build();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
        //打开Session
        Session session = sessionFactory.openSession();
        //开启事务Transaction
        Transaction transaction = session.beginTransaction();

        try {
            //sava对象p1
            session.save(p1);
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
