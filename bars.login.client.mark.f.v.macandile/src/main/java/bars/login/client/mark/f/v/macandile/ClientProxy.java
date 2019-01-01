package bars.login.client.mark.f.v.macandile;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import bars.login.server.mark.f.v.macandile.DAO.User;


@FeignClient(name="bars.login.mark.f.v.macandile", url="localhost:8081")
public interface ClientProxy {
	
	
	@GetMapping("/all")
	public List<User> getAll();
	
	@GetMapping("/{username}/{password}")
	public List<User> getUserByNameAndPass(@PathVariable("username") final String userName, @PathVariable("password") final String password);
	
	@GetMapping("/{username}")
	public User getUsername(@PathVariable("username") final String userName);
	
	@GetMapping("/{username}/{password}/{usertype}")
	public void saveUserByNameAndPass(@PathVariable("username") final String userName, @PathVariable("password") final String password, @PathVariable("usertype") final String userType);
	
	@PutMapping("/{username}/{password}")  
	public void updateUserByName(@PathVariable("username") final String userName,@PathVariable("password") final String password);
	
	@DeleteMapping("/delete/{username}")  
	public void deleteUserByName(@PathVariable("username") final String userName);
}
