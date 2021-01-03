package com.learn

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

/**
 * @author Rizki Rian Anandita
 */
class ConditionalTest {

    // Jalan jika Os menggunakan Windows atau Linux
    @Test
    @EnabledOnOs(value = [OS.WINDOWS, OS.LINUX])
    fun enableOnWindowsOrLinux() {
        // only run on windows
    }

    // Tidak jalan jika Os dengan Windows
    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun disableOnWindows() {
        // only run if not windows
    }

    // Jalan hanya jika menggunakan JAVA XX
    @Test
    @EnabledOnJre(value = [JRE.JAVA_8])
    fun onlyRunOnJava() {

    }

    // Jalan jika menggunakan selain JAVA XX
    @Test
    @DisabledOnJre(value = [JRE.JAVA_8])
    fun disableRunOnJava() {

    }

    // Hanya jalan jika versi java ada di versi yang ditentukan
    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    fun onlyRunJava11ToJava14() {

    }

    // Tidak akan berjalan di java version yang telah ditentukan
    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    fun disableRunJava11ToJava14() {

    }

    @Test
    fun printSystemProperties() {
        System.getProperties().forEach { key, value ->
            println("$key => $value")
        }
    }

    @Test
    @EnabledIfSystemProperties(value = [
        EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle. Corporation")
    ])
    fun enableOnOracle() {

    }

    @Test
    @DisabledIfSystemProperties(value = [
        DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle. Corporation")
    ])
    fun disableOnOracle() {

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun enableOnDev() {

    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun disableOnDev() {

    }
}