package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(thread: UInt?, attr: io.github.kotlinmania.libc.COpaquePointer?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, arg: COpaquePointer?): Int
