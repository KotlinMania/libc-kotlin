// port-lint: source library/core/src/time.rs
package io.github.kotlinmania.libc.time

/** A nonnegative span of whole seconds and fractional nanoseconds. */
class StdDuration private constructor(
    private val seconds: ULong,
    private val nanoseconds: UInt,
) : Comparable<StdDuration> {
    fun isZero(): Boolean = seconds == 0uL && nanoseconds == 0u

    fun asSecs(): ULong = seconds

    fun subsecMillis(): UInt = nanoseconds / 1_000_000u

    fun subsecMicros(): UInt = nanoseconds / 1_000u

    fun subsecNanos(): UInt = nanoseconds

    fun checkedAdd(other: StdDuration): StdDuration? {
        if (seconds > ULong.MAX_VALUE - other.seconds) return null
        var secs = seconds + other.seconds
        var nanos = nanoseconds + other.nanoseconds
        if (nanos >= NANOS_PER_SECOND) {
            nanos -= NANOS_PER_SECOND
            if (secs == ULong.MAX_VALUE) return null
            secs += 1u
        }
        return StdDuration(secs, nanos)
    }

    fun saturatingAdd(other: StdDuration): StdDuration = checkedAdd(other) ?: MAX

    fun checkedSub(other: StdDuration): StdDuration? {
        if (seconds < other.seconds) return null
        var secs = seconds - other.seconds
        val nanos =
            if (nanoseconds >= other.nanoseconds) {
                nanoseconds - other.nanoseconds
            } else {
                if (secs == 0uL) return null
                secs -= 1u
                nanoseconds + NANOS_PER_SECOND - other.nanoseconds
            }
        return StdDuration(secs, nanos)
    }

    fun saturatingSub(other: StdDuration): StdDuration = checkedSub(other) ?: ZERO

    fun checkedMul(factor: UInt): StdDuration? {
        val totalNanos = nanoseconds.toULong() * factor.toULong()
        val extraSecs = totalNanos / NANOS_PER_SECOND
        val nanos = (totalNanos % NANOS_PER_SECOND).toUInt()
        if (factor != 0u && seconds > ULong.MAX_VALUE / factor) return null
        val secs = seconds * factor
        if (secs > ULong.MAX_VALUE - extraSecs) return null
        return StdDuration(secs + extraSecs, nanos)
    }

    fun saturatingMul(factor: UInt): StdDuration = checkedMul(factor) ?: MAX

    fun checkedDiv(divisor: UInt): StdDuration? {
        if (divisor == 0u) return null
        val secs = seconds / divisor
        val extraSecs = seconds % divisor
        var nanos = nanoseconds / divisor
        val extraNanos = nanoseconds % divisor
        nanos += ((extraSecs * NANOS_PER_SECOND + extraNanos) / divisor).toUInt()
        return StdDuration(secs, nanos)
    }

    fun absDiff(other: StdDuration): StdDuration =
        checkedSub(other) ?: requireNotNull(other.checkedSub(this))

    fun asSecsF64(): Double = seconds.toDouble() + nanoseconds.toDouble() / NANOS_PER_SECOND.toDouble()

    fun asSecsF32(): Float = seconds.toFloat() + nanoseconds.toFloat() / NANOS_PER_SECOND.toFloat()

    operator fun plus(other: StdDuration): StdDuration =
        checkedAdd(other) ?: throw ArithmeticException("Overflow when adding durations")

    operator fun minus(other: StdDuration): StdDuration =
        checkedSub(other) ?: throw ArithmeticException("Overflow when subtracting durations")

    operator fun times(factor: UInt): StdDuration =
        checkedMul(factor) ?: throw ArithmeticException("Overflow when multiplying duration")

    operator fun div(divisor: UInt): StdDuration =
        checkedDiv(divisor) ?: throw ArithmeticException("Cannot divide duration by zero")

    override fun compareTo(other: StdDuration): Int {
        val result = seconds.compareTo(other.seconds)
        return if (result == 0) nanoseconds.compareTo(other.nanoseconds) else result
    }

    override fun equals(other: Any?): Boolean =
        other is StdDuration && seconds == other.seconds && nanoseconds == other.nanoseconds

    override fun hashCode(): Int = 31 * seconds.hashCode() + nanoseconds.hashCode()

    companion object {
        private const val NANOS_PER_SECOND = 1_000_000_000u

        val ZERO: StdDuration = StdDuration(0u, 0u)

        val MAX: StdDuration = StdDuration(ULong.MAX_VALUE, NANOS_PER_SECOND - 1u)

        /** Carries excess nanoseconds into seconds, checking for overflow. */
        fun new(seconds: ULong, nanoseconds: UInt): StdDuration {
            val carry = (nanoseconds / NANOS_PER_SECOND).toULong()
            if (seconds > ULong.MAX_VALUE - carry) throw ArithmeticException("Duration seconds overflow")
            return StdDuration(seconds + carry, nanoseconds % NANOS_PER_SECOND)
        }

        fun fromSecs(seconds: ULong): StdDuration = StdDuration(seconds, 0u)

        fun fromMillis(milliseconds: ULong): StdDuration =
            StdDuration(milliseconds / 1_000u, (milliseconds % 1_000u).toUInt() * 1_000_000u)

        fun fromMicros(microseconds: ULong): StdDuration =
            StdDuration(microseconds / 1_000_000u, (microseconds % 1_000_000u).toUInt() * 1_000u)

        fun fromNanos(nanoseconds: ULong): StdDuration =
            StdDuration(nanoseconds / NANOS_PER_SECOND, (nanoseconds % NANOS_PER_SECOND).toUInt())
    }
}
