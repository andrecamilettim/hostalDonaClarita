package cl.softlitte.duoc.app.hostalApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import cl.softlitte.duoc.app.hostalApp.util.FileManagerUtil;

@Controller
@SessionAttributes("sessionUser")
public class AdminController {
//    @Autowired
//    private PacienteService pacienteService;
    
   
   
   @Autowired
   FileManagerUtil fileManagerUtil;
    

    @RequestMapping(value = "/admin/index", method = RequestMethod.GET)
    public String registration(Model model) {
    	User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        
        return "admin/admin";
    }

   
}
