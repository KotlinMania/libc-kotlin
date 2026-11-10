package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.linuxlike.android.O_CREAT
import io.github.kotlinmania.libc.unix.linuxlike.android.O_TRUNC
import io.github.kotlinmania.libc.unix.linuxlike.android.SC_PAGESIZE
import kotlin.test.Test

class CallerApiTest {
    @Test fun callerMemoryPreservesBytesAcrossCopyAndResize() = verifyCallerMemory()

    @Test fun callerStringLengthMatches() = verifyCallerString()

    @Test
    fun callerDescriptorIoRoundTripsAndExposesHostErrors() =
        verifyCallerDescriptorIo(
            directory = System.getProperty("java.io.tmpdir") ?: ".",
            oCreat = O_CREAT,
            oTrunc = O_TRUNC,
        )

    @Test fun callerProcessGetpidAndKillWork() = verifyCallerProcess()

    @Test fun callerErrnoStrerrorReturnsMessage() = verifyCallerErrno()

    @Test
    fun callerSysconfReportsPageSize() =
        verifyCallerSysconf(
            scPagesize = SC_PAGESIZE,
        )

    @Test fun callerSocketpairCreatesPair() = verifyCallerSockets()
}
