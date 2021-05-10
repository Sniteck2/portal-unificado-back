package usuario.causa.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.EscritoVO;
import usuario.causa.repository.EscritoDAO;
import usuario.causa.service.EscritoService;
import usuario.causa.service.builder.EscritoVOBuilder;
import usuario.causa.service.builder.VOBuilderFactory;

@Service
public class EscritoServiceImpl implements EscritoService {

  private final EscritoDAO escritoDAO;

  @Autowired
  public EscritoServiceImpl(EscritoDAO escritoDAO) {
    this.escritoDAO = escritoDAO;
  }

  @Override
  public List<EscritoVO> listarPorIdCuaderno(Long idCuaderno) {
    return this.escritoDAO.buscarPorIdCuaderno(idCuaderno).stream().map(VOBuilderFactory::getEscritoVOBuilder)
        .map(EscritoVOBuilder::build).collect(Collectors.toList());
  }
}
