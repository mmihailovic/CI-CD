package com.example.kotlinprobavanje.repository

import com.example.kotlinprobavanje.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository:JpaRepository<Student, Long> {
}