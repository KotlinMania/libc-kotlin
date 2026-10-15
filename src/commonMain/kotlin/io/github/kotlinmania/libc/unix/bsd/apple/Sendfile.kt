// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun sendfile(fd: Int, s: Int, offset: Long, len: Long?, hdtr: SfHdtr?, flags: Int): Int
