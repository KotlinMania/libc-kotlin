// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int
