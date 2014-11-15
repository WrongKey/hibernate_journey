package com.wrongkey.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;

/**
 *@author wrongkey
 *@description HibernateUtil
 *@date 2014/11/15
 *@version v1.0
 *
 */
public class HibernateUtil {
    private static final  SessionFactory SESSION_FACTORY = buildSessionFactory();

    /**
     *@author wrongkey
     *@description
     *@param []
     *@return org.hibernate.SessionFactory
     *@date 2014/11/15
     */
    private static SessionFactory buildSessionFactory(){
            //获取配置信息
            Configuration configuration = new Configuration().configure("com.wrongkey.hibernate/hibernatech01.cfg.xml");
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

            StandardServiceRegistryImpl registry = (StandardServiceRegistryImpl) builder.build();
            //获取SessionFactory
            return configuration.buildSessionFactory(registry);
    }

    /**
     *@author wrongkey
     *@description 取得sessionFactory
     *@param []
     *@return org.hibernate.SessionFactory
     *@date 2014/11/15
     */
    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
