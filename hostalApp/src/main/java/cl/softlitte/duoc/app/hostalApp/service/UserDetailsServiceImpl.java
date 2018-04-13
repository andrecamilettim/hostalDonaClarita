package cl.softlitte.duoc.app.hostalApp.service;


import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class UserDetailsServiceImpl implements UserDetailsService{
//	 @Autowired
//	    private UsuarioRepository userRepository;

	    @Override
	    @Transactional(readOnly = true)
	    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//	        Usuario user = userRepository.findByEmail(email);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//	        grantedAuthorities.add(new SimpleGrantedAuthority(user.getParamTipoUsuario().getValor()));     

//	        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), grantedAuthorities);
	    	return new org.springframework.security.core.userdetails.User("", "", grantedAuthorities);
	    }
}
