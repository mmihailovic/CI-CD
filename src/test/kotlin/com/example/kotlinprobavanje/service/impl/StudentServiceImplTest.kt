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
class StudentServiceImplTest {
    @InjectMocks
    private lateinit var studentServiceImpl: StudentServiceImpl

    companion object {
        const val STUDENT_ID: Long = 15;
    }

    @Test
    fun updateStudent() {

    }
}