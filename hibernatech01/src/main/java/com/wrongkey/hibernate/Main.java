package com.wrongkey.hibernate;

import com.wrongkey.hibernate.dao.PersonDAOHibernateImpl;
import com.wrongkey.hibernate.model.Event;
import com.wrongkey.hibernate.model.Person;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *@author wrongkey
 *@description
 *@date 2014/11/15
 *@version v1.0
 *
 */
public class Main {
    public static void main(String[] args) {
        PersonDAOHibernateImpl personDAOHibernate = new PersonDAOHibernateImpl();
        Event event1 = new Event();
        event1.setId(7);
        event1.setDate(new Date());
        event1.setTitle("darling");
        personDAOHibernate.save(event1);
        Set<Event> events = new HashSet<Event>();
        events.add(event1);

        Person person = new Person();
        person.setId(5);
        person.setLastName("yanjun");
        person.setFirstName("song");
        person.setAddress("xinzheng");
        person.setCity("Nanchong");
        person.setEvents(events);

        personDAOHibernate.save(person);
    }
}
