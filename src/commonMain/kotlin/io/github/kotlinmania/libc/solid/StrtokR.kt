package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun strtokR(arg1: String?, arg2: String?, arg3: COpaquePointer?): String?
