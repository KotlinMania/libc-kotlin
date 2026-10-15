// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun execveat(dirfd: Int, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: Int): Int
