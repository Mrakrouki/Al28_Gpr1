package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="evaluation")
public class Evaluation {

    /**
     * Default constructor
     */
    public Evaluation() {
    }

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idEvaluation;
    
    private String note;

    /**
     * 
     */
    private String commentaire;

    
    
	public Integer getId() {
		return idEvaluation;
	}

	public void setId(Integer id) {
		this.idEvaluation = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

    

}