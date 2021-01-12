package usuario.causa.repository.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.ParteDAO;
import usuario.causa.repository.model.Parte;
import usuario.causa.repository.model.Usuario;

@Repository
public class ParteDAOImpl implements ParteDAO {

  private final EntityManager em;

  @Autowired
  public ParteDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<Parte> buscarPartes(Long idUsuario, List<Long> competencias) {
    Usuario usuario = new Usuario();
    usuario.setId(idUsuario);
    StringBuilder str = new StringBuilder();
    str.append("FROM Parte p WHERE p.usuario =: usuario");
    if(competencias != null && competencias.size() > 0){
        str.append(" AND p.competencia IN (");
        StringBuilder finalStrBuilder = str;
        competencias.forEach(item -> finalStrBuilder.append(item + ","));
        str = new StringBuilder(StringUtils.chop(str.toString()) + ")");
    }
    TypedQuery<Parte> query = em.createQuery(str.toString(), Parte.class);
    query.setParameter("usuario", usuario);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
