package com.dailycodebuffer.transaction.repository;

import com.dailycodebuffer.transaction.entitiy.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
