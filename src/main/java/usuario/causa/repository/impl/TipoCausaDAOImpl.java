package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.TipoCausaDAO;
import usuario.causa.repository.model.TipoCausa;

@Repository
public class TipoCausaDAOImpl implements TipoCausaDAO {

  private final EntityManager em;

  @Autowired
  public TipoCausaDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<TipoCausa> listarTipoCausas() {
    TypedQuery<TipoCausa> query = em.createQuery("FROM TipoCausa", TipoCausa.class);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
