@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.fcntl
import io.github.kotlinmania.libc.unix.poll
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.get
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.usePinned
import libc.cinterop.libc_close
import libc.cinterop.libc_get_descriptor_constants
import libc.cinterop.libc_get_errno
import libc.cinterop.libc_pipe
import libc.cinterop.libc_select_timeout
import libc.cinterop.libc_write
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.TimeSource

class DescriptorTest {
    private val constants get() = requireNotNull(libc_get_descriptor_constants()).pointed

    private fun withPipe(block: (Int, Int) -> Unit) =
        memScoped {
            val fds = allocArray<IntVar>(2)
            assertEquals(0, libc_pipe(fds))
            try {
                block(fds[0], fds[1])
            } finally {
                libc_close(fds[0])
                libc_close(fds[1])
            }
        }

    @Test
    fun arrayPollingCopiesEveryReadinessMaskAndIgnoresNegativeDescriptors() =
        withPipe { read, write ->
            val fds = arrayOf(Pollfd(-1, 1, 4), Pollfd(read, 1, 4))
            assertEquals(0, poll(fds, 0))
            assertTrue(fds.all { it.revents == 0.toShort() })
            byteArrayOf(42).usePinned { assertEquals(1L, libc_write(write, it.addressOf(0), 1uL)) }
            assertEquals(1, poll(fds, 50))
            assertEquals(0.toShort(), fds[0].revents)
            assertEquals(1.toShort(), fds[1].revents)
            val single = Pollfd(read, 1, 0)
            assertEquals(1, poll(single, 1u, 0))
            assertEquals(1.toShort(), single.revents)
            assertFailsWith<IllegalArgumentException> { poll(single, 2u, 0) }
        }

    @Test
    fun noDescriptorsStillWaitsForTimeout() {
        val start = TimeSource.Monotonic.markNow()
        assertEquals(0, poll(emptyArray(), 30))
        assertTrue(start.elapsedNow() >= 20.milliseconds)
    }

    @Test
    fun selectUsesHostTimevalLayout() {
        val start = TimeSource.Monotonic.markNow()
        assertEquals(0, libc_select_timeout(0, null, null, null, 1, 0, 30_000))
        assertTrue(start.elapsedNow() >= 20.milliseconds)
        assertEquals(-1, libc_select_timeout(0, null, null, null, 1, 0, 1_000_000))
        assertEquals(-1, libc_select_timeout(0, null, null, null, 1, 0, 4_294_967_296L))
    }

    @Test
    fun descriptorFlagsAndErrnoComeFromHost() =
        withPipe { read, _ ->
            val flags = fcntl(read, constants.f_getfd)
            assertTrue(flags >= 0)
            assertEquals(0, fcntl(read, constants.f_setfd, flags or constants.fd_cloexec))
            assertTrue((fcntl(read, constants.f_getfd) and constants.fd_cloexec) != 0)
            val status = fcntl(read, constants.f_getfl)
            assertEquals(0, fcntl(read, constants.f_setfl, status or constants.o_nonblock))
            assertTrue((fcntl(read, constants.f_getfl) and constants.o_nonblock) != 0)
            assertEquals(-1, fcntl(-1, constants.f_getfd))
            assertEquals(constants.ebadf, libc_get_errno())
        }
}
