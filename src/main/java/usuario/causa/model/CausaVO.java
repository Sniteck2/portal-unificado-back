package usuario.causa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CausaVO implements Serializable {

  private static final long serialVersionUID = -7062877558758854734L;
  private Long id;
  private Long rolCausa;
  private String eraCausa;
  private String glosaParte;
  private String rucEra;
  private String rutTipTrbiunal;
  private Long rucSecuencia;
  private String rucDv;
  private String codUsuario;
  private Long crrFormaIniProc;
  private Date fechaIngresoCausa;
  private Date fechaIngresoSistema;
  private TribunalVO tribunalVO;
  private Long codUbicacion;
  private Long flgReservado;
  private Long codInfoCausaOjv;
  private Long codFormaIngComp;
  private CompetenciaVO competenciaVO;
  private String tipoCausa;
  private String fechaModificacion;
  private List<Long> competencias;
  private Long idUsuario;
  private String fechaInicio;
  private String fechaFinal;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRolCausa() {
    return rolCausa;
  }

  public void setRolCausa(Long rolCausa) {
    this.rolCausa = rolCausa;
  }

  public String getEraCausa() {
    return eraCausa;
  }

  public void setEraCausa(String eraCausa) {
    this.eraCausa = eraCausa;
  }

  public String getGlosaParte() {
    return glosaParte;
  }

  public void setGlosaParte(String glosaParte) {
    this.glosaParte = glosaParte;
  }

  public String getRucEra() {
    return rucEra;
  }

  public void setRucEra(String rucEra) {
    this.rucEra = rucEra;
  }

  public String getRutTipTrbiunal() {
    return rutTipTrbiunal;
  }

  public void setRutTipTrbiunal(String rutTipTrbiunal) {
    this.rutTipTrbiunal = rutTipTrbiunal;
  }

  public Long getRucSecuencia() {
    return rucSecuencia;
  }

  public void setRucSecuencia(Long rucSecuencia) {
    this.rucSecuencia = rucSecuencia;
  }

  public String getRucDv() {
    return rucDv;
  }

  public void setRucDv(String rucDv) {
    this.rucDv = rucDv;
  }

  public String getCodUsuario() {
    return codUsuario;
  }

  public void setCodUsuario(String codUsuario) {
    this.codUsuario = codUsuario;
  }

  public Long getCrrFormaIniProc() {
    return crrFormaIniProc;
  }

  public void setCrrFormaIniProc(Long crrFormaIniProc) {
    this.crrFormaIniProc = crrFormaIniProc;
  }

  public Date getFechaIngresoCausa() {
    return fechaIngresoCausa;
  }

  public void setFechaIngresoCausa(Date fechaIngresoCausa) {
    this.fechaIngresoCausa = fechaIngresoCausa;
  }

  public Date getFechaIngresoSistema() {
    return fechaIngresoSistema;
  }

  public void setFechaIngresoSistema(Date fechaIngresoSistema) {
    this.fechaIngresoSistema = fechaIngresoSistema;
  }

  public TribunalVO getTribunalVO() {
    return tribunalVO;
  }

  public void setTribunalVO(TribunalVO tribunalVO) {
    this.tribunalVO = tribunalVO;
  }

  public Long getCodUbicacion() {
    return codUbicacion;
  }

  public void setCodUbicacion(Long codUbicacion) {
    this.codUbicacion = codUbicacion;
  }

  public Long getFlgReservado() {
    return flgReservado;
  }

  public void setFlgReservado(Long flgReservado) {
    this.flgReservado = flgReservado;
  }

  public Long getCodInfoCausaOjv() {
    return codInfoCausaOjv;
  }

  public void setCodInfoCausaOjv(Long codInfoCausaOjv) {
    this.codInfoCausaOjv = codInfoCausaOjv;
  }

  public Long getCodFormaIngComp() {
    return codFormaIngComp;
  }

  public void setCodFormaIngComp(Long codFormaIngComp) {
    this.codFormaIngComp = codFormaIngComp;
  }

  public CompetenciaVO getCompetenciaVO() {
    return competenciaVO;
  }

  public void setCompetenciaVO(CompetenciaVO competenciaVO) {
    this.competenciaVO = competenciaVO;
  }

  public String getTipoCausa() {
    return tipoCausa;
  }

  public void setTipoCausa(String tipoCausa) {
    this.tipoCausa = tipoCausa;
  }

  public String getFechaModificacion() {
    return fechaModificacion;
  }

  public void setFechaModificacion(String fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
  }

  public List<Long> getCompetencias() {
    return competencias;
  }

  public void setCompetencias(List<Long> competencias) {
    this.competencias = competencias;
  }

  public Long getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public String getFechaFinal() {
    return fechaFinal;
  }

  public void setFechaFinal(String fechaFinal) {
    this.fechaFinal = fechaFinal;
  }

  @Override
  public String toString() {
    return "CausaVO{" +
        "id=" + id +
        ", rolCausa=" + rolCausa +
        ", eraCausa='" + eraCausa + '\'' +
        ", glosaParte='" + glosaParte + '\'' +
        ", rucEra=" + rucEra +
        ", rutTipTrbiunal=" + rutTipTrbiunal +
        ", rucSecuencia=" + rucSecuencia +
        ", rucDv=" + rucDv +
        ", codUsuario='" + codUsuario + '\'' +
        ", crrFormaIniProc=" + crrFormaIniProc +
        ", fechaIngresoCausa=" + fechaIngresoCausa +
        ", fechaIngresoSistema=" + fechaIngresoSistema +
        ", tribunalVO=" + tribunalVO +
        ", codUbicacion=" + codUbicacion +
        ", flgReservado=" + flgReservado +
        ", codInfoCausaOjv=" + codInfoCausaOjv +
        ", codFormaIngComp=" + codFormaIngComp +
        ", competenciaVO=" + competenciaVO +
        ", tipoCausa=" + tipoCausa +
        ", fechaModificacion='" + fechaModificacion + '\'' +
        ", competencias=" + competencias +
        ", idUsuario=" + idUsuario +
        ", fechaInicio='" + fechaInicio + '\'' +
        ", fechaFinal='" + fechaFinal + '\'' +
        '}';
  }
}
