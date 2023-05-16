package com.xamcheck.accelerate.student.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.accelerate.visor.model.AcademicYear;
@Repository
public interface AcademicYearRepository extends JpaRepository<AcademicYear, Long> {
	//

}
