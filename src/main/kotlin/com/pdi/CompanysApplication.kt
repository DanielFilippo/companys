package com.pdi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CompanysApplication

fun main(args: Array<String>) {
	runApplication<CompanysApplication>(*args)
}
