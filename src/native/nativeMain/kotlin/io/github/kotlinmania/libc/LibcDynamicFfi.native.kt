@file:OptIn(ExperimentalUnsignedTypes::class, kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.cinterop.libc_alloc_zeroed
import io.github.kotlinmania.libc.cinterop.libc_free_mem
import io.github.kotlinmania.libc.cinterop.libc_invoke
import io.github.kotlinmania.libc.cinterop.libc_invoke_fp
import io.github.kotlinmania.libc.cinterop.libc_is_host_available
import io.github.kotlinmania.libc.cinterop.libc_last_error_number
import io.github.kotlinmania.libc.cinterop.libc_read_bytes
import io.github.kotlinmania.libc.cinterop.libc_resolve_symbol_address
import io.github.kotlinmania.libc.cinterop.libc_strlen_at
import io.github.kotlinmania.libc.cinterop.libc_write_bytes
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.value

internal actual object LibcDynamicFfiPlatform {
    actual fun isHostAvailable(): Boolean = libc_is_host_available() != 0

    actual fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long =
        memScoped {
            val status = alloc<IntVar>()
            val raw =
                if (args.isEmpty()) {
                    libc_invoke(symbol, fixedArgc, 0, null, status.ptr)
                } else {
                    args.usePinned { pinned ->
                        libc_invoke(symbol, fixedArgc, args.size, pinned.addressOf(0), status.ptr)
                    }
                }
            checkInvokeStatus(status.value, symbol)
            raw
        }

    actual fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double =
        memScoped {
            val status = alloc<IntVar>()
            val retF32 = if (returnIsFloat32) 1 else 0
            val raw =
                if (args.isEmpty()) {
                    libc_invoke_fp(symbol, fpMask, retF32, 0, null, status.ptr)
                } else {
                    args.usePinned { pinned ->
                        libc_invoke_fp(symbol, fpMask, retF32, args.size, pinned.addressOf(0), status.ptr)
                    }
                }
            checkInvokeStatus(status.value, symbol)
            raw
        }

    actual fun resolveSymbolAddress(symbol: String): Long = libc_resolve_symbol_address(symbol)

    actual fun lastErrorNumber(): Int = libc_last_error_number()

    actual fun strlenAt(address: Long): Int = libc_strlen_at(address)

    actual fun allocZeroed(size: Int): Long = libc_alloc_zeroed(size)

    actual fun freeMem(address: Long) {
        libc_free_mem(address)
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray {
        if (length <= 0 || address == 0L) return ByteArray(0)
        val out = ByteArray(length)
        out.usePinned { pinned ->
            libc_read_bytes(address, length, pinned.addressOf(0).reinterpret())
        }
        return out
    }

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        if (source.isEmpty() || address == 0L) return
        source.usePinned { pinned ->
            libc_write_bytes(address, source.size, pinned.addressOf(0).reinterpret())
        }
    }

    private fun checkInvokeStatus(
        code: Int,
        symbol: String,
    ) {
        if (code != 0) {
            throw UnsupportedOperationException("C symbol '$symbol' is unavailable on this host ($code)")
        }
    }
}
