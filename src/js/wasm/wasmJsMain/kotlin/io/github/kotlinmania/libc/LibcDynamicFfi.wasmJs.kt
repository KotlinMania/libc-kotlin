@file:OptIn(ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.libc

// Hide require('@kotlinmania/libc-native-bindings') behind new Function so webpack browser bundles never scan it statically.
private fun wasmHasNodeLibcAddon(): Boolean =
    js(
        "{ try { var rq = (new Function('return typeof require === \"function\" ? require : null'))(); if (!rq) return false; var m = rq('@kotlinmania/libc-native-bindings'); globalThis.__kmLibcAddon = m; return !!m; } catch (e) { return false; } }",
    )

private fun wasmLibcInvokeCsv(
    symbol: String,
    fixedArgc: Int,
    flatCsv: String,
): String =
    js(
        "{ var parts = flatCsv.length === 0 ? [] : flatCsv.split(',').map(Number); var r = globalThis.__kmLibcAddon.invokeLoHi(symbol, fixedArgc, parts); return r[0] + ',' + r[1] + ',' + r[2]; }",
    )

private fun wasmLibcInvokeFpCsv(
    symbol: String,
    fpMask: Int,
    retF32: Int,
    flatCsv: String,
): String =
    js(
        "{ var parts = flatCsv.length === 0 ? [] : flatCsv.split(',').map(Number); var r = globalThis.__kmLibcAddon.invokeFpPair(symbol, fpMask, retF32, parts); return r[0] + ',' + r[1]; }",
    )

private fun wasmLibcResolveCsv(symbol: String): String =
    js("{ var r = globalThis.__kmLibcAddon.resolveSymbolLoHi(symbol); return r[0] + ',' + r[1]; }")

private fun wasmLibcLastErrno(): Int =
    js("{ return globalThis.__kmLibcAddon.lastErrorNumber() | 0; }")

private fun wasmLibcStrlenAt(
    lo: Int,
    hi: Int,
): Int =
    js("{ return globalThis.__kmLibcAddon.strlenAtLoHi(lo, hi) | 0; }")

private fun wasmLibcAllocCsv(size: Int): String =
    js("{ var r = globalThis.__kmLibcAddon.allocZeroedLoHi(size); return r[0] + ',' + r[1]; }")

private fun wasmLibcFree(
    lo: Int,
    hi: Int,
): Unit =
    js("{ globalThis.__kmLibcAddon.freeMemLoHi(lo, hi); }")

private fun wasmLibcReadCsv(
    lo: Int,
    hi: Int,
    length: Int,
): String =
    js("{ var r = globalThis.__kmLibcAddon.readBytesLoHi(lo, hi, length); return Array.from(r).join(','); }")

private fun wasmLibcWriteCsv(
    lo: Int,
    hi: Int,
    bytesCsv: String,
): Unit =
    js(
        "{ var arr = bytesCsv.length === 0 ? [] : bytesCsv.split(',').map(Number); globalThis.__kmLibcAddon.writeBytesLoHi(lo, hi, arr); }",
    )

internal actual object LibcDynamicFfiPlatform {
    private val hasAddon: Boolean = wasmHasNodeLibcAddon()
    private var arena = ByteArray(65536)
    private var arenaOffset = 64

    private fun packLoHi(
        lo: Int,
        hi: Int,
    ): Long = (hi.toLong() shl 32) or (lo.toLong() and 0xFFFF_FFFFL)

    private fun encodeArgsCsv(args: LongArray): String {
        if (args.isEmpty()) return ""
        val sb = StringBuilder(args.size * 12)
        for (i in args.indices) {
            if (i > 0) sb.append(',')
            sb.append(args[i].toInt())
            sb.append(',')
            sb.append((args[i] ushr 32).toInt())
        }
        return sb.toString()
    }

    actual fun isHostAvailable(): Boolean = hasAddon

    actual fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long {
        if (!hasAddon) {
            throw UnsupportedOperationException("C dynamic FFI ($symbol) requires a Node.js host")
        }
        val parts = wasmLibcInvokeCsv(symbol, fixedArgc, encodeArgsCsv(args)).split(',')
        val status = parts[2].toInt()
        if (status != 0) {
            throw UnsupportedOperationException("C symbol '$symbol' is unavailable on this host ($status)")
        }
        return packLoHi(parts[0].toInt(), parts[1].toInt())
    }

    actual fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double {
        if (!hasAddon) {
            throw UnsupportedOperationException("C dynamic FFI ($symbol) requires a Node.js host")
        }
        val parts = wasmLibcInvokeFpCsv(symbol, fpMask, if (returnIsFloat32) 1 else 0, encodeArgsCsv(args)).split(',')
        val status = parts[1].toInt()
        if (status != 0) {
            throw UnsupportedOperationException("C symbol '$symbol' is unavailable on this host ($status)")
        }
        return parts[0].toDouble()
    }

    actual fun resolveSymbolAddress(symbol: String): Long {
        if (!hasAddon) return 0L
        val parts = wasmLibcResolveCsv(symbol).split(',')
        return packLoHi(parts[0].toInt(), parts[1].toInt())
    }

    actual fun lastErrorNumber(): Int {
        if (!hasAddon) throw UnsupportedOperationException("errno requires a Node.js host")
        return wasmLibcLastErrno()
    }

    actual fun strlenAt(address: Long): Int {
        if (address == 0L) return 0
        if (hasAddon) {
            return wasmLibcStrlenAt(address.toInt(), (address ushr 32).toInt())
        }
        var i = address.toInt()
        while (i < arena.size && arena[i] != 0.toByte()) i++
        return i - address.toInt()
    }

    actual fun allocZeroed(size: Int): Long {
        val n = maxOf(size, 1)
        if (hasAddon) {
            val parts = wasmLibcAllocCsv(n).split(',')
            return packLoHi(parts[0].toInt(), parts[1].toInt())
        }
        val aligned = (arenaOffset + 7) and -8
        if (aligned + n > arena.size) {
            arena = arena.copyOf(maxOf(arena.size * 2, aligned + n + 4096))
        }
        arena.fill(0, aligned, aligned + n)
        arenaOffset = aligned + n
        return aligned.toLong()
    }

    actual fun freeMem(address: Long) {
        if (hasAddon && address != 0L) {
            wasmLibcFree(address.toInt(), (address ushr 32).toInt())
        }
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        if (hasAddon) {
            val csv = wasmLibcReadCsv(address.toInt(), (address ushr 32).toInt(), length)
            if (csv.isEmpty()) return ByteArray(0)
            val parts = csv.split(',')
            return ByteArray(parts.size) { parts[it].toInt().toByte() }
        }
        val start = address.toInt()
        return arena.copyOfRange(start, start + length)
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        if (hasAddon) {
            val csv = source.joinToString(",") { (it.toInt() and 0xFF).toString() }
            wasmLibcWriteCsv(address.toInt(), (address ushr 32).toInt(), csv)
            return
        }
        source.copyInto(arena, destinationOffset = address.toInt())
    }
}
