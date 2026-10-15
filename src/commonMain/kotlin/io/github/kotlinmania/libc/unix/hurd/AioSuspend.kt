// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int
