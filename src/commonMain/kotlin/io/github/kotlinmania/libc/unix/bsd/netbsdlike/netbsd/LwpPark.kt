// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun lwpPark(clock: Int, flags: Int, ts: Timespec?, unpark: Int, hint: COpaquePointer?, unparkhint: COpaquePointer?): Int
