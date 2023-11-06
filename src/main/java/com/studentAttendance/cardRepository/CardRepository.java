package com.studentAttendance.cardRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.studentAttendance.cardEntity.*;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {}
 