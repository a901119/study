package hwang.kyuchul.ums.dao.mapper;

import hwang.kyuchul.ums.domain.User;

import java.util.List;

public interface UserMapper {
	List<User> getUsers();
	User getUser(int userNo);
	int addUser(String name);
	int updateUser(User user);
	int delUser(int userNo);

}
