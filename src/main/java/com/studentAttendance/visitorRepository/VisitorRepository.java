package com.studentAttendance.visitorRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentAttendance.visitorEntity.Visitor;


@Repository
public interface VisitorRepository extends JpaRepository<Visitor, String> {

}
