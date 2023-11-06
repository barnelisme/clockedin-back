package com.studentAttendance.userRepository;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentAttendance.userEntity.User;


@Repository
public interface UserRepository extends JpaRepository<User, String>{

	@Query("DELETE FROM User u WHERE u.id = :id")
	 void deleteById(String id);
	
}
