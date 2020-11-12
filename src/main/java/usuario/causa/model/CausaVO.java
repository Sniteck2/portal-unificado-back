package usuario.causa.model;

import java.io.Serializable;
import java.util.Date;

public class CausaVO implements Serializable {

  private static final long serialVersionUID = -7062877558758854734L;
  private Long id;
  private Long rolCausa;
  private String eraCausa;
  private String glosaParte;
  private char rucEra;
  private char rutTipTrbiunal;
  private Long rucSecuencia;
  private char rucDv;
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
  private char tipoCausa;

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

  public char getRucEra() {
    return rucEra;
  }

  public void setRucEra(char rucEra) {
    this.rucEra = rucEra;
  }

  public char getRutTipTrbiunal() {
    return rutTipTrbiunal;
  }

  public void setRutTipTrbiunal(char rutTipTrbiunal) {
    this.rutTipTrbiunal = rutTipTrbiunal;
  }

  public Long getRucSecuencia() {
    return rucSecuencia;
  }

  public void setRucSecuencia(Long rucSecuencia) {
    this.rucSecuencia = rucSecuencia;
  }

  public char getRucDv() {
    return rucDv;
  }

  public void setRucDv(char rucDv) {
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

  public char getTipoCausa() {
    return tipoCausa;
  }

  public void setTipoCausa(char tipoCausa) {
    this.tipoCausa = tipoCausa;
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
        '}';
  }
}
