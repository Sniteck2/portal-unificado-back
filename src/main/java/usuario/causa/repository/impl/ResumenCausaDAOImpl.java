package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.ResumenCausaDAO;
import usuario.causa.repository.model.ResumenCausa;

@Repository
public class ResumenCausaDAOImpl implements ResumenCausaDAO {

  private final EntityManager em;

  @Autowired
  public ResumenCausaDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<ResumenCausa> listarTodo() {
    TypedQuery<ResumenCausa> query = em.createQuery("FROM ResumenCausa", ResumenCausa.class);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
