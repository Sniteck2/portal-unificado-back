package usuario.causa.service.builder;

import usuario.causa.repository.model.Escrito;
import usuario.causa.repository.model.ResumenEscrito;
import usuario.causa.repository.model.ResumenParte;
import usuario.causa.repository.model.ResumenTramite;
import usuario.causa.repository.model.TipoEscrito;
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

    public static TipoEscritoVOBuilder getTipoEscritoVOBuilder(TipoEscrito tipoEscrito){
        return new TipoEscritoVOBuilder().fromTipoEscritoVOBuilder(tipoEscrito);
    }

    public static EscritoVOBuilder getEscritoVOBuilder(Escrito escrito){
        return new EscritoVOBuilder().fromEscritoVOBuilder(escrito);
    }
}
