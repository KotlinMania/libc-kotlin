package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.COpaquePointer

public actual fun systemPropertyWait(pi: PropInfo?, oldSerial: UInt, newSerialPtr: UInt?, relativeTimeout: Timespec?): Boolean =
    js("require('@kotlinmania/libc-native-bindings').systemPropertyWait(pi?.toLong() ?: 0L, oldSerial, newSerialPtr?.toLong() ?: 0L, relativeTimeout?.toLong() ?: 0L)") as Boolean

public actual fun exchangedata(path1: String?, path2: String?, options: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').exchangedata(path1, path2, options)") as CInt
