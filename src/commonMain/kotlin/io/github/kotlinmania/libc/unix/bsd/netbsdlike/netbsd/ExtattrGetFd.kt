// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long
