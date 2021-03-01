package it.clienteGestionale.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	
	private static final long serialVersionUID = -1752603793860992912L;

	@Id
	@Column(name="id", nullable=false, updatable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "nome", nullable = false)
    private String nome;
 
    @Column(name = "cognome", nullable = false)
    private String cognome;
    
    @Column(name = "email", nullable = true)
    private String email;
    
    @Column(name = "codicefiscale", nullable = false)
    private String codiceFiscale;
    
    @Column(name = "datanascita", nullable = false)
    private Date dataNascita;
    
    @Column(name = "datacreazione", nullable = true)
    private Date dataCreazione;
    
    @Column(name = "password", nullable = false)
    private String password;
	

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
}
