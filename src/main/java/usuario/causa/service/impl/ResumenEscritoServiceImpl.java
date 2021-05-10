package usuario.causa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.ResumenEscritoVO;
import usuario.causa.repository.ResumenEscritoDAO;
import usuario.causa.service.ResumenEscritoService;
import usuario.causa.service.builder.ResumenEscritoVOBuilder;
import usuario.causa.service.builder.VOBuilderFactory;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResumenEscritoServiceImpl implements ResumenEscritoService {

    private final ResumenEscritoDAO resumenEscritoDAO;

    @Autowired
    public ResumenEscritoServiceImpl(ResumenEscritoDAO resumenEscritoDAO) {
        this.resumenEscritoDAO = resumenEscritoDAO;
    }

    @Override
    public List<ResumenEscritoVO> listarTodo() {
        return this.resumenEscritoDAO.listarTodo().stream().map(VOBuilderFactory::getResumenEscritoVOBuilder)
                .map(ResumenEscritoVOBuilder::build).collect(Collectors.toList());
    }


}
