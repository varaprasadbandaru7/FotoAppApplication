package com.myphotoshop.fotoapp.users.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.myphotoshop.fotoapp.users.entity.UserEntity;
import com.myphotoshop.fotoapp.users.model.User;
import com.myphotoshop.fotoapp.users.repository.UserRepository;
import com.myphotoshop.fotoapp.users.shared.Utils;

@Service
public class UserServiceImpl implements UserService {

	Utils utils;
	UserRepository userRepository;
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public UserServiceImpl(Utils utils,UserRepository userRepository,BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.utils=utils;
		this.userRepository=userRepository;
		this.bCryptPasswordEncoder=bCryptPasswordEncoder;
	}

	@Override
	public User createUser(User user) {

		String userid = utils.generateUserID();
		
		user.setUserid(userid);
		
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity=modelMapper.map(user, UserEntity.class);
		
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(userEntity);
		
		User returnValue=modelMapper.map(userEntity, User.class);
		
		return returnValue;
	}
}