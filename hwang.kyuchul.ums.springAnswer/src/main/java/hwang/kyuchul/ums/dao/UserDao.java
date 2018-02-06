package hwang.kyuchul.ums.dao;

import hwang.kyuchul.ums.domain.User;

import java.util.List;

public interface UserDao {
	List<User> getUsers();
	User getUser(int userNo);
	int addUser(String userName);
	int updateUser(User user);
	int delUser(int userNo);

}
