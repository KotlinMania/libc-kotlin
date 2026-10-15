// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun mallocZoneStatistics(zone: io.github.kotlinmania.libc.COpaquePointer?, stats: MallocStatisticsT?)
