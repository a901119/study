package hwang.kyuchul.ums.dao;

import hwang.kyuchul.ums.dao.mapper.UserMapper;
import hwang.kyuchul.ums.domain.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired private UserMapper userMapper;

	@Override
	public List<User> getUsers() {
		return userMapper.getUsers();
	}

	@Override
	public User getUser(int userNo) {
		return userMapper.getUser(userNo);
	}

	@Override
	public int addUser(String userName) {
		return userMapper.addUser(userName);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateUser(user);
	}

	@Override
	public int delUser(int userNo) {
		return userMapper.delUser(userNo);
	}
}
