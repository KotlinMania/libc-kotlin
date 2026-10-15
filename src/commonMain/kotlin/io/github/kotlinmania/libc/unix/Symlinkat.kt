// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
