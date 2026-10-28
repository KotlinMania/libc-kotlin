package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, type: Int): Int
