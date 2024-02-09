package daos;

import java.util.List;

import model.Subject;

public interface SubjectDao {
	
	public void registrar (Subject subject);
	public void	editar (Subject subject);
	public void	eliminar (Subject subject);
	public Subject find(Integer id);
	public List<Subject>findAll();


}
