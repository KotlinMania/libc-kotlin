// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun stat64at(dirfd: Int, path: String?, buf: Stat64?, flags: Int): Int
