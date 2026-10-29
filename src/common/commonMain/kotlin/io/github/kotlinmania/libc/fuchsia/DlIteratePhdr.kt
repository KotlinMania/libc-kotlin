package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int
