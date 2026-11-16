@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun systemPropertyWait(pi: PropInfo?, oldSerial: UInt, newSerialPtr: UInt?, relativeTimeout: Timespec?): Boolean =
    io.github.kotlinmania.libc.unix.linuxlike.android.b64.cinterop.libc_b64_mod_system_property_wait(pi?.value?.toCPointer<ByteVar>(), oldSerial, newSerialPtr?.value?.toCPointer<ByteVar>(), relativeTimeout?.value?.toCPointer<ByteVar>())
