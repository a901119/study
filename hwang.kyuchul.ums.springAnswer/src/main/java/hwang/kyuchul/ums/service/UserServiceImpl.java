package hwang.kyuchul.ums.service;

import hwang.kyuchul.ums.dao.UserDao;
import hwang.kyuchul.ums.domain.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired private UserDao userDao;

	@Override
	public List<User> listUsers() {
		return userDao.getUsers();
	}

	@Override
	public User findUser(int userNo) {
		User user = null;
		for(User tmp:userDao.getUsers()){
			if(tmp.getUserNo()==userNo){
				user = tmp;
				break;	
			}
		}
		return user;
	}

	@Transactional
	@Override
	public boolean join(String userName) {
		return userDao.addUser(userName)>0;
	}
	
	@Transactional
	@Override
	public boolean fixUserInfo(User user) {
		return userDao.updateUser(user)>0;
	}

	@Transactional
	@Override
	public boolean secede(int userNo) {
		return userDao.delUser(userNo)>0;
	}
}
