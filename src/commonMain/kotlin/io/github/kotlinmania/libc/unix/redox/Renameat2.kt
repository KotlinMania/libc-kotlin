// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int
