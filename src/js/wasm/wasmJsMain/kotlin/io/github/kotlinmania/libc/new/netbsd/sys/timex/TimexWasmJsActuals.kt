@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.sys.timex

import io.github.kotlinmania.libc.CInt

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    0

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    0
