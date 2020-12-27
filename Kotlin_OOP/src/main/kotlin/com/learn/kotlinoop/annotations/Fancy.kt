package com.learn.kotlinoop.annotations

/**
 * @author Rizki Rian Anandita
 */

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)