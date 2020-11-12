package usuario.causa.repository.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TO_USUARIO")
public class Usuario {

  Long id;
  Long codUsuario;
  String password;
  Long rut;
  String dv;
  String nombre;
  String appPaterno;
  String appMaterno;
  String correo;
  Long flgActivo;
  Date fechaCreacion;
  Date fechaUltimoAcceso;
  Long flgCambioPassword;
  Date fechaCambioPassword;
  Long numeroIntentos;
  String sexo;
  Date fechaNacimiento;
  Date fechaBloqueo;

  public Usuario() {
  }

  public Usuario(Long id, Long codUsuario, String password, Long rut, String dv,
      String nombre, String appPaterno, String appMaterno, String correo, Long flgActivo,
      Date fechaCreacion, Date fechaUltimoAcceso, Long flgCambioPassword,
      Date fechaCambioPassword, Long numeroIntentos, String sexo, Date fechaNacimiento,
      Date fechaBloqueo) {
    this.id = id;
    this.codUsuario = codUsuario;
    this.password = password;
    this.rut = rut;
    this.dv = dv;
    this.nombre = nombre;
    this.appPaterno = appPaterno;
    this.appMaterno = appMaterno;
    this.correo = correo;
    this.flgActivo = flgActivo;
    this.fechaCreacion = fechaCreacion;
    this.fechaUltimoAcceso = fechaUltimoAcceso;
    this.flgCambioPassword = flgCambioPassword;
    this.fechaCambioPassword = fechaCambioPassword;
    this.numeroIntentos = numeroIntentos;
    this.sexo = sexo;
    this.fechaNacimiento = fechaNacimiento;
    this.fechaBloqueo = fechaBloqueo;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "CRR_USUARIO")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "COD_USUARIO")
  public Long getCodUsuario() {
    return codUsuario;
  }

  public void setCodUsuario(Long codUsuario) {
    this.codUsuario = codUsuario;
  }

  @Column(name = "PASSWORD")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Column(name = "RUT")
  public Long getRut() {
    return rut;
  }

  public void setRut(Long rut) {
    this.rut = rut;
  }

  @Column(name = "RUT_DV")
  public String getDv() {
    return dv;
  }

  public void setDv(String dv) {
    this.dv = dv;
  }

  @Column(name = "IDF_NOMBRE")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Column(name = "IDF_APPATERNO")
  public String getAppPaterno() {
    return appPaterno;
  }

  public void setAppPaterno(String appPaterno) {
    this.appPaterno = appPaterno;
  }

  @Column(name = "IDF_APMATERNO")
  public String getAppMaterno() {
    return appMaterno;
  }

  public void setAppMaterno(String appMaterno) {
    this.appMaterno = appMaterno;
  }

  @Column(name = "GLS_CORREO")
  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  @Column(name = "FLG_ACTIVO")
  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  @Column(name = "FEC_CREACION")
  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  @Column(name = "FEC_ULTIMO_ACCESO")
  public Date getFechaUltimoAcceso() {
    return fechaUltimoAcceso;
  }

  public void setFechaUltimoAcceso(Date fechaUltimoAcceso) {
    this.fechaUltimoAcceso = fechaUltimoAcceso;
  }

  @Column(name = "FLG_CAMBIO_PASSWORD")
  public Long getFlgCambioPassword() {
    return flgCambioPassword;
  }

  public void setFlgCambioPassword(Long flgCambioPassword) {
    this.flgCambioPassword = flgCambioPassword;
  }

  @Column(name = "FEC_CAMBIO_PASSWORD")
  public Date getFechaCambioPassword() {
    return fechaCambioPassword;
  }

  public void setFechaCambioPassword(Date fechaCambioPassword) {
    this.fechaCambioPassword = fechaCambioPassword;
  }

  @Column(name = "NRO_INTENTOS")
  public Long getNumeroIntentos() {
    return numeroIntentos;
  }

  public void setNumeroIntentos(Long numeroIntentos) {
    this.numeroIntentos = numeroIntentos;
  }

  @Column(name = "GLS_SEXO")
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Column(name = "FEC_NACIMIENTO")
  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  @Column(name = "FEC_BLOQUEO")
  public Date getFechaBloqueo() {
    return fechaBloqueo;
  }

  public void setFechaBloqueo(Date fechaBloqueo) {
    this.fechaBloqueo = fechaBloqueo;
  }

  @Override
  public String toString() {
    return "Usuario{" +
        "id=" + id +
        ", codUsuario=" + codUsuario +
        ", password='" + password + '\'' +
        ", rut=" + rut +
        ", dv='" + dv + '\'' +
        ", nombre='" + nombre + '\'' +
        ", appPaterno='" + appPaterno + '\'' +
        ", appMaterno='" + appMaterno + '\'' +
        ", correo='" + correo + '\'' +
        ", flgActivo=" + flgActivo +
        ", fechaCreacion=" + fechaCreacion +
        ", fechaUltimoAcceso=" + fechaUltimoAcceso +
        ", flgCambioPassword=" + flgCambioPassword +
        ", fechaCambioPassword=" + fechaCambioPassword +
        ", numeroIntentos=" + numeroIntentos +
        ", sexo='" + sexo + '\'' +
        ", fechaNacimiento=" + fechaNacimiento +
        ", fechaBloqueo=" + fechaBloqueo +
        '}';
  }
}
