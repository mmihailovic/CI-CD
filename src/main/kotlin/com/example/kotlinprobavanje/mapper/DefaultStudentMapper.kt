package com.example.kotlinprobavanje.mapper

import com.example.kotlinprobavanje.dto.StudentDTO
import com.example.kotlinprobavanje.model.Student

class DefaultStudentMapper {

    fun studentToStudentDTO(student: Student): StudentDTO {
        return StudentDTO(student.name, student.email)
    }
}