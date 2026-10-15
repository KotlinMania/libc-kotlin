// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun kvmGetprocs(kd: io.github.kotlinmania.libc.COpaquePointer?, op: Int, arg: Int, cnt: Int?): KinfoProc?
