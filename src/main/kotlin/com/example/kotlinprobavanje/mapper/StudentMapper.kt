package com.example.kotlinprobavanje.mapper

import com.example.kotlinprobavanje.dto.StudentCreateDTO
import com.example.kotlinprobavanje.dto.StudentDTO
import com.example.kotlinprobavanje.dto.StudentUpdateDTO
import com.example.kotlinprobavanje.model.Student
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface StudentMapper {

    @Mapping(source = "name", target = "email")
    fun studentCreateDtoToStudent(studentCreateDTO: StudentCreateDTO): Student
    fun studentToStudentDTO(student: Student): StudentDTO
    @Mapping(source = "name", target = "email")
    fun studentUpdateDtoToStudent(studentUpdateDTO: StudentUpdateDTO): Student
}