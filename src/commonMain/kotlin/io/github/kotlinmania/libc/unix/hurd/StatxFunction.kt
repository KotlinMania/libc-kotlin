// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun statx(dirfd: Int, pathname: String?, flags: Int, mask: UInt, statxbuf: Statx?): Int
