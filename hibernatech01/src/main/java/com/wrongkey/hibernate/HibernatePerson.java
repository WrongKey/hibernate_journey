package com.wrongkey.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        StandardServiceRegistryImpl registry = (StandardServiceRegistryImpl) builder.build();

        SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
        Session session = sessionFactory.openSession();

    }
}
