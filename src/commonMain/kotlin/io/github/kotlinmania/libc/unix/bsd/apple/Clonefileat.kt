// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun clonefileat(srcDirfd: Int, src: String?, dstDirfd: Int, dst: String?, flags: UInt): Int
