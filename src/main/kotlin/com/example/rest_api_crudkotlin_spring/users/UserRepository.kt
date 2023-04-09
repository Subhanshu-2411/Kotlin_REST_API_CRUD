package com.example.rest_api_crudkotlin_spring.users

import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Int>