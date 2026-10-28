// port-lint: source new/common/linux_like/pthread.rs
package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
public actual class CpuSetT internal constructor(
    internal val rawValue: COpaquePointer,
)
