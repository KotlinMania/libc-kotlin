package io.github.kotlinmania.libc

import android.app.Activity
import android.app.Instrumentation
import android.os.Bundle
import io.github.kotlinmania.libc.unix.linuxlike.android.O_CREAT
import io.github.kotlinmania.libc.unix.linuxlike.android.O_TRUNC

class LibcInstrumentationRunner : Instrumentation() {
    override fun onCreate(arguments: Bundle?) {
        super.onCreate(arguments)
        start()
    }

    override fun onStart() {
        val tests = CallerApiTest()
        val cacheDir = targetContext.cacheDir.absolutePath
        val cases =
            listOf(
                "callerMemoryPreservesBytesAcrossCopyAndResize" to tests::callerMemoryPreservesBytesAcrossCopyAndResize,
                "callerDescriptorIoRoundTripsAndExposesHostErrors" to {
                    verifyCallerDescriptorIo(
                        directory = cacheDir,
                        oCreat = O_CREAT,
                        oTrunc = O_TRUNC,
                    )
                },
            )
        var failed = 0
        cases.forEachIndexed { index, (name, execute) ->
            val status =
                Bundle().apply {
                    putString("id", "InstrumentationTestRunner")
                    putString("class", CallerApiTest::class.qualifiedName)
                    putString("test", name)
                    putInt("numtests", cases.size)
                    putInt("current", index + 1)
                }
            sendStatus(1, status)
            try {
                execute()
                sendStatus(0, status)
            } catch (error: Throwable) {
                failed++
                status.putString("stack", error.stackTraceToString())
                sendStatus(-2, status)
            }
        }
        val result =
            Bundle().apply {
                putInt("numtests", cases.size)
                putString("stream", "Libc JNI behavior tests: ${cases.size - failed} passed, $failed failed\n")
            }
        finish(Activity.RESULT_OK, result)
    }
}
