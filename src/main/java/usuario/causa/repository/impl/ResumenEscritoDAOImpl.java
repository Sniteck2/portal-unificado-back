package usuario.causa.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.model.ResumenEscrito;
import usuario.causa.repository.ResumenEscritoDAO;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

@Repository
public class ResumenEscritoDAOImpl implements ResumenEscritoDAO {

    private final EntityManager em;

    @Autowired
    public ResumenEscritoDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<ResumenEscrito> listarTodo() {
        TypedQuery<ResumenEscrito> query = em.createQuery("FROM ResumenEscrito", ResumenEscrito.class);
        return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
    }
}
