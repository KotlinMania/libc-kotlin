package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(native: UInt?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int
