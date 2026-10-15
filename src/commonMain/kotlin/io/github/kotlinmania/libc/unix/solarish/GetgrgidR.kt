// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int
