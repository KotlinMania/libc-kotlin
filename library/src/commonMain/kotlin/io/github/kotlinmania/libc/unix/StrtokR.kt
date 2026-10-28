package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun strtokR(s: String?, t: String?, p: COpaquePointer?): String?
