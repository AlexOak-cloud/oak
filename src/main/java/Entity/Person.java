package Entity;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "people")
@Getter
@Setter
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Integer id ;
    @Column(name = "name")
    private String name;
    @Column (name = "age")
    private int age;
    @Column(name = "education")
    private boolean education;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age ==
                person.age && education == person.education && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, education);
    }

    public static Person create(int id,String name,int age,boolean education){
        return new Person(id,name,age,education);
    }
}
