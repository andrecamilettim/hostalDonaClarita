package cl.softlitte.duoc.app.hostalApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.softlitte.duoc.app.hostalApp.model.Usuario;



public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
	 <S extends Usuario> S save(Usuario usuario);
	  Usuario findByIdUsuario(int  id);
	  List<Usuario> findAll();	 	
	  void delete(Usuario usuario);	 
	  Usuario findByEmail(String email);
	  Usuario findByUsernameAndPassword(String username, String password);
	  Usuario findByUsername(String username);
}
