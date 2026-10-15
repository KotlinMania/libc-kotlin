// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean
