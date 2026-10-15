// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public fun cpuCount(cpuset: CpuSetT): Int = cpuCountS(128uL, cpuset)
