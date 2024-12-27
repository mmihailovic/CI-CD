package com.example.kotlinprobavanje.exceptions

import org.springframework.http.HttpStatus

class StudentNotFoundException(id: Long): ApplicationException("Student with ID $id not found!", HttpStatus.NOT_FOUND) {
}