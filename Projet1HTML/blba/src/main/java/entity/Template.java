package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="template")
public class Template {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTemplate;
	
	private String exemple;

	public Integer getIdTemplate() {
		return idTemplate;
	}

	public void setIdTemplate(Integer idTemplate) {
		this.idTemplate = idTemplate;
	}

	public String getExemple() {
		return exemple;
	}

	public void setExemple(String exemple) {
		this.exemple = exemple;
	}
	
	
}
