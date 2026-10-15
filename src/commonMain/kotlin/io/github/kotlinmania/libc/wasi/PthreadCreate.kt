package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(native: io.github.kotlinmania.libc.COpaquePointer?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int
