// port-lint: tests library/core/src/time.rs
package io.github.kotlinmania.libc.time

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull
import kotlin.test.assertTrue

class StdDurationTest {
    @Test
    fun constructorsPreserveSecondsAndSubseconds() {
        val five = StdDuration.fromSecs(5u)
        assertEquals(five, StdDuration.fromMillis(5_000u))
        assertEquals(five, StdDuration.fromMicros(5_000_000u))
        assertEquals(five, StdDuration.fromNanos(5_000_000_000u))
        val value = StdDuration.new(5u, 730_023_852u)
        assertEquals(5uL, value.asSecs())
        assertEquals(730u, value.subsecMillis())
        assertEquals(730_023u, value.subsecMicros())
        assertEquals(730_023_852u, value.subsecNanos())
    }

    @Test
    fun normalizesNanosecondsAndChecksCarryOverflow() {
        assertEquals(StdDuration.new(9u, 294_967_295u), StdDuration.new(5u, UInt.MAX_VALUE))
        assertFailsWith<ArithmeticException> { StdDuration.new(ULong.MAX_VALUE, 1_000_000_000u) }
        assertEquals(ULong.MAX_VALUE, StdDuration.MAX.asSecs())
        assertEquals(999_999_999u, StdDuration.MAX.subsecNanos())
        assertTrue(StdDuration.ZERO.isZero())
    }

    @Test
    fun checkedAndSaturatingArithmeticPreserveBoundaries() {
        val oneNano = StdDuration.fromNanos(1u)
        assertNull(StdDuration.MAX.checkedAdd(oneNano))
        assertEquals(StdDuration.MAX, StdDuration.MAX.saturatingAdd(oneNano))
        assertNull(StdDuration.ZERO.checkedSub(oneNano))
        assertEquals(StdDuration.ZERO, StdDuration.ZERO.saturatingSub(oneNano))
        assertEquals(StdDuration.new(0u, 999_999_999u), StdDuration.fromSecs(1u) - oneNano)
        assertEquals(StdDuration.fromSecs(1u), StdDuration.new(0u, 999_999_999u) + oneNano)
        assertEquals(StdDuration.new(9u, 600_000_000u), StdDuration.new(100u, 400_000_000u).absDiff(StdDuration.fromSecs(110u)))
    }

    @Test
    fun checkedMultiplicationAndDivisionMatchIntegerRounding() {
        assertEquals(StdDuration.new(1u, 2u), StdDuration.new(0u, 500_000_001u).checkedMul(2u))
        assertNull(StdDuration.fromSecs(ULong.MAX_VALUE - 1u).checkedMul(2u))
        assertEquals(StdDuration.MAX, StdDuration.MAX.saturatingMul(2u))
        assertEquals(StdDuration.fromMillis(500u), StdDuration.fromSecs(1u).checkedDiv(2u))
        assertEquals(StdDuration.fromNanos(333_333_333u), StdDuration.fromSecs(1u).checkedDiv(3u))
        assertNull(StdDuration.fromSecs(2u).checkedDiv(0u))
    }

    @Test
    fun retainsUnsignedRangeBeyondSignedAndFloatingPointPrecision() {
        val seconds = Long.MAX_VALUE.toULong() + 42u
        val value = StdDuration.new(seconds, 1u)
        assertEquals(seconds, value.asSecs())
        assertTrue(value > StdDuration.fromSecs(Long.MAX_VALUE.toULong()))
        assertEquals(1u, value.subsecNanos())
        assertEquals(value, value.checkedMul(1u))
        assertEquals(value, value.checkedDiv(1u))
    }
}
