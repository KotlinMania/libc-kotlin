// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun pwritev(fd: Int, iov: Iovec?, count: Int, offset: Long): Long
