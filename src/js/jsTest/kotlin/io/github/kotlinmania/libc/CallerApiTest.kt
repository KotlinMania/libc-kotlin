package io.github.kotlinmania.libc

import kotlin.test.Test
import kotlin.test.assertFailsWith

class CallerApiTest {
    @Test fun callerMemoryPreservesBytesAcrossCopyAndResize() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyCallerMemory() } else verifyCallerMemory()
    }

    @Test fun callerStringLengthMatches() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyCallerString() } else verifyCallerString()
    }

    @Test fun callerDescriptorIoRoundTripsAndExposesHostErrors() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyCallerDescriptorIo() } else verifyCallerDescriptorIo()
    }

    @Test fun callerProcessGetpidAndKillWork() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyCallerProcess() } else verifyCallerProcess()
    }

    @Test fun callerErrnoStrerrorReturnsMessage() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyCallerErrno() } else verifyCallerErrno()
    }

    @Test fun callerSysconfReportsPageSize() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyCallerSysconf() } else verifyCallerSysconf()
    }

    @Test fun callerSocketpairCreatesPair() {
        if (testIsBrowser()) assertFailsWith<UnsupportedOperationException> { verifyCallerSockets() } else verifyCallerSockets()
    }
}
