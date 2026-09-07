// port-lint: source Powerpc64.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun getsystemcfg(label: CInt): CULong =
    throw UnsupportedOperationException("getsystemcfg requires manual FFI bridge — not yet implemented")
