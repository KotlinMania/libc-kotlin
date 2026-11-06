package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.COpaquePointer

internal object B64ModRawLibc {
    external fun systemPropertyWait(pi: Long, oldSerial: Int, newSerialPtr: Long, relativeTimeout: Long): Boolean
    external fun exchangedata(path1: String?, path2: String?, options: Int): Int
}

public actual fun systemPropertyWait(pi: PropInfo?, oldSerial: UInt, newSerialPtr: UInt?, relativeTimeout: Timespec?): Boolean =
    B64ModRawLibc.systemPropertyWait(pi?.toLong() ?: 0L, oldSerial, newSerialPtr?.toLong() ?: 0L, relativeTimeout?.toLong() ?: 0L)

public actual fun exchangedata(path1: String?, path2: String?, options: CUint): CInt =
    B64ModRawLibc.exchangedata(path1, path2, options)
