package cn.zj.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/list") 
	public String list(Model m) {
		
		List<User> users = userService.selectList();
		
		//共享数据
		m.addAttribute("users", users);
		
		return "userList";
	}
	
	
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		
		userService.deleteByPrimaryKey(userId);
		//跳回到查询列表页面
		return "redirect:/user/list.do";
	}
}
