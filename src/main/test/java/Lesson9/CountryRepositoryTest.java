package Lesson9;

import Lesson9.domain.Country;
import Lesson9.repository.CountryRepositoty;
import Lesson9.repository.CountryRepositotyImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.*;

public class CountryRepositoryTest {

    private CountryRepositoty repositoty;

    private SessionFactory factory;
    private Session session;
    private Transaction transaction;

    @Before
    public void setup (){
        factory = mock(SessionFactory.class);
        session = mock(Session.class);
        transaction = mock(Transaction.class);

        repositoty = new CountryRepositotyImpl(factory);

        when(factory.openSession()).thenReturn((org.hibernate.Session) session);
        when(((org.hibernate.Session) session).beginTransaction()).thenReturn(transaction);
        System.out.println(factory.openSession());
        System.out.println(session);

    }
    @Test
    public void testCreate_valiData_returnSaveObject (){

        String name = "Russia";
        String capital = "Moscow";
        double population = 147000000;

        Country country = repositoty.create(name, capital, population);
        assertEquals(name, country.getName());
        assertEquals(capital, country.getCapital());
        assertEquals(population, country.getPopulation(), 0.0d);

        verify(session, times(1)).persist(Matchers.any(Country.class));
        verify(transaction).commit();
        verify(session).close();
    }

    @Test
    public void testDelete(){
        String name = "Russia";
        String capital = "Moscow";
        double population = 147000000;

        Country country = repositoty.create(name, capital, population);
        assertEquals(name, country.getName());
        assertEquals(capital, country.getCapital());
        assertEquals(population, country.getPopulation(), 0.0d);

        country= repositoty.delete(country);


//        verify(session,times(2)).persist(Matchers.any(Country.class));
//        verify(transaction).commit();
//        verify(session).close();
    }
}
