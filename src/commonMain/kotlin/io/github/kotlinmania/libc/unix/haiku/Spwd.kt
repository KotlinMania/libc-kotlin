// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Spwd(
    val spNamp: String?,
    val spPwdp: String?,
    val spLstchg: Int,
    val spMin: Int,
    val spMax: Int,
    val spWarn: Int,
    val spInact: Int,
    val spExpire: Int,
    val spFlag: Int,
)
