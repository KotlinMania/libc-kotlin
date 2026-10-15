// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun glob64(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: Glob64T?): Int
