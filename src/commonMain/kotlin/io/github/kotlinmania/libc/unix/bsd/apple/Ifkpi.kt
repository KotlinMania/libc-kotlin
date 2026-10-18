package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Ifkpi(
    val ifkModuleId: UInt,
    val ifkType: UInt,
    val ifkData: CAnonymousIfkData,
)
