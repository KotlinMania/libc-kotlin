package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(native: Int?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int
