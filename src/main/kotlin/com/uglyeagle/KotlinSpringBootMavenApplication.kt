package com.uglyeagle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*;

@SpringBootApplication
class KotlinSpringBootMavenApplication

fun main(args: Array<String>) {

	runApplication<KotlinSpringBootMavenApplication>(*args)

	System.out.println("hello -- pure java syntax");

	System.out.println("hello -- pure java syntax without semecolon")

	println("hello -- Kotlin synatx, Kotlin function")
}
