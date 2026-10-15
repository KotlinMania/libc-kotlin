// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun statx(dirfd: Int, pathname: String?, flags: Int, mask: UInt, statxbuf: Statx?): Int
