package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pthreadDetach(thread: io.github.kotlinmania.libc.COpaquePointer?): Int
