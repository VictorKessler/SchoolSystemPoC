package org.victor_kessler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.victor_kessler.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
