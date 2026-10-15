// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean
