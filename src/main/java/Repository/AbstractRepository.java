package Repository;


import Entity.Person;

public abstract class AbstractRepository<S extends Person> implements Repository {

    @Override
    public <S extends Person> S save(S entity) {
        return null;
    }

}