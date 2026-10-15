// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun linkat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
