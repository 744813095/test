package cn.zj.ssm.service;

import java.util.List;

import cn.zj.ssm.pojo.User;

public interface UserService {
	public User selectByPrimaryKey(Integer id);

	public List<User> selectList();

	public int insert(User user);

	public int updateByPrimaryKey(User user);

	public int deleteByPrimaryKey(Integer id);
}
