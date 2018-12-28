package bars.login.client.mark.f.v.macandile.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bars.login.client.mark.f.v.macandile.ClientProxy;
import bars.login.server.mark.f.v.macandile.DAO.User;

@Controller
@RequestMapping("/")
public class ClientController {
	
	@Autowired
	private ClientProxy clientProxy;
	
	@RequestMapping("/login")
	public String index() {
		return "login";
	}
	@RequestMapping("/insertPage")
	public String insertPage() {
		return "insertPage";
	}
	
	@GetMapping("/all")
	public List<User> allUser(){
		
		return clientProxy.getAll();
	}
	
	@PostMapping("/loginMember")
	public ModelAndView getUserPassword(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		List<User> user = clientProxy.getUserByNameAndPass(userName, password);
		
		if(clientProxy.getUserByNameAndPass(userName, password).size() > 0) {
			
			if(user.get(0).getUserType().equals("user")) {
				List<User> listOfUser = clientProxy.getAll();
				model.addObject("userList", listOfUser);
				model.setViewName("success");
				return model;
			}else if(user.get(0).getUserType().equals("admin")) {
				List<User> listOfUser = clientProxy.getAll();
				model.addObject("userList", listOfUser);
				model.setViewName("adminSuccess");
				return model;
			}
			return null;
			
		}else {
			model.setViewName("fail");
			return model;
		}
		
	}
	
	@PostMapping("/insertMember")
	public ModelAndView insertUserPassword(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String userType = request.getParameter("userType");
		
		User user = clientProxy.geteUsername(userName);
		
		if(user == null) {
			
			clientProxy.saveUserByNameAndPass(userName, password, userType);
			List<User> userList = clientProxy.getAll();
			model.addObject("userList" ,userList);
			model.setViewName("adminSuccess");
			return model;
		}else {
			model.setViewName("failcreate");
			return model;
		}
		
		
	}
	
	@PostMapping("/deleteUser")
	public ModelAndView deleteUser(HttpServletRequest request) {
		
		ModelAndView model = new ModelAndView();
		String userName = request.getParameter("userName");
		
		
		if( clientProxy.geteUsername(userName) != null) {
			
			clientProxy.deleteUserByName(userName);
			List<User> listOfUser = clientProxy.getAll();
			model.addObject("userList", listOfUser);
			model.setViewName("adminSuccess");
			return model;
		}else {
			model.setViewName("fail");
			return model;
		}
		
	
}
	
	
}
