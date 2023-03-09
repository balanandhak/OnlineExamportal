package com.exam;

import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.exam.entity.User;
import com.exam.repository.UserRepository;

@SpringBootTest
class ExamportalApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Test
	public void addUser() {
 User user=new User(3,"jenny123","jennifer","jenny","jenny123@gmail.com","12876448","designer", true, null);
	userRepository.save(user);
	assertNotNull(userRepository.findById((long) 3).get());

	}

}
