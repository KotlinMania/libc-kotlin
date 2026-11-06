// port-lint: source psp.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc

// PSP C type definitions
//
// These type declarations are not enough, as they must be ultimately resolved
// by the linker. Crates that use these definitions must, somewhere in the
// crate graph, include a Note provider crate such as the `psp` crate.

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

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public fun interface SceKernelVTimerHandler {
    public operator fun invoke(uid: SceUid, arg1: SceKernelSysClock?, arg2: SceKernelSysClock?, arg3: COpaquePointer?): UInt
}

public fun interface SceKernelVTimerHandlerWide {
    public operator fun invoke(uid: SceUid, arg1: Long, arg2: Long, arg3: COpaquePointer?): UInt
}

public fun interface SceKernelThreadEventHandler {
    public operator fun invoke(mask: Int, thid: SceUid, common: COpaquePointer?): Int
}

public fun interface SceKernelAlarmHandler {
    public operator fun invoke(common: COpaquePointer?): UInt
}

public fun interface SceKernelCallbackFunction {
    public operator fun invoke(arg1: Int, arg2: Int, arg: COpaquePointer?): Int
}

public fun interface SceKernelThreadEntry {
    public operator fun invoke(args: ULong, argp: COpaquePointer?): Int
}

public fun interface PowerCallback {
    public operator fun invoke(unknown: Int, powerInfo: Int)
}

public typealias IoPermissions = Int

public fun interface UmdCallback {
    public operator fun invoke(unknown: Int, event: Int): Int
}

public fun interface SceMpegRingbufferCbFn {
    public operator fun invoke(data: COpaquePointer?, numPackets: Int, param: COpaquePointer?): Int
}

public typealias SceMpegRingbufferCb = SceMpegRingbufferCbFn?

public fun interface GuCallbackFn {
    public operator fun invoke(id: Int, arg: COpaquePointer?)
}

public typealias GuCallback = GuCallbackFn?

public fun interface GuSwapBuffersCallbackFn {
    public operator fun invoke(display: COpaquePointer?, render: COpaquePointer?)
}

public typealias GuSwapBuffersCallback = GuSwapBuffersCallbackFn?

public fun interface SceNetAdhocctlHandlerFn {
    public operator fun invoke(flag: Int, error: Int, unknown: COpaquePointer?)
}

public typealias SceNetAdhocctlHandler = SceNetAdhocctlHandlerFn?

public fun interface AdhocMatchingCallbackFn {
    public operator fun invoke(matchingId: Int, event: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?)
}

public typealias AdhocMatchingCallback = AdhocMatchingCallbackFn?

public fun interface SceNetApctlHandlerFn {
    public operator fun invoke(oldState: Int, newState: Int, event: Int, error: Int, pArg: COpaquePointer?)
}

public typealias SceNetApctlHandler = SceNetApctlHandlerFn?

public fun interface HttpMallocFunctionFn {
    public operator fun invoke(size: ULong): COpaquePointer?
}

public typealias HttpMallocFunction = HttpMallocFunctionFn?

public fun interface HttpReallocFunctionFn {
    public operator fun invoke(p: COpaquePointer?, size: ULong): COpaquePointer?
}

public typealias HttpReallocFunction = HttpReallocFunctionFn?

public fun interface HttpFreeFunctionFn {
    public operator fun invoke(p: COpaquePointer?)
}

public typealias HttpFreeFunction = HttpFreeFunctionFn?

public fun interface HttpPasswordCBFn {
    public operator fun invoke(request: Int, authType: HttpAuthType, realm: COpaquePointer?, username: COpaquePointer?, password: COpaquePointer?, needEntity: Int, entityBody: COpaquePointer?, entitySize: ULong?, save: Int?): Int
}

public typealias HttpPasswordCB = HttpPasswordCBFn?

public typealias SocklenT = UInt

public sealed class AudioFormat(public val value: UInt) {
    public data object Stereo : AudioFormat(0u)
    public data object Mono : AudioFormat(0x10u)
}

public sealed class DisplayMode(public val value: UInt) {
    public data object Lcd : DisplayMode(0u)
}

public sealed class DisplayPixelFormat(public val value: UInt) {
    public data object Psm5650 : DisplayPixelFormat(0u)
    public data object Psm5551 : DisplayPixelFormat(1u)
    public data object Psm4444 : DisplayPixelFormat(2u)
    public data object Psm8888 : DisplayPixelFormat(3u)
}

public sealed class DisplaySetBufSync(public val value: UInt) {
    public data object Immediate : DisplaySetBufSync(0u)
    public data object NextFrame : DisplaySetBufSync(1u)
}

public sealed class AudioOutputFrequency(public val value: Int) {
    public data object Khz48 : AudioOutputFrequency(48000)
    public data object Khz441 : AudioOutputFrequency(44100)
    public data object Khz32 : AudioOutputFrequency(32000)
    public data object Khz24 : AudioOutputFrequency(24000)
    public data object Khz2205 : AudioOutputFrequency(22050)
    public data object Khz16 : AudioOutputFrequency(16000)
    public data object Khz12 : AudioOutputFrequency(12000)
    public data object Khz11025 : AudioOutputFrequency(11025)
    public data object Khz8 : AudioOutputFrequency(8000)
}

public sealed class AudioInputFrequency(public val value: Int) {
    public data object Khz441 : AudioInputFrequency(44100)
    public data object Khz2205 : AudioInputFrequency(22050)
    public data object Khz11025 : AudioInputFrequency(11025)
}

public sealed class CtrlMode(public val value: UInt) {
    public data object Digital : CtrlMode(0u)
    public data object Analog : CtrlMode(Digital.value + 1u)
}

public sealed class GeMatrixType(public val value: Int) {
    public data object Bone0 : GeMatrixType(0)
    public data object Bone1 : GeMatrixType(Bone0.value + 1)
    public data object Bone2 : GeMatrixType(Bone1.value + 1)
    public data object Bone3 : GeMatrixType(Bone2.value + 1)
    public data object Bone4 : GeMatrixType(Bone3.value + 1)
    public data object Bone5 : GeMatrixType(Bone4.value + 1)
    public data object Bone6 : GeMatrixType(Bone5.value + 1)
    public data object Bone7 : GeMatrixType(Bone6.value + 1)
    public data object World : GeMatrixType(Bone7.value + 1)
    public data object View : GeMatrixType(World.value + 1)
    public data object Projection : GeMatrixType(View.value + 1)
    public data object TexGen : GeMatrixType(Projection.value + 1)
}

public sealed class GeListState(public val value: Int) {
    public data object Done : GeListState(0)
    public data object Queued : GeListState(Done.value + 1)
    public data object DrawingDone : GeListState(Queued.value + 1)
    public data object StallReached : GeListState(DrawingDone.value + 1)
    public data object CancelDone : GeListState(StallReached.value + 1)
}

public sealed class GeCommand(public val value: UByte) {
    public data object Nop : GeCommand(0u)
    public data object Vaddr : GeCommand(0x1u)
    public data object Iaddr : GeCommand(0x2u)
    public data object Prim : GeCommand(0x4u)
    public data object Bezier : GeCommand(0x5u)
    public data object Spline : GeCommand(0x6u)
    public data object BoundingBox : GeCommand(0x7u)
    public data object Jump : GeCommand(0x8u)
    public data object BJump : GeCommand(0x9u)
    public data object Call : GeCommand(0xau)
    public data object Ret : GeCommand(0xbu)
    public data object End : GeCommand(0xcu)
    public data object Signal : GeCommand(0xeu)
    public data object Finish : GeCommand(0xfu)
    public data object Base : GeCommand(0x10u)
    public data object VertexType : GeCommand(0x12u)
    public data object OffsetAddr : GeCommand(0x13u)
    public data object Origin : GeCommand(0x14u)
    public data object Region1 : GeCommand(0x15u)
    public data object Region2 : GeCommand(0x16u)
    public data object LightingEnable : GeCommand(0x17u)
    public data object LightEnable0 : GeCommand(0x18u)
    public data object LightEnable1 : GeCommand(0x19u)
    public data object LightEnable2 : GeCommand(0x1au)
    public data object LightEnable3 : GeCommand(0x1bu)
    public data object DepthClampEnable : GeCommand(0x1cu)
    public data object CullFaceEnable : GeCommand(0x1du)
    public data object TextureMapEnable : GeCommand(0x1eu)
    public data object FogEnable : GeCommand(0x1fu)
    public data object DitherEnable : GeCommand(0x20u)
    public data object AlphaBlendEnable : GeCommand(0x21u)
    public data object AlphaTestEnable : GeCommand(0x22u)
    public data object ZTestEnable : GeCommand(0x23u)
    public data object StencilTestEnable : GeCommand(0x24u)
    public data object AntiAliasEnable : GeCommand(0x25u)
    public data object PatchCullEnable : GeCommand(0x26u)
    public data object ColorTestEnable : GeCommand(0x27u)
    public data object LogicOpEnable : GeCommand(0x28u)
    public data object BoneMatrixNumber : GeCommand(0x2au)
    public data object BoneMatrixData : GeCommand(0x2bu)
    public data object MorphWeight0 : GeCommand(0x2cu)
    public data object MorphWeight1 : GeCommand(0x2du)
    public data object MorphWeight2 : GeCommand(0x2eu)
    public data object MorphWeight3 : GeCommand(0x2fu)
    public data object MorphWeight4 : GeCommand(0x30u)
    public data object MorphWeight5 : GeCommand(0x31u)
    public data object MorphWeight6 : GeCommand(0x32u)
    public data object MorphWeight7 : GeCommand(0x33u)
    public data object PatchDivision : GeCommand(0x36u)
    public data object PatchPrimitive : GeCommand(0x37u)
    public data object PatchFacing : GeCommand(0x38u)
    public data object WorldMatrixNumber : GeCommand(0x3au)
    public data object WorldMatrixData : GeCommand(0x3bu)
    public data object ViewMatrixNumber : GeCommand(0x3cu)
    public data object ViewMatrixData : GeCommand(0x3du)
    public data object ProjMatrixNumber : GeCommand(0x3eu)
    public data object ProjMatrixData : GeCommand(0x3fu)
    public data object TGenMatrixNumber : GeCommand(0x40u)
    public data object TGenMatrixData : GeCommand(0x41u)
    public data object ViewportXScale : GeCommand(0x42u)
    public data object ViewportYScale : GeCommand(0x43u)
    public data object ViewportZScale : GeCommand(0x44u)
    public data object ViewportXCenter : GeCommand(0x45u)
    public data object ViewportYCenter : GeCommand(0x46u)
    public data object ViewportZCenter : GeCommand(0x47u)
    public data object TexScaleU : GeCommand(0x48u)
    public data object TexScaleV : GeCommand(0x49u)
    public data object TexOffsetU : GeCommand(0x4au)
    public data object TexOffsetV : GeCommand(0x4bu)
    public data object OffsetX : GeCommand(0x4cu)
    public data object OffsetY : GeCommand(0x4du)
    public data object ShadeMode : GeCommand(0x50u)
    public data object ReverseNormal : GeCommand(0x51u)
    public data object MaterialUpdate : GeCommand(0x53u)
    public data object MaterialEmissive : GeCommand(0x54u)
    public data object MaterialAmbient : GeCommand(0x55u)
    public data object MaterialDiffuse : GeCommand(0x56u)
    public data object MaterialSpecular : GeCommand(0x57u)
    public data object MaterialAlpha : GeCommand(0x58u)
    public data object MaterialSpecularCoef : GeCommand(0x5bu)
    public data object AmbientColor : GeCommand(0x5cu)
    public data object AmbientAlpha : GeCommand(0x5du)
    public data object LightMode : GeCommand(0x5eu)
    public data object LightType0 : GeCommand(0x5fu)
    public data object LightType1 : GeCommand(0x60u)
    public data object LightType2 : GeCommand(0x61u)
    public data object LightType3 : GeCommand(0x62u)
    public data object Light0X : GeCommand(0x63u)
    public data object Light0Y : GeCommand((Light0X.value + 1u).toUByte())
    public data object Light0Z : GeCommand((Light0Y.value + 1u).toUByte())
    public data object Light1X : GeCommand((Light0Z.value + 1u).toUByte())
    public data object Light1Y : GeCommand((Light1X.value + 1u).toUByte())
    public data object Light1Z : GeCommand((Light1Y.value + 1u).toUByte())
    public data object Light2X : GeCommand((Light1Z.value + 1u).toUByte())
    public data object Light2Y : GeCommand((Light2X.value + 1u).toUByte())
    public data object Light2Z : GeCommand((Light2Y.value + 1u).toUByte())
    public data object Light3X : GeCommand((Light2Z.value + 1u).toUByte())
    public data object Light3Y : GeCommand((Light3X.value + 1u).toUByte())
    public data object Light3Z : GeCommand((Light3Y.value + 1u).toUByte())
    public data object Light0DirectionX : GeCommand(0x6fu)
    public data object Light0DirectionY : GeCommand((Light0DirectionX.value + 1u).toUByte())
    public data object Light0DirectionZ : GeCommand((Light0DirectionY.value + 1u).toUByte())
    public data object Light1DirectionX : GeCommand((Light0DirectionZ.value + 1u).toUByte())
    public data object Light1DirectionY : GeCommand((Light1DirectionX.value + 1u).toUByte())
    public data object Light1DirectionZ : GeCommand((Light1DirectionY.value + 1u).toUByte())
    public data object Light2DirectionX : GeCommand((Light1DirectionZ.value + 1u).toUByte())
    public data object Light2DirectionY : GeCommand((Light2DirectionX.value + 1u).toUByte())
    public data object Light2DirectionZ : GeCommand((Light2DirectionY.value + 1u).toUByte())
    public data object Light3DirectionX : GeCommand((Light2DirectionZ.value + 1u).toUByte())
    public data object Light3DirectionY : GeCommand((Light3DirectionX.value + 1u).toUByte())
    public data object Light3DirectionZ : GeCommand((Light3DirectionY.value + 1u).toUByte())
    public data object Light0ConstantAtten : GeCommand(0x7bu)
    public data object Light0LinearAtten : GeCommand((Light0ConstantAtten.value + 1u).toUByte())
    public data object Light0QuadtraticAtten : GeCommand((Light0LinearAtten.value + 1u).toUByte())
    public data object Light1ConstantAtten : GeCommand((Light0QuadtraticAtten.value + 1u).toUByte())
    public data object Light1LinearAtten : GeCommand((Light1ConstantAtten.value + 1u).toUByte())
    public data object Light1QuadtraticAtten : GeCommand((Light1LinearAtten.value + 1u).toUByte())
    public data object Light2ConstantAtten : GeCommand((Light1QuadtraticAtten.value + 1u).toUByte())
    public data object Light2LinearAtten : GeCommand((Light2ConstantAtten.value + 1u).toUByte())
    public data object Light2QuadtraticAtten : GeCommand((Light2LinearAtten.value + 1u).toUByte())
    public data object Light3ConstantAtten : GeCommand((Light2QuadtraticAtten.value + 1u).toUByte())
    public data object Light3LinearAtten : GeCommand((Light3ConstantAtten.value + 1u).toUByte())
    public data object Light3QuadtraticAtten : GeCommand((Light3LinearAtten.value + 1u).toUByte())
    public data object Light0ExponentAtten : GeCommand(0x87u)
    public data object Light1ExponentAtten : GeCommand((Light0ExponentAtten.value + 1u).toUByte())
    public data object Light2ExponentAtten : GeCommand((Light1ExponentAtten.value + 1u).toUByte())
    public data object Light3ExponentAtten : GeCommand((Light2ExponentAtten.value + 1u).toUByte())
    public data object Light0CutoffAtten : GeCommand(0x8bu)
    public data object Light1CutoffAtten : GeCommand((Light0CutoffAtten.value + 1u).toUByte())
    public data object Light2CutoffAtten : GeCommand((Light1CutoffAtten.value + 1u).toUByte())
    public data object Light3CutoffAtten : GeCommand((Light2CutoffAtten.value + 1u).toUByte())
    public data object Light0Ambient : GeCommand(0x8fu)
    public data object Light0Diffuse : GeCommand((Light0Ambient.value + 1u).toUByte())
    public data object Light0Specular : GeCommand((Light0Diffuse.value + 1u).toUByte())
    public data object Light1Ambient : GeCommand((Light0Specular.value + 1u).toUByte())
    public data object Light1Diffuse : GeCommand((Light1Ambient.value + 1u).toUByte())
    public data object Light1Specular : GeCommand((Light1Diffuse.value + 1u).toUByte())
    public data object Light2Ambient : GeCommand((Light1Specular.value + 1u).toUByte())
    public data object Light2Diffuse : GeCommand((Light2Ambient.value + 1u).toUByte())
    public data object Light2Specular : GeCommand((Light2Diffuse.value + 1u).toUByte())
    public data object Light3Ambient : GeCommand((Light2Specular.value + 1u).toUByte())
    public data object Light3Diffuse : GeCommand((Light3Ambient.value + 1u).toUByte())
    public data object Light3Specular : GeCommand((Light3Diffuse.value + 1u).toUByte())
    public data object Cull : GeCommand(0x9bu)
    public data object FrameBufPtr : GeCommand(0x9cu)
    public data object FrameBufWidth : GeCommand(0x9du)
    public data object ZBufPtr : GeCommand(0x9eu)
    public data object ZBufWidth : GeCommand(0x9fu)
    public data object TexAddr0 : GeCommand(0xa0u)
    public data object TexAddr1 : GeCommand((TexAddr0.value + 1u).toUByte())
    public data object TexAddr2 : GeCommand((TexAddr1.value + 1u).toUByte())
    public data object TexAddr3 : GeCommand((TexAddr2.value + 1u).toUByte())
    public data object TexAddr4 : GeCommand((TexAddr3.value + 1u).toUByte())
    public data object TexAddr5 : GeCommand((TexAddr4.value + 1u).toUByte())
    public data object TexAddr6 : GeCommand((TexAddr5.value + 1u).toUByte())
    public data object TexAddr7 : GeCommand((TexAddr6.value + 1u).toUByte())
    public data object TexBufWidth0 : GeCommand(0xa8u)
    public data object TexBufWidth1 : GeCommand((TexBufWidth0.value + 1u).toUByte())
    public data object TexBufWidth2 : GeCommand((TexBufWidth1.value + 1u).toUByte())
    public data object TexBufWidth3 : GeCommand((TexBufWidth2.value + 1u).toUByte())
    public data object TexBufWidth4 : GeCommand((TexBufWidth3.value + 1u).toUByte())
    public data object TexBufWidth5 : GeCommand((TexBufWidth4.value + 1u).toUByte())
    public data object TexBufWidth6 : GeCommand((TexBufWidth5.value + 1u).toUByte())
    public data object TexBufWidth7 : GeCommand((TexBufWidth6.value + 1u).toUByte())
    public data object ClutAddr : GeCommand(0xb0u)
    public data object ClutAddrUpper : GeCommand(0xb1u)
    public data object TransferSrc : GeCommand((ClutAddrUpper.value + 1u).toUByte())
    public data object TransferSrcW : GeCommand((TransferSrc.value + 1u).toUByte())
    public data object TransferDst : GeCommand((TransferSrcW.value + 1u).toUByte())
    public data object TransferDstW : GeCommand((TransferDst.value + 1u).toUByte())
    public data object TexSize0 : GeCommand(0xb8u)
    public data object TexSize1 : GeCommand((TexSize0.value + 1u).toUByte())
    public data object TexSize2 : GeCommand((TexSize1.value + 1u).toUByte())
    public data object TexSize3 : GeCommand((TexSize2.value + 1u).toUByte())
    public data object TexSize4 : GeCommand((TexSize3.value + 1u).toUByte())
    public data object TexSize5 : GeCommand((TexSize4.value + 1u).toUByte())
    public data object TexSize6 : GeCommand((TexSize5.value + 1u).toUByte())
    public data object TexSize7 : GeCommand((TexSize6.value + 1u).toUByte())
    public data object TexMapMode : GeCommand(0xc0u)
    public data object TexShadeLs : GeCommand(0xc1u)
    public data object TexMode : GeCommand(0xc2u)
    public data object TexFormat : GeCommand(0xc3u)
    public data object LoadClut : GeCommand(0xc4u)
    public data object ClutFormat : GeCommand(0xc5u)
    public data object TexFilter : GeCommand(0xc6u)
    public data object TexWrap : GeCommand(0xc7u)
    public data object TexLevel : GeCommand(0xc8u)
    public data object TexFunc : GeCommand(0xc9u)
    public data object TexEnvColor : GeCommand(0xcau)
    public data object TexFlush : GeCommand(0xcbu)
    public data object TexSync : GeCommand(0xccu)
    public data object Fog1 : GeCommand(0xcdu)
    public data object Fog2 : GeCommand(0xceu)
    public data object FogColor : GeCommand(0xcfu)
    public data object TexLodSlope : GeCommand(0xd0u)
    public data object FramebufPixFormat : GeCommand(0xd2u)
    public data object ClearMode : GeCommand(0xd3u)
    public data object Scissor1 : GeCommand(0xd4u)
    public data object Scissor2 : GeCommand(0xd5u)
    public data object MinZ : GeCommand(0xd6u)
    public data object MaxZ : GeCommand(0xd7u)
    public data object ColorTest : GeCommand(0xd8u)
    public data object ColorRef : GeCommand(0xd9u)
    public data object ColorTestmask : GeCommand(0xdau)
    public data object AlphaTest : GeCommand(0xdbu)
    public data object StencilTest : GeCommand(0xdcu)
    public data object StencilOp : GeCommand(0xddu)
    public data object ZTest : GeCommand(0xdeu)
    public data object BlendMode : GeCommand(0xdfu)
    public data object BlendFixedA : GeCommand(0xe0u)
    public data object BlendFixedB : GeCommand(0xe1u)
    public data object Dith0 : GeCommand(0xe2u)
    public data object Dith1 : GeCommand((Dith0.value + 1u).toUByte())
    public data object Dith2 : GeCommand((Dith1.value + 1u).toUByte())
    public data object Dith3 : GeCommand((Dith2.value + 1u).toUByte())
    public data object LogicOp : GeCommand(0xe6u)
    public data object ZWriteDisable : GeCommand(0xe7u)
    public data object MaskRgb : GeCommand(0xe8u)
    public data object MaskAlpha : GeCommand(0xe9u)
    public data object TransferStart : GeCommand(0xeau)
    public data object TransferSrcPos : GeCommand(0xebu)
    public data object TransferDstPos : GeCommand(0xecu)
    public data object TransferSize : GeCommand(0xeeu)
    public data object Vscx : GeCommand(0xf0u)
    public data object Vscy : GeCommand(0xf1u)
    public data object Vscz : GeCommand(0xf2u)
    public data object Vtcs : GeCommand(0xf3u)
    public data object Vtct : GeCommand(0xf4u)
    public data object Vtcq : GeCommand(0xf5u)
    public data object Vcv : GeCommand(0xf6u)
    public data object Vap : GeCommand(0xf7u)
    public data object Vfc : GeCommand(0xf8u)
    public data object Vscv : GeCommand(0xf9u)
    public data object Unknown03 : GeCommand(0x03u)
    public data object Unknown0D : GeCommand(0x0du)
    public data object Unknown11 : GeCommand(0x11u)
    public data object Unknown29 : GeCommand(0x29u)
    public data object Unknown34 : GeCommand(0x34u)
    public data object Unknown35 : GeCommand(0x35u)
    public data object Unknown39 : GeCommand(0x39u)
    public data object Unknown4E : GeCommand(0x4eu)
    public data object Unknown4F : GeCommand(0x4fu)
    public data object Unknown52 : GeCommand(0x52u)
    public data object Unknown59 : GeCommand(0x59u)
    public data object Unknown5A : GeCommand(0x5au)
    public data object UnknownB6 : GeCommand(0xb6u)
    public data object UnknownB7 : GeCommand(0xb7u)
    public data object UnknownD1 : GeCommand(0xd1u)
    public data object UnknownED : GeCommand(0xedu)
    public data object UnknownEF : GeCommand(0xefu)
    public data object UnknownFA : GeCommand(0xfau)
    public data object UnknownFB : GeCommand(0xfbu)
    public data object UnknownFC : GeCommand(0xfcu)
    public data object UnknownFD : GeCommand(0xfdu)
    public data object UnknownFE : GeCommand(0xfeu)
    public data object NopFF : GeCommand(0xffu)
}

public sealed class SceSysMemPartitionId(public val value: Int) {
    public data object SceKernelUnknownPartition : SceSysMemPartitionId(0)
    public data object SceKernelPrimaryKernelPartition : SceSysMemPartitionId(1)
    public data object SceKernelPrimaryUserPartition : SceSysMemPartitionId(2)
    public data object SceKernelOtherKernelPartition1 : SceSysMemPartitionId(3)
    public data object SceKernelOtherKernelPartition2 : SceSysMemPartitionId(4)
    public data object SceKernelVshellPARTITION : SceSysMemPartitionId(5)
    public data object SceKernelScUserPartition : SceSysMemPartitionId(6)
    public data object SceKernelMeUserPartition : SceSysMemPartitionId(7)
    public data object SceKernelExtendedScKernelPartition : SceSysMemPartitionId(8)
    public data object SceKernelExtendedSc2KernelPartition : SceSysMemPartitionId(9)
    public data object SceKernelExtendedMeKernelPartition : SceSysMemPartitionId(10)
    public data object SceKernelVshellKernelPartition : SceSysMemPartitionId(11)
    public data object SceKernelExtendedKernelPartition : SceSysMemPartitionId(12)
}

public sealed class SceSysMemBlockTypes(public val value: Int) {
    public data object Low : SceSysMemBlockTypes(0)
    public data object High : SceSysMemBlockTypes(Low.value + 1)
    public data object Addr : SceSysMemBlockTypes(High.value + 1)
}

public sealed class Interrupt(public val value: UInt) {
    public data object Gpio : Interrupt(4u)
    public data object Ata : Interrupt(5u)
    public data object Umd : Interrupt(6u)
    public data object Mscm0 : Interrupt(7u)
    public data object Wlan : Interrupt(8u)
    public data object Audio : Interrupt(10u)
    public data object I2c : Interrupt(12u)
    public data object Sircs : Interrupt(14u)
    public data object Systimer0 : Interrupt(15u)
    public data object Systimer1 : Interrupt(16u)
    public data object Systimer2 : Interrupt(17u)
    public data object Systimer3 : Interrupt(18u)
    public data object Thread0 : Interrupt(19u)
    public data object Nand : Interrupt(20u)
    public data object Dmacplus : Interrupt(21u)
    public data object Dma0 : Interrupt(22u)
    public data object Dma1 : Interrupt(23u)
    public data object Memlmd : Interrupt(24u)
    public data object Ge : Interrupt(25u)
    public data object Vblank : Interrupt(30u)
    public data object Mecodec : Interrupt(31u)
    public data object Hpremote : Interrupt(36u)
    public data object Mscm1 : Interrupt(60u)
    public data object Mscm2 : Interrupt(61u)
    public data object Thread1 : Interrupt(65u)
    public data object Interrupt : Interrupt(66u)
}

public sealed class SubInterrupt(public val value: UInt) {
    public data object Gpio : SubInterrupt(Interrupt.Gpio.toUInt())
    public data object Ata : SubInterrupt(Interrupt.Ata.toUInt())
    public data object Umd : SubInterrupt(Interrupt.Umd.toUInt())
    public data object Dmacplus : SubInterrupt(Interrupt.Dmacplus.toUInt())
    public data object Ge : SubInterrupt(Interrupt.Ge.toUInt())
    public data object Display : SubInterrupt(Interrupt.Vblank.toUInt())
}

public sealed class SceKernelIdListType(public val value: UInt) {
    public data object Thread : SceKernelIdListType(1u)
    public data object Semaphore : SceKernelIdListType(2u)
    public data object EventFlag : SceKernelIdListType(3u)
    public data object Mbox : SceKernelIdListType(4u)
    public data object Vpl : SceKernelIdListType(5u)
    public data object Fpl : SceKernelIdListType(6u)
    public data object Mpipe : SceKernelIdListType(7u)
    public data object Callback : SceKernelIdListType(8u)
    public data object ThreadEventHandler : SceKernelIdListType(9u)
    public data object Alarm : SceKernelIdListType(10u)
    public data object VTimer : SceKernelIdListType(11u)
    public data object SleepThread : SceKernelIdListType(64u)
    public data object DelayThread : SceKernelIdListType(65u)
    public data object SuspendThread : SceKernelIdListType(66u)
    public data object DormantThread : SceKernelIdListType(67u)
}

public sealed class UsbCamResolution(public val value: Int) {
    public data object Px160120 : UsbCamResolution(0)
    public data object Px176144 : UsbCamResolution(1)
    public data object Px320240 : UsbCamResolution(2)
    public data object Px352288 : UsbCamResolution(3)
    public data object Px640480 : UsbCamResolution(4)
    public data object Px1024768 : UsbCamResolution(5)
    public data object Px1280960 : UsbCamResolution(6)
    public data object Px480272 : UsbCamResolution(7)
    public data object Px360272 : UsbCamResolution(8)
}

public sealed class UsbCamResolutionEx(public val value: Int) {
    public data object Px160120 : UsbCamResolutionEx(0)
    public data object Px176144 : UsbCamResolutionEx(1)
    public data object Px320240 : UsbCamResolutionEx(2)
    public data object Px352288 : UsbCamResolutionEx(3)
    public data object Px360272 : UsbCamResolutionEx(4)
    public data object Px480272 : UsbCamResolutionEx(5)
    public data object Px640480 : UsbCamResolutionEx(6)
    public data object Px1024768 : UsbCamResolutionEx(7)
    public data object Px1280960 : UsbCamResolutionEx(8)
}

public sealed class UsbCamDelay(public val value: Int) {
    public data object NoDelay : UsbCamDelay(0)
    public data object Delay10Sec : UsbCamDelay(1)
    public data object Delay20Sec : UsbCamDelay(2)
    public data object Delay30Sec : UsbCamDelay(3)
}

public sealed class UsbCamFrameRate(public val value: Int) {
    public data object Fps375 : UsbCamFrameRate(0)
    public data object Fps5 : UsbCamFrameRate(1)
    public data object Fps75 : UsbCamFrameRate(2)
    public data object Fps10 : UsbCamFrameRate(3)
    public data object Fps15 : UsbCamFrameRate(4)
    public data object Fps20 : UsbCamFrameRate(5)
    public data object Fps30 : UsbCamFrameRate(6)
    public data object Fps60 : UsbCamFrameRate(7)
}

public sealed class UsbCamWb(public val value: Int) {
    public data object Auto : UsbCamWb(0)
    public data object Daylight : UsbCamWb(1)
    public data object Fluorescent : UsbCamWb(2)
    public data object Incadescent : UsbCamWb(3)
}

public sealed class UsbCamEffectMode(public val value: Int) {
    public data object Normal : UsbCamEffectMode(0)
    public data object Negative : UsbCamEffectMode(1)
    public data object Blackwhite : UsbCamEffectMode(2)
    public data object Sepia : UsbCamEffectMode(3)
    public data object Blue : UsbCamEffectMode(4)
    public data object Red : UsbCamEffectMode(5)
    public data object Green : UsbCamEffectMode(6)
}

public sealed class UsbCamEvLevel(public val value: Int) {
    public data object Pos20 : UsbCamEvLevel(0)
    public data object Pos17 : UsbCamEvLevel(1)
    public data object Pos15 : UsbCamEvLevel(2)
    public data object Pos13 : UsbCamEvLevel(3)
    public data object Pos10 : UsbCamEvLevel(4)
    public data object Pos07 : UsbCamEvLevel(5)
    public data object Pos05 : UsbCamEvLevel(6)
    public data object Pos03 : UsbCamEvLevel(7)
    public data object Zero : UsbCamEvLevel(8)
    public data object Neg03 : UsbCamEvLevel(Zero.value + 1)
    public data object Neg05 : UsbCamEvLevel(Neg03.value + 1)
    public data object Neg07 : UsbCamEvLevel(Neg05.value + 1)
    public data object Neg10 : UsbCamEvLevel(Neg07.value + 1)
    public data object Neg13 : UsbCamEvLevel(Neg10.value + 1)
    public data object Neg15 : UsbCamEvLevel(Neg13.value + 1)
    public data object Neg17 : UsbCamEvLevel(Neg15.value + 1)
    public data object Neg20 : UsbCamEvLevel(Neg17.value + 1)
}

public sealed class RtcCheckValidError(public val value: Int) {
    public data object InvalidYear : RtcCheckValidError(-1)
    public data object InvalidMonth : RtcCheckValidError(-2)
    public data object InvalidDay : RtcCheckValidError(-3)
    public data object InvalidHour : RtcCheckValidError(-4)
    public data object InvalidMinutes : RtcCheckValidError(-5)
    public data object InvalidSeconds : RtcCheckValidError(-6)
    public data object InvalidMicroseconds : RtcCheckValidError(-7)
}

public sealed class PowerTick(public val value: UInt) {
    public data object All : PowerTick(0u)
    public data object Suspend : PowerTick(1u)
    public data object Display : PowerTick(6u)
}

public sealed class IoAssignPerms(public val value: UInt) {
    public data object RdWr : IoAssignPerms(0u)
    public data object RdOnly : IoAssignPerms(1u)
}

public sealed class IoWhence(public val value: UInt) {
    public data object Set : IoWhence(0u)
    public data object Cur : IoWhence(1u)
    public data object End : IoWhence(2u)
}

public sealed class UmdType(public val value: UInt) {
    public data object Game : UmdType(0x10u)
    public data object Video : UmdType(0x20u)
    public data object Audio : UmdType(0x40u)
}

public sealed class GuPrimitive(public val value: UInt) {
    public data object Points : GuPrimitive(0u)
    public data object Lines : GuPrimitive(1u)
    public data object LineStrip : GuPrimitive(2u)
    public data object Triangles : GuPrimitive(3u)
    public data object TriangleStrip : GuPrimitive(4u)
    public data object TriangleFan : GuPrimitive(5u)
    public data object Sprites : GuPrimitive(6u)
}

public sealed class PatchPrimitive(public val value: UInt) {
    public data object Points : PatchPrimitive(0u)
    public data object LineStrip : PatchPrimitive(2u)
    public data object TriangleStrip : PatchPrimitive(4u)
}

public sealed class GuState(public val value: UInt) {
    public data object AlphaTest : GuState(0u)
    public data object DepthTest : GuState(1u)
    public data object ScissorTest : GuState(2u)
    public data object StencilTest : GuState(3u)
    public data object Blend : GuState(4u)
    public data object CullFace : GuState(5u)
    public data object Dither : GuState(6u)
    public data object Fog : GuState(7u)
    public data object ClipPlanes : GuState(8u)
    public data object Texture2D : GuState(9u)
    public data object Lighting : GuState(10u)
    public data object Light0 : GuState(11u)
    public data object Light1 : GuState(12u)
    public data object Light2 : GuState(13u)
    public data object Light3 : GuState(14u)
    public data object LineSmooth : GuState(15u)
    public data object PatchCullFace : GuState(16u)
    public data object ColorTest : GuState(17u)
    public data object ColorLogicOp : GuState(18u)
    public data object FaceNormalReverse : GuState(19u)
    public data object PatchFace : GuState(20u)
    public data object Fragment2X : GuState(21u)
}

public sealed class MatrixMode(public val value: UInt) {
    public data object Projection : MatrixMode(0u)
    public data object View : MatrixMode(1u)
    public data object Model : MatrixMode(2u)
    public data object Texture : MatrixMode(3u)
}

public sealed class TexturePixelFormat(public val value: UInt) {
    public data object Psm5650 : TexturePixelFormat(0u)
    public data object Psm5551 : TexturePixelFormat(1u)
    public data object Psm4444 : TexturePixelFormat(2u)
    public data object Psm8888 : TexturePixelFormat(3u)
    public data object PsmT4 : TexturePixelFormat(4u)
    public data object PsmT8 : TexturePixelFormat(5u)
    public data object PsmT16 : TexturePixelFormat(6u)
    public data object PsmT32 : TexturePixelFormat(7u)
    public data object PsmDxt1 : TexturePixelFormat(8u)
    public data object PsmDxt3 : TexturePixelFormat(9u)
    public data object PsmDxt5 : TexturePixelFormat(10u)
}

public sealed class SplineMode(public val value: UInt) {
    public data object FillFill : SplineMode(0u)
    public data object OpenFill : SplineMode(1u)
    public data object FillOpen : SplineMode(2u)
    public data object OpenOpen : SplineMode(3u)
}

public sealed class ShadingModel(public val value: UInt) {
    public data object Flat : ShadingModel(0u)
    public data object Smooth : ShadingModel(1u)
}

public sealed class LogicalOperation(public val value: UInt) {
    public data object Clear : LogicalOperation(0u)
    public data object And : LogicalOperation(1u)
    public data object AndReverse : LogicalOperation(2u)
    public data object Copy : LogicalOperation(3u)
    public data object AndInverted : LogicalOperation(4u)
    public data object Noop : LogicalOperation(5u)
    public data object Xor : LogicalOperation(6u)
    public data object Or : LogicalOperation(7u)
    public data object Nor : LogicalOperation(8u)
    public data object Equiv : LogicalOperation(9u)
    public data object Inverted : LogicalOperation(10u)
    public data object OrReverse : LogicalOperation(11u)
    public data object CopyInverted : LogicalOperation(12u)
    public data object OrInverted : LogicalOperation(13u)
    public data object Nand : LogicalOperation(14u)
    public data object Set : LogicalOperation(15u)
}

public sealed class TextureFilter(public val value: UInt) {
    public data object Nearest : TextureFilter(0u)
    public data object Linear : TextureFilter(1u)
    public data object NearestMipmapNearest : TextureFilter(4u)
    public data object LinearMipmapNearest : TextureFilter(5u)
    public data object NearestMipmapLinear : TextureFilter(6u)
    public data object LinearMipmapLinear : TextureFilter(7u)
}

public sealed class TextureMapMode(public val value: UInt) {
    public data object TextureCoords : TextureMapMode(0u)
    public data object TextureMatrix : TextureMapMode(1u)
    public data object EnvironmentMap : TextureMapMode(2u)
}

public sealed class TextureLevelMode(public val value: UInt) {
    public data object Auto : TextureLevelMode(0u)
    public data object Const : TextureLevelMode(1u)
    public data object Slope : TextureLevelMode(2u)
}

public sealed class TextureProjectionMapMode(public val value: UInt) {
    public data object Position : TextureProjectionMapMode(0u)
    public data object Uv : TextureProjectionMapMode(1u)
    public data object NormalizedNormal : TextureProjectionMapMode(2u)
    public data object Normal : TextureProjectionMapMode(3u)
}

public sealed class GuTexWrapMode(public val value: UInt) {
    public data object Repeat : GuTexWrapMode(0u)
    public data object Clamp : GuTexWrapMode(1u)
}

public sealed class FrontFaceDirection(public val value: UInt) {
    public data object Clockwise : FrontFaceDirection(0u)
    public data object CounterClockwise : FrontFaceDirection(1u)
}

public sealed class AlphaFunc(public val value: UInt) {
    public data object Never : AlphaFunc(0u)
    public data object Always : AlphaFunc(Never.value + 1u)
    public data object Equal : AlphaFunc(Always.value + 1u)
    public data object NotEqual : AlphaFunc(Equal.value + 1u)
    public data object Less : AlphaFunc(NotEqual.value + 1u)
    public data object LessOrEqual : AlphaFunc(Less.value + 1u)
    public data object Greater : AlphaFunc(LessOrEqual.value + 1u)
    public data object GreaterOrEqual : AlphaFunc(Greater.value + 1u)
}

public sealed class StencilFunc(public val value: UInt) {
    public data object Never : StencilFunc(0u)
    public data object Always : StencilFunc(Never.value + 1u)
    public data object Equal : StencilFunc(Always.value + 1u)
    public data object NotEqual : StencilFunc(Equal.value + 1u)
    public data object Less : StencilFunc(NotEqual.value + 1u)
    public data object LessOrEqual : StencilFunc(Less.value + 1u)
    public data object Greater : StencilFunc(LessOrEqual.value + 1u)
    public data object GreaterOrEqual : StencilFunc(Greater.value + 1u)
}

public sealed class ColorFunc(public val value: UInt) {
    public data object Never : ColorFunc(0u)
    public data object Always : ColorFunc(Never.value + 1u)
    public data object Equal : ColorFunc(Always.value + 1u)
    public data object NotEqual : ColorFunc(Equal.value + 1u)
}

public sealed class DepthFunc(public val value: UInt) {
    public data object Never : DepthFunc(0u)
    public data object Always : DepthFunc(Never.value + 1u)
    public data object Equal : DepthFunc(Always.value + 1u)
    public data object NotEqual : DepthFunc(Equal.value + 1u)
    public data object Less : DepthFunc(NotEqual.value + 1u)
    public data object LessOrEqual : DepthFunc(Less.value + 1u)
    public data object Greater : DepthFunc(LessOrEqual.value + 1u)
    public data object GreaterOrEqual : DepthFunc(Greater.value + 1u)
}

public sealed class TextureEffect(public val value: UInt) {
    public data object Modulate : TextureEffect(0u)
    public data object Decal : TextureEffect(1u)
    public data object Blend : TextureEffect(2u)
    public data object Replace : TextureEffect(3u)
    public data object Add : TextureEffect(4u)
}

public sealed class TextureColorComponent(public val value: UInt) {
    public data object Rgb : TextureColorComponent(0u)
    public data object Rgba : TextureColorComponent(1u)
}

public sealed class MipmapLevel(public val value: UInt) {
    public data object None : MipmapLevel(0u)
    public data object Level1 : MipmapLevel(None.value + 1u)
    public data object Level2 : MipmapLevel(Level1.value + 1u)
    public data object Level3 : MipmapLevel(Level2.value + 1u)
    public data object Level4 : MipmapLevel(Level3.value + 1u)
    public data object Level5 : MipmapLevel(Level4.value + 1u)
    public data object Level6 : MipmapLevel(Level5.value + 1u)
    public data object Level7 : MipmapLevel(Level6.value + 1u)
}

public sealed class BlendOp(public val value: UInt) {
    public data object Add : BlendOp(0u)
    public data object Subtract : BlendOp(1u)
    public data object ReverseSubtract : BlendOp(2u)
    public data object Min : BlendOp(3u)
    public data object Max : BlendOp(4u)
    public data object Abs : BlendOp(5u)
}

public sealed class BlendSrc(public val value: UInt) {
    public data object SrcColor : BlendSrc(0u)
    public data object OneMinusSrcColor : BlendSrc(1u)
    public data object SrcAlpha : BlendSrc(2u)
    public data object OneMinusSrcAlpha : BlendSrc(3u)
    public data object Fix : BlendSrc(10u)
}

public sealed class BlendDst(public val value: UInt) {
    public data object DstColor : BlendDst(0u)
    public data object OneMinusDstColor : BlendDst(1u)
    public data object DstAlpha : BlendDst(4u)
    public data object OneMinusDstAlpha : BlendDst(5u)
    public data object Fix : BlendDst(10u)
}

public sealed class StencilOperation(public val value: UInt) {
    public data object Keep : StencilOperation(0u)
    public data object Zero : StencilOperation(1u)
    public data object Replace : StencilOperation(2u)
    public data object Invert : StencilOperation(3u)
    public data object Incr : StencilOperation(4u)
    public data object Decr : StencilOperation(5u)
}

public sealed class LightMode(public val value: UInt) {
    public data object SingleColor : LightMode(0u)
    public data object SeparateSpecularColor : LightMode(1u)
}

public sealed class LightType(public val value: UInt) {
    public data object Directional : LightType(0u)
    public data object Pointlight : LightType(1u)
    public data object Spotlight : LightType(2u)
}

public sealed class GuContextType(public val value: UInt) {
    public data object Direct : GuContextType(0u)
    public data object Call : GuContextType(1u)
    public data object Send : GuContextType(2u)
}

public sealed class GuQueueMode(public val value: UInt) {
    public data object Tail : GuQueueMode(0u)
    public data object Head : GuQueueMode(1u)
}

public sealed class GuSyncMode(public val value: UInt) {
    public data object Finish : GuSyncMode(0u)
    public data object Signal : GuSyncMode(1u)
    public data object Done : GuSyncMode(2u)
    public data object List : GuSyncMode(3u)
    public data object Send : GuSyncMode(4u)
}

public sealed class GuSyncBehavior(public val value: UInt) {
    public data object Wait : GuSyncBehavior(0u)
    public data object NoWait : GuSyncBehavior(1u)
}

public sealed class GuCallbackId(public val value: UInt) {
    public data object Signal : GuCallbackId(1u)
    public data object Finish : GuCallbackId(4u)
}

public sealed class SignalBehavior(public val value: UInt) {
    public data object Suspend : SignalBehavior(1u)
    public data object Continue : SignalBehavior(2u)
}

public sealed class ClutPixelFormat(public val value: UInt) {
    public data object Psm5650 : ClutPixelFormat(0u)
    public data object Psm5551 : ClutPixelFormat(1u)
    public data object Psm4444 : ClutPixelFormat(2u)
    public data object Psm8888 : ClutPixelFormat(3u)
}

public sealed class KeyType(public val value: Int) {
    public data object Directory : KeyType(1)
    public data object Integer : KeyType(2)
    public data object String : KeyType(3)
    public data object Bytes : KeyType(4)
}

public sealed class UtilityMsgDialogMode {
    public data object Error : UtilityMsgDialogMode()
    public data object Text : UtilityMsgDialogMode()
}

public sealed class UtilityMsgDialogPressed {
    public data object Unknown1 : UtilityMsgDialogPressed()
    public data object Yes : UtilityMsgDialogPressed()
    public data object No : UtilityMsgDialogPressed()
    public data object Back : UtilityMsgDialogPressed()
}

public sealed class UtilityDialogButtonAccept {
    public data object Circle : UtilityDialogButtonAccept()
    public data object Cross : UtilityDialogButtonAccept()
}

public sealed class SceUtilityOskInputLanguage {
    public data object Default : SceUtilityOskInputLanguage()
    public data object Japanese : SceUtilityOskInputLanguage()
    public data object English : SceUtilityOskInputLanguage()
    public data object French : SceUtilityOskInputLanguage()
    public data object Spanish : SceUtilityOskInputLanguage()
    public data object German : SceUtilityOskInputLanguage()
    public data object Italian : SceUtilityOskInputLanguage()
    public data object Dutch : SceUtilityOskInputLanguage()
    public data object Portugese : SceUtilityOskInputLanguage()
    public data object Russian : SceUtilityOskInputLanguage()
    public data object Korean : SceUtilityOskInputLanguage()
}

public sealed class SceUtilityOskInputType(public val value: UInt) {
    public data object All : SceUtilityOskInputType(0u)
    public data object LatinDigit : SceUtilityOskInputType(All.value + 1u)
    public data object LatinSymbol : SceUtilityOskInputType(LatinDigit.value + 1u)
    public data object LatinLowercase : SceUtilityOskInputType(4u)
    public data object LatinUppercase : SceUtilityOskInputType(8u)
    public data object JapaneseDigit : SceUtilityOskInputType(0x100u)
    public data object JapaneseSymbol : SceUtilityOskInputType(0x200u)
    public data object JapaneseLowercase : SceUtilityOskInputType(0x400u)
    public data object JapaneseUppercase : SceUtilityOskInputType(0x800u)
    public data object JapaneseHiragana : SceUtilityOskInputType(0x1000u)
    public data object JapaneseHalfWidthKatakana : SceUtilityOskInputType(0x2000u)
    public data object JapaneseKatakana : SceUtilityOskInputType(0x4000u)
    public data object JapaneseKanji : SceUtilityOskInputType(0x8000u)
    public data object RussianLowercase : SceUtilityOskInputType(0x10000u)
    public data object RussianUppercase : SceUtilityOskInputType(0x20000u)
    public data object Korean : SceUtilityOskInputType(0x40000u)
    public data object Url : SceUtilityOskInputType(0x80000u)
}

public sealed class SceUtilityOskState {
    public data object None : SceUtilityOskState()
    public data object Initializing : SceUtilityOskState()
    public data object Initialized : SceUtilityOskState()
    public data object Visible : SceUtilityOskState()
    public data object Quit : SceUtilityOskState()
    public data object Finished : SceUtilityOskState()
}

public sealed class SceUtilityOskResult {
    public data object Unchanged : SceUtilityOskResult()
    public data object Cancelled : SceUtilityOskResult()
    public data object Changed : SceUtilityOskResult()
}

public sealed class SystemParamLanguage {
    public data object Japanese : SystemParamLanguage()
    public data object English : SystemParamLanguage()
    public data object French : SystemParamLanguage()
    public data object Spanish : SystemParamLanguage()
    public data object German : SystemParamLanguage()
    public data object Italian : SystemParamLanguage()
    public data object Dutch : SystemParamLanguage()
    public data object Portugese : SystemParamLanguage()
    public data object Russian : SystemParamLanguage()
    public data object Korean : SystemParamLanguage()
    public data object ChineseTraditional : SystemParamLanguage()
    public data object ChineseSimplified : SystemParamLanguage()
}

public sealed class SystemParamId(public val value: UInt) {
    public data object StringNickname : SystemParamId(1u)
    public data object AdhocChannel : SystemParamId(StringNickname.value + 1u)
    public data object WlanPowerSave : SystemParamId(AdhocChannel.value + 1u)
    public data object DateFormat : SystemParamId(WlanPowerSave.value + 1u)
    public data object TimeFormat : SystemParamId(DateFormat.value + 1u)
    public data object Timezone : SystemParamId(TimeFormat.value + 1u)
    public data object DaylightSavings : SystemParamId(Timezone.value + 1u)
    public data object Language : SystemParamId(DaylightSavings.value + 1u)
    public data object Unknown : SystemParamId(Language.value + 1u)
}

public sealed class SystemParamAdhocChannel(public val value: UInt) {
    public data object ChannelAutomatic : SystemParamAdhocChannel(0u)
    public data object Channel1 : SystemParamAdhocChannel(1u)
    public data object Channel6 : SystemParamAdhocChannel(6u)
    public data object Channel11 : SystemParamAdhocChannel(11u)
}

public sealed class SystemParamWlanPowerSaveState {
    public data object Off : SystemParamWlanPowerSaveState()
    public data object On : SystemParamWlanPowerSaveState()
}

public sealed class SystemParamDateFormat {
    public data object Yyyymmdd : SystemParamDateFormat()
    public data object Mmddyyyy : SystemParamDateFormat()
    public data object Ddmmyyyy : SystemParamDateFormat()
}

public sealed class SystemParamTimeFormat {
    public data object Hour24 : SystemParamTimeFormat()
    public data object Hour12 : SystemParamTimeFormat()
}

public sealed class SystemParamDaylightSavings {
    public data object Std : SystemParamDaylightSavings()
    public data object Dst : SystemParamDaylightSavings()
}

public sealed class AvModule {
    public data object AvCodec : AvModule()
    public data object SasCore : AvModule()
    public data object Atrac3Plus : AvModule()
    public data object MpegBase : AvModule()
    public data object Mp3 : AvModule()
    public data object Vaudio : AvModule()
    public data object Aac : AvModule()
    public data object G729 : AvModule()
}

public sealed class Module(public val value: UInt) {
    public data object NetCommon : Module(0x100u)
    public data object NetAdhoc : Module(NetCommon.value + 1u)
    public data object NetInet : Module(NetAdhoc.value + 1u)
    public data object NetParseUri : Module(NetInet.value + 1u)
    public data object NetHttp : Module(NetParseUri.value + 1u)
    public data object NetSsl : Module(NetHttp.value + 1u)
    public data object UsbPspCm : Module(0x200u)
    public data object UsbMic : Module(UsbPspCm.value + 1u)
    public data object UsbCam : Module(UsbMic.value + 1u)
    public data object UsbGps : Module(UsbCam.value + 1u)
    public data object AvCodec : Module(0x300u)
    public data object AvSascore : Module(AvCodec.value + 1u)
    public data object AvAtrac3Plus : Module(AvSascore.value + 1u)
    public data object AvMpegBase : Module(AvAtrac3Plus.value + 1u)
    public data object AvMp3 : Module(AvMpegBase.value + 1u)
    public data object AvVaudio : Module(AvMp3.value + 1u)
    public data object AvAac : Module(AvVaudio.value + 1u)
    public data object AvG729 : Module(AvAac.value + 1u)
    public data object NpCommon : Module(0x400u)
    public data object NpService : Module(NpCommon.value + 1u)
    public data object NpMatching2 : Module(NpService.value + 1u)
    public data object NpDrm : Module(0x500u)
    public data object Irda : Module(0x600u)
}

public sealed class NetModule(public val value: UInt) {
    public data object NetCommon : NetModule(1u)
    public data object NetAdhoc : NetModule(NetCommon.value + 1u)
    public data object NetInet : NetModule(NetAdhoc.value + 1u)
    public data object NetParseUri : NetModule(NetInet.value + 1u)
    public data object NetHttp : NetModule(NetParseUri.value + 1u)
    public data object NetSsl : NetModule(NetHttp.value + 1u)
}

public sealed class UsbModule(public val value: UInt) {
    public data object UsbPspCm : UsbModule(1u)
    public data object UsbAcc : UsbModule(UsbPspCm.value + 1u)
    public data object UsbMic : UsbModule(UsbAcc.value + 1u)
    public data object UsbCam : UsbModule(UsbMic.value + 1u)
    public data object UsbGps : UsbModule(UsbCam.value + 1u)
}

public sealed class NetParam {
    public data object Name : NetParam()
    public data object Ssid : NetParam()
    public data object Secure : NetParam()
    public data object WepKey : NetParam()
    public data object IsStaticIp : NetParam()
    public data object Ip : NetParam()
    public data object NetMask : NetParam()
    public data object Route : NetParam()
    public data object ManualDns : NetParam()
    public data object PrimaryDns : NetParam()
    public data object SecondaryDns : NetParam()
    public data object ProxyUser : NetParam()
    public data object ProxyPass : NetParam()
    public data object UseProxy : NetParam()
    public data object ProxyServer : NetParam()
    public data object ProxyPort : NetParam()
    public data object Unknown1 : NetParam()
    public data object Unknown2 : NetParam()
}

public sealed class UtilityNetconfAction {
    public data object ConnectAP : UtilityNetconfAction()
    public data object DisplayStatus : UtilityNetconfAction()
    public data object ConnectAdhoc : UtilityNetconfAction()
}

public sealed class UtilitySavedataMode {
    public data object AutoLoad : UtilitySavedataMode()
    public data object AutoSave : UtilitySavedataMode()
    public data object Load : UtilitySavedataMode()
    public data object Save : UtilitySavedataMode()
    public data object ListLoad : UtilitySavedataMode()
    public data object ListSave : UtilitySavedataMode()
    public data object ListDelete : UtilitySavedataMode()
    public data object Delete : UtilitySavedataMode()
}

public sealed class UtilitySavedataFocus {
    public data object Unknown1 : UtilitySavedataFocus()
    public data object FirstList : UtilitySavedataFocus()
    public data object LastList : UtilitySavedataFocus()
    public data object Latest : UtilitySavedataFocus()
    public data object Oldest : UtilitySavedataFocus()
    public data object Unknown2 : UtilitySavedataFocus()
    public data object Unknown3 : UtilitySavedataFocus()
    public data object FirstEmpty : UtilitySavedataFocus()
    public data object LastEmpty : UtilitySavedataFocus()
}

public sealed class UtilityGameSharingMode(public val value: UInt) {
    public data object Single : UtilityGameSharingMode(1u)
    public data object Multiple : UtilityGameSharingMode(Single.value + 1u)
}

public sealed class UtilityGameSharingDataType(public val value: UInt) {
    public data object File : UtilityGameSharingDataType(1u)
    public data object Memory : UtilityGameSharingDataType(File.value + 1u)
}

public sealed class UtilityHtmlViewerInterfaceMode {
    public data object Full : UtilityHtmlViewerInterfaceMode()
    public data object Limited : UtilityHtmlViewerInterfaceMode()
    public data object None : UtilityHtmlViewerInterfaceMode()
}

public sealed class UtilityHtmlViewerCookieMode(public val value: UInt) {
    public data object Disabled : UtilityHtmlViewerCookieMode(0u)
    public data object Enabled : UtilityHtmlViewerCookieMode(Disabled.value + 1u)
    public data object Confirm : UtilityHtmlViewerCookieMode(Enabled.value + 1u)
    public data object Default : UtilityHtmlViewerCookieMode(Confirm.value + 1u)
}

public sealed class UtilityHtmlViewerTextSize {
    public data object Large : UtilityHtmlViewerTextSize()
    public data object Normal : UtilityHtmlViewerTextSize()
    public data object Small : UtilityHtmlViewerTextSize()
}

public sealed class UtilityHtmlViewerDisplayMode {
    public data object Normal : UtilityHtmlViewerDisplayMode()
    public data object Fit : UtilityHtmlViewerDisplayMode()
    public data object SmartFit : UtilityHtmlViewerDisplayMode()
}

public sealed class UtilityHtmlViewerConnectMode {
    public data object Last : UtilityHtmlViewerConnectMode()
    public data object ManualOnce : UtilityHtmlViewerConnectMode()
    public data object ManualAll : UtilityHtmlViewerConnectMode()
}

public sealed class UtilityHtmlViewerDisconnectMode {
    public data object Enable : UtilityHtmlViewerDisconnectMode()
    public data object Disable : UtilityHtmlViewerDisconnectMode()
    public data object Confirm : UtilityHtmlViewerDisconnectMode()
}

public sealed class ScePspnetAdhocPtpState {
    public data object Closed : ScePspnetAdhocPtpState()
    public data object Listen : ScePspnetAdhocPtpState()
    public data object SynSent : ScePspnetAdhocPtpState()
    public data object SynReceived : ScePspnetAdhocPtpState()
    public data object Established : ScePspnetAdhocPtpState()
}

public sealed class AdhocMatchingMode(public val value: UInt) {
    public data object Host : AdhocMatchingMode(1u)
    public data object Client : AdhocMatchingMode(Host.value + 1u)
    public data object Ptp : AdhocMatchingMode(Client.value + 1u)
}

public sealed class ApctlState {
    public data object Disconnected : ApctlState()
    public data object Scanning : ApctlState()
    public data object Joining : ApctlState()
    public data object GettingIp : ApctlState()
    public data object GotIp : ApctlState()
    public data object EapAuth : ApctlState()
    public data object KeyExchange : ApctlState()
}

public sealed class ApctlEvent {
    public data object ConnectRequest : ApctlEvent()
    public data object ScanRequest : ApctlEvent()
    public data object ScanComplete : ApctlEvent()
    public data object Established : ApctlEvent()
    public data object GetIp : ApctlEvent()
    public data object DisconnectRequest : ApctlEvent()
    public data object Error : ApctlEvent()
    public data object Info : ApctlEvent()
    public data object EapAuth : ApctlEvent()
    public data object KeyExchange : ApctlEvent()
    public data object Reconnect : ApctlEvent()
}

public sealed class ApctlInfo {
    public data object ProfileName : ApctlInfo()
    public data object Bssid : ApctlInfo()
    public data object Ssid : ApctlInfo()
    public data object SsidLength : ApctlInfo()
    public data object SecurityType : ApctlInfo()
    public data object Strength : ApctlInfo()
    public data object Channel : ApctlInfo()
    public data object PowerSave : ApctlInfo()
    public data object Ip : ApctlInfo()
    public data object SubnetMask : ApctlInfo()
    public data object Gateway : ApctlInfo()
    public data object PrimaryDns : ApctlInfo()
    public data object SecondaryDns : ApctlInfo()
    public data object UseProxy : ApctlInfo()
    public data object ProxyUrl : ApctlInfo()
    public data object ProxyPort : ApctlInfo()
    public data object EapType : ApctlInfo()
    public data object StartBrowser : ApctlInfo()
    public data object Wifisp : ApctlInfo()
}

public sealed class ApctlInfoSecurityType {
    public data object None : ApctlInfoSecurityType()
    public data object Wep : ApctlInfoSecurityType()
    public data object Wpa : ApctlInfoSecurityType()
}

public sealed class HttpMethod {
    public data object Get : HttpMethod()
    public data object Post : HttpMethod()
    public data object Head : HttpMethod()
}

public sealed class HttpAuthType {
    public data object Basic : HttpAuthType()
    public data object Digest : HttpAuthType()
}

public open class SceUid(public var value: Int) {
    public var field0: Int
        get() = value
        set(v) { value = v }
}

public open class SceMpeg(public var value: COpaquePointer?) {
    public var field0: COpaquePointer?
        get() = value
        set(v) { value = v }
}

public open class SceMpegStream(public var value: COpaquePointer?) {
    public var field0: COpaquePointer?
        get() = value
        set(v) { value = v }
}

public open class Mp3Handle(public var value: Int) {
    public var field0: Int
        get() = value
        set(v) { value = v }
}

public open class RegHandle(public var value: UInt) {
    public var field0: UInt
        get() = value
        set(v) { value = v }
}

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: UByte,
    public var saData: List<UByte>,
)

public open class InAddr(public var sAddr: UInt)

public open class AudioInputParams(
    public var unknown1: Int,
    public var gain: Int,
    public var unknown2: Int,
    public var unknown3: Int,
    public var unknown4: Int,
    public var unknown5: Int,
)

public open class Atrac3BufferInfo(
    public var pucWritePositionFirstBuf: COpaquePointer?,
    public var uiWritableByteFirstBuf: UInt,
    public var uiMinWriteByteFirstBuf: UInt,
    public var uiReadPositionFirstBuf: UInt,
    public var pucWritePositionSecondBuf: COpaquePointer?,
    public var uiWritableByteSecondBuf: UInt,
    public var uiMinWriteByteSecondBuf: UInt,
    public var uiReadPositionSecondBuf: UInt,
)

public open class SceCtrlData(
    public var timestamp: UInt,
    public var buttons: Int,
    public var lx: UByte,
    public var ly: UByte,
    public var rsrv: List<UByte>,
)

public open class SceCtrlLatch(
    public var uiMake: UInt,
    public var uiBreak: UInt,
    public var uiPress: UInt,
    public var uiRelease: UInt,
)

public open class GeStack(public var stack: List<UInt>)

public open class GeCallbackData(
    public var signalFunc: GuCallbackFn?,
    public var signalArg: COpaquePointer?,
    public var finishFunc: GuCallbackFn?,
    public var finishArg: COpaquePointer?,
)

public open class GeListArgs(
    public var size: UInt,
    public var context: GeContext?,
    public var numStacks: UInt,
    public var stacks: GeStack?,
)

public open class GeBreakParam(public var buf: List<UInt>)

public open class SceKernelLoadExecParam(
    public var size: Int,
    public var args: Int,
    public var argp: COpaquePointer?,
    public var key: COpaquePointer?,
)

public open class Timeval(public var tvSec: Int, public var tvUsec: Int)

public open class Timezone(public var tzMinutesWest: Int, public var tzDstTime: Int)

public open class IntrHandlerOptionParam(
    public var size: Int,
    public var entry: UInt,
    public var common: UInt,
    public var gp: UInt,
    public var intrCode: UShort,
    public var subCount: UShort,
    public var intrLevel: UShort,
    public var enabled: UShort,
    public var calls: UInt,
    public var field1c: UInt,
    public var totalClockLo: UInt,
    public var totalClockHi: UInt,
    public var minClockLo: UInt,
    public var minClockHi: UInt,
    public var maxClockLo: UInt,
    public var maxClockHi: UInt,
)

public open class SceKernelLMOption(
    public var size: Int,
    public var mPidText: SceUid,
    public var mPidData: SceUid,
    public var flags: UInt,
    public var position: UByte,
    public var access: UByte,
    public var cReserved: List<UByte>,
)

public open class SceKernelSMOption(
    public var size: Int,
    public var mPidStack: SceUid,
    public var stackSize: Int,
    public var priority: Int,
    public var attribute: UInt,
)

public open class SceKernelModuleInfo(
    public var size: Int,
    public var nSegment: UByte,
    public var reserved: List<UByte>,
    public var segmentAddr: List<Int>,
    public var segmentSize: List<Int>,
    public var entryAddr: UInt,
    public var gpValue: UInt,
    public var textAddr: UInt,
    public var textSize: UInt,
    public var dataSize: UInt,
    public var bssSize: UInt,
    public var attribute: UShort,
    public var version: List<UByte>,
    public var name: List<UByte>,
)

public open class DebugProfilerRegs(
    public var enable: UInt,
    public var systemck: UInt,
    public var cpuck: UInt,
    public var internal: UInt,
    public var memory: UInt,
    public var copz: UInt,
    public var vfpu: UInt,
    public var sleep: UInt,
    public var busAccess: UInt,
    public var uncachedLoad: UInt,
    public var uncachedStore: UInt,
    public var cachedLoad: UInt,
    public var cachedStore: UInt,
    public var iMiss: UInt,
    public var dMiss: UInt,
    public var dWriteback: UInt,
    public var cop0Inst: UInt,
    public var fpuInst: UInt,
    public var vfpuInst: UInt,
    public var localBus: UInt,
)

public open class SceKernelSysClock(public var low: UInt, public var hi: UInt)

public open class SceKernelThreadOptParam(public var size: Int, public var stackMpid: SceUid)

public open class SceKernelThreadInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var status: Int,
    public var entry: SceKernelThreadEntry,
    public var stack: COpaquePointer?,
    public var stackSize: Int,
    public var gpReg: COpaquePointer?,
    public var initPriority: Int,
    public var currentPriority: Int,
    public var waitType: Int,
    public var waitId: SceUid,
    public var wakeupCount: Int,
    public var exitStatus: Int,
    public var runClocks: SceKernelSysClock,
    public var intrPreemptCount: UInt,
    public var threadPreemptCount: UInt,
    public var releaseCount: UInt,
)

public open class SceKernelThreadRunStatus(
    public var size: Int,
    public var status: Int,
    public var currentPriority: Int,
    public var waitType: Int,
    public var waitId: Int,
    public var wakeupCount: Int,
    public var runClocks: SceKernelSysClock,
    public var intrPreemptCount: UInt,
    public var threadPreemptCount: UInt,
    public var releaseCount: UInt,
)

public open class SceKernelSemaOptParam(public var size: Int)

public open class SceKernelSemaInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var initCount: Int,
    public var currentCount: Int,
    public var maxCount: Int,
    public var numWaitThreads: Int,
)

public open class SceKernelEventFlagInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var initPattern: UInt,
    public var currentPattern: UInt,
    public var numWaitThreads: Int,
)

public open class SceKernelEventFlagOptParam(public var size: Int)

public open class SceKernelMbxOptParam(public var size: Int)

public open class SceKernelMbxInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var numWaitThreads: Int,
    public var numMessages: Int,
    public var firstMessage: COpaquePointer?,
)

public open class SceKernelVTimerInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var active: Int,
    public var base: SceKernelSysClock,
    public var current: SceKernelSysClock,
    public var schedule: SceKernelSysClock,
    public var handler: SceKernelVTimerHandler,
    public var common: COpaquePointer?,
)

public open class SceKernelThreadEventHandlerInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var threadId: SceUid,
    public var mask: Int,
    public var handler: SceKernelThreadEventHandler,
    public var common: COpaquePointer?,
)

public open class SceKernelAlarmInfo(
    public var size: Int,
    public var schedule: SceKernelSysClock,
    public var handler: SceKernelAlarmHandler,
    public var common: COpaquePointer?,
)

public open class SceKernelSystemStatus(
    public var size: Int,
    public var status: UInt,
    public var idleClocks: SceKernelSysClock,
    public var comesOutOfIdleCount: UInt,
    public var threadSwitchCount: UInt,
    public var vfpuSwitchCount: UInt,
)

public open class SceKernelMppInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var bufSize: Int,
    public var freeSize: Int,
    public var numSendWaitThreads: Int,
    public var numReceiveWaitThreads: Int,
)

public open class SceKernelVplOptParam(public var size: Int)

public open class SceKernelVplInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var poolSize: Int,
    public var freeSize: Int,
    public var numWaitThreads: Int,
)

public open class SceKernelFplOptParam(public var size: Int)

public open class SceKernelFplInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var blockSize: Int,
    public var numBlocks: Int,
    public var freeBlocks: Int,
    public var numWaitThreads: Int,
)

public open class SceKernelVTimerOptParam(public var size: Int)

public open class SceKernelCallbackInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var threadId: SceUid,
    public var callback: SceKernelCallbackFunction,
    public var common: COpaquePointer?,
    public var notifyCount: Int,
    public var notifyArg: Int,
)

public open class UsbCamSetupStillParam(
    public var size: Int,
    public var resolution: UsbCamResolution,
    public var jpegSize: Int,
    public var reverseFlags: Int,
    public var delay: UsbCamDelay,
    public var compLevel: Int,
)

public open class UsbCamSetupStillExParam(
    public var size: Int,
    public var unk: UInt,
    public var resolution: UsbCamResolutionEx,
    public var jpegSize: Int,
    public var compLevel: Int,
    public var unk2: UInt,
    public var unk3: UInt,
    public var flip: Int,
    public var mirror: Int,
    public var delay: UsbCamDelay,
    public var unk4: List<UInt>,
)

public open class UsbCamSetupVideoParam(
    public var size: Int,
    public var resolution: UsbCamResolution,
    public var framerate: UsbCamFrameRate,
    public var whiteBalance: UsbCamWb,
    public var saturation: Int,
    public var brightness: Int,
    public var contrast: Int,
    public var sharpness: Int,
    public var effectMode: UsbCamEffectMode,
    public var frameSize: Int,
    public var unk: UInt,
    public var evlEvel: UsbCamEvLevel,
)

public open class UsbCamSetupVideoExParam(
    public var size: Int,
    public var unk: UInt,
    public var resolution: UsbCamResolutionEx,
    public var framerate: UsbCamFrameRate,
    public var unk2: UInt,
    public var unk3: UInt,
    public var whiteBalance: UsbCamWb,
    public var saturation: Int,
    public var brightness: Int,
    public var contrast: Int,
    public var sharpness: Int,
    public var unk4: UInt,
    public var unk5: UInt,
    public var unk6: List<UInt>,
    public var effectMode: UsbCamEffectMode,
    public var unk7: UInt,
    public var unk8: UInt,
    public var unk9: UInt,
    public var unk10: UInt,
    public var unk11: UInt,
    public var frameSize: Int,
    public var unk12: UInt,
    public var evLevel: UsbCamEvLevel,
)

public open class ScePspDateTime(
    public var year: UShort,
    public var month: UShort,
    public var day: UShort,
    public var hour: UShort,
    public var minutes: UShort,
    public var seconds: UShort,
    public var microseconds: UInt,
)

public open class SceIoStat(
    public var stMode: Int,
    public var stAttr: Int,
    public var stSize: Long,
    public var stCtime: ScePspDateTime,
    public var stAtime: ScePspDateTime,
    public var stMtime: ScePspDateTime,
    public var stPrivate: List<UInt>,
)

public open class UmdInfo(public var size: UInt, public var type: UmdType)

public open class SceMpegRingbuffer(
    public var packets: Int,
    public var unk0: UInt,
    public var unk1: UInt,
    public var unk2: UInt,
    public var unk3: UInt,
    public var data: COpaquePointer?,
    public var callback: SceMpegRingbufferCb,
    public var cbParam: COpaquePointer?,
    public var unk4: UInt,
    public var unk5: UInt,
    public var sceMpeg: COpaquePointer?,
)

public open class SceMpegAu(
    public var ptsMsb: UInt,
    public var pts: UInt,
    public var dtsMsb: UInt,
    public var dts: UInt,
    public var esBuffer: UInt,
    public var auSize: UInt,
)

public open class SceMpegAvcMode(public var unk0: Int, public var pixelFormat: DisplayPixelFormat)

public open class SceMpegLLI(
    public var src: COpaquePointer?,
    public var dst: COpaquePointer?,
    public var next: COpaquePointer?,
    public var size: Int,
)

public open class SceMpegYCrCbBuffer(
    public var frameBufferHeight16: Int,
    public var frameBufferWidth16: Int,
    public var unknown: Int,
    public var unknown2: Int,
    public var yBuffer: COpaquePointer?,
    public var yBuffer2: COpaquePointer?,
    public var crBuffer: COpaquePointer?,
    public var cbBuffer: COpaquePointer?,
    public var crBuffer2: COpaquePointer?,
    public var cbBuffer2: COpaquePointer?,
    public var frameHeight: Int,
    public var frameWidth: Int,
    public var frameBufferWidth: Int,
    public var unknown3: List<Int>,
)

public open class ScePspSRect(
    public var x: Short,
    public var y: Short,
    public var w: Short,
    public var h: Short,
)

public open class ScePspIRect(
    public var x: Int,
    public var y: Int,
    public var w: Int,
    public var h: Int,
)

public open class ScePspL64Rect(
    public var x: ULong,
    public var y: ULong,
    public var w: ULong,
    public var h: ULong,
)

public open class ScePspSVector2(public var x: Short, public var y: Short)

public open class ScePspIVector2(public var x: Int, public var y: Int)

public open class ScePspL64Vector2(public var x: ULong, public var y: ULong)

public open class ScePspSVector3(
    public var x: Short,
    public var y: Short,
    public var z: Short,
)

public open class ScePspIVector3(
    public var x: Int,
    public var y: Int,
    public var z: Int,
)

public open class ScePspL64Vector3(
    public var x: ULong,
    public var y: ULong,
    public var z: ULong,
)

public open class ScePspSVector4(
    public var x: Short,
    public var y: Short,
    public var z: Short,
    public var w: Short,
)

public open class ScePspIVector4(
    public var x: Int,
    public var y: Int,
    public var z: Int,
    public var w: Int,
)

public open class ScePspL64Vector4(
    public var x: ULong,
    public var y: ULong,
    public var z: ULong,
    public var w: ULong,
)

public open class ScePspIMatrix2(public var x: ScePspIVector2, public var y: ScePspIVector2)

public open class ScePspIMatrix3(
    public var x: ScePspIVector3,
    public var y: ScePspIVector3,
    public var z: ScePspIVector3,
)

public open class ScePspIMatrix4(
    public var x: ScePspIVector4,
    public var y: ScePspIVector4,
    public var z: ScePspIVector4,
    public var w: ScePspIVector4,
)

public open class ScePspIMatrix4Unaligned(
    public var x: ScePspIVector4,
    public var y: ScePspIVector4,
    public var z: ScePspIVector4,
    public var w: ScePspIVector4,
)

public open class SceMp3InitArg(
    public var mp3StreamStart: UInt,
    public var unk1: UInt,
    public var mp3StreamEnd: UInt,
    public var unk2: UInt,
    public var mp3Buf: COpaquePointer?,
    public var mp3BufSize: Int,
    public var pcmBuf: COpaquePointer?,
    public var pcmBufSize: Int,
)

public open class OpenPSID(public var data: List<UByte>)

public open class UtilityDialogCommon(
    public var size: UInt,
    public var language: SystemParamLanguage,
    public var buttonAccept: UtilityDialogButtonAccept,
    public var graphicsThread: Int,
    public var accessThread: Int,
    public var fontThread: Int,
    public var soundThread: Int,
    public var result: Int,
    public var reserved: List<Int>,
)

public open class UtilityNetconfAdhoc(public var name: List<UByte>, public var timeout: UInt)

public open class UtilityNetconfData(
    public var base: UtilityDialogCommon,
    public var action: UtilityNetconfAction,
    public var adhocparam: UtilityNetconfAdhoc?,
    public var hotspot: Int,
    public var hotspotConnected: Int,
    public var wifisp: Int,
)

public open class UtilitySavedataFileData(
    public var buf: COpaquePointer?,
    public var bufSize: Int,
    public var size: Int,
    public var unknown: Int,
)

public open class UtilitySavedataListSaveNewData(public var icon0: UtilitySavedataFileData, public var title: COpaquePointer?)

public open class UtilityGameSharingParams(
    public var base: UtilityDialogCommon,
    public var unknown1: Int,
    public var unknown2: Int,
    public var name: List<UByte>,
    public var unknown3: Int,
    public var unknown4: Int,
    public var unknown5: Int,
    public var result: Int,
    public var filepath: COpaquePointer?,
    public var mode: UtilityGameSharingMode,
    public var datatype: UtilityGameSharingDataType,
    public var data: COpaquePointer?,
    public var datasize: UInt,
)

public open class UtilityHtmlViewerParam(
    public var base: UtilityDialogCommon,
    public var memaddr: COpaquePointer?,
    public var memsize: UInt,
    public var unknown1: Int,
    public var unknown2: Int,
    public var initialurl: COpaquePointer?,
    public var numtabs: UInt,
    public var interfacemode: UtilityHtmlViewerInterfaceMode,
    public var options: Int,
    public var dldirname: COpaquePointer?,
    public var dlfilename: COpaquePointer?,
    public var uldirname: COpaquePointer?,
    public var ulfilename: COpaquePointer?,
    public var cookiemode: UtilityHtmlViewerCookieMode,
    public var unknown3: UInt,
    public var homeurl: COpaquePointer?,
    public var textsize: UtilityHtmlViewerTextSize,
    public var displaymode: UtilityHtmlViewerDisplayMode,
    public var connectmode: UtilityHtmlViewerConnectMode,
    public var disconnectmode: UtilityHtmlViewerDisconnectMode,
    public var memused: UInt,
    public var unknown4: List<Int>,
)

public open class SceUtilityOskData(
    public var unk00: Int,
    public var unk04: Int,
    public var language: SceUtilityOskInputLanguage,
    public var unk12: Int,
    public var inputtype: SceUtilityOskInputType,
    public var lines: Int,
    public var unk24: Int,
    public var desc: UShort?,
    public var intext: UShort?,
    public var outtextlength: Int,
    public var outtext: UShort?,
    public var result: SceUtilityOskResult,
    public var outtextlimit: Int,
)

public open class SceUtilityOskParams(
    public var base: UtilityDialogCommon,
    public var datacount: Int,
    public var data: SceUtilityOskData?,
    public var state: SceUtilityOskState,
    public var unk60: Int,
)

public open class SceNetMallocStat(
    public var pool: Int,
    public var maximum: Int,
    public var free: Int,
)

public open class SceNetAdhocctlAdhocId(
    public var unknown: Int,
    public var adhocId: List<UByte>,
    public var unk: List<UByte>,
)

public open class SceNetAdhocctlScanInfo(
    public var next: SceNetAdhocctlScanInfo?,
    public var channel: Int,
    public var name: List<UByte>,
    public var bssid: List<UByte>,
    public var unknown: List<UByte>,
    public var unknown2: Int,
)

public open class SceNetAdhocctlGameModeInfo(public var count: Int, public var macs: List<List<UByte>>)

public open class SceNetAdhocPtpStat(
    public var next: SceNetAdhocPtpStat?,
    public var ptpId: Int,
    public var mac: List<UByte>,
    public var peermac: List<UByte>,
    public var port: UShort,
    public var peerport: UShort,
    public var sentData: UInt,
    public var rcvdData: UInt,
    public var state: ScePspnetAdhocPtpState,
)

public open class SceNetAdhocPdpStat(
    public var next: SceNetAdhocPdpStat?,
    public var pdpId: Int,
    public var mac: List<UByte>,
    public var port: UShort,
    public var rcvdData: UInt,
)

public open class AdhocPoolStat(
    public var size: Int,
    public var maxsize: Int,
    public var freesize: Int,
)

public open class GeContext(public var context: List<UInt>)

public open class SceKernelUtilsSha1Context(
    public var h: List<UInt>,
    public var usRemains: UShort,
    public var usComputed: UShort,
    public var ullTotalLen: ULong,
    public var buf: List<UByte>,
)

public open class SceKernelUtilsMt19937Context(public var count: UInt, public var state: List<UInt>)

public open class SceKernelUtilsMd5Context(
    public var h: List<UInt>,
    public var pad: UInt,
    public var usRemains: UShort,
    public var usComputed: UShort,
    public var ullTotalLen: ULong,
    public var buf: List<UByte>,
)

public open class SceIoDirent(
    public var dStat: SceIoStat,
    public var dName: List<UByte>,
    public var dPrivate: COpaquePointer?,
    public var dummy: Int,
)

public open class ScePspFRect(
    public var x: Float,
    public var y: Float,
    public var w: Float,
    public var h: Float,
)

public open class ScePspFVector3(
    public var x: Float,
    public var y: Float,
    public var z: Float,
)

public open class ScePspFVector4(
    public var x: Float,
    public var y: Float,
    public var z: Float,
    public var w: Float,
)

public open class ScePspFVector4Unaligned(
    public var x: Float,
    public var y: Float,
    public var z: Float,
    public var w: Float,
)

public open class ScePspFVector2(public var x: Float, public var y: Float)

public open class ScePspFMatrix2(public var x: ScePspFVector2, public var y: ScePspFVector2)

public open class ScePspFMatrix3(
    public var x: ScePspFVector3,
    public var y: ScePspFVector3,
    public var z: ScePspFVector3,
)

public open class ScePspFMatrix4(
    public var x: ScePspFVector4,
    public var y: ScePspFVector4,
    public var z: ScePspFVector4,
    public var w: ScePspFVector4,
)

public open class ScePspFMatrix4Unaligned(
    public var x: ScePspFVector4,
    public var y: ScePspFVector4,
    public var z: ScePspFVector4,
    public var w: ScePspFVector4,
)

public open class ScePspVector3(
    public var fv: ScePspFVector3? = null,
    public var iv: ScePspIVector3? = null,
    public var f: List<Float>? = null,
    public var i: List<Int>? = null,
)

public open class ScePspVector4(
    public var fv: ScePspFVector4? = null,
    public var iv: ScePspIVector4? = null,
    public var qw: U128? = null,
    public var f: List<Float>? = null,
    public var i: List<Int>? = null,
)

public open class ScePspMatrix2(
    public var fm: ScePspFMatrix2? = null,
    public var im: ScePspIMatrix2? = null,
    public var fv: List<ScePspFVector2>? = null,
    public var iv: List<ScePspIVector2>? = null,
    public var v: List<ScePspVector2>? = null,
    public var f: List<List<Float>>? = null,
    public var i: List<List<Int>>? = null,
)

public open class ScePspMatrix3(
    public var fm: ScePspFMatrix3? = null,
    public var im: ScePspIMatrix3? = null,
    public var fv: List<ScePspFVector3>? = null,
    public var iv: List<ScePspIVector3>? = null,
    public var v: List<ScePspVector3>? = null,
    public var f: List<List<Float>>? = null,
    public var i: List<List<Int>>? = null,
)

public open class ScePspVector2(
    public var fv: ScePspFVector2? = null,
    public var iv: ScePspIVector2? = null,
    public var f: List<Float>? = null,
    public var i: List<Int>? = null,
)

public open class ScePspMatrix4(
    public var fm: ScePspFMatrix4? = null,
    public var im: ScePspIMatrix4? = null,
    public var fv: List<ScePspFVector4>? = null,
    public var iv: List<ScePspIVector4>? = null,
    public var v: List<ScePspVector4>? = null,
    public var f: List<List<Float>>? = null,
    public var i: List<List<Int>>? = null,
)

public open class Key(
    public var keyType: KeyType,
    public var name: List<UByte>,
    public var nameLen: UInt,
    public var unk2: UInt,
    public var unk3: UInt,
)

public open class UtilityMsgDialogParams(
    public var base: UtilityDialogCommon,
    public var unknown: Int,
    public var mode: UtilityMsgDialogMode,
    public var errorValue: UInt,
    public var message: List<UByte>,
    public var options: Int,
    public var buttonPressed: UtilityMsgDialogPressed,
)

public open class UtilityNetData(public var asUint: UInt? = null, public var asString: List<UByte>? = null)

public open class UtilitySavedataSFOParam(
    public var title: List<UByte>,
    public var savedataTitle: List<UByte>,
    public var detail: List<UByte>,
    public var parentalLevel: UByte,
    public var unknown: List<UByte>,
)

public open class SceUtilitySavedataParam(
    public var base: UtilityDialogCommon,
    public var mode: UtilitySavedataMode,
    public var unknown1: Int,
    public var overwrite: Int,
    public var gameName: List<UByte>,
    public var reserved: List<UByte>,
    public var saveName: List<UByte>,
    public var saveNameList: List<UByte>?,
    public var fileName: List<UByte>,
    public var reserved1: List<UByte>,
    public var dataBuf: COpaquePointer?,
    public var dataBufSize: Int,
    public var dataSize: Int,
    public var sfoParam: UtilitySavedataSFOParam,
    public var icon0FileData: UtilitySavedataFileData,
    public var icon1FileData: UtilitySavedataFileData,
    public var pic1FileData: UtilitySavedataFileData,
    public var snd0FileData: UtilitySavedataFileData,
    public var newData: UtilitySavedataListSaveNewData?,
    public var focus: UtilitySavedataFocus,
    public var unknown2: List<Int>,
    public var key: List<UByte>,
    public var unknown3: List<UByte>,
)

public open class SceNetAdhocctlPeerInfo(
    public var next: SceNetAdhocctlPeerInfo?,
    public var nickname: List<UByte>,
    public var mac: List<UByte>,
    public var unknown: List<UByte>,
    public var timestamp: UInt,
)

public open class SceNetAdhocctlParams(
    public var channel: Int,
    public var name: List<UByte>,
    public var bssid: List<UByte>,
    public var nickname: List<UByte>,
)

public open class SceNetApctlInfo(
    public var name: List<UByte>? = null,
    public var bssid: List<UByte>? = null,
    public var ssid: List<UByte>? = null,
    public var ssidLength: UInt? = null,
    public var securityType: UInt? = null,
    public var strength: UByte? = null,
    public var channel: UByte? = null,
    public var powerSave: UByte? = null,
    public var ip: List<UByte>? = null,
    public var subNetMask: List<UByte>? = null,
    public var gateway: List<UByte>? = null,
    public var primaryDns: List<UByte>? = null,
    public var secondaryDns: List<UByte>? = null,
    public var useProxy: UInt? = null,
    public var proxyUrl: List<UByte>? = null,
    public var proxyPort: UShort? = null,
    public var eapType: UInt? = null,
    public var startBrowser: UInt? = null,
    public var wifisp: UInt? = null,
)

public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val AUDIO_VOLUME_MAX: UInt = 0x8000u

public val AUDIO_CHANNEL_MAX: UInt = 8u

public val AUDIO_NEXT_CHANNEL: Int = -1

public val AUDIO_SAMPLE_MIN: UInt = 64u

public val AUDIO_SAMPLE_MAX: UInt = 65472u

public val PSP_CTRL_SELECT: Int = 0x000001

public val PSP_CTRL_START: Int = 0x000008

public val PSP_CTRL_UP: Int = 0x000010

public val PSP_CTRL_RIGHT: Int = 0x000020

public val PSP_CTRL_DOWN: Int = 0x000040

public val PSP_CTRL_LEFT: Int = 0x000080

public val PSP_CTRL_LTRIGGER: Int = 0x000100

public val PSP_CTRL_RTRIGGER: Int = 0x000200

public val PSP_CTRL_TRIANGLE: Int = 0x001000

public val PSP_CTRL_CIRCLE: Int = 0x002000

public val PSP_CTRL_CROSS: Int = 0x004000

public val PSP_CTRL_SQUARE: Int = 0x008000

public val PSP_CTRL_HOME: Int = 0x010000

public val PSP_CTRL_HOLD: Int = 0x020000

public val PSP_CTRL_NOTE: Int = 0x800000

public val PSP_CTRL_SCREEN: Int = 0x400000

public val PSP_CTRL_VOLUP: Int = 0x100000

public val PSP_CTRL_VOLDOWN: Int = 0x200000

public val PSP_CTRL_WLAN_UP: Int = 0x040000

public val PSP_CTRL_REMOTE: Int = 0x080000

public val PSP_CTRL_DISC: Int = 0x1000000

public val PSP_CTRL_MS: Int = 0x2000000

public val USB_CAM_PID: Int = 0x282

public val USB_BUS_DRIVER_NAME: String = "USBBusDriver"

public val USB_CAM_DRIVER_NAME: String = "USBCamDriver"

public val USB_CAM_MIC_DRIVER_NAME: String = "USBCamMicDriver"

public val USB_STOR_DRIVER_NAME: String = "USBStor_Driver"

public val ACTIVATED: Int = 0x200

public val CONNECTED: Int = 0x020

public val ESTABLISHED: Int = 0x002

public val USB_CAM_FLIP: Int = 1

public val USB_CAM_MIRROR: Int = 0x100

public val THREAD_ATTR_VFPU: Int = 0x00004000

public val THREAD_ATTR_USER: Int = 0x80000000

public val THREAD_ATTR_USBWLAN: Int = 0xa0000000

public val THREAD_ATTR_VSH: Int = 0xc0000000

public val THREAD_ATTR_SCRATCH_SRAM: Int = 0x00008000

public val THREAD_ATTR_NO_FILLSTACK: Int = 0x00100000

public val THREAD_ATTR_CLEAR_STACK: Int = 0x00200000

public val EVENT_WAIT_MULTIPLE: Int = 0x200

public val EVENT_WAIT_AND: Int = 0

public val EVENT_WAIT_OR: Int = 1

public val EVENT_WAIT_CLEAR: Int = 0x20

public val POWER_INFO_POWER_SWITCH: Int = 0x80000000

public val POWER_INFO_HOLD_SWITCH: Int = 0x40000000

public val POWER_INFO_STANDBY: Int = 0x00080000

public val POWER_INFO_RESUME_COMPLETE: Int = 0x00040000

public val POWER_INFO_RESUMING: Int = 0x00020000

public val POWER_INFO_SUSPENDING: Int = 0x00010000

public val POWER_INFO_AC_POWER: Int = 0x00001000

public val POWER_INFO_BATTERY_LOW: Int = 0x00000100

public val POWER_INFO_BATTERY_EXIST: Int = 0x00000080

public val POWER_INFO_BATTERY_POWER: Int = 0x0000007

public val FIO_S_IFLNK: Int = 0x4000

public val FIO_S_IFDIR: Int = 0x1000

public val FIO_S_IFREG: Int = 0x2000

public val FIO_S_ISUID: Int = 0x0800

public val FIO_S_ISGID: Int = 0x0400

public val FIO_S_ISVTX: Int = 0x0200

public val FIO_S_IRUSR: Int = 0x0100

public val FIO_S_IWUSR: Int = 0x0080

public val FIO_S_IXUSR: Int = 0x0040

public val FIO_S_IRGRP: Int = 0x0020

public val FIO_S_IWGRP: Int = 0x0010

public val FIO_S_IXGRP: Int = 0x0008

public val FIO_S_IROTH: Int = 0x0004

public val FIO_S_IWOTH: Int = 0x0002

public val FIO_S_IXOTH: Int = 0x0001

public val FIO_SO_IFLNK: Int = 0x0008

public val FIO_SO_IFDIR: Int = 0x0010

public val FIO_SO_IFREG: Int = 0x0020

public val FIO_SO_IROTH: Int = 0x0004

public val FIO_SO_IWOTH: Int = 0x0002

public val FIO_SO_IXOTH: Int = 0x0001

public val PSP_O_RD_ONLY: Int = 0x0001

public val PSP_O_WR_ONLY: Int = 0x0002

public val PSP_O_RD_WR: Int = 0x0003

public val PSP_O_NBLOCK: Int = 0x0004

public val PSP_O_DIR: Int = 0x0008

public val PSP_O_APPEND: Int = 0x0100

public val PSP_O_CREAT: Int = 0x0200

public val PSP_O_TRUNC: Int = 0x0400

public val PSP_O_EXCL: Int = 0x0800

public val PSP_O_NO_WAIT: Int = 0x8000

public val UMD_NOT_PRESENT: Int = 0x01

public val UMD_PRESENT: Int = 0x02

public val UMD_CHANGED: Int = 0x04

public val UMD_INITING: Int = 0x08

public val UMD_INITED: Int = 0x10

public val UMD_READY: Int = 0x20

public val PLAY_PAUSE: Int = 0x1

public val FORWARD: Int = 0x4

public val BACK: Int = 0x8

public val VOL_UP: Int = 0x10

public val VOL_DOWN: Int = 0x20

public val HOLD: Int = 0x80

public val GU_PI: Float = 3.141593

public val GU_TEXTURE_8BIT: Int = 1

public val GU_TEXTURE_16BIT: Int = 2

public val GU_TEXTURE_32BITF: Int = 3

public val GU_COLOR_5650: Int = 4 shl 2

public val GU_COLOR_5551: Int = 5 shl 2

public val GU_COLOR_4444: Int = 6 shl 2

public val GU_COLOR_8888: Int = 7 shl 2

public val GU_NORMAL_8BIT: Int = 1 shl 5

public val GU_NORMAL_16BIT: Int = 2 shl 5

public val GU_NORMAL_32BITF: Int = 3 shl 5

public val GU_VERTEX_8BIT: Int = 1 shl 7

public val GU_VERTEX_16BIT: Int = 2 shl 7

public val GU_VERTEX_32BITF: Int = 3 shl 7

public val GU_WEIGHT_8BIT: Int = 1 shl 9

public val GU_WEIGHT_16BIT: Int = 2 shl 9

public val GU_WEIGHT_32BITF: Int = 3 shl 9

public val GU_INDEX_8BIT: Int = 1 shl 11

public val GU_INDEX_16BIT: Int = 2 shl 11

public val GU_WEIGHTS1: Int = (((1 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS2: Int = (((2 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS3: Int = (((3 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS4: Int = (((4 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS5: Int = (((5 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS6: Int = (((6 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS7: Int = (((7 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS8: Int = (((8 - 1) and 7) shl 14).toInt()

public val GU_VERTICES1: Int = (((1 - 1) and 7) shl 18).toInt()

public val GU_VERTICES2: Int = (((2 - 1) and 7) shl 18).toInt()

public val GU_VERTICES3: Int = (((3 - 1) and 7) shl 18).toInt()

public val GU_VERTICES4: Int = (((4 - 1) and 7) shl 18).toInt()

public val GU_VERTICES5: Int = (((5 - 1) and 7) shl 18).toInt()

public val GU_VERTICES6: Int = (((6 - 1) and 7) shl 18).toInt()

public val GU_VERTICES7: Int = (((7 - 1) and 7) shl 18).toInt()

public val GU_VERTICES8: Int = (((8 - 1) and 7) shl 18).toInt()

public val GU_TRANSFORM_2D: Int = 1 shl 23

public val GU_TRANSFORM_3D: Int = 0

public val GU_COLOR_BUFFER_BIT: Int = 1

public val GU_STENCIL_BUFFER_BIT: Int = 2

public val GU_DEPTH_BUFFER_BIT: Int = 4

public val GU_FAST_CLEAR_BIT: Int = 16

public val GU_AMBIENT: Int = 1

public val GU_DIFFUSE: Int = 2

public val GU_SPECULAR: Int = 4

public val GU_UNKNOWN_LIGHT_COMPONENT: Int = 8

public val SYSTEM_REGISTRY: List<UByte> = "/system".encodeToByteArray()

public val REG_KEYNAME_SIZE: UInt = 27u

public val UTILITY_MSGDIALOG_ERROR: Int = 0

public val UTILITY_MSGDIALOG_TEXT: Int = 1

public val UTILITY_MSGDIALOG_YES_NO_BUTTONS: Int = 0x10

public val UTILITY_MSGDIALOG_DEFAULT_NO: Int = 0x100

public val UTILITY_HTMLVIEWER_OPEN_SCE_START_PAGE: Int = 0x000001

public val UTILITY_HTMLVIEWER_DISABLE_STARTUP_LIMITS: Int = 0x000002

public val UTILITY_HTMLVIEWER_DISABLE_EXIT_DIALOG: Int = 0x000004

public val UTILITY_HTMLVIEWER_DISABLE_CURSOR: Int = 0x000008

public val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_COMPLETE_DIALOG: Int = 0x000010

public val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_START_DIALOG: Int = 0x000020

public val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_DESTINATION_DIALOG: Int = 0x000040

public val UTILITY_HTMLVIEWER_LOCK_DOWNLOAD_DESTINATION_DIALOG: Int = 0x000080

public val UTILITY_HTMLVIEWER_DISABLE_TAB_DISPLAY: Int = 0x000100

public val UTILITY_HTMLVIEWER_ENABLE_ANALOG_HOLD: Int = 0x000200

public val UTILITY_HTMLVIEWER_ENABLE_FLASH: Int = 0x000400

public val UTILITY_HTMLVIEWER_DISABLE_LRTRIGGER: Int = 0x000800

public expect fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int

public expect fun sceAudioChRelease(channel: Int): Int

public expect fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioGetChannelRestLen(channel: Int): Int

public expect fun sceAudioGetChannelRestLength(channel: Int): Int

public expect fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int

public expect fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int

public expect fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int

public expect fun sceAudioOutput2Reserve(sampleCount: Int): Int

public expect fun sceAudioOutput2Release(): Int

public expect fun sceAudioOutput2ChangeLength(sampleCount: Int): Int

public expect fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutput2GetRestSample(): Int

public expect fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int

public expect fun sceAudioSRCChRelease(): Int

public expect fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int

public expect fun sceAudioInputInitEx(params: AudioInputParams?): Int

public expect fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?)

public expect fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?)

public expect fun sceAudioGetInputLength(): Int

public expect fun sceAudioWaitInputEnd(): Int

public expect fun sceAudioPollInputEnd(): Int

public expect fun sceAtracGetAtracID(uiCodecType: UInt): Int

public expect fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int

public expect fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int

public expect fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int

public expect fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int

public expect fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int

public expect fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int

public expect fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int

public expect fun sceAtracReleaseAtracID(atracId: Int): Int

public expect fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int

public expect fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int

public expect fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int

public expect fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int

public expect fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int

public expect fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int

public expect fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int

public expect fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int

public expect fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int

public expect fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int

public expect fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int

public expect fun sceCtrlSetSamplingCycle(cycle: Int): Int

public expect fun sceCtrlGetSamplingCycle(pcycle: Int?): Int

public expect fun sceCtrlSetSamplingMode(mode: CtrlMode): Int

public expect fun sceCtrlGetSamplingMode(pmode: Int?): Int

public expect fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int

public expect fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int

public expect fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int

public expect fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int

public expect fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt

public expect fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int

public expect fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt

public expect fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int

public expect fun sceDisplayGetVcount(): UInt

public expect fun sceDisplayWaitVblank(): Int

public expect fun sceDisplayWaitVblankCB(): Int

public expect fun sceDisplayWaitVblankStart(): Int

public expect fun sceDisplayWaitVblankStartCB(): Int

public expect fun sceDisplayGetAccumulatedHcount(): Int

public expect fun sceDisplayGetCurrentHcount(): Int

public expect fun sceDisplayGetFramePerSec(): Float

public expect fun sceDisplayIsForeground(): Int

public expect fun sceDisplayIsVblank(): Int

public expect fun sceGeEdramGetSize(): UInt

public expect fun sceGeEdramGetAddr(): COpaquePointer?

public expect fun sceGeEdramSetAddrTranslation(width: Int): Int

public expect fun sceGeGetCmd(cmd: Int): UInt

public expect fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int

public expect fun sceGeGetStack(stackId: Int, stack: GeStack?): Int

public expect fun sceGeSaveContext(context: GeContext?): Int

public expect fun sceGeRestoreContext(context: GeContext?): Int

public expect fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int

public expect fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int

public expect fun sceGeListDeQueue(qid: Int): Int

public expect fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int

public expect fun sceGeListSync(qid: Int, syncType: Int): GeListState

public expect fun sceGeDrawSync(syncType: Int): GeListState

public expect fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int

public expect fun sceGeContinue(): Int

public expect fun sceGeSetCallback(cb: GeCallbackData?): Int

public expect fun sceGeUnsetCallback(cbid: Int): Int

public expect fun sceKernelExitGame()

public expect fun sceKernelRegisterExitCallback(id: SceUid): Int

public expect fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int

public expect fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid

public expect fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer?

public expect fun sceKernelFreePartitionMemory(blockid: SceUid): Int

public expect fun sceKernelTotalFreeMemSize(): ULong

public expect fun sceKernelMaxFreeMemSize(): ULong

public expect fun sceKernelDevkitVersion(): UInt

public expect fun sceKernelSetCompiledSdkVersion(version: UInt): Int

public expect fun sceKernelGetCompiledSdkVersion(): UInt

public expect fun sceKernelLibcTime(t: Int?): Int

public expect fun sceKernelLibcClock(): UInt

public expect fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int

public expect fun sceKernelDcacheWritebackAll()

public expect fun sceKernelDcacheWritebackInvalidateAll()

public expect fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelIcacheInvalidateAll()

public expect fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int

public expect fun sceKernelUtilsMt19937UInt(ctx: SceKernelUtilsMt19937Context?): UInt

public expect fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int

public expect fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int

public expect fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int

public expect fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int

public expect fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int

public expect fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int

public expect fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int

public expect fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int

public expect fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int

public expect fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int

public expect fun sceKernelCpuSuspendIntr(): UInt

public expect fun sceKernelCpuResumeIntr(flags: UInt)

public expect fun sceKernelCpuResumeIntrWithSync(flags: UInt)

public expect fun sceKernelIsCpuIntrSuspended(flags: UInt): Int

public expect fun sceKernelIsCpuIntrEnable(): Int

public expect fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int

public expect fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int

public expect fun sceKernelUnloadModule(modId: SceUid): Int

public expect fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int

public expect fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int

public expect fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int

public expect fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int

public expect fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int

public expect fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int

public expect fun sceKernelVolatileMemUnlock(unk: Int): Int

public expect fun sceKernelStdin(): SceUid

public expect fun sceKernelStdout(): SceUid

public expect fun sceKernelStderr(): SceUid

public expect fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType

public expect fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: SceKernelThreadOptParam?): SceUid

public expect fun sceKernelDeleteThread(thid: SceUid): Int

public expect fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int

public expect fun sceKernelExitThread(status: Int): Int

public expect fun sceKernelExitDeleteThread(status: Int): Int

public expect fun sceKernelTerminateThread(thid: SceUid): Int

public expect fun sceKernelTerminateDeleteThread(thid: SceUid): Int

public expect fun sceKernelSuspendDispatchThread(): Int

public expect fun sceKernelResumeDispatchThread(state: Int): Int

public expect fun sceKernelSleepThread(): Int

public expect fun sceKernelSleepThreadCB(): Int

public expect fun sceKernelWakeupThread(thid: SceUid): Int

public expect fun sceKernelCancelWakeupThread(thid: SceUid): Int

public expect fun sceKernelSuspendThread(thid: SceUid): Int

public expect fun sceKernelResumeThread(thid: SceUid): Int

public expect fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int

public expect fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int

public expect fun sceKernelDelayThread(delay: UInt): Int

public expect fun sceKernelDelayThreadCB(delay: UInt): Int

public expect fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int

public expect fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int

public expect fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int

public expect fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int

public expect fun sceKernelRotateThreadReadyQueue(priority: Int): Int

public expect fun sceKernelReleaseWaitThread(thid: SceUid): Int

public expect fun sceKernelGetThreadId(): Int

public expect fun sceKernelGetThreadCurrentPriority(): Int

public expect fun sceKernelGetThreadExitStatus(thid: SceUid): Int

public expect fun sceKernelCheckThreadStack(): Int

public expect fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int

public expect fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int

public expect fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int

public expect fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: SceKernelSemaOptParam?): SceUid

public expect fun sceKernelDeleteSema(semaId: SceUid): Int

public expect fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int

public expect fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int

public expect fun sceKernelPollSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int

public expect fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: SceKernelEventFlagOptParam?): SceUid

public expect fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int

public expect fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int

public expect fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int

public expect fun sceKernelDeleteEventFlag(evId: SceUid): Int

public expect fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int

public expect fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: SceKernelMbxOptParam?): SceUid

public expect fun sceKernelDeleteMbx(mbxId: SceUid): Int

public expect fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int

public expect fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int

public expect fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int

public expect fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int

public expect fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid

public expect fun sceKernelSetSysClockAlarm(clock: SceKernelSysClock?, handler: SceKernelAlarmHandler?, common: COpaquePointer?): SceUid

public expect fun sceKernelCancelAlarm(alarmId: SceUid): Int

public expect fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int

public expect fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid

public expect fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int

public expect fun sceKernelDeleteCallback(cb: SceUid): Int

public expect fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int

public expect fun sceKernelCancelCallback(cb: SceUid): Int

public expect fun sceKernelGetCallbackCount(cb: SceUid): Int

public expect fun sceKernelCheckCallback(): Int

public expect fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int

public expect fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int

public expect fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid

public expect fun sceKernelDeleteMsgPipe(uid: SceUid): Int

public expect fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int

public expect fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int

public expect fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int

public expect fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int

public expect fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: SceKernelVplOptParam?): SceUid

public expect fun sceKernelDeleteVpl(uid: SceUid): Int

public expect fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int

public expect fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int

public expect fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int

public expect fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int

public expect fun sceKernelDeleteFpl(uid: SceUid): Int

public expect fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int

public expect fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int

public expect fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int

public expect fun sceKernelUSec2SysClockWide(usec: UInt): Long

public expect fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int

public expect fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int

public expect fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int

public expect fun sceKernelGetSystemTimeWide(): Long

public expect fun sceKernelGetSystemTimeLow(): UInt

public expect fun sceKernelCreateVTimer(name: COpaquePointer?, opt: SceKernelVTimerOptParam?): SceUid

public expect fun sceKernelDeleteVTimer(uid: SceUid): Int

public expect fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int

public expect fun sceKernelGetVTimerBaseWide(uid: SceUid): Long

public expect fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int

public expect fun sceKernelGetVTimerTimeWide(uid: SceUid): Long

public expect fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int

public expect fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long

public expect fun sceKernelStartVTimer(uid: SceUid): Int

public expect fun sceKernelStopVTimer(uid: SceUid): Int

public expect fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int

public expect fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int

public expect fun sceKernelCancelVTimerHandler(uid: SceUid): Int

public expect fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int

public expect fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid

public expect fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int

public expect fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int

public expect fun sceKernelReferThreadProfiler(): DebugProfilerRegs?

public expect fun sceKernelReferGlobalProfiler(): DebugProfilerRegs?

public expect fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int

public expect fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int

public expect fun sceUsbActivate(pid: UInt): Int

public expect fun sceUsbDeactivate(pid: UInt): Int

public expect fun sceUsbGetState(): Int

public expect fun sceUsbGetDrvState(driverName: COpaquePointer?): Int

public expect fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int

public expect fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int

public expect fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamStillWaitInputEnd(): Int

public expect fun sceUsbCamStillPollInputEnd(): Int

public expect fun sceUsbCamStillCancelInput(): Int

public expect fun sceUsbCamStillGetInputLength(): Int

public expect fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int

public expect fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int

public expect fun sceUsbCamStartVideo(): Int

public expect fun sceUsbCamStopVideo(): Int

public expect fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamWaitReadVideoFrameEnd(): Int

public expect fun sceUsbCamPollReadVideoFrameEnd(): Int

public expect fun sceUsbCamGetReadVideoFrameSize(): Int

public expect fun sceUsbCamSetSaturation(saturation: Int): Int

public expect fun sceUsbCamSetBrightness(brightness: Int): Int

public expect fun sceUsbCamSetContrast(contrast: Int): Int

public expect fun sceUsbCamSetSharpness(sharpness: Int): Int

public expect fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int

public expect fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int

public expect fun sceUsbCamSetReverseMode(reverseFlags: Int): Int

public expect fun sceUsbCamSetZoom(zoom: Int): Int

public expect fun sceUsbCamGetSaturation(saturation: Int?): Int

public expect fun sceUsbCamGetBrightness(brightness: Int?): Int

public expect fun sceUsbCamGetContrast(contrast: Int?): Int

public expect fun sceUsbCamGetSharpness(sharpness: Int?): Int

public expect fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int

public expect fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int

public expect fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int

public expect fun sceUsbCamGetZoom(zoom: Int?): Int

public expect fun sceUsbCamAutoImageReverseSW(on: Int): Int

public expect fun sceUsbCamGetAutoImageReverseState(): Int

public expect fun sceUsbCamGetLensDirection(): Int

public expect fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int

public expect fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int

public expect fun sceUsbstorBootSetCapacity(size: UInt): Int

public expect fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int

public expect fun scePowerUnregisterCallback(slot: Int): Int

public expect fun scePowerIsPowerOnline(): Int

public expect fun scePowerIsBatteryExist(): Int

public expect fun scePowerIsBatteryCharging(): Int

public expect fun scePowerGetBatteryChargingStatus(): Int

public expect fun scePowerIsLowBattery(): Int

public expect fun scePowerGetBatteryLifePercent(): Int

public expect fun scePowerGetBatteryLifeTime(): Int

public expect fun scePowerGetBatteryTemp(): Int

public expect fun scePowerGetBatteryElec(): Int

public expect fun scePowerGetBatteryVolt(): Int

public expect fun scePowerSetCpuClockFrequency(cpufreq: Int): Int

public expect fun scePowerSetBusClockFrequency(busfreq: Int): Int

public expect fun scePowerGetCpuClockFrequency(): Int

public expect fun scePowerGetCpuClockFrequencyInt(): Int

public expect fun scePowerGetCpuClockFrequencyFloat(): Float

public expect fun scePowerGetBusClockFrequency(): Int

public expect fun scePowerGetBusClockFrequencyInt(): Int

public expect fun scePowerGetBusClockFrequencyFloat(): Float

public expect fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int

public expect fun scePowerLock(unknown: Int): Int

public expect fun scePowerUnlock(unknown: Int): Int

public expect fun scePowerTick(t: PowerTick): Int

public expect fun scePowerGetIdleTimer(): Int

public expect fun scePowerIdleTimerEnable(unknown: Int): Int

public expect fun scePowerIdleTimerDisable(unknown: Int): Int

public expect fun scePowerRequestStandby(): Int

public expect fun scePowerRequestSuspend(): Int

public expect fun sceWlanDevIsPowerOn(): Int

public expect fun sceWlanGetSwitchState(): Int

public expect fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int

public expect fun sceWlanDevAttach(): Int

public expect fun sceWlanDevDetach(): Int

public expect fun sceRtcGetTickResolution(): UInt

public expect fun sceRtcGetCurrentTick(tick: ULong?): Int

public expect fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int

public expect fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int

public expect fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int

public expect fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int

public expect fun sceRtcIsLeapYear(year: Int): Int

public expect fun sceRtcGetDaysInMonth(year: Int, month: Int): Int

public expect fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int

public expect fun sceRtcCheckValid(date: ScePspDateTime?): Int

public expect fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int

public expect fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int

public expect fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int

public expect fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int

public expect fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int

public expect fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int

public expect fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int

public expect fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int

public expect fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int

public expect fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int

public expect fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int

public expect fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int

public expect fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int

public expect fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int

public expect fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int

public expect fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int

public expect fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int

public expect fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int

public expect fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int

public expect fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int

public expect fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int

public expect fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int

public expect fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int

public expect fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int

public expect fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid

public expect fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid

public expect fun sceIoClose(fd: SceUid): Int

public expect fun sceIoCloseAsync(fd: SceUid): Int

public expect fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int

public expect fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int

public expect fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int

public expect fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int

public expect fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long

public expect fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int

public expect fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int

public expect fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int

public expect fun sceIoRemove(file: COpaquePointer?): Int

public expect fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int

public expect fun sceIoRmdir(path: COpaquePointer?): Int

public expect fun sceIoChdir(path: COpaquePointer?): Int

public expect fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int

public expect fun sceIoDopen(dirname: COpaquePointer?): SceUid

public expect fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int

public expect fun sceIoDclose(fd: SceUid): Int

public expect fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int

public expect fun sceIoUnassign(dev: COpaquePointer?): Int

public expect fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int

public expect fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int

public expect fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoSync(device: COpaquePointer?, unk: UInt): Int

public expect fun sceIoWaitAsync(fd: SceUid, res: Long?): Int

public expect fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int

public expect fun sceIoPollAsync(fd: SceUid, res: Long?): Int

public expect fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int

public expect fun sceIoCancel(fd: SceUid): Int

public expect fun sceIoGetDevType(fd: SceUid): Int

public expect fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int

public expect fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int

public expect fun sceJpegInitMJpeg(): Int

public expect fun sceJpegFinishMJpeg(): Int

public expect fun sceJpegCreateMJpeg(width: Int, height: Int): Int

public expect fun sceJpegDeleteMJpeg(): Int

public expect fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int

public expect fun sceUmdCheckMedium(): Int

public expect fun sceUmdGetDiscInfo(info: UmdInfo?): Int

public expect fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int

public expect fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int

public expect fun sceUmdWaitDriveStat(state: Int): Int

public expect fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int

public expect fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int

public expect fun sceUmdCancelWaitDriveStat(): Int

public expect fun sceUmdGetDriveStat(): Int

public expect fun sceUmdGetErrorStat(): Int

public expect fun sceUmdRegisterUMDCallBack(cbid: Int): Int

public expect fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int

public expect fun sceUmdReplacePermit(): Int

public expect fun sceUmdReplaceProhibit(): Int

public expect fun sceMpegInit(): Int

public expect fun sceMpegFinish()

public expect fun sceMpegRingbufferQueryMemSize(packets: Int): Int

public expect fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int

public expect fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?)

public expect fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int

public expect fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int

public expect fun sceMpegQueryMemSize(unk: Int): Int

public expect fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int

public expect fun sceMpegDelete(handle: SceMpeg)

public expect fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int

public expect fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int

public expect fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream

public expect fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream)

public expect fun sceMpegFlushAllStream(handle: SceMpeg): Int

public expect fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer?

public expect fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?)

public expect fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int

public expect fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int

public expect fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int

public expect fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int

public expect fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int

public expect fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int

public expect fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int

public expect fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int

public expect fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int

public expect fun sceMpegBaseCscInit(width: Int): Int

public expect fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int

public expect fun sceMpegbaseBea18f91(lli: SceMpegLLI?): Int

public expect fun sceHprmPeekCurrentKey(key: Int?): Int

public expect fun sceHprmPeekLatch(latch: List<UInt>?): Int

public expect fun sceHprmReadLatch(latch: List<UInt>?): Int

public expect fun sceHprmIsHeadphoneExist(): Int

public expect fun sceHprmIsRemoteExist(): Int

public expect fun sceHprmIsMicrophoneExist(): Int

public expect fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int)

public expect fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int)

public expect fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int)

public expect fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int)

public expect fun sceGuDisplay(state: Boolean): Boolean

public expect fun sceGuDepthFunc(function: DepthFunc)

public expect fun sceGuDepthMask(mask: Int)

public expect fun sceGuDepthOffset(offset: Int)

public expect fun sceGuDepthRange(near: Int, far: Int)

public expect fun sceGuFog(near: Float, far: Float, color: UInt)

public expect fun sceGuInit()

public expect fun sceGuTerm()

public expect fun sceGuBreak(mode: Int)

public expect fun sceGuContinue()

public expect fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback

public expect fun sceGuSignal(behavior: SignalBehavior, signal: Int)

public expect fun sceGuSendCommandf(cmd: GeCommand, argument: Float)

public expect fun sceGuSendCommandi(cmd: GeCommand, argument: Int)

public expect fun sceGuGetMemory(size: Int): COpaquePointer?

public expect fun sceGuStart(contextType: GuContextType, list: COpaquePointer?)

public expect fun sceGuFinish(): Int

public expect fun sceGuFinishId(id: UInt): Int

public expect fun sceGuCallList(list: COpaquePointer?)

public expect fun sceGuCallMode(mode: Int)

public expect fun sceGuCheckList(): Int

public expect fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?)

public expect fun sceGuSwapBuffers(): COpaquePointer?

public expect fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState

public expect fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGuEndObject()

public expect fun sceGuSetStatus(state: GuState, status: Int)

public expect fun sceGuGetStatus(state: GuState): Boolean

public expect fun sceGuSetAllStatus(status: Int)

public expect fun sceGuGetAllStatus(): Int

public expect fun sceGuEnable(state: GuState)

public expect fun sceGuDisable(state: GuState)

public expect fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3)

public expect fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float)

public expect fun sceGuLightColor(light: Int, component: Int, color: UInt)

public expect fun sceGuLightMode(mode: LightMode)

public expect fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float)

public expect fun sceGuClear(flags: Int)

public expect fun sceGuClearColor(color: UInt)

public expect fun sceGuClearDepth(depth: UInt)

public expect fun sceGuClearStencil(stencil: UInt)

public expect fun sceGuPixelMask(mask: UInt)

public expect fun sceGuColor(color: UInt)

public expect fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt)

public expect fun sceGuColorMaterial(components: Int)

public expect fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int)

public expect fun sceGuAmbient(color: UInt)

public expect fun sceGuAmbientColor(color: UInt)

public expect fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt)

public expect fun sceGuMaterial(components: Int, color: UInt)

public expect fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt)

public expect fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int)

public expect fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation)

public expect fun sceGuSpecular(power: Float)

public expect fun sceGuFrontFace(order: FrontFaceDirection)

public expect fun sceGuLogicalOp(op: LogicalOperation)

public expect fun sceGuSetDither(matrix: ScePspIMatrix4)

public expect fun sceGuShadeModel(mode: ShadingModel)

public expect fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?)

public expect fun sceGuTexEnvColor(color: UInt)

public expect fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter)

public expect fun sceGuTexFlush()

public expect fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent)

public expect fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?)

public expect fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float)

public expect fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt)

public expect fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int)

public expect fun sceGuTexOffset(u: Float, v: Float)

public expect fun sceGuTexProjMapMode(mode: TextureProjectionMapMode)

public expect fun sceGuTexScale(u: Float, v: Float)

public expect fun sceGuTexSlope(slope: Float)

public expect fun sceGuTexSync()

public expect fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode)

public expect fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?)

public expect fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt)

public expect fun sceGuOffset(x: UInt, y: UInt)

public expect fun sceGuScissor(x: Int, y: Int, w: Int, h: Int)

public expect fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int)

public expect fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt)

public expect fun sceGuPatchFrontFace(a0: UInt)

public expect fun sceGuPatchPrim(prim: PatchPrimitive)

public expect fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4)

public expect fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4)

public expect fun sceGuMorphWeight(index: Int, weight: Float)

public expect fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumFastInverse()

public expect fun sceGumFullInverse()

public expect fun sceGumLoadIdentity()

public expect fun sceGumLoadMatrix(m: ScePspFMatrix4)

public expect fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3)

public expect fun sceGumMatrixMode(mode: MatrixMode)

public expect fun sceGumMultMatrix(m: ScePspFMatrix4)

public expect fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float)

public expect fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float)

public expect fun sceGumPopMatrix()

public expect fun sceGumPushMatrix()

public expect fun sceGumRotateX(angle: Float)

public expect fun sceGumRotateY(angle: Float)

public expect fun sceGumRotateZ(angle: Float)

public expect fun sceGumRotateXYZ(v: ScePspFVector3)

public expect fun sceGumRotateZYX(v: ScePspFVector3)

public expect fun sceGumScale(v: ScePspFVector3)

public expect fun sceGumStoreMatrix(m: ScePspFMatrix4)

public expect fun sceGumTranslate(v: ScePspFVector3)

public expect fun sceGumUpdateMatrix()

public expect fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int

public expect fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int

public expect fun sceMp3InitResource(): Int

public expect fun sceMp3TermResource(): Int

public expect fun sceMp3Init(handle: Mp3Handle): Int

public expect fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int

public expect fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int

public expect fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int

public expect fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int

public expect fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int

public expect fun sceMp3GetLoopNum(handle: Mp3Handle): Int

public expect fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int

public expect fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int

public expect fun sceMp3GetSamplingRate(handle: Mp3Handle): Int

public expect fun sceMp3GetBitRate(handle: Mp3Handle): Int

public expect fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int

public expect fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int

public expect fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int

public expect fun sceRegFlushRegistry(handle: RegHandle): Int

public expect fun sceRegCloseRegistry(handle: RegHandle): Int

public expect fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int

public expect fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int

public expect fun sceRegCloseCategory(dirHandle: RegHandle): Int

public expect fun sceRegFlushCategory(dirHandle: RegHandle): Int

public expect fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int

public expect fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int

public expect fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int

public expect fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int

public expect fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int

public expect fun sceRegRemoveRegistry(key: Key?): Int

public expect fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int

public expect fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int

public expect fun sceUtilityMsgDialogShutdownStart()

public expect fun sceUtilityMsgDialogGetStatus(): Int

public expect fun sceUtilityMsgDialogUpdate(n: Int)

public expect fun sceUtilityMsgDialogAbort(): Int

public expect fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int

public expect fun sceUtilityNetconfShutdownStart(): Int

public expect fun sceUtilityNetconfUpdate(unknown: Int): Int

public expect fun sceUtilityNetconfGetStatus(): Int

public expect fun sceUtilityCheckNetParam(id: Int): Int

public expect fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int

public expect fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int

public expect fun sceUtilitySavedataGetStatus(): Int

public expect fun sceUtilitySavedataShutdownStart(): Int

public expect fun sceUtilitySavedataUpdate(unknown: Int)

public expect fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int

public expect fun sceUtilityGameSharingShutdownStart()

public expect fun sceUtilityGameSharingGetStatus(): Int

public expect fun sceUtilityGameSharingUpdate(n: Int)

public expect fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int

public expect fun sceUtilityHtmlViewerShutdownStart(): Int

public expect fun sceUtilityHtmlViewerUpdate(n: Int): Int

public expect fun sceUtilityHtmlViewerGetStatus(): Int

public expect fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int

public expect fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int

public expect fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int

public expect fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int

public expect fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int

public expect fun sceUtilityOskShutdownStart(): Int

public expect fun sceUtilityOskUpdate(n: Int): Int

public expect fun sceUtilityOskGetStatus(): Int

public expect fun sceUtilityLoadNetModule(module: NetModule): Int

public expect fun sceUtilityUnloadNetModule(module: NetModule): Int

public expect fun sceUtilityLoadAvModule(module: AvModule): Int

public expect fun sceUtilityUnloadAvModule(module: AvModule): Int

public expect fun sceUtilityLoadUsbModule(module: UsbModule): Int

public expect fun sceUtilityUnloadUsbModule(module: UsbModule): Int

public expect fun sceUtilityLoadModule(module: Module): Int

public expect fun sceUtilityUnloadModule(module: Module): Int

public expect fun sceUtilityCreateNetParam(conf: Int): Int

public expect fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int

public expect fun sceUtilityCopyNetParam(src: Int, dest: Int): Int

public expect fun sceUtilityDeleteNetParam(conf: Int): Int

public expect fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int

public expect fun sceNetTerm(): Int

public expect fun sceNetFreeThreadinfo(thid: Int): Int

public expect fun sceNetThreadAbort(thid: Int): Int

public expect fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?)

public expect fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?)

public expect fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int

public expect fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int

public expect fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int

public expect fun sceNetAdhocctlTerm(): Int

public expect fun sceNetAdhocctlConnect(name: COpaquePointer?): Int

public expect fun sceNetAdhocctlDisconnect(): Int

public expect fun sceNetAdhocctlGetState(event: Int?): Int

public expect fun sceNetAdhocctlCreate(name: COpaquePointer?): Int

public expect fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int

public expect fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int

public expect fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int

public expect fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int

public expect fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int

public expect fun sceNetAdhocctlExitGameMode(): Int

public expect fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int

public expect fun sceNetAdhocctlScan(): Int

public expect fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int

public expect fun sceNetAdhocctlDelHandler(id: Int): Int

public expect fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int

public expect fun sceNetAdhocInit(): Int

public expect fun sceNetAdhocTerm(): Int

public expect fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int

public expect fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int

public expect fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int

public expect fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int

public expect fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int

public expect fun sceNetAdhocGameModeUpdateMaster(): Int

public expect fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGameModeDeleteMaster(): Int

public expect fun sceNetAdhocGameModeDeleteReplica(id: Int): Int

public expect fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int

public expect fun sceNetAdhocMatchingInit(memsize: Int): Int

public expect fun sceNetAdhocMatchingTerm(): Int

public expect fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int

public expect fun sceNetAdhocMatchingDelete(matchingId: Int): Int

public expect fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingStop(matchingId: Int): Int

public expect fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int

public expect fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int

public expect fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int

public expect fun sceNetApctlTerm(): Int

public expect fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int

public expect fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int

public expect fun sceNetApctlDelHandler(handlerId: Int): Int

public expect fun sceNetApctlConnect(connIndex: Int): Int

public expect fun sceNetApctlDisconnect(): Int

public expect fun sceNetApctlGetState(pstate: ApctlState?): Int

public expect fun sceNetInetInit(): Int

public expect fun sceNetInetTerm(): Int

public expect fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: UInt?): Int

public expect fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int

public expect fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int

public expect fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: UInt?): Int

public expect fun sceNetInetListen(s: Int, backlog: Int): Int

public expect fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong

public expect fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: UInt?): ULong

public expect fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong

public expect fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong

public expect fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int

public expect fun sceNetInetShutdown(s: Int, how: Int): Int

public expect fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int

public expect fun sceNetInetClose(s: Int): Int

public expect fun sceNetInetGetErrno(): Int

public expect fun sceSslInit(unknown1: Int): Int

public expect fun sceSslEnd(): Int

public expect fun sceSslGetUsedMemoryMax(memory: UInt?): Int

public expect fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int

public expect fun sceHttpInit(unknown1: UInt): Int

public expect fun sceHttpEnd(): Int

public expect fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int

public expect fun sceHttpDeleteTemplate(templateid: Int): Int

public expect fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int

public expect fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int

public expect fun sceHttpDeleteConnection(connectionId: Int): Int

public expect fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int

public expect fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int

public expect fun sceHttpDeleteRequest(requestId: Int): Int

public expect fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int

public expect fun sceHttpAbortRequest(requestId: Int): Int

public expect fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int

public expect fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int

public expect fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int

public expect fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpSetResolveRetry(id: Int, count: Int): Int

public expect fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpEnableKeepAlive(id: Int): Int

public expect fun sceHttpDisableKeepAlive(id: Int): Int

public expect fun sceHttpEnableRedirect(id: Int): Int

public expect fun sceHttpDisableRedirect(id: Int): Int

public expect fun sceHttpEnableCookie(id: Int): Int

public expect fun sceHttpDisableCookie(id: Int): Int

public expect fun sceHttpSaveSystemCookie(): Int

public expect fun sceHttpLoadSystemCookie(): Int

public expect fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int

public expect fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int

public expect fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int

public expect fun sceHttpsEnd(): Int

public expect fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int

public expect fun sceHttpDisableAuth(id: Int): Int

public expect fun sceHttpDisableCache(id: Int): Int

public expect fun sceHttpEnableAuth(id: Int): Int

public expect fun sceHttpEnableCache(id: Int): Int

public expect fun sceHttpEndCache(): Int

public expect fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int

public expect fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int

public expect fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int

public expect fun sceHttpInitCache(maxSize: ULong): Int

public expect fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int

public expect fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int

public expect fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int

public expect fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int

public expect fun sceNetResolverInit(): Int

public expect fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int

public expect fun sceNetResolverDelete(rid: Int): Int

public expect fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStop(rid: Int): Int

public expect fun sceNetResolverTerm(): Int
