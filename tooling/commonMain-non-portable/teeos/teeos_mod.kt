// port-lint: source teeos/teeos_mod.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

// Libc bindings for teeos
//
// Apparently the loader just dynamically links it anyway, but fails
// when linking is explicitly requested.

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public class U128(
    public val high: ULong = 0uL,
    public val low: ULong = 0uL,
) : Comparable<U128> {
    public infix fun shr(bitCount: Int): U128 {
        val n = bitCount and 127
        return when {
            n == 0 -> this
            n < 64 -> U128(high shr n, (low shr n) or (high shl (64 - n)))
            else -> U128(0uL, high shr (n - 64))
        }
    }

    public infix fun shl(bitCount: Int): U128 {
        val n = bitCount and 127
        return when {
            n == 0 -> this
            n < 64 -> U128((high shl n) or (low shr (64 - n)), low shl n)
            else -> U128(low shl (n - 64), 0uL)
        }
    }

    public infix fun and(other: U128): U128 = U128(high and other.high, low and other.low)
    public infix fun and(mask: ULong): U128 = U128(0uL, low and mask)
    public infix fun and(mask: UInt): U128 = U128(0uL, low and mask.toULong())
    public infix fun and(mask: Long): U128 = and(fromLong(mask))
    public infix fun and(mask: Int): U128 = and(fromLong(mask.toLong()))

    public infix fun or(other: U128): U128 = U128(high or other.high, low or other.low)
    public infix fun or(mask: ULong): U128 = U128(high, low or mask)
    public infix fun or(mask: UInt): U128 = U128(high, low or mask.toULong())
    public infix fun or(mask: Long): U128 = or(fromLong(mask))
    public infix fun or(mask: Int): U128 = or(fromLong(mask.toLong()))

    public infix fun xor(other: U128): U128 = U128(high xor other.high, low xor other.low)
    public infix fun xor(mask: ULong): U128 = U128(high, low xor mask)
    public infix fun xor(mask: UInt): U128 = U128(high, low xor mask.toULong())
    public infix fun xor(mask: Long): U128 = xor(fromLong(mask))
    public infix fun xor(mask: Int): U128 = xor(fromLong(mask.toLong()))

    public fun inv(): U128 = U128(high.inv(), low.inv())

    public operator fun plus(other: U128): U128 {
        val newLow = low + other.low
        val carry = if (newLow < low) 1uL else 0uL
        return U128(high + other.high + carry, newLow)
    }

    public operator fun minus(other: U128): U128 {
        val borrow = if (low < other.low) 1uL else 0uL
        return U128(high - other.high - borrow, low - other.low)
    }

    public operator fun times(other: U128): U128 {
        val a0 = low and 0xFFFF_FFFFuL
        val a1 = low shr 32
        val a2 = high and 0xFFFF_FFFFuL
        val a3 = high shr 32
        val b0 = other.low and 0xFFFF_FFFFuL
        val b1 = other.low shr 32
        val b2 = other.high and 0xFFFF_FFFFuL
        val b3 = other.high shr 32

        val p00 = a0 * b0
        val r0 = p00 and 0xFFFF_FFFFuL
        var c = p00 shr 32

        val s1 = a0 * b1 + c
        val t1 = a1 * b0
        val u1 = (s1 and 0xFFFF_FFFFuL) + (t1 and 0xFFFF_FFFFuL)
        val r1 = u1 and 0xFFFF_FFFFuL
        c = (s1 shr 32) + (t1 shr 32) + (u1 shr 32)

        val m20 = a0 * b2
        val m11 = a1 * b1
        val m02 = a2 * b0
        val u2 = (m20 and 0xFFFF_FFFFuL) + (m11 and 0xFFFF_FFFFuL) + (m02 and 0xFFFF_FFFFuL) + (c and 0xFFFF_FFFFuL)
        val r2 = u2 and 0xFFFF_FFFFuL
        c = (m20 shr 32) + (m11 shr 32) + (m02 shr 32) + (c shr 32) + (u2 shr 32)

        val r3 = (a0 * b3 + a1 * b2 + a2 * b1 + a3 * b0 + c) and 0xFFFF_FFFFuL
        return U128((r3 shl 32) or r2, (r1 shl 32) or r0)
    }

    public operator fun div(other: U128): U128 = divRem(other).first
    public operator fun rem(other: U128): U128 = divRem(other).second

    private fun divRem(divisor: U128): Pair<U128, U128> {
        check(divisor.high != 0uL || divisor.low != 0uL) { "attempt to divide by zero" }
        if (this < divisor) return ZERO to this
        var quotient = ZERO
        var remainder = ZERO
        for (bit in 127 downTo 0) {
            remainder = remainder shl 1
            val bitVal =
                if (bit >= 64) {
                    (high shr (bit - 64)) and 1uL
                } else {
                    (low shr bit) and 1uL
                }
            if (bitVal != 0uL) {
                remainder = U128(remainder.high, remainder.low or 1uL)
            }
            if (remainder >= divisor) {
                remainder -= divisor
                quotient =
                    if (bit >= 64) {
                        U128(quotient.high or (1uL shl (bit - 64)), quotient.low)
                    } else {
                        U128(quotient.high, quotient.low or (1uL shl bit))
                    }
            }
        }
        return quotient to remainder
    }

    public fun toByte(): Byte = low.toByte()
    public fun toUByte(): UByte = low.toUByte()
    public fun toShort(): Short = low.toShort()
    public fun toUShort(): UShort = low.toUShort()
    public fun toInt(): Int = low.toInt()
    public fun toUInt(): UInt = low.toUInt()
    public fun toLong(): Long = low.toLong()
    public fun toULong(): ULong = low
    public fun toFloat(): Float = high.toDouble().toFloat() * 18446744073709551616.0f + low.toDouble().toFloat()
    public fun toDouble(): Double = high.toDouble() * 18446744073709551616.0 + low.toDouble()
    public fun toU128(): U128 = this
    public fun toI128(): I128 = I128(high.toLong(), low)

    public fun toBeBytes(): UByteArray =
        ubyteArrayOf(
            (high shr 56).toUByte(),
            (high shr 48).toUByte(),
            (high shr 40).toUByte(),
            (high shr 32).toUByte(),
            (high shr 24).toUByte(),
            (high shr 16).toUByte(),
            (high shr 8).toUByte(),
            high.toUByte(),
            (low shr 56).toUByte(),
            (low shr 48).toUByte(),
            (low shr 40).toUByte(),
            (low shr 32).toUByte(),
            (low shr 24).toUByte(),
            (low shr 16).toUByte(),
            (low shr 8).toUByte(),
            low.toUByte(),
        )

    public fun toLeBytes(): UByteArray =
        ubyteArrayOf(
            low.toUByte(),
            (low shr 8).toUByte(),
            (low shr 16).toUByte(),
            (low shr 24).toUByte(),
            (low shr 32).toUByte(),
            (low shr 40).toUByte(),
            (low shr 48).toUByte(),
            (low shr 56).toUByte(),
            high.toUByte(),
            (high shr 8).toUByte(),
            (high shr 16).toUByte(),
            (high shr 24).toUByte(),
            (high shr 32).toUByte(),
            (high shr 40).toUByte(),
            (high shr 48).toUByte(),
            (high shr 56).toUByte(),
        )

    public fun toNeBytes(): UByteArray = toLeBytes()

    override fun compareTo(other: U128): Int {
        val hc = high.compareTo(other.high)
        return if (hc != 0) hc else low.compareTo(other.low)
    }

    override fun equals(other: Any?): Boolean =
        other is U128 && high == other.high && low == other.low

    override fun hashCode(): Int = 31 * high.hashCode() + low.hashCode()

    override fun toString(): String {
        if (high == 0uL) return low.toString()
        val ten = U128(0uL, 10uL)
        val sb = StringBuilder()
        var cur = this
        while (cur.high != 0uL || cur.low != 0uL) {
            val (q, r) = cur.divRem(ten)
            sb.append(('0'.code + r.low.toInt()).toChar())
            cur = q
        }
        return sb.reverse().toString()
    }

    public companion object {
        public val ZERO: U128 = U128(0uL, 0uL)
        public val ONE: U128 = U128(0uL, 1uL)
        public val MIN: U128 = ZERO
        public val MAX: U128 = U128(ULong.MAX_VALUE, ULong.MAX_VALUE)
        public val MIN_VALUE: U128 = MIN
        public val MAX_VALUE: U128 = MAX

        public fun fromULong(v: ULong): U128 = U128(0uL, v)
        public fun fromUInt(v: UInt): U128 = U128(0uL, v.toULong())
        public fun fromUShort(v: UShort): U128 = U128(0uL, v.toULong())
        public fun fromUByte(v: UByte): U128 = U128(0uL, v.toULong())
        public fun fromLong(v: Long): U128 = U128(if (v < 0L) ULong.MAX_VALUE else 0uL, v.toULong())
        public fun fromInt(v: Int): U128 = fromLong(v.toLong())
        public fun fromShort(v: Short): U128 = fromLong(v.toLong())
        public fun fromByte(v: Byte): U128 = fromLong(v.toLong())

        public fun fromBeBytes(bytes: UByteArray): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 0 until 8) hi = (hi shl 8) or bytes[i].toULong()
            for (i in 8 until 16) lo = (lo shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }

        public fun fromBeBytes(bytes: List<UByte>): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 0 until 8) hi = (hi shl 8) or bytes[i].toULong()
            for (i in 8 until 16) lo = (lo shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }

        public fun fromLeBytes(bytes: UByteArray): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 7 downTo 0) lo = (lo shl 8) or bytes[i].toULong()
            for (i in 15 downTo 8) hi = (hi shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }

        public fun fromLeBytes(bytes: List<UByte>): U128 {
            var hi = 0uL
            var lo = 0uL
            for (i in 7 downTo 0) lo = (lo shl 8) or bytes[i].toULong()
            for (i in 15 downTo 8) hi = (hi shl 8) or bytes[i].toULong()
            return U128(hi, lo)
        }
    }
}

public class I128(
    public val high: Long = 0L,
    public val low: ULong = 0uL,
) : Comparable<I128> {
    public infix fun shr(bitCount: Int): I128 {
        val n = bitCount and 127
        return when {
            n == 0 -> this
            n < 64 -> I128(high shr n, (low shr n) or (high.toULong() shl (64 - n)))
            else -> {
                val signFill = if (high < 0L) -1L else 0L
                I128(signFill, (high shr (n - 64)).toULong())
            }
        }
    }

    public infix fun shl(bitCount: Int): I128 {
        val u = U128(high.toULong(), low) shl bitCount
        return I128(u.high.toLong(), u.low)
    }

    public infix fun and(other: I128): I128 = I128(high and other.high, low and other.low)
    public infix fun and(mask: Long): I128 = and(fromLong(mask))
    public infix fun and(mask: Int): I128 = and(fromLong(mask.toLong()))
    public infix fun and(mask: ULong): I128 = I128(0L, low and mask)
    public infix fun and(mask: UInt): I128 = I128(0L, low and mask.toULong())

    public infix fun or(other: I128): I128 = I128(high or other.high, low or other.low)
    public infix fun or(mask: Long): I128 = or(fromLong(mask))
    public infix fun or(mask: Int): I128 = or(fromLong(mask.toLong()))
    public infix fun or(mask: ULong): I128 = I128(high, low or mask)
    public infix fun or(mask: UInt): I128 = I128(high, low or mask.toULong())

    public infix fun xor(other: I128): I128 = I128(high xor other.high, low xor other.low)
    public infix fun xor(mask: Long): I128 = xor(fromLong(mask))
    public infix fun xor(mask: Int): I128 = xor(fromLong(mask.toLong()))
    public infix fun xor(mask: ULong): I128 = I128(high, low xor mask)
    public infix fun xor(mask: UInt): I128 = I128(high, low xor mask.toULong())

    public fun inv(): I128 = I128(high.inv(), low.inv())

    public operator fun unaryMinus(): I128 {
        val invLow = low.inv() + 1uL
        val carry = if (invLow == 0uL) 1L else 0L
        return I128(high.inv() + carry, invLow)
    }

    public operator fun plus(other: I128): I128 {
        val u = U128(high.toULong(), low) + U128(other.high.toULong(), other.low)
        return I128(u.high.toLong(), u.low)
    }

    public operator fun minus(other: I128): I128 {
        val u = U128(high.toULong(), low) - U128(other.high.toULong(), other.low)
        return I128(u.high.toLong(), u.low)
    }

    public operator fun times(other: I128): I128 {
        val u = U128(high.toULong(), low) * U128(other.high.toULong(), other.low)
        return I128(u.high.toLong(), u.low)
    }

    public operator fun div(other: I128): I128 {
        val negA = high < 0L
        val negB = other.high < 0L
        val absA = if (negA) -this else this
        val absB = if (negB) -other else other
        val q = U128(absA.high.toULong(), absA.low) / U128(absB.high.toULong(), absB.low)
        val signedQ = I128(q.high.toLong(), q.low)
        return if (negA != negB) -signedQ else signedQ
    }

    public operator fun rem(other: I128): I128 {
        val negA = high < 0L
        val negB = other.high < 0L
        val absA = if (negA) -this else this
        val absB = if (negB) -other else other
        val r = U128(absA.high.toULong(), absA.low) % U128(absB.high.toULong(), absB.low)
        val signedR = I128(r.high.toLong(), r.low)
        return if (negA) -signedR else signedR
    }

    public fun toByte(): Byte = low.toByte()
    public fun toUByte(): UByte = low.toUByte()
    public fun toShort(): Short = low.toShort()
    public fun toUShort(): UShort = low.toUShort()
    public fun toInt(): Int = low.toInt()
    public fun toUInt(): UInt = low.toUInt()
    public fun toLong(): Long = low.toLong()
    public fun toULong(): ULong = low
    public fun toFloat(): Float = toDouble().toFloat()
    public fun toDouble(): Double =
        if (high < 0L) {
            val mag = -this
            -(U128(mag.high.toULong(), mag.low).toDouble())
        } else {
            U128(high.toULong(), low).toDouble()
        }
    public fun toU128(): U128 = U128(high.toULong(), low)
    public fun toI128(): I128 = this

    public fun toBeBytes(): UByteArray = U128(high.toULong(), low).toBeBytes()
    public fun toLeBytes(): UByteArray = U128(high.toULong(), low).toLeBytes()
    public fun toNeBytes(): UByteArray = U128(high.toULong(), low).toNeBytes()

    override fun compareTo(other: I128): Int {
        val hc = high.compareTo(other.high)
        return if (hc != 0) hc else low.compareTo(other.low)
    }

    override fun equals(other: Any?): Boolean =
        other is I128 && high == other.high && low == other.low

    override fun hashCode(): Int = 31 * high.hashCode() + low.hashCode()

    override fun toString(): String {
        if (high >= 0L) return U128(high.toULong(), low).toString()
        val mag = -this
        return "-${U128(mag.high.toULong(), mag.low)}"
    }

    public companion object {
        public val ZERO: I128 = I128(0L, 0uL)
        public val ONE: I128 = I128(0L, 1uL)
        public val MIN: I128 = I128(Long.MIN_VALUE, 0uL)
        public val MAX: I128 = I128(Long.MAX_VALUE, ULong.MAX_VALUE)
        public val MIN_VALUE: I128 = MIN
        public val MAX_VALUE: I128 = MAX

        public fun fromLong(v: Long): I128 = I128(if (v < 0L) -1L else 0L, v.toULong())
        public fun fromInt(v: Int): I128 = fromLong(v.toLong())
        public fun fromShort(v: Short): I128 = fromLong(v.toLong())
        public fun fromByte(v: Byte): I128 = fromLong(v.toLong())
        public fun fromULong(v: ULong): I128 = I128(0L, v)
        public fun fromUInt(v: UInt): I128 = I128(0L, v.toULong())
        public fun fromUShort(v: UShort): I128 = I128(0L, v.toULong())
        public fun fromUByte(v: UByte): I128 = I128(0L, v.toULong())

        public fun fromBeBytes(bytes: UByteArray): I128 = U128.fromBeBytes(bytes).toI128()
        public fun fromBeBytes(bytes: List<UByte>): I128 = U128.fromBeBytes(bytes).toI128()
        public fun fromLeBytes(bytes: UByteArray): I128 = U128.fromLeBytes(bytes).toI128()
        public fun fromLeBytes(bytes: List<UByte>): I128 = U128.fromLeBytes(bytes).toI128()
    }
}

public typealias CBool = Int

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias PidT = CInt

public typealias WcharT = UInt

// long double in C means A float point value, which has 128bit length.
// but some bit maybe not used, so the real length of long double could be 80(x86) or 128(power pc/IEEE)
// this is different from f128(not stable and not included default) in Rust, so we use u128 for FFI(Rust to C).
// this is unstable and will cause to memfault/data abort.
public typealias CLongdouble = ClongDouble

public typealias PthreadT = CUlong

public typealias PthreadKeyT = CUint

public typealias PthreadSpinlockT = CInt

public typealias OffT = Long

public typealias TimeT = CLong

public typealias ClockT = CLong

public typealias ClockidT = CInt

public typealias SusecondsT = CLong

public fun interface OnceFn {
    public operator fun invoke()
}

public typealias PthreadOnceT = CInt

public typealias VaList = COpaquePointer?

public typealias WintT = CUint

public typealias WctypeT = CUlong

public fun interface Cmpfunc {
    public operator fun invoke(x: COpaquePointer?, y: COpaquePointer?): CInt
}

public open class ClongDouble(public var value: U128) {
    public var field0: U128
        get() = value
        set(v) { value = v }
}

public open class PthreadCondT(public var size: List<UByte>)

public open class PthreadMutexT(public var size: List<UByte>)

public open class PthreadMutexattrT(public var size: List<UByte>)

public open class PthreadCondattrT(public var size: List<UByte>)

public open class PthreadAttrT(public var size: List<ULong>)

public open class CpuSetT(public var bits: List<CUlong>)

public open class Timespec(public var tvSec: TimeT, public var tvNsec: CLong)

public open class Timeval(public var tvSec: TimeT, public var tvUsec: SusecondsT)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

public open class MbstateT(public var opaque1: CUint, public var opaque2: CUint)

public open class SemT(public var value: List<CInt>)

public open class DivT(public var quot: CInt, public var rem: CInt)

// fcntl
public val O_CREAT: UInt = 64u

public val O_EXCL: UInt = 128u

public val O_NOCTTY: UInt = 256u

public val O_TRUNC: UInt = 512u

public val O_APPEND: UInt = 1024u

public val O_NONBLOCK: UInt = 2048u

public val O_DSYNC: UInt = 4096u

public val O_SYNC: UInt = 1052672u

public val O_RSYNC: UInt = 1052672u

public val O_DIRECTORY: UInt = 65536u

public val O_NOFOLLOW: UInt = 131072u

public val O_CLOEXEC: UInt = 524288u

public val O_ASYNC: UInt = 8192u

public val O_DIRECT: UInt = 16384u

public val O_LARGEFILE: UInt = 32768u

public val O_NOATIME: UInt = 262144u

public val O_PATH: UInt = 2097152u

public val O_TMPFILE: UInt = 4259840u

public val O_NDELAY: UInt = O_NONBLOCK

public val F_DUPFD: UInt = 0u

public val F_GETFD: UInt = 1u

public val F_SETFD: UInt = 2u

public val F_GETFL: UInt = 3u

public val F_SETFL: UInt = 4u

public val F_SETOWN: UInt = 8u

public val F_GETOWN: UInt = 9u

public val F_SETSIG: UInt = 10u

public val F_GETSIG: UInt = 11u

public val F_GETLK: UInt = 12u

public val F_SETLK: UInt = 13u

public val F_SETLKW: UInt = 14u

public val F_SETOWN_EX: UInt = 15u

public val F_GETOWN_EX: UInt = 16u

public val F_GETOWNER_UIDS: UInt = 17u

// mman
public val MAP_FAILED: ULong = 0xffffffffffffffffuL

public val MAP_FIXED_NOREPLACE: UInt = 0x100000u

public val MAP_SHARED_VALIDATE: UInt = 0x03u

public val MAP_SHARED: UInt = 0x01u

public val MAP_PRIVATE: UInt = 0x02u

public val MAP_TYPE: UInt = 0x0fu

public val MAP_FIXED: UInt = 0x10u

public val MAP_ANON: UInt = 0x20u

public val MAP_ANONYMOUS: UInt = MAP_ANON

public val MAP_NORESERVE: UInt = 0x4000u

public val MAP_GROWSDOWN: UInt = 0x0100u

public val MAP_DENYWRITE: UInt = 0x0800u

public val MAP_EXECUTABLE: UInt = 0x1000u

public val MAP_LOCKED: UInt = 0x2000u

public val MAP_POPULATE: UInt = 0x8000u

public val MAP_NONBLOCK: UInt = 0x10000u

public val MAP_STACK: UInt = 0x20000u

public val MAP_HUGETLB: UInt = 0x40000u

public val MAP_SYNC: UInt = 0x80000u

public val MAP_FILE: UInt = 0u

public val MAP_HUGE_SHIFT: UInt = 26u

public val MAP_HUGE_MASK: UInt = 0x3fu

public val MAP_HUGE_16KB: UInt = 14u shl 26

public val MAP_HUGE_64KB: UInt = 16u shl 26

public val MAP_HUGE_512KB: UInt = 19u shl 26

public val MAP_HUGE_1MB: UInt = 20u shl 26

public val MAP_HUGE_2MB: UInt = 21u shl 26

public val MAP_HUGE_8MB: UInt = 23u shl 26

public val MAP_HUGE_16MB: UInt = 24u shl 26

public val MAP_HUGE_32MB: UInt = 25u shl 26

public val MAP_HUGE_256MB: UInt = 28u shl 26

public val MAP_HUGE_512MB: UInt = 29u shl 26

public val MAP_HUGE_1GB: UInt = 30u shl 26

public val MAP_HUGE_2GB: UInt = 31u shl 26

public val MAP_HUGE_16GB: UInt = 34u shl 26

public val PROT_NONE: UInt = 0u

public val PROT_READ: UInt = 1u

public val PROT_WRITE: UInt = 2u

public val PROT_EXEC: UInt = 4u

public val PROT_GROWSDOWN: UInt = 0x01000000u

public val PROT_GROWSUP: UInt = 0x02000000u

public val MS_ASYNC: UInt = 1u

public val MS_INVALIDATE: UInt = 2u

public val MS_SYNC: UInt = 4u

public val MCL_CURRENT: UInt = 1u

public val MCL_FUTURE: UInt = 2u

public val MCL_ONFAULT: UInt = 4u

public val POSIX_MADV_NORMAL: UInt = 0u

public val POSIX_MADV_RANDOM: UInt = 1u

public val POSIX_MADV_SEQUENTIAL: UInt = 2u

public val POSIX_MADV_WILLNEED: UInt = 3u

public val POSIX_MADV_DONTNEED: UInt = 4u

// wctype
public val WCTYPE_ALNUM: ULong = 1uL

public val WCTYPE_ALPHA: ULong = 2uL

public val WCTYPE_BLANK: ULong = 3uL

public val WCTYPE_CNTRL: ULong = 4uL

public val WCTYPE_DIGIT: ULong = 5uL

public val WCTYPE_GRAPH: ULong = 6uL

public val WCTYPE_LOWER: ULong = 7uL

public val WCTYPE_PRINT: ULong = 8uL

public val WCTYPE_PUNCT: ULong = 9uL

public val WCTYPE_SPACE: ULong = 10uL

public val WCTYPE_UPPER: ULong = 11uL

public val WCTYPE_XDIGIT: ULong = 12uL

// locale
public val LC_CTYPE: Int = 0

public val LC_NUMERIC: Int = 1

public val LC_TIME: Int = 2

public val LC_COLLATE: Int = 3

public val LC_MONETARY: Int = 4

public val LC_MESSAGES: Int = 5

public val LC_ALL: Int = 6

// pthread
public val SIZEOF_PTHREAD_COND_T: Int = 48

public val SIZEOF_PTHREAD_MUTEX_T: Int = 40

public val SIZEOF_PTHREAD_MUTEXATTR_T: Int = 4

public val SIZEOF_PTHREAD_CONDATTR_T: Int = 4

// errno.h
public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val EDEADLK: CInt = 35

public val ENAMETOOLONG: CInt = 36

public val ENOLCK: CInt = 37

public val ENOSYS: CInt = 38

public val ENOTEMPTY: CInt = 39

public val ELOOP: CInt = 40

public val EWOULDBLOCK: CInt = EAGAIN

public val ENOMSG: CInt = 42

public val EIDRM: CInt = 43

public val ECHRNG: CInt = 44

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELNRNG: CInt = 48

public val EUNATCH: CInt = 49

public val ENOCSI: CInt = 50

public val EL2HLT: CInt = 51

public val EBADE: CInt = 52

public val EBADR: CInt = 53

public val EXFULL: CInt = 54

public val ENOANO: CInt = 55

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val EDEADLOCK: CInt = EDEADLK

public val EBFONT: CInt = 59

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EMULTIHOP: CInt = 72

public val EDOTDOT: CInt = 73

public val EBADMSG: CInt = 74

public val EOVERFLOW: CInt = 75

public val ENOTUNIQ: CInt = 76

public val EBADFD: CInt = 77

public val EREMCHG: CInt = 78

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBSCN: CInt = 81

public val ELIBMAX: CInt = 82

public val ELIBEXEC: CInt = 83

public val EILSEQ: CInt = 84

public val ERESTART: CInt = 85

public val ESTRPIPE: CInt = 86

public val EUSERS: CInt = 87

public val ENOTSOCK: CInt = 88

public val EDESTADDRREQ: CInt = 89

public val EMSGSIZE: CInt = 90

public val EPROTOTYPE: CInt = 91

public val ENOPROTOOPT: CInt = 92

public val EPROTONOSUPPOR: CInt = 93

public val ESOCKTNOSUPPOR: CInt = 94

public val EOPNOTSUPP: CInt = 95

public val ENOTSUP: CInt = EOPNOTSUPP

public val EPFNOSUPPORT: CInt = 96

public val EAFNOSUPPORT: CInt = 97

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val ENETDOWN: CInt = 100

public val ENETUNREACH: CInt = 101

public val ENETRESET: CInt = 102

public val ECONNABORTED: CInt = 103

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EISCONN: CInt = 106

public val ENOTCONN: CInt = 107

public val ESHUTDOWN: CInt = 108

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EALREADY: CInt = 114

public val EINPROGRESS: CInt = 115

public val ESTALE: CInt = 116

public val EUCLEAN: CInt = 117

public val ENOTNAM: CInt = 118

public val ENAVAIL: CInt = 119

public val EISNAM: CInt = 120

public val EREMOTEIO: CInt = 121

public val EDQUOT: CInt = 122

public val ENOMEDIUM: CInt = 123

public val EMEDIUMTYPE: CInt = 124

public val ECANCELED: CInt = 125

public val ENOKEY: CInt = 126

public val EKEYEXPIRED: CInt = 127

public val EKEYREVOKED: CInt = 128

public val EKEYREJECTED: CInt = 129

public val EOWNERDEAD: CInt = 130

public val ENOTRECOVERABLE: CInt = 131

public val ERFKILL: CInt = 132

public val EHWPOISON: CInt = 133

// pthreadAttr.h
public val TEESMP_THREAD_ATTR_CA_WILDCARD: CInt = 0

public val TEESMP_THREAD_ATTR_CA_INHERIT: CInt = -1

public val TEESMP_THREAD_ATTR_TASK_ID_INHERIT: CInt = -1

public val TEESMP_THREAD_ATTR_HAS_SHADOW: CInt = 0x1

public val TEESMP_THREAD_ATTR_NO_SHADOW: CInt = 0x0

// unistd.h
public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_STREAM_MAX: CInt = 5

public val SC_TZNAME_MAX: CInt = 6

public val SC_JOB_CONTROL: CInt = 7

public val SC_SAVED_IDS: CInt = 8

public val SC_REALTIME_SIGNALS: CInt = 9

public val SC_PRIORITY_SCHEDULING: CInt = 10

public val SC_TIMERS: CInt = 11

public val SC_ASYNCHRONOUS_IO: CInt = 12

public val SC_PRIORITIZED_IO: CInt = 13

public val SC_SYNCHRONIZED_IO: CInt = 14

public val SC_FSYNC: CInt = 15

public val SC_MAPPED_FILES: CInt = 16

public val SC_MEMLOCK: CInt = 17

public val SC_MEMLOCK_RANGE: CInt = 18

public val SC_MEMORY_PROTECTION: CInt = 19

public val SC_MESSAGE_PASSING: CInt = 20

public val SC_SEMAPHORES: CInt = 21

public val SC_SHARED_MEMORY_OBJECTS: CInt = 22

public val SC_AIO_LISTIO_MAX: CInt = 23

public val SC_AIO_MAX: CInt = 24

public val SC_AIO_PRIO_DELTA_MAX: CInt = 25

public val SC_DELAYTIMER_MAX: CInt = 26

public val SC_MQ_OPEN_MAX: CInt = 27

public val SC_MQ_PRIO_MAX: CInt = 28

public val SC_VERSION: CInt = 29

public val SC_PAGE_SIZE: CInt = 30

public val SC_PAGESIZE: CInt = 30

// !!
public val SC_RTSIG_MAX: CInt = 31

public val SC_SEM_NSEMS_MAX: CInt = 32

public val SC_SEM_VALUE_MAX: CInt = 33

public val SC_SIGQUEUE_MAX: CInt = 34

public val SC_TIMER_MAX: CInt = 35

public val SC_BC_BASE_MAX: CInt = 36

public val SC_BC_DIM_MAX: CInt = 37

public val SC_BC_SCALE_MAX: CInt = 38

public val SC_BC_STRING_MAX: CInt = 39

public val SC_COLL_WEIGHTS_MAX: CInt = 40

public val SC_EXPR_NEST_MAX: CInt = 42

public val SC_LINE_MAX: CInt = 43

public val SC_RE_DUP_MAX: CInt = 44

public val SC_2_VERSION: CInt = 46

public val SC_2_C_BIND: CInt = 47

public val SC_2_C_DEV: CInt = 48

public val SC_2_FORT_DEV: CInt = 49

public val SC_2_FORT_RUN: CInt = 50

public val SC_2_SW_DEV: CInt = 51

public val SC_2_LOCALEDEF: CInt = 52

public val SC_UIO_MAXIOV: CInt = 60

// !!
public val SC_IOV_MAX: CInt = 60

public val SC_THREADS: CInt = 67

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 68

public val SC_GETGR_R_SIZE_MAX: CInt = 69

public val SC_GETPW_R_SIZE_MAX: CInt = 70

public val SC_LOGIN_NAME_MAX: CInt = 71

public val SC_TTY_NAME_MAX: CInt = 72

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 73

public val SC_THREAD_KEYS_MAX: CInt = 74

public val SC_THREAD_STACK_MIN: CInt = 75

public val SC_THREAD_THREADS_MAX: CInt = 76

public val SC_THREAD_ATTR_STACKADDR: CInt = 77

public val SC_THREAD_ATTR_STACKSIZE: CInt = 78

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 79

public val SC_THREAD_PRIO_INHERIT: CInt = 80

public val SC_THREAD_PRIO_PROTECT: CInt = 81

public val SC_THREAD_PROCESS_SHARED: CInt = 82

public val SC_NPROCESSORS_CONF: CInt = 83

public val SC_NPROCESSORS_ONLN: CInt = 84

public val SC_PHYS_PAGES: CInt = 85

public val SC_AVPHYS_PAGES: CInt = 86

public val SC_ATEXIT_MAX: CInt = 87

public val SC_PASS_MAX: CInt = 88

public val SC_XOPEN_VERSION: CInt = 89

public val SC_XOPEN_XCU_VERSION: CInt = 90

public val SC_XOPEN_UNIX: CInt = 91

public val SC_XOPEN_CRYPT: CInt = 92

public val SC_XOPEN_ENH_I18N: CInt = 93

public val SC_XOPEN_SHM: CInt = 94

public val SC_2_CHAR_TERM: CInt = 95

public val SC_2_UPE: CInt = 97

public val SC_XOPEN_XPG2: CInt = 98

public val SC_XOPEN_XPG3: CInt = 99

public val SC_XOPEN_XPG4: CInt = 100

public val SC_NZERO: CInt = 109

public val SC_XBS5_ILP32_OFF32: CInt = 125

public val SC_XBS5_ILP32_OFFBIG: CInt = 126

public val SC_XBS5_LP64_OFF64: CInt = 127

public val SC_XBS5_LPBIG_OFFBIG: CInt = 128

public val SC_XOPEN_LEGACY: CInt = 129

public val SC_XOPEN_REALTIME: CInt = 130

public val SC_XOPEN_REALTIME_THREADS: CInt = 131

public val SC_ADVISORY_INFO: CInt = 132

public val SC_BARRIERS: CInt = 133

public val SC_CLOCK_SELECTION: CInt = 137

public val SC_CPUTIME: CInt = 138

public val SC_THREAD_CPUTIME: CInt = 139

public val SC_MONOTONIC_CLOCK: CInt = 149

public val SC_READER_WRITER_LOCKS: CInt = 153

public val SC_SPIN_LOCKS: CInt = 154

public val SC_REGEXP: CInt = 155

public val SC_SHELL: CInt = 157

public val SC_SPAWN: CInt = 159

public val SC_SPORADIC_SERVER: CInt = 160

public val SC_THREAD_SPORADIC_SERVER: CInt = 161

public val SC_TIMEOUTS: CInt = 164

public val SC_TYPED_MEMORY_OBJECTS: CInt = 165

public val SC_2_PBS: CInt = 168

public val SC_2_PBS_ACCOUNTING: CInt = 169

public val SC_2_PBS_LOCATE: CInt = 170

public val SC_2_PBS_MESSAGE: CInt = 171

public val SC_2_PBS_TRACK: CInt = 172

public val SC_SYMLOOP_MAX: CInt = 173

public val SC_STREAMS: CInt = 174

public val SC_2_PBS_CHECKPOINT: CInt = 175

public val SC_V6_ILP32_OFF32: CInt = 176

public val SC_V6_ILP32_OFFBIG: CInt = 177

public val SC_V6_LP64_OFF64: CInt = 178

public val SC_V6_LPBIG_OFFBIG: CInt = 179

public val SC_HOST_NAME_MAX: CInt = 180

public val SC_TRACE: CInt = 181

public val SC_TRACE_EVENT_FILTER: CInt = 182

public val SC_TRACE_INHERIT: CInt = 183

public val SC_TRACE_LOG: CInt = 184

public val SC_IPV6: CInt = 235

public val SC_RAW_SOCKETS: CInt = 236

public val SC_V7_ILP32_OFF32: CInt = 237

public val SC_V7_ILP32_OFFBIG: CInt = 238

public val SC_V7_LP64_OFF64: CInt = 239

public val SC_V7_LPBIG_OFFBIG: CInt = 240

public val SC_SS_REPL_MAX: CInt = 241

public val SC_TRACE_EVENT_NAME_MAX: CInt = 242

public val SC_TRACE_NAME_MAX: CInt = 243

public val SC_TRACE_SYS_MAX: CInt = 244

public val SC_TRACE_USER_EVENT_MAX: CInt = 245

public val SC_XOPEN_STREAMS: CInt = 246

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 247

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 248

// limits.h
public val PTHREAD_KEYS_MAX: CInt = 128

public val PTHREAD_STACK_MIN: CInt = 2048

public val PTHREAD_DESTRUCTOR_ITERATIONS: CInt = 4

public val SEM_VALUE_MAX: CInt = 0x7fffffff

public val SEM_NSEMS_MAX: CInt = 256

public val DELAYTIMER_MAX: CInt = 0x7fffffff

public val MQ_PRIO_MAX: CInt = 32768

public val LOGIN_NAME_MAX: CInt = 256

// time.h
public val CLOCK_REALTIME: ClockidT = 0

public val CLOCK_MONOTONIC: ClockidT = 1

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(size = List(SIZEOF_PTHREAD_MUTEX_T) { 0 })

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(size = List(SIZEOF_PTHREAD_COND_T) { 0 })

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 1

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_MUTEX_STALLED: CInt = 0

public val PTHREAD_MUTEX_ROBUST: CInt = 1

// ---- ALLOC -----------------------------------------------------------------------------
public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun alignedAlloc(align: SizeT, len: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: UInt?, c: WcharT, n: SizeT): UInt?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

// ----- PTHREAD ---------------------------------------------------------------------------
public expect fun pthreadSelf(): PthreadT

public expect fun pthreadJoin(native: PthreadT, value: COpaquePointer?): CInt

// detach or pthreadAttrSetdetachstate must not be called!
// pub fn pthreadDetach(thread: pthreadT) -> cInt;
public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stackSize: SizeT): CInt

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt

public expect fun pthreadAttrSettee(attr: PthreadAttrT?, ca: CInt, taskId: CInt, shadow: CInt): CInt

// C-TA API do not include this interface, but TA can use.
public expect fun schedYield(): CInt

public expect fun pthreadKeyCreate(key: CUint?, dtor: PthreadKeyCreateDtorCallback?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadMutexDestroy(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexInit(lock: PthreadMutexT?, attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexLock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexTrylock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexUnlock(lock: PthreadMutexT?): CInt

public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt

public expect fun pthreadCondBroadcast(cond: PthreadCondT?): CInt

public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt

public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt

public expect fun pthreadCondSignal(cond: PthreadCondT?): CInt

public expect fun pthreadCondWait(cond: PthreadCondT?, lock: PthreadMutexT?): CInt

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt

public expect fun pthreadCreate(native: CUlong?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: CInt?): CInt

public expect fun pthreadSpinLock(lock: CInt?): CInt

public expect fun pthreadSpinTrylock(lock: CInt?): CInt

public expect fun pthreadSpinUnlock(lock: CInt?): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadOnce(pot: CInt?, f: OnceFn?): CInt

public expect fun pthreadEqual(p1: PthreadT, p2: PthreadT): CInt

public expect fun pthreadMutexattrSetprotocol(a: PthreadMutexattrT?, protocol: CInt): CInt

public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stack: COpaquePointer?, size: SizeT): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, size: SizeT, set: CpuSetT?): CInt

// stdio.h
public expect fun printf(fmt: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(fmt: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, fmt: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, fmt: String?, vararg variadicArgs: Long): CInt

public expect fun vsnprintf(s: COpaquePointer?, n: SizeT, fmt: String?, ap: VaList): CInt

public expect fun vsprintf(s: COpaquePointer?, fmt: String?, ap: VaList): CInt

// Not available.
// pub fn pthreadSetnameNp(thread: pthreadT, name: *const cChar) -> cInt;
public expect fun abort(): Nothing

// Not available.
// pub fn prctl(op: cInt, ...) -> cInt;
public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

// sysconf is currently only implemented as a Note.
public expect fun sysconf(name: CInt): CLong

// mman.h
public expect fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): CInt

// errno.h
public expect fun errnoLocation(): CInt?

public expect fun strerror(e: CInt): COpaquePointer?

// time.h
public expect fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt

// unistd
public expect fun getpid(): PidT

// time
public expect fun gettimeofday(tv: Timeval?, tz: COpaquePointer?): CInt

public expect fun strftime(restrict: COpaquePointer?, sz: SizeT, restrict: String?, restrict: Tm?): SizeT

public expect fun time(t: CLong?): TimeT

// sem
public expect fun semClose(sem: SemT?): CInt

public expect fun semDestroy(sem: SemT?): CInt

public expect fun semGetvalue(sem: SemT?, valp: CInt?): CInt

public expect fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt

public expect fun semOpen(name: String?, flags: CInt, vararg variadicArgs: Long): SemT?

public expect fun semPost(sem: SemT?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun semWait(sem: SemT?): CInt

// locale
public expect fun setlocale(cat: CInt, name: String?): COpaquePointer?

public expect fun strcoll(l: String?, r: String?): CInt

public expect fun strxfrm(dest: COpaquePointer?, src: String?, n: SizeT): SizeT

public expect fun strtod(s: String?, p: COpaquePointer?): CDouble

// multibyte
public expect fun mbrtowc(wc: UInt?, src: String?, n: SizeT, st: MbstateT?): SizeT

public expect fun wcrtomb(s: COpaquePointer?, wc: WcharT, st: MbstateT?): SizeT

public expect fun wctob(c: WintT): CInt

// prng
public expect fun srandom(seed: CUint)

public expect fun initstate(seed: CUint, state: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun setstate(state: COpaquePointer?): COpaquePointer?

public expect fun random(): CLong

// string
public expect fun strchr(s: String?, c: CInt): COpaquePointer?

public expect fun strlen(cs: String?): SizeT

public expect fun strcmp(l: String?, r: String?): CInt

public expect fun strcpy(dest: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncmp(l: String?, r: String?, n: SizeT): CInt

public expect fun strncpy(dest: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strnlen(cs: String?, n: SizeT): SizeT

public expect fun strrchr(s: String?, c: CInt): COpaquePointer?

public expect fun strstr(h: String?, n: String?): COpaquePointer?

public expect fun wcschr(s: UInt?, c: WcharT): UInt?

public expect fun wcslen(s: UInt?): SizeT

// ctype
public expect fun isalpha(c: CInt): CInt

public expect fun isascii(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun iswctype(wc: WintT, ttype: WctypeT): CInt

public expect fun iswdigit(wc: WintT): CInt

public expect fun iswlower(wc: WintT): CInt

public expect fun iswspace(wc: WintT): CInt

public expect fun iswupper(wc: WintT): CInt

public expect fun towupper(wc: WintT): WintT

public expect fun towlower(wc: WintT): WintT

// cmath
public expect fun atan(x: CDouble): CDouble

public expect fun ceil(x: CDouble): CDouble

public expect fun ceilf(x: CFloat): CFloat

public expect fun exp(x: CDouble): CDouble

public expect fun fabs(x: CDouble): CDouble

public expect fun floor(x: CDouble): CDouble

public expect fun frexp(x: CDouble, e: CInt?): CDouble

public expect fun log(x: CDouble): CDouble

public expect fun log2(x: CDouble): CDouble

public expect fun pow(x: CDouble, y: CDouble): CDouble

public expect fun roundf(x: CFloat): CFloat

public expect fun scalbn(x: CDouble, n: CInt): CDouble

public expect fun sqrt(x: CDouble): CDouble

// stdlib
public expect fun abs(x: CInt): CInt

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLonglong

public expect fun bsearch(key: COpaquePointer?, base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc): COpaquePointer?

public expect fun div(num: CInt, den: CInt): DivT

public expect fun ecvt(x: CDouble, n: CInt, dp: CInt?, sign: CInt?): COpaquePointer?

public expect fun imaxabs(a: IntmaxT): IntmaxT

public expect fun llabs(a: CLonglong): CLonglong

public expect fun qsort(base: COpaquePointer?, nel: SizeT, width: SizeT, cmp: Cmpfunc)

public expect fun strtoul(s: String?, p: COpaquePointer?, base: CInt): CUlong

public expect fun strtol(s: String?, p: COpaquePointer?, base: CInt): CLong

public expect fun wcstod(s: UInt?, p: COpaquePointer?): CDouble

public fun errno(): CInt {
    return errnoLocation()
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = 8
    for (i in cpuset.bits[0 until (size / sizeOfMask)].iter()) {
        s += i.countOnes()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt {
    return CPU_COUNT_S(sizeOf<CpuSetT>(), cpuset)
}
