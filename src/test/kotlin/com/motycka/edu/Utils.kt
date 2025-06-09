package com.motycka.edu

import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun captureStdout(block: () -> Unit): String {
    val originalOut = System.out
    val outputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(outputStream))

    try {
        block()
    } finally {
        System.setOut(originalOut)
    }

    return outputStream.toString().trim()
}
