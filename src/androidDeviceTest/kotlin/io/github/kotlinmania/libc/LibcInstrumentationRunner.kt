package io.github.kotlinmania.libc

import android.app.Activity
import android.app.Instrumentation
import android.os.Bundle

class LibcInstrumentationRunner : Instrumentation() {
    override fun onCreate(arguments: Bundle?) {
        super.onCreate(arguments)
        start()
    }

    override fun onStart() {
        val tests = HostIoTest(targetContext.cacheDir.absolutePath)
        val cases =
            listOf(
                "androidNativeMemoryPreservesBytesAcrossCopyAndResize" to tests::androidNativeMemoryPreservesBytesAcrossCopyAndResize,
                "androidDescriptorsPreserveBytesAndExposeHostErrors" to tests::androidDescriptorsPreserveBytesAndExposeHostErrors,
            )
        var failed = 0
        cases.forEachIndexed { index, (name, execute) ->
            val status =
                Bundle().apply {
                    putString("id", "InstrumentationTestRunner")
                    putString("class", HostIoTest::class.qualifiedName)
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
