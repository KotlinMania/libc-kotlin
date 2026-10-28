package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun calloc(amt: ULong, amt2: ULong): COpaquePointer?
