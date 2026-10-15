// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
