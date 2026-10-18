package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(tid: io.github.kotlinmania.libc.COpaquePointer?, attr: PthreadAttrT?, start: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int
