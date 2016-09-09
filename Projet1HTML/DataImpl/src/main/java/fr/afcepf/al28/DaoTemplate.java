package fr.afcepf.al28;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Template;
import fr.afcepf.al28.IDao.IDaoTemplate;

@Service
@Transactional
public class DaoTemplate implements IDaoTemplate{

	@PersistenceContext
	private EntityManager em;
	
	private Template template;
	
	@Override
	public void methodeTemplate() {
		template = new Template();
		template.setExemple("Tada");
		em.persist(template);
	}


	
}
