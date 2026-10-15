// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: Int, rlimit: Rlimit?): Int
