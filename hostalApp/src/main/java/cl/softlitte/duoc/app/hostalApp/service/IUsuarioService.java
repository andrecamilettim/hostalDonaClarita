package cl.softlitte.duoc.app.hostalApp.service;

import java.util.List;

import cl.softlitte.duoc.app.hostalApp.model.Usuario;



public interface IUsuarioService {

	Usuario findByUsernameAndPassword(String username, String password);
	void save(Usuario usuario);
	Usuario findById(int id);
	List<Usuario> findAll();
	void deleteById(Usuario usuario);
	Usuario login(String username, String password);
	Usuario findByEmail(String email);
	Usuario findByUsername(String username);
	boolean existUsuario(int id);	
}
