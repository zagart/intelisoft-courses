package by.grodno.zagart.java.intelisoft;

import by.grodno.zagart.java.intelisoft.Entities.Actor;
import by.grodno.zagart.java.intelisoft.Entities.Film;
import by.grodno.zagart.java.intelisoft.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    private static Session session;

    public static void main(String[] args ) {
        session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Actor actor = new Actor();
        actor.setName("Actor1");
        Actor actor1 = new Actor();
        actor1.setName("Actor2");
        Actor actor2 = new Actor();
        actor2.setName("Actor3");

        Film film = new Film();
        film.setTitle("Film1");
        Film film1 = new Film();
        film1.setTitle("Film2");
        Film film2 = new Film();
        film2.setTitle("Film3");

        film.addActor(actor);
        film.addActor(actor1);
        film1.addActor(actor1);
        film1.addActor(actor2);
        film2.addActor(actor2);
        film2.addActor(actor);
        actor.addFilm(film);

        session.save(film);
        session.save(film1);
        session.save(film2);
        session.save(actor);
        session.save(actor1);
        session.save(actor2);

        transaction.commit();
        HibernateUtil.closeFactory();
    }

}
