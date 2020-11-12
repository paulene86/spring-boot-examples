package com.in28minutes.springboot.jpa.hibernate.h2.example.student;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name= "CUENTAS")
public class Cuenta {
	@Id
	@Column(name = "ID_CUENTA")
	private Long id;

	@Override
	public String toString() {
		return "Cuenta{" +
				"id=" + id +
				", iban='" + iban + '\'' +
				", ibanOrigen='" + ibanOrigen + '\'' +
				", estado='" + estado + '\'' +
				", fechaApertura=" + fechaApertura +
				", fechaActivacion=" + fechaActivacion +
				", codDivisa='" + codDivisa + '\'' +
				", fechalta=" + fechalta +
				", idUsuarioAlta=" + idUsuarioAlta +
				", fechaBaja=" + fechaBaja +
				", idUsuarioBaja=" + idUsuarioBaja +
				", codigoCuenta='" + codigoCuenta + '\'' +
				", codigoCuentaExterna='" + codigoCuentaExterna + '\'' +
				", uuidCuenta='" + uuidCuenta + '\'' +
				", desdeCallCenter=" + desdeCallCenter +
				", codigoPromocion='" + codigoPromocion + '\'' +
				", enviadoActivacion=" + enviadoActivacion +
				", idUsuarioModAdmin=" + idUsuarioModAdmin +
				", fechaLastModificacionAdmin=" + fechaLastModificacionAdmin +
				", fechaAltaModificacion=" + fechaAltaModificacion +
				", idCuentaEfectivo=" + idCuentaEfectivo +
				", tipoCuenta='" + tipoCuenta + '\'' +
				'}';
	}

	@Column(name = "IBAN")
	private String iban;

	@Column(name = "IBAN_ORIGEN")
	private String ibanOrigen;

	@Column(name = "ESTADO")
	private String estado;

	@Column(name = "FECHA_APERTURA")
	private Date fechaApertura;

	@Column( name = "FECHA_ACTIVACION")
	private Date fechaActivacion;

	@Column( name = "COD_DIVISA")
	private String codDivisa;

	@Column(name = "FEC_ALTA")
	private Date fechalta;

	@Column(name = "ID_USU_ALTA")
	private Long idUsuarioAlta;

	@Column(name = "FEC_BAJA")
	private Date fechaBaja;

	@Column(name = "ID_USU_BAJA")
	private Long idUsuarioBaja;

	@Column(name = "CODIGO_CUENTA")
	private String codigoCuenta;

	@Column(name = "CODIGO_CUENTA_EXTERNA")
	private String codigoCuentaExterna;

	@Column(name= "UUID_CUENTAS")
	private String uuidCuenta;

	@Column(name = "DESDE_CALL_CENTER")
	private int desdeCallCenter;

	@Column(name = "COD_PROMOCION")
	private String codigoPromocion;

	@Column(name = "ENVIADO_ACTIVACION")
	private Date enviadoActivacion;

	@Column(name = "ID_USUARIO_MOD_ADMIN")
	private Long idUsuarioModAdmin;

	@Column(name = "FECHA_LAST_MOD_ADMIN")
	private Date fechaLastModificacionAdmin;

	@Column(name = "FECHA_ALTA_MODIFICACION")
	private Date fechaAltaModificacion;

	@Column(name = "ID_CUENTA_EFECTIVO")
	private Long idCuentaEfectivo;

	@Column(name = "TIPO_CUENTA")
	private String tipoCuenta;


}
