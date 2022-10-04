package com.example.demojms.vo;

import java.io.Serializable;
import java.util.List;

public class Mensagem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 163681670907461960L;
	

	private String to;
	private String corpo;
	private String subject;
	private String sist;
	private String tipoEmail;
	private String from;
	private String dataEnvio;
	private String status;
	private String error;
	private String copia;
	private String performance;
	private List<String> enexos;
	private long id;	
	
	
	public Mensagem(String to, String corpo, String subject, String sist, String tipoEmail, String from,
			String dataEnvio, String status, String error, String copia, String performance, List<String> enexos) {
		super();
		this.to = to;
		this.corpo = corpo;
		this.subject = subject;
		this.sist = sist;
		this.tipoEmail = tipoEmail;
		this.from = from;
		this.dataEnvio = dataEnvio;
		this.status = status;
		this.error = error;
		this.copia = copia;
		this.performance = performance;
		this.enexos = enexos;
	}
	
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSist() {
		return sist;
	}
	public void setSist(String sist) {
		this.sist = sist;
	}
	public String getTipoEmail() {
		return tipoEmail;
	}
	public void setTipoEmail(String tipoEmail) {
		this.tipoEmail = tipoEmail;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getCopia() {
		return copia;
	}
	public void setCopia(String copia) {
		this.copia = copia;
	}
	public List<String> getEnexos() {
		return enexos;
	}
	public void setEnexos(List<String> enexos) {
		this.enexos = enexos;
	}
	

}
