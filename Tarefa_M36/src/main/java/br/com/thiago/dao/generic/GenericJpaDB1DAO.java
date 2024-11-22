package br.com.thiago.dao.generic;

import br.com.thiago.dao.domain.Persistente;

import java.io.Serializable;

public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }

}
