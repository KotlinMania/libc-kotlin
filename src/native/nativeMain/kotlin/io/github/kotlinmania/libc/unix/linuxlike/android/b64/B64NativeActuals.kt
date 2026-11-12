@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.unix.linuxlike.android.b64.cinterop.libcUnixLinuxlikeAndroidB64SystemPropertyWait
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun systemPropertyWait(pi: ConstPtr, oldSerial: UInt, newSerialPtr: MutPtr, relativeTimeout: ConstPtr): Boolean =
    libcUnixLinuxlikeAndroidB64SystemPropertyWait(pi.rawAddress.toCPointer<ByteVar>(), oldSerial, newSerialPtr.rawAddress.toCPointer<ByteVar>(), relativeTimeout.rawAddress.toCPointer<ByteVar>())
