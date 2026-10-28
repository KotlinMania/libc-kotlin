package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class VnodeInfoPath(
    val vipVi: VnodeInfo,
    val vipPath: List<ByteArray>,
)
