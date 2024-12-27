package com.example.kotlinprobavanje.service.impl

import com.example.kotlinprobavanje.repository.StudentRepository
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import java.util.*

@ExtendWith(MockitoExtension::class)
class StudentServiceImplTest (@InjectMocks val studentServiceImpl: StudentServiceImpl, @Mock val studentRepository: StudentRepository) {
    companion object {
        const val STUDENT_ID: Long = 15;
    }

    @Test
    fun updateStudent() {
        when(studentRepository.findById(STUDENT_ID)) { Optional.empty() }
    }
}