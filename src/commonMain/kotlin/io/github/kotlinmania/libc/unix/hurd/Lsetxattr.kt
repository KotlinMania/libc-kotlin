// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int
