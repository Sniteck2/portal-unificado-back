package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.ResumenParteDAO;
import usuario.causa.repository.model.ResumenParte;

@Repository
public class ResumenParteDAOImpl implements ResumenParteDAO {

  private final EntityManager em;

  @Autowired
  public ResumenParteDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<ResumenParte> listarTodo() {
    TypedQuery<ResumenParte> query = em.createQuery("FROM ResumenParte", ResumenParte.class);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
