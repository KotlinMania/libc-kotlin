package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(thread: Int?, attr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int
