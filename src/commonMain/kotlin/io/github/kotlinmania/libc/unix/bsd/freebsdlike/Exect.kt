// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int
