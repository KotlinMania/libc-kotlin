package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.poll
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.TimeSource

class PollTest {
    @Test
    fun copiesReadinessBackToCaller() {
        val fd = Pollfd(Int.MAX_VALUE, 1, 4)
        assertEquals(1, poll(fd, 1u, 0))
        assertEquals(32.toShort(), fd.revents)
        val ignored = Pollfd(-1, 1, 4)
        assertEquals(0, poll(ignored, 1u, 0))
        assertEquals(0.toShort(), ignored.revents)
    }

    @Test
    fun emptyPollHonorsTimeout() {
        val start = TimeSource.Monotonic.markNow()
        assertEquals(0, poll(null, 0u, 30))
        assertTrue(start.elapsedNow() >= 20.milliseconds)
    }
}
