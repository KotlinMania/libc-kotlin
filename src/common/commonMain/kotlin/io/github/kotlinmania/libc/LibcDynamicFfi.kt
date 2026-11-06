@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc

internal expect object LibcDynamicFfiPlatform {
    fun isHostAvailable(): Boolean

    fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long

    fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double

    fun resolveSymbolAddress(symbol: String): Long

    fun lastErrorNumber(): Int

    fun strlenAt(address: Long): Int

    fun allocZeroed(size: Int): Long

    fun freeMem(address: Long)

    fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray

    fun writeBytes(
        address: Long,
        source: ByteArray,
    )
}

internal object LibcDynamicFfi {
    fun isHostAvailable(): Boolean = LibcDynamicFfiPlatform.isHostAvailable()

    fun invoke(
        symbol: String,
        fixedArgc: Int,
        args: LongArray,
    ): Long = LibcDynamicFfiPlatform.invoke(symbol, fixedArgc, args)

    fun invokeFp(
        symbol: String,
        fpMask: Int,
        returnIsFloat32: Boolean,
        args: LongArray,
    ): Double = LibcDynamicFfiPlatform.invokeFp(symbol, fpMask, returnIsFloat32, args)

    fun resolveSymbolAddress(symbol: String): Long = LibcDynamicFfiPlatform.resolveSymbolAddress(symbol)

    fun lastErrorNumber(): Int = LibcDynamicFfiPlatform.lastErrorNumber()

    fun allocZeroed(size: Int): Long = LibcDynamicFfiPlatform.allocZeroed(size)

    fun freeMem(address: Long) {
        LibcDynamicFfiPlatform.freeMem(address)
    }

    fun readBytes(
        address: Long,
        length: Int,
    ): ByteArray = LibcDynamicFfiPlatform.readBytes(address, length)

    fun writeBytes(
        address: Long,
        source: ByteArray,
    ) {
        LibcDynamicFfiPlatform.writeBytes(address, source)
    }

    fun allocUtf8CString(value: String): Long {
        val utf8 = value.encodeToByteArray()
        val ptr = allocZeroed(utf8.size + 1)
        if (utf8.isNotEmpty()) {
            writeBytes(ptr, utf8)
        }
        return ptr
    }

    fun allocUtf8CBuffer(
        initial: String?,
        minCapacity: Int,
    ): Long {
        val utf8 = initial?.encodeToByteArray()
        val size = maxOf(minCapacity, (utf8?.size ?: 0) + 1, 1)
        val ptr = allocZeroed(size)
        if (utf8 != null && utf8.isNotEmpty()) {
            writeBytes(ptr, utf8)
        }
        return ptr
    }

    fun readUtf8CString(address: Long): String {
        if (address == 0L) return ""
        val len = LibcDynamicFfiPlatform.strlenAt(address)
        if (len <= 0) return ""
        return readBytes(address, len).decodeToString()
    }

    fun allocScalarSlot(bits: Long): Long {
        val ptr = allocZeroed(8)
        writeScalarSlot(ptr, 8, bits)
        return ptr
    }

    fun readScalarSlot(
        address: Long,
        byteWidth: Int,
    ): Long {
        if (address == 0L || byteWidth <= 0) return 0L
        val w = byteWidth.coerceIn(1, 8)
        val bytes = readBytes(address, w)
        var out = 0L
        for (i in 0 until bytes.size) {
            out = out or ((bytes[i].toLong() and 0xFFL) shl (i * 8))
        }
        return out
    }

    fun writeScalarSlot(
        address: Long,
        byteWidth: Int,
        bits: Long,
    ) {
        if (address == 0L || byteWidth <= 0) return
        val w = byteWidth.coerceIn(1, 8)
        val bytes = ByteArray(w)
        for (i in 0 until w) {
            bytes[i] = ((bits ushr (i * 8)) and 0xFFL).toByte()
        }
        writeBytes(address, bytes)
    }
}
