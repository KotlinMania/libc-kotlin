package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int
