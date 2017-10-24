package com.liuyingke.service.impl;

import com.liuyingke.dao.UUserMapper;
import com.liuyingke.model.UUser;
import com.liuyingke.service.UUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("userService")
public class UUserServiceImpl implements UUserService {

	@Resource
	private UUserMapper userMapper;


	public UUser login(Map<String, Object> map) {

		return userMapper.login(map);
	}

	public UUser findUserByEmail(String email) {
		return userMapper.findUserByEmail(email);
	}


}
