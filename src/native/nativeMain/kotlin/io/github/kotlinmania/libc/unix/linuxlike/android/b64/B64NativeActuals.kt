@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.android.PropInfo
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.cinterop.libcUnixLinuxlikeAndroidB64SystemPropertyWait
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun systemPropertyWait(pi: ConstPtr<PropInfo>, oldSerial: UInt, newSerialPtr: MutPtr<UInt>, relativeTimeout: ConstPtr<Timespec>): Boolean =
    libcUnixLinuxlikeAndroidB64SystemPropertyWait(pi.rawAddress.toCPointer<ByteVar>(), oldSerial, newSerialPtr.rawAddress.toCPointer<ByteVar>(), relativeTimeout.rawAddress.toCPointer<ByteVar>())
