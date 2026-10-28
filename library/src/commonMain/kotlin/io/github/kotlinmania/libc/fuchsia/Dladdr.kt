package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int
