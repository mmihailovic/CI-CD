package com.example.kotlinprobavanje.controller

import com.example.kotlinprobavanje.dto.StudentCreateDTO
import com.example.kotlinprobavanje.dto.StudentDTO
import com.example.kotlinprobavanje.dto.StudentUpdateDTO
import com.example.kotlinprobavanje.service.StudentService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController (private val studentService: StudentService) {

    @GetMapping
    fun getAllStudents(): ResponseEntity<List<StudentDTO>> {
        return ResponseEntity(studentService.getAllStudents(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable("id") id: Long): ResponseEntity<StudentDTO> {
        return ResponseEntity(studentService.getStudent(id), HttpStatus.OK);
    }

    @PostMapping
    fun createStudent(@RequestBody studentCreateDTO: StudentCreateDTO): ResponseEntity<StudentDTO> {
        return ResponseEntity(studentService.createStudent(studentCreateDTO), HttpStatus.CREATED)
    }

    @PatchMapping
    fun updateStudent(@RequestBody studentUpdateDTO: StudentUpdateDTO): ResponseEntity<StudentDTO> {
        return ResponseEntity(studentService.updateStudent(studentUpdateDTO), HttpStatus.OK);
    }
}