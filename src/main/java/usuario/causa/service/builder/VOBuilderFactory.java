package usuario.causa.service.builder;

import usuario.causa.repository.model.ResumenEscrito;
import usuario.causa.repository.model.ResumenParte;
import usuario.causa.repository.model.ResumenTramite;
import usuario.causa.repository.model.Tramite;

public class VOBuilderFactory {

    private VOBuilderFactory(){}

    public static ResumenEscritoVOBuilder getResumenEscritoVOBuilder(ResumenEscrito resumenEscrito){
        return new ResumenEscritoVOBuilder().fromResumenEscrito(resumenEscrito);
    }

    public static ResumenParteVOBuilder getResumenParteVOBuilder(ResumenParte resumenParte){
        return new ResumenParteVOBuilder().fromResumenParte(resumenParte);
    }

    public static ResumenTramiteVOBuilder getResumenTramiteVOBuilder(ResumenTramite resumenTramite){
        return new ResumenTramiteVOBuilder().fromResumenTramite(resumenTramite);
    }

    public static TramiteVOBuilder getTramiteVOBuilder(Tramite tramite){
        return new TramiteVOBuilder().fromTramiteVOBuilder(tramite);
    }
}
