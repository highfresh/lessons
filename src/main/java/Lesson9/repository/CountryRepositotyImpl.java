package Lesson9.repository;

import Lesson9.domain.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.management.monitor.CounterMonitor;
import java.util.List;

public class CountryRepositotyImpl implements CountryRepositoty {

    private final SessionFactory factory;

    public CountryRepositotyImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Country create(String name, String capital, double population) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Country country = new Country();
        country.setName(name);
        country.setCapital(capital);
        country.setPopulation(population);

        session.persist(country);
        transaction.commit();
        session.close();


        return country;
    }

    @Override
    public Country delete(Country country) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Country country1 = new Country();
        session.delete(country);
        transaction.commit();
        session.close();
        return country;
    }

    @Override
    public Country getById(int id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        Country country = session.get(Country.class, id);
        transaction.commit();
        session.close();

        return country;
    }

    @Override
    public List<Country> getCountriesWithMillionPopulation() {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

       List<Country> countries =  session.createQuery("from Country where population > :population",Country.class)
        .setParameter("population", 1_000_000d )
                .getResultList();
        transaction.commit();
        session.close();

        return countries;
    }
}
