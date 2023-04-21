// Java Program to Demonstrate Department File

// Importing package module to this code fragment

package de.schog.SpringBootDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="department")
// class
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long departmentId;

    @Column(name="department_name")
    private String departmentName;

    @Column(name="department_adress")
    private String departmentAddress;

    @Column(name="department_code")
    private String departmentCode;

}
