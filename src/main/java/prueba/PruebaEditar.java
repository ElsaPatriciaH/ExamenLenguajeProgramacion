package prueba;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaEditar {
	
public static void main(String[] args) {
		
		SubjectDao subDao = new SubjectDaoImpl();
		Subject sub = new Subject();
		Subject sj = subDao.find(14);
		
		
		sj.setSubject("Mateo Diaz");
		sj.setCredits("5");
		
		subDao.editar(sj);
		
		List<Subject> subList = subDao.findAll();
		for(Subject s: subList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
		
	}

}
