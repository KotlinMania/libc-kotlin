// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd15/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15

import io.github.kotlinmania.libc.*

public expect fun cpusetGetdomain(level: Int, which: Int, id: UInt, setsize: ULong, mask: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.CAnonymousDomainset?, policy: Int?): Int
