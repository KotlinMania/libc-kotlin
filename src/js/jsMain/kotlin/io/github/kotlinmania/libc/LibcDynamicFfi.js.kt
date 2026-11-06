@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc

// Hide require('@kotlinmania/libc-native-bindings') behind new Function so webpack browser bundles never scan it statically.
private fun loadNodeLibcAddon(): dynamic =
    js(
        "(function(){ try { var rq = (new Function('return typeof require === \"function\" ? require : null'))(); if (!rq) return null; return rq('@kotlinmania/libc-native-bindings'); } catch (e) { return null; } })()",
    )

internal actual object LibcDynamicFfiPlatform {
    private val addon: dynamic = loadNodeLibcAddon()
    private var arena = ByteArray(65536)
    private var arenaOffset = 64

    private fun packLoHi(
        lo: Int,
        hi: Int,
    ): Long = (hi.toLong() shl 32) or (lo.toLong() and 0xFFFF_FFFFL)

    actual fun isHostAvailable(): Boolean = addon != null

    actual fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long {
        val mod = addon ?: throw UnsupportedOperationException("C dynamic FFI ($symbol) requires a Node.js host")
        val flat = IntArray(args.size * 2)
        for (i in args.indices) {
            flat[i * 2] = args[i].toInt()
            flat[i * 2 + 1] = (args[i] ushr 32).toInt()
        }
        val res = mod.invokeLoHi(symbol, fixedArgc, flat)
        val status = res[2] as Int
        if (status != 0) {
            throw UnsupportedOperationException("C symbol '$symbol' is unavailable on this host ($status)")
        }
        return packLoHi(res[0] as Int, res[1] as Int)
    }

    actual fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double {
        val mod = addon ?: throw UnsupportedOperationException("C dynamic FFI ($symbol) requires a Node.js host")
        val flat = IntArray(args.size * 2)
        for (i in args.indices) {
            flat[i * 2] = args[i].toInt()
            flat[i * 2 + 1] = (args[i] ushr 32).toInt()
        }
        val res = mod.invokeFpPair(symbol, fpMask, if (returnIsFloat32) 1 else 0, flat)
        val status = res[1] as Int
        if (status != 0) {
            throw UnsupportedOperationException("C symbol '$symbol' is unavailable on this host ($status)")
        }
        return res[0] as Double
    }

    actual fun resolveSymbolAddress(symbol: String): Long {
        val mod = addon ?: return 0L
        val pair = mod.resolveSymbolLoHi(symbol)
        return packLoHi(pair[0] as Int, pair[1] as Int)
    }

    actual fun lastErrorNumber(): Int {
        val mod = addon ?: throw UnsupportedOperationException("errno requires a Node.js host")
        return mod.lastErrorNumber() as Int
    }

    actual fun strlenAt(address: Long): Int {
        if (address == 0L) return 0
        val mod = addon
        if (mod != null) {
            return mod.strlenAtLoHi(address.toInt(), (address ushr 32).toInt()) as Int
        }
        var i = address.toInt()
        while (i < arena.size && arena[i] != 0.toByte()) i++
        return i - address.toInt()
    }

    actual fun allocZeroed(size: Int): Long {
        val n = maxOf(size, 1)
        val mod = addon
        if (mod != null) {
            val pair = mod.allocZeroedLoHi(n)
            return packLoHi(pair[0] as Int, pair[1] as Int)
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
        val mod = addon
        if (mod != null && address != 0L) {
            mod.freeMemLoHi(address.toInt(), (address ushr 32).toInt())
        }
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        val mod = addon
        if (mod != null) {
            val raw = mod.readBytesLoHi(address.toInt(), (address ushr 32).toInt(), length)
            val out = ByteArray(length)
            for (i in 0 until length) {
                out[i] = (raw[i] as Int).toByte()
            }
            return out
        }
        val start = address.toInt()
        return arena.copyOfRange(start, start + length)
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        val mod = addon
        if (mod != null) {
            val ints = IntArray(source.size) { source[it].toInt() and 0xFF }
            mod.writeBytesLoHi(address.toInt(), (address ushr 32).toInt(), ints)
            return
        }
        source.copyInto(arena, destinationOffset = address.toInt())
    }
}
