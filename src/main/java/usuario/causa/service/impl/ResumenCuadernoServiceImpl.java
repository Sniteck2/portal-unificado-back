package usuario.causa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.ResumenCuadernoVO;
import usuario.causa.repository.ResumenCuadernoDAO;
import usuario.causa.repository.model.ResumenCuaderno;
import usuario.causa.service.ResumenCuadernoService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResumenCuadernoServiceImpl  implements ResumenCuadernoService {

    private final ResumenCuadernoDAO resumenCuadernoDAO;

    @Autowired
    public ResumenCuadernoServiceImpl(ResumenCuadernoDAO resumenCuadernoDAO) {
        this.resumenCuadernoDAO = resumenCuadernoDAO;
    }

    @Override
    public List<ResumenCuadernoVO> listarTodo() {
        return this.resumenCuadernoVOS(this.resumenCuadernoDAO.listarTodo());
    }

    private List<ResumenCuadernoVO> resumenCuadernoVOS(List<ResumenCuaderno> resumenCuadernos){
        List<ResumenCuadernoVO> resumenCuadernoVOS = new ArrayList<>();
        ResumenCuadernoVO resumenCuadernoVO = new ResumenCuadernoVO();
        resumenCuadernos.forEach(resumenCuaderno -> {
            resumenCuadernoVO.setId(resumenCuaderno.getId());
            resumenCuadernoVO.setFechaInicio(resumenCuaderno.getFechaInicio());
            resumenCuadernoVO.setFechaTermino(resumenCuaderno.getFechaTermino());
            resumenCuadernoVO.setTotalRegistroBase(resumenCuaderno.getTotalRegistroBase());
            resumenCuadernoVO.setTotalRegistroBaseEstimada(resumenCuaderno.getTotalRegistroBaseEstimada());
            resumenCuadernoVO.setTotalRegistroPortal(resumenCuaderno.getTotalRegistroPortal());
            resumenCuadernoVO.setTiempo(resumenCuaderno.getTiempo());
            resumenCuadernoVOS.add(resumenCuadernoVO);
        });
        return resumenCuadernoVOS;
    }
}
