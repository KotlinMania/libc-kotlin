@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeAndroidB64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidB64SystemPropertyWait(pi: Long, oldSerial: Int, newSerialPtr: Long, relativeTimeout: Long): Boolean
}

public actual fun systemPropertyWait(pi: ConstPtr, oldSerial: UInt, newSerialPtr: MutPtr, relativeTimeout: ConstPtr): Boolean =
    UnixLinuxlikeAndroidB64JniBridge.libcUnixLinuxlikeAndroidB64SystemPropertyWait(pi.rawAddress, oldSerial.toInt(), newSerialPtr.rawAddress, relativeTimeout.rawAddress)
