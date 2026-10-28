package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mount(specialDevice: String?, mountDirectory: String?, flags: Int, mountType: String?, mountData: COpaquePointer?, mountDatalen: Int): Int
