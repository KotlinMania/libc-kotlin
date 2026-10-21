package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.internal.LibcJni
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.poll
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.TimeSource

class PollTest {
    @Test
    fun reportsInvalidDescriptorAndClearsIgnoredDescriptor() {
        val constants = LibcJni.pollConstants()
        val fd = Pollfd(Int.MAX_VALUE, constants[0], 4)
        assertEquals(1, poll(fd, 1u, 0))
        assertEquals(constants[2], fd.revents)
        val ignored = Pollfd(-1, constants[0], 4)
        assertEquals(0, poll(ignored, 1u, 0))
        assertEquals(0.toShort(), ignored.revents)
    }

    @Test
    fun copiesReadinessBackToCaller() {
        val socket = LibcJni.boundDatagramSocket()
        assertTrue(socket >= 0)
        try {
            val input = LibcJni.pollConstants()[0]
            val fd = Pollfd(socket, input, 4)
            assertEquals(0, poll(fd, 1u, 0))
            assertEquals(0.toShort(), fd.revents)
            val payload = byteArrayOf(1, 2, 3, 4)
            sendDatagram(socket, payload)
            assertEquals(1, poll(fd, 1u, 1000))
            assertTrue(fd.revents.toInt() and input.toInt() != 0)
            val received = ByteArray(payload.size)
            assertEquals(payload.size.toLong(), LibcJni.recv(socket, received, 0, received.size, 0))
            assertContentEquals(payload, received)
            assertEquals(0, poll(fd, 1u, 0))
            assertEquals(0.toShort(), fd.revents)
        } finally {
            assertEquals(0, LibcJni.closesocket(socket))
        }
    }

    @Test
    fun copiesMixedDescriptorResultsToOriginalSlots() {
        val socket = LibcJni.boundDatagramSocket()
        assertTrue(socket >= 0)
        try {
            val constants = LibcJni.pollConstants()
            sendDatagram(socket, byteArrayOf(7))
            assertEquals(1, poll(Pollfd(socket, constants[0], 0), 1u, 1000))
            val returned = shortArrayOf(4, 4, 4)
            assertEquals(
                2,
                LibcJni.poll(
                    intArrayOf(-1, socket, Int.MAX_VALUE),
                    shortArrayOf(constants[0], constants[0], constants[0]),
                    returned,
                    3,
                    1000,
                ),
            )
            assertEquals(0.toShort(), returned[0])
            assertTrue(returned[1].toInt() and constants[0].toInt() != 0)
            assertEquals(constants[2], returned[2])
        } finally {
            assertEquals(0, LibcJni.closesocket(socket))
        }
    }

    @Test
    fun rejectsInvalidArrayLengthsAndDescriptorCounts() {
        assertEquals(-1, LibcJni.poll(intArrayOf(), shortArrayOf(), shortArrayOf(), -1, 0))
        assertEquals(-1, LibcJni.poll(intArrayOf(-1), shortArrayOf(), shortArrayOf(4), 1, 0))
        assertEquals(-1, LibcJni.poll(intArrayOf(-1), shortArrayOf(0), shortArrayOf(), 1, 0))
        assertEquals(-1, LibcJni.poll(intArrayOf(), shortArrayOf(0), shortArrayOf(4), 1, 0))
    }

    @Test
    fun ignoredDescriptorHonorsTimeout() {
        val start = TimeSource.Monotonic.markNow()
        val fd = Pollfd(-1, LibcJni.pollConstants()[0], 4)
        assertEquals(0, poll(fd, 1u, 30))
        assertTrue(start.elapsedNow() >= 20.milliseconds)
        assertEquals(0.toShort(), fd.revents)
    }

    @Test
    fun emptyPollHonorsTimeout() {
        val start = TimeSource.Monotonic.markNow()
        assertEquals(0, poll(null, 0u, 30))
        assertTrue(start.elapsedNow() >= 20.milliseconds)
    }

    private fun sendDatagram(socket: Int, payload: ByteArray) {
        val address = ByteArray(128)
        val length = intArrayOf(address.size)
        assertEquals(0, LibcJni.getsockname(socket, address, length))
        assertEquals(payload.size.toLong(), LibcJni.sendto(socket, payload, 0, payload.size, 0, address, length[0]))
    }
}
