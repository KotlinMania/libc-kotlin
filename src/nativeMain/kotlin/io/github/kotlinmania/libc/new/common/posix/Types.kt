// port-lint: source libc/src/new/common/posix/mod.rs
package io.github.kotlinmania.libc.new.common.posix

import kotlinx.cinterop.COpaquePointer

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
public actual class SigsetT internal constructor(
    internal val rawValue: COpaquePointer,
)
