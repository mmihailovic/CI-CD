package com.example.kotlinprobavanje.service

import com.example.kotlinprobavanje.dto.StudentCreateDTO
import com.example.kotlinprobavanje.dto.StudentDTO
import com.example.kotlinprobavanje.dto.StudentUpdateDTO

interface StudentService {
    /**
     * Retrieves all students
     * @return List of [StudentDTO] represents students
     */
    fun getAllStudents(): List<StudentDTO>
    fun getStudent(id: Long):StudentDTO
    fun createStudent(studentCreateDTO: StudentCreateDTO): StudentDTO
    fun updateStudent(studentUpdateDTO: StudentUpdateDTO): StudentDTO
}