package usuario.causa.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.ResumenCuadernoDAO;
import usuario.causa.repository.model.ResumenCuaderno;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

@Repository
public class ResumenCuadernoDAOImpl implements ResumenCuadernoDAO {

    private final EntityManager em;

    @Autowired
    public ResumenCuadernoDAOImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<ResumenCuaderno> listarTodo() {
        TypedQuery<ResumenCuaderno> query = em.createQuery("FROM ResumenCuaderno", ResumenCuaderno.class);
        return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
    }
}
