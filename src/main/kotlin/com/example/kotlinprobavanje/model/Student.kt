package com.example.kotlinprobavanje.model

import jakarta.persistence.*

@Entity
class Student(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long, var name: String, var email: String,
              @Enumerated(EnumType.STRING) var studiesType: StudiesType)
