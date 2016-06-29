package by.grodno.zagart.java.intelisoft;

import by.grodno.zagart.java.intelisoft.Entities.Actor;
import by.grodno.zagart.java.intelisoft.Entities.Film;
import by.grodno.zagart.java.intelisoft.Util.HibernateUtil;
import org.hibernate.Session;

public class Main {

    private static Session session;

    public static void main(String[] args ) {
        session = HibernateUtil.getSession();

        Actor actor = new Actor();
        actor.setName("Actor1");
        Actor actor1 = new Actor();
        actor.setName("Actor2");
        Actor actor2 = new Actor();
        actor.setName("Actor2");

        Film film = new Film();
        film.setTitle("Film1");
        Film film1 = new Film();
        film.setTitle("Film2");
        Film film2 = new Film();
        film.setTitle("Film3");

        HibernateUtil.closeFactory();
    }

}
