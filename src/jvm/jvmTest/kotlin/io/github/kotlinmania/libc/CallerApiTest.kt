package io.github.kotlinmania.libc

import kotlin.test.Test

class CallerApiTest {
    @Test fun callerMemoryPreservesBytesAcrossCopyAndResize() = verifyCallerMemory()

    @Test fun callerStringLengthMatches() = verifyCallerString()

    @Test fun callerDescriptorIoRoundTripsAndExposesHostErrors() = verifyCallerDescriptorIo()

    @Test fun callerProcessGetpidAndKillWork() = verifyCallerProcess()

    @Test fun callerErrnoStrerrorReturnsMessage() = verifyCallerErrno()

    @Test fun callerSysconfReportsPageSize() = verifyCallerSysconf()

    @Test fun callerSocketpairCreatesPair() = verifyCallerSockets()

    @Test fun hostAppleDarwinJniSyscallsWorkWhenOnDarwin() = verifyHostAppleDarwinIfPresent()
}
