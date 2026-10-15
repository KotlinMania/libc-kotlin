// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun flistxattr(filedes: Int, list: String?, size: ULong, flags: Int): Long
