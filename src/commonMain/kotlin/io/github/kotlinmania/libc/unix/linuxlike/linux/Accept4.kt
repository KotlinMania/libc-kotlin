// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun accept4(fd: Int, addr: Sockaddr?, len: UInt?, flg: Int): Int
