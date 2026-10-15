// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
