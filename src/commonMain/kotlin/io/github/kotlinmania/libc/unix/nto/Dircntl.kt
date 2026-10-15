// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun dircntl(dir: DIR?, cmd: Int, vararg args: Any?): Int
