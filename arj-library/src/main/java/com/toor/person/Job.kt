package com.toor.person

data class Job(val title: String, val salary: Long)

fun main() {
    println(Job("job", 1) == Job("job", 1))
}