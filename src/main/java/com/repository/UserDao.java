package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.model.LoginDetail;

@Repository
@EnableJpaRepositories
@EnableTransactionManagement
public interface UserDao extends JpaRepository<LoginDetail , Long>{
	
	//to fetch data for authentication i.e if username password matches then fetch the data
	public LoginDetail findByUserNameAndPassword(String userName,String password);
	
	//
	@Query(nativeQuery=true,value="select * from loginDetails WHERE role='trainer' OR role='trainee'")
	public List<LoginDetail> findAll();
}
