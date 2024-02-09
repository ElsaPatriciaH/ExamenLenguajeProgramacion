package prueba;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaEliminar {
	
public static void main(String[] args) {
		
		SubjectDao subDao = new SubjectDaoImpl();
		
		Subject sj = subDao.find(14);
		
		
		subDao.eliminar(sj);;
		
		List<Subject> subList = subDao.findAll();
		for(Subject s: subList) {
			System.out.println(s.getIdSubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}
		
	}

}
