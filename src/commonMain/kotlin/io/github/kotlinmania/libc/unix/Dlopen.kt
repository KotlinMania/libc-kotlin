package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun dlopen(filename: String?, flag: Int): COpaquePointer?
