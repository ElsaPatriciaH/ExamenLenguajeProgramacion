package prueba;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaRegistrar {
	
	public static void main(String[] args) {
		
		SubjectDao subDao = new SubjectDaoImpl();
		Subject sub = new Subject();
		
		sub.setIdSubject(14);
		sub.setSubject("Fernando Diaz");
		sub.setCredits("8");
		
		subDao.registrar(sub);
		
		List<Subject> subList = subDao.findAll();
		for(Subject s: subList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
		
	}

}
