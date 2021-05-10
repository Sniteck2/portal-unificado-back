package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.ResumenTramiteDAO;
import usuario.causa.repository.model.ResumenTramite;

@Repository
public class ResumenTramiteDAOImpl implements ResumenTramiteDAO {

  private final EntityManager em;

  @Autowired
  public ResumenTramiteDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<ResumenTramite> listarTodo() {
    TypedQuery<ResumenTramite> query = em.createQuery("FROM ResumenTramite", ResumenTramite.class);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
