// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun renameatxNp(fromfd: Int, from: String?, tofd: Int, to: String?, flags: UInt): Int
