package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun getsubopt(optionp: COpaquePointer?, tokens: COpaquePointer?, valuep: COpaquePointer?): Int
