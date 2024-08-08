package br.edu.avangers.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_Avangers")
public class Avanger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "avenger_seq", sequenceName = "TAB_AVANGERS_SEQ", allocationSize = 1)
	private Long idAvanger;
	@Column(length = 100, nullable = false)
	private String nickName;
	@Column(length = 100, nullable = false)
	private String personName;
	@Column(length = 200, nullable = false)
	private String description;
	@Column(length = 500, nullable = false)
	private String history;
	
	
	public Long getIdAvanger() {
		return idAvanger;
	}
	public void setIdAvanger(Long idAvanger) {
		this.idAvanger = idAvanger;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	
	
	
	

}
