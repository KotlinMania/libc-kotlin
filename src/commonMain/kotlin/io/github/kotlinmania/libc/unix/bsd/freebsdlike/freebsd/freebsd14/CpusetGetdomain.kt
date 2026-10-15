// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd14/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*

public expect fun cpusetGetdomain(level: Int, which: Int, id: UInt, setsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14.CAnonymousDomainset?, policy: Int?): Int
