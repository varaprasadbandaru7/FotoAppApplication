package com.myphotoshop.fotoapp.users.shared;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	public String generateUserID()
	{
		return UUID.randomUUID().toString();
	}
}
