package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.User;
@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, Long>{
	List<User> findAll();
	void deleteById(int id);
}
