// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int
