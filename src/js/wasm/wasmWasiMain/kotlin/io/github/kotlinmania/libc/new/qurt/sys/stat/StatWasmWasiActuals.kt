@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.stat

import io.github.kotlinmania.libc.CInt

public actual fun stat(pathname: String?, statbuf: COpaquePointer?): CInt =
    0

public actual fun fstat(fd: CInt, statbuf: COpaquePointer?): CInt =
    0
