@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.COpaquePointer

public actual fun systemPropertyWait(pi: COpaquePointer?, oldSerial: UInt, newSerialPtr: COpaquePointer?, relativeTimeout: COpaquePointer?): Boolean =
    false
