package bars.login.server.mark.f.v.macandile.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bars.login.server.mark.f.v.macandile.DAO.User;
import bars.login.server.mark.f.v.macandile.entity.UserRepository;


@RestController
@RequestMapping("/")
public class UserController {
	
	private UserRepository userRepository;
	
	
	public UserController(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}


	@GetMapping("/{username}/{password}")
	public List<User> getUserByNameAndPass(@PathVariable("username") final String userName, @PathVariable("password") final String password){
		
		List<User> findName = userRepository.findByUserNameAndPassword(userName, password);
		
		return findName;
		
	}
	
	@GetMapping("/{username}")
	public User getUsername(@PathVariable("username") final String userName){
		
		User findName = userRepository.findByUserName(userName);
		
		return findName;
		
	}
	
	@GetMapping("/{username}/{password}/{usertype}")
	public void saveUserByNameAndPass(@PathVariable("username") final String userName, @PathVariable("password") final String password, @PathVariable("usertype") final String userType){
		
		User user = new User(userName, password, userType);
		userRepository.save(user);
		
	}
	
	@DeleteMapping("/delete/{username}")  
	public void deleteUserByName(@PathVariable("username") final String userName){
		
		if(userRepository.findByUserName(userName).getUserName().length() > 0) {
			userRepository.deleteById(userRepository.findByUserName(userName).getUserId());
		}
		
	}
	
	
	@GetMapping("/all")
	public List<User> getAll(){
		
		//userRepository.findByUserName(username, password, userType);
		
		return userRepository.findAll();
		
	}
	
	@PutMapping("/{username}/{password}")  
	public void updateUserByName(@PathVariable("username") final String userName,@PathVariable("password") final String password){
		
		if(userRepository.findByUserName(userName).getUserName().length() > 0) {
			User user = userRepository.findByUserName(userName);
			user.setUserName(userName);
			user.setPassword(password);
			user.setUserType(user.getUserType());
			userRepository.save(user);
		}
		
	}

	
	
	
}
