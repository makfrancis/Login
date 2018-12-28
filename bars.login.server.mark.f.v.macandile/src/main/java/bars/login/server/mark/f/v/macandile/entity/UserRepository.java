package bars.login.server.mark.f.v.macandile.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bars.login.server.mark.f.v.macandile.DAO.User;


public interface UserRepository extends JpaRepository<User, Integer> {
 
	List<User> findByUserNameAndPassword(String userName, String password);
	User findByUserName(String userName);
	
}