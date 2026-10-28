package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.internal.WasiLibcEnv
import io.github.kotlinmania.libc.unix.bsd.popen
import io.github.kotlinmania.libc.unix.fopen
import io.github.kotlinmania.libc.unix.getpid
import io.github.kotlinmania.libc.unix.getuid
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class WasiFacilitiesTest {
    @Test
    fun realDescriptorErrorsComeFromWasiPreviewOne() {
        assertEquals(-1, WasiLibcEnv.close(-1))
        assertEquals(8, WasiLibcEnv.getErrno())
        assertEquals(0, WasiLibcEnv.isatty(-1))
        assertEquals(8, WasiLibcEnv.getErrno())
    }

    @Test
    fun ungrantedFilesystemCapabilitiesNeverCreateVirtualFiles() {
        assertNull(fopen("/kotlinmania-no-preopen/forbidden.txt", "w"))
        assertEquals(76, WasiLibcEnv.getErrno())
    }

    @Test
    fun unavailableHostFacilitiesNeverInventResults() {
        assertFailsWith<UnsupportedOperationException> { getpid() }
        assertFailsWith<UnsupportedOperationException> { getuid() }
        assertFailsWith<UnsupportedOperationException> { popen("echo fabricated", "r") }
    }
}
