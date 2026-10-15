// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun getrlimit64(resource: UInt, rlim: Rlimit64?): Int
