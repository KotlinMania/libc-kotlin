// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: Int, errbuf: String?): io.github.kotlinmania.libc.COpaquePointer?
