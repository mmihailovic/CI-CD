package com.example.kotlinprobavanje.exceptions

import org.springframework.http.HttpStatus

abstract class ApplicationException (override val message: String, val httpStatus: HttpStatus): RuntimeException(message) {
}