package cl.camiletti.happyFeetWeb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
 
    
    @Autowired
	private Environment env;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
       
        return "paciente/registrationPaciente";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") String userForm, BindingResult bindingResult, Model model) {
        
        return "";
    }
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String home(Model model,String error, String logout) { 
    	if (error != null)
            model.addAttribute("error", "Usuario o password inválidos..");

        if (logout != null)
            model.addAttribute("mensaje", "Sesion cerrada exitosamente.");

        return "index";
    }
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login(Model model,String error, String logout) { 
    	if (error != null)
            model.addAttribute("error", "Usuario o password inválidos.");

        if (logout != null)
            model.addAttribute("message", "Sesion cerrada.");

        return "login";
    }
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public void login(@ModelAttribute("loginForm") String loginForm, BindingResult bindingResult, Model model) {
        //userValidator.validate(loginForm, bindingResult);
    	 
    	model.addAttribute("loginForm",null);
    }
	
    @RequestMapping(value="/redirect", method = RequestMethod.GET)
    public ModelAndView welcome(Model model) {
    	User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	GrantedAuthority role=user.getAuthorities().iterator().next();
    	String rol=role.toString();  
    	
//    	List<Parametro> parametros=parametroService.findAll();
//    	
//    	for (Parametro parametro : parametros) {
//			if(parametro.getValor().equals(rol)){
//				return new ModelAndView("redirect:"+rol.toLowerCase()+"/index");
//			}
//		}    	
    	return null;
        
    }
    
    @RequestMapping(value="/forgot", method = RequestMethod.GET)
    public String olvide(Model model) {
    	
    	return "forgot";
        
    }
    
    
    
}
