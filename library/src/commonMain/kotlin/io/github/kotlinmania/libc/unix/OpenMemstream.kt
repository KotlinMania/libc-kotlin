package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun openMemstream(ptr: COpaquePointer?, sizeloc: ULong?): FILE?
