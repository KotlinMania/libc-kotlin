// port-lint: tests libc/src/hermit.rs
package io.github.kotlinmania.libc.hermit

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class HermitTest {
    @Test
    fun testHermitConstants() {
        assertEquals(0, AF_UNSPEC)
        assertEquals(3, AF_INET)
        assertEquals(1, AF_INET6)
        assertEquals(2, AF_VSOCK)
        assertEquals(1, CLOCK_REALTIME)
        assertEquals(4, CLOCK_MONOTONIC)
        assertEquals(0u, DT_UNKNOWN)
        assertEquals(1u, DT_FIFO)
        assertEquals(2u, DT_CHR)
        assertEquals(4u, DT_DIR)
        assertEquals(6u, DT_BLK)
        assertEquals(8u, DT_REG)
        assertEquals(10u, DT_LNK)
        assertEquals(12u, DT_SOCK)
        assertEquals(14u, DT_WHT)
        assertEquals(1, EPERM)
        assertEquals(2, ENOENT)
        assertEquals(11, EAGAIN)
        assertEquals(11, EWOULDBLOCK)
        assertEquals(0, STDIN_FILENO)
        assertEquals(1, STDOUT_FILENO)
        assertEquals(2, STDERR_FILENO)
    }

    @Test
    fun testHermitDataClasses() {
        val timespec = Timespec(tvSec = 100L, tvNsec = 500)
        assertEquals(100L, timespec.tvSec)
        assertEquals(500, timespec.tvNsec)

        val inAddr = InAddr(sAddr = 0x7f000001u)
        assertEquals(0x7f000001u, inAddr.sAddr)

        val pollfd = Pollfd(fd = 3, events = POLLIN, revents = 0)
        assertEquals(3, pollfd.fd)
        assertEquals(POLLIN, pollfd.events)
        assertNotNull(pollfd)
    }
}
