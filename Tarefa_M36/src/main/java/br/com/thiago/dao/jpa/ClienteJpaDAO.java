package br.com.thiago.dao.jpa;

import br.com.thiago.dao.domain.ClienteJpa;
import br.com.thiago.dao.generic.GenericJpaDB1DAO;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
