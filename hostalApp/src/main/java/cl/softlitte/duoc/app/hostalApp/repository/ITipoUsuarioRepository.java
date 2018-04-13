package cl.softlitte.duoc.app.hostalApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.softlitte.duoc.app.hostalApp.model.TipoUsuario;




public interface ITipoUsuarioRepository extends JpaRepository<TipoUsuario, Long> {
<S extends TipoUsuario> S save(TipoUsuario tipoUsuario);
List<TipoUsuario> findAll();
}
