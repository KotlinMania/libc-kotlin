@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

private object UnixLinuxlikeAndroidB64JniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_linuxlike_android_b64_systemPropertyWait(pi: Long, oldSerial: Int, newSerialPtr: Long, relativeTimeout: Long): Boolean
}

public actual fun systemPropertyWait(pi: COpaquePointer?, oldSerial: UInt, newSerialPtr: COpaquePointer?, relativeTimeout: COpaquePointer?): Boolean =
    UnixLinuxlikeAndroidB64JniBridge.libc_unix_linuxlike_android_b64_systemPropertyWait((pi?.value ?: 0L), oldSerial.toInt(), (newSerialPtr?.value ?: 0L), (relativeTimeout?.value ?: 0L))
