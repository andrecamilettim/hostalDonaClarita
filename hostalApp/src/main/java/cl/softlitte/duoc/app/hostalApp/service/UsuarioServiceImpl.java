package cl.softlitte.duoc.app.hostalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.softlitte.duoc.app.hostalApp.model.Usuario;
import cl.softlitte.duoc.app.hostalApp.repository.IUsuarioRepository;


public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Usuario findByUsernameAndPassword(String username, String password) {
		
		return  usuarioRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
		
	}

	@Override
	public Usuario findById(int id) {
		return usuarioRepository.findByIdUsuario(id);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public void deleteById(Usuario usuario) {
		usuarioRepository.delete(usuario);
		
	}

	
	@Override
	public Usuario findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	@Override
	public Usuario login(String username, String password) {
		Usuario user = this.findByUsername(username);
		if(user!=null && user.getPassword().equals(password)){			
			return user;
			}
		else{
			return null;
		}
	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioRepository.findByUsername(username); 
	}

	@Override
	public boolean existUsuario(int id) {
	Usuario usuario = 	usuarioRepository.findByIdUsuario(id);
	if(usuario!=null) {
		
	return true;
		
	}else {	return false;
	}
	}

}
