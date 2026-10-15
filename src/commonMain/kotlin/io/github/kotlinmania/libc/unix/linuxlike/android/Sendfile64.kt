// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun sendfile64(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long
