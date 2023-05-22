package org.victor_kessler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.victor_kessler.domain.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}