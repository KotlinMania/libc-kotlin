package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): Long
