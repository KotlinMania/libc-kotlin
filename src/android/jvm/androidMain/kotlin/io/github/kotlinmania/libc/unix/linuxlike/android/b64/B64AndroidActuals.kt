@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.android.PropInfo
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeAndroidB64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeAndroidB64SystemPropertyWait(pi: Long, oldSerial: Int, newSerialPtr: Long, relativeTimeout: Long): Boolean
}

public actual fun systemPropertyWait(pi: ConstPtr<PropInfo>, oldSerial: UInt, newSerialPtr: MutPtr<UInt>, relativeTimeout: ConstPtr<Timespec>): Boolean =
    UnixLinuxlikeAndroidB64JniBridge.libcUnixLinuxlikeAndroidB64SystemPropertyWait(pi.rawAddress, oldSerial.toInt(), newSerialPtr.rawAddress, relativeTimeout.rawAddress)
