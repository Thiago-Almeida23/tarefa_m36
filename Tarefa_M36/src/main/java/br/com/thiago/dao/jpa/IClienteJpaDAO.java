package br.com.thiago.dao.jpa;

import br.com.thiago.dao.domain.Persistente;
import br.com.thiago.dao.generic.IGenericJpaDAO;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}
