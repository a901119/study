package hwang.kyuchul.ums.service;

import hwang.kyuchul.ums.domain.User;

import java.util.List;

public interface UserService {
	List<User> listUsers();
	User findUser(int userNo);
	boolean join(String userName);
	boolean fixUserInfo(User user);
	boolean secede(int userNo);

}
