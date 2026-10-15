// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun renameat(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?): Int
