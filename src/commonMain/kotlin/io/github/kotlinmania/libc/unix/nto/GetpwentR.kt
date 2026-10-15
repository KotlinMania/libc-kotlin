// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun getpwentR(pwd: Passwd?, buf: String?, bufsize: Int, result: COpaquePointer?): Int
