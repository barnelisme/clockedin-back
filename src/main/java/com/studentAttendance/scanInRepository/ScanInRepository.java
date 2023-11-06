package com.studentAttendance.scanInRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.studentAttendance.scanInEntity.ScanIn;


@Repository
public interface ScanInRepository extends JpaRepository<ScanIn, String>{

}
