package usuario.causa.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.TramiteVO;
import usuario.causa.repository.TramiteDAO;
import usuario.causa.service.TramiteService;
import usuario.causa.service.builder.TramiteVOBuilder;
import usuario.causa.service.builder.VOBuilderFactory;

@Service
public class TramiteServiceImpl implements TramiteService {

  private final TramiteDAO tramiteDAO;

  @Autowired
  public TramiteServiceImpl(TramiteDAO tramiteDAO) {
    this.tramiteDAO = tramiteDAO;
  }

  @Override
  public List<TramiteVO> listarPorIdCausa(Long idCausa) {
    return this.tramiteDAO.listarPorIdCausa(idCausa).stream().map(VOBuilderFactory::getTramiteVOBuilder)
        .map(TramiteVOBuilder::build).collect(Collectors.toList());
  }
}
