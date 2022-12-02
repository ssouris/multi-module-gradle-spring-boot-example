package com.example.multimoduleexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service

@SpringBootApplication
class MultimoduleExampleApplication

@Service
class MyService {

    fun getFoo(): String {
        return LibraryUtility.getFoo()
    }
}

fun main(args: Array<String>) {
    runApplication<MultimoduleExampleApplication>(*args)
}
