package hwang.kyuchul.ums.controller;

import hwang.kyuchul.ums.domain.User;
import hwang.kyuchul.ums.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired private UserService userService;
	
	@RequestMapping("/")
	public String main(){
		return "main";
	}
	
	@RequestMapping("listUsers")
	@ResponseBody
	public List<User> listUsers(){
		return userService.listUsers();
	}
	
	@RequestMapping("join")
	@ResponseBody
	public boolean join(String userName){
		return userService.join(userName);
	}
	
	@RequestMapping("fixUserInfo")
	@ResponseBody
	public boolean fixUserInfo(User user){
		return userService.fixUserInfo(user);
	}
	
	@RequestMapping("secede")
	@ResponseBody
	public boolean secede(int userNo){
		return userService.secede(userNo);
	}
}