package com.motycka.edu.lesson01

import com.motycka.edu.captureStdout
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldContain

class MainTest : StringSpec({

    "main function should print 'Hello, Kotlin!'" {
        // Capture stdout during main function execution
        val output = captureStdout {
            main(emptyArray())
        }

        // Verify the output contains the expected message
        output shouldContain "Hello, Kotlin!"
    }

    "main function should print program arguments" {
        // Capture stdout during main function execution with arguments
        val args = arrayOf("arg1", "arg2", "arg3")
        val output = captureStdout {
            main(args)
        }

        // Verify the output contains the expected message with arguments
        output shouldContain "Program arguments: arg1, arg2, arg3"
    }
})
