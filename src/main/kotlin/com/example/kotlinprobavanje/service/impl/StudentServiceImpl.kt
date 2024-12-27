package com.example.kotlinprobavanje.service.impl

import com.example.kotlinprobavanje.dto.StudentCreateDTO
import com.example.kotlinprobavanje.dto.StudentDTO
import com.example.kotlinprobavanje.dto.StudentUpdateDTO
import com.example.kotlinprobavanje.exceptions.StudentNotFoundException
import com.example.kotlinprobavanje.mapper.StudentMapper
import com.example.kotlinprobavanje.model.Student
import com.example.kotlinprobavanje.repository.StudentRepository
import com.example.kotlinprobavanje.service.StudentService
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl (private val studentRepository: StudentRepository,
                          private val studentMapper: StudentMapper): StudentService {
    override fun getAllStudents(): List<StudentDTO> {
        return studentRepository.findAll().map { s -> studentMapper.studentToStudentDTO(s) }
    }

    override fun getStudent(id: Long): StudentDTO {
        return studentMapper.studentToStudentDTO(studentRepository.findById(id).orElseThrow())
    }

    override fun createStudent(studentCreateDTO: StudentCreateDTO): StudentDTO {
        return studentMapper.studentToStudentDTO(studentRepository.save(studentMapper.studentCreateDtoToStudent(studentCreateDTO)))
    }

    override fun updateStudent(studentUpdateDTO: StudentUpdateDTO): StudentDTO {
        var student: Student = studentRepository.findById(studentUpdateDTO.id)
                .orElseThrow { StudentNotFoundException(studentUpdateDTO.id) }

        student.name = studentUpdateDTO.name
        return studentMapper.studentToStudentDTO(studentRepository.save(student))
    }

}