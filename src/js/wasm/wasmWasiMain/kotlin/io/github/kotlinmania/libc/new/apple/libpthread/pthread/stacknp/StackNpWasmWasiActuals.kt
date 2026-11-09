@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.stacknp

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.UintptrT

public actual fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: COpaquePointer?): UintptrT =
    0uL
