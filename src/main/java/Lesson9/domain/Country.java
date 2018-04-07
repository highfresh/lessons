package Lesson9.domain;

import javax.persistence.*;

@Entity
@Table (name = "country")
public class Country {


    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.SEQUENCE,
    generator = "country_id_gen")
    @SequenceGenerator(name = "country_id_gen", allocationSize = 20,
            sequenceName = "alloc_country_id",
            initialValue = 10000)
    private int id;
    @Column (nullable = false, unique = true)
    private String name;

    @Column (nullable = false, unique = true)
    private String capital;

    @Column (nullable = false)
    private double population;

    public Country (){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }
}
