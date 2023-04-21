// Java Program to Illustrate DepartmentRepository File

// Importing package module to code fragment

package de.schog.SpringBootDemo.repository;

import de.schog.SpringBootDemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface DepartmentRepository
        extends JpaRepository<Department, Long> {
}
