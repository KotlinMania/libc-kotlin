package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(native: Long?, attr: io.github.kotlinmania.libc.unix.hurd.PthreadAttr?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int
