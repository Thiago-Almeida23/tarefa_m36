package br.com.thiago.dao.generic;

import br.com.thiago.dao.domain.Persistente;

import java.io.Serializable;

public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}
