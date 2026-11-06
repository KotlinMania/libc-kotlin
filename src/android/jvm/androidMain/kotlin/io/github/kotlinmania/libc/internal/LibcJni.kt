package io.github.kotlinmania.libc.internal

internal object LibcJni {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun isHostAvailable(): Boolean

    @JvmStatic
    external fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long

    @JvmStatic
    external fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double

    @JvmStatic
    external fun resolveSymbolAddress(symbol: String): Long

    @JvmStatic
    external fun lastErrorNumber(): Int

    @JvmStatic
    external fun strlenAt(address: Long): Int

    @JvmStatic
    external fun allocZeroed(size: Int): Long

    @JvmStatic
    external fun freeMem(address: Long)

    @JvmStatic
    external fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray

    @JvmStatic
    external fun writeBytes(
        address: Long,
        source: ByteArray,
    )
}
