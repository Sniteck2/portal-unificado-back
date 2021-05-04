package usuario.causa.model;

import java.io.Serializable;
import java.util.Date;

public class UsuarioVO implements Serializable {

  private static final long serialVersionUID = -5964362400260619726L;
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
  Long codTipoPerfil;
  Date fechaNacimiento;
  Date fechaBloqueo;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCodUsuario() {
    return codUsuario;
  }

  public void setCodUsuario(Long codUsuario) {
    this.codUsuario = codUsuario;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getRut() {
    return rut;
  }

  public void setRut(Long rut) {
    this.rut = rut;
  }

  public String getDv() {
    return dv;
  }

  public void setDv(String dv) {
    this.dv = dv;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAppPaterno() {
    return appPaterno;
  }

  public void setAppPaterno(String appPaterno) {
    this.appPaterno = appPaterno;
  }

  public String getAppMaterno() {
    return appMaterno;
  }

  public void setAppMaterno(String appMaterno) {
    this.appMaterno = appMaterno;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public Long getFlgActivo() {
    return flgActivo;
  }

  public void setFlgActivo(Long flgActivo) {
    this.flgActivo = flgActivo;
  }

  public Date getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(Date fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public Date getFechaUltimoAcceso() {
    return fechaUltimoAcceso;
  }

  public void setFechaUltimoAcceso(Date fechaUltimoAcceso) {
    this.fechaUltimoAcceso = fechaUltimoAcceso;
  }

  public Long getFlgCambioPassword() {
    return flgCambioPassword;
  }

  public void setFlgCambioPassword(Long flgCambioPassword) {
    this.flgCambioPassword = flgCambioPassword;
  }

  public Date getFechaCambioPassword() {
    return fechaCambioPassword;
  }

  public void setFechaCambioPassword(Date fechaCambioPassword) {
    this.fechaCambioPassword = fechaCambioPassword;
  }

  public Long getNumeroIntentos() {
    return numeroIntentos;
  }

  public void setNumeroIntentos(Long numeroIntentos) {
    this.numeroIntentos = numeroIntentos;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Long getCodTipoPerfil() {
    return codTipoPerfil;
  }

  public void setCodTipoPerfil(Long codTipoPerfil) {
    this.codTipoPerfil = codTipoPerfil;
  }

  public Date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Date getFechaBloqueo() {
    return fechaBloqueo;
  }

  public void setFechaBloqueo(Date fechaBloqueo) {
    this.fechaBloqueo = fechaBloqueo;
  }

  @Override
  public String toString() {
    return "UsuarioVO{" +
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
