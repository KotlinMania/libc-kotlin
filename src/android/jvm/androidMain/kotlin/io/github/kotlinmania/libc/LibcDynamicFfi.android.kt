@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.internal.LibcJni

internal actual object LibcDynamicFfiPlatform {
    actual fun isHostAvailable(): Boolean = LibcJni.isHostAvailable()

    actual fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long = LibcJni.invoke(symbol, fixedArgc, args)

    actual fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double = LibcJni.invokeFp(symbol, fpMask, returnIsFloat32, args)

    actual fun resolveSymbolAddress(symbol: String): Long = LibcJni.resolveSymbolAddress(symbol)

    actual fun lastErrorNumber(): Int = LibcJni.lastErrorNumber()

    actual fun strlenAt(address: Long): Int = LibcJni.strlenAt(address)

    actual fun allocZeroed(size: Int): Long = LibcJni.allocZeroed(size)

    actual fun freeMem(address: Long) {
        LibcJni.freeMem(address)
    }

    actual fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray = LibcJni.readBytes(address, length)

    actual fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        LibcJni.writeBytes(address, source)
    }
}
