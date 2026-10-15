// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun fmount(src: String?, fd: Int, flags: Int, data: COpaquePointer?): Int
