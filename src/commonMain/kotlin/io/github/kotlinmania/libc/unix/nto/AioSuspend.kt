// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun aioSuspend(list: COpaquePointer?, nent: Int, timeout: Timespec?): Int
