package usuario.causa.repository.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TO_CAUSA")
public class Causa {

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
  private Tribunal tribunal;
  private Long codUbicacion;
  private Long flgReservado;
  private Long codInfoCausaOjv;
  private Long codFormaIngComp;
  private Competencia competencia;
  private char tipoCausa;

  public Causa() {
  }

  public Causa(Long id, Long rolCausa, String eraCausa, String glosaParte, char rucEra,
      char rutTipTrbiunal, Long rucSecuencia, char rucDv, String codUsuario,
      Long crrFormaIniProc, Date fechaIngresoCausa, Date fechaIngresoSistema,
      Tribunal tribunal, Long codUbicacion, Long flgReservado, Long codInfoCausaOjv,
      Long codFormaIngComp, Competencia competencia, char tipoCausa) {
    this.id = id;
    this.rolCausa = rolCausa;
    this.eraCausa = eraCausa;
    this.glosaParte = glosaParte;
    this.rucEra = rucEra;
    this.rutTipTrbiunal = rutTipTrbiunal;
    this.rucSecuencia = rucSecuencia;
    this.rucDv = rucDv;
    this.codUsuario = codUsuario;
    this.crrFormaIniProc = crrFormaIniProc;
    this.fechaIngresoCausa = fechaIngresoCausa;
    this.fechaIngresoSistema = fechaIngresoSistema;
    this.tribunal = tribunal;
    this.codUbicacion = codUbicacion;
    this.flgReservado = flgReservado;
    this.codInfoCausaOjv = codInfoCausaOjv;
    this.codFormaIngComp = codFormaIngComp;
    this.competencia = competencia;
    this.tipoCausa = tipoCausa;
  }

  @Id
  @Column(name = "CRR_CAUSA")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "ROL_CAUSA")
  public Long getRolCausa() {
    return rolCausa;
  }

  public void setRolCausa(Long rolCausa) {
    this.rolCausa = rolCausa;
  }

  @Column(name = "ERA_CAUSA")
  public String getEraCausa() {
    return eraCausa;
  }

  public void setEraCausa(String eraCausa) {
    this.eraCausa = eraCausa;
  }

  @Column(name = "GLS_PARTE")
  public String getGlosaParte() {
    return glosaParte;
  }

  public void setGlosaParte(String glosaParte) {
    this.glosaParte = glosaParte;
  }

  @Column(name = "RUC_ERA")
  public char getRucEra() {
    return rucEra;
  }

  public void setRucEra(char rucEra) {
    this.rucEra = rucEra;
  }

  @Column(name = "RUC_TIPTRIBUNAL")
  public char getRutTipTrbiunal() {
    return rutTipTrbiunal;
  }

  public void setRutTipTrbiunal(char rutTipTrbiunal) {
    this.rutTipTrbiunal = rutTipTrbiunal;
  }

  @Column(name = "RUC_SECUENCIA")
  public Long getRucSecuencia() {
    return rucSecuencia;
  }

  public void setRucSecuencia(Long rucSecuencia) {
    this.rucSecuencia = rucSecuencia;
  }

  @Column(name = "RUC_DV")
  public char getRucDv() {
    return rucDv;
  }

  public void setRucDv(char rucDv) {
    this.rucDv = rucDv;
  }

  @Column(name = "COD_USUARIO")
  public String getCodUsuario() {
    return codUsuario;
  }

  public void setCodUsuario(String codUsuario) {
    this.codUsuario = codUsuario;
  }

  @Column(name = "CRR_FORM_INI_PROCE")
  public Long getCrrFormaIniProc() {
    return crrFormaIniProc;
  }

  public void setCrrFormaIniProc(Long crrFormaIniProc) {
    this.crrFormaIniProc = crrFormaIniProc;
  }

  @Column(name = "FEC_INGRESO_CAUSA")
  public Date getFechaIngresoCausa() {
    return fechaIngresoCausa;
  }

  public void setFechaIngresoCausa(Date fechaIngresoCausa) {
    this.fechaIngresoCausa = fechaIngresoCausa;
  }

  @Column(name = "FEC_INGRESO_SISTEMA")
  public Date getFechaIngresoSistema() {
    return fechaIngresoSistema;
  }

  public void setFechaIngresoSistema(Date fechaIngresoSistema) {
    this.fechaIngresoSistema = fechaIngresoSistema;
  }

  @ManyToOne
  @JoinColumn(name = "COD_TRIBUNAL")
  public Tribunal getTribunal() {
    return tribunal;
  }

  public void setTribunal(Tribunal tribunal) {
    this.tribunal = tribunal;
  }

  @Column(name = "COD_UBICACION")
  public Long getCodUbicacion() {
    return codUbicacion;
  }

  public void setCodUbicacion(Long codUbicacion) {
    this.codUbicacion = codUbicacion;
  }

  @Column(name = "FLG_RESERVADO")
  public Long getFlgReservado() {
    return flgReservado;
  }

  public void setFlgReservado(Long flgReservado) {
    this.flgReservado = flgReservado;
  }

  @Column(name = "CRR_INFO_CAUSA_OJV")
  public Long getCodInfoCausaOjv() {
    return codInfoCausaOjv;
  }

  public void setCodInfoCausaOjv(Long codInfoCausaOjv) {
    this.codInfoCausaOjv = codInfoCausaOjv;
  }

  @Column(name = "CRR_FORM_ING_COMP")
  public Long getCodFormaIngComp() {
    return codFormaIngComp;
  }

  public void setCodFormaIngComp(Long codFormaIngComp) {
    this.codFormaIngComp = codFormaIngComp;
  }

  @ManyToOne
  @JoinColumn(name = "COD_COMPETENCIA")
  public Competencia getCompetencia() {
    return competencia;
  }

  public void setCompetencia(Competencia competencia) {
    this.competencia = competencia;
  }

  @Column(name = "TIPO_CAUSA")
  public char getTipoCausa() {
    return tipoCausa;
  }

  public void setTipoCausa(char tipoCausa) {
    this.tipoCausa = tipoCausa;
  }

  @Override
  public String toString() {
    return "Causa{" +
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
        ", tribuna=" + tribunal +
        ", codUbicacion=" + codUbicacion +
        ", flgReservado=" + flgReservado +
        ", codInfoCausaOjv=" + codInfoCausaOjv +
        ", codFormaIngComp=" + codFormaIngComp +
        ", competencia=" + competencia +
        ", tipoCausa=" + tipoCausa +
        '}';
  }
}
