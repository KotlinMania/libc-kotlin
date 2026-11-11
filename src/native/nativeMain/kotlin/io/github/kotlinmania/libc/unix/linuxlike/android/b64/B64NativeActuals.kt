@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.cinterop.libc_unix_linuxlike_android_b64_systemPropertyWait
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun systemPropertyWait(pi: COpaquePointer?, oldSerial: UInt, newSerialPtr: COpaquePointer?, relativeTimeout: COpaquePointer?): Boolean =
    libc_unix_linuxlike_android_b64_systemPropertyWait(pi?.value?.toCPointer<ByteVar>(), oldSerial, newSerialPtr?.value?.toCPointer<ByteVar>(), relativeTimeout?.value?.toCPointer<ByteVar>())
