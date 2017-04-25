package xuan.wen.zhi.qin.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xuan.wen.zhi.qin.domain.model.user.UserModel;
import xuan.wen.zhi.qin.domain.repository.user.UserRepository;
import xuan.wen.zhi.qin.service.AbstractService;
import xuan.wen.zhi.qin.service.user.UserService;

/**
 * Created by qinzhiwenxuan on 2017/4/20.
 */
@Service("userService")
public class UserServiceImpl extends AbstractService<UserModel> implements UserService<UserModel> {

	@Autowired
	private UserRepository userRepository;

	/***
	 * 注入Repository
	 */
	@Override
	public void injectionRepository() {
		this.basicRepository = userRepository;
	}

}
