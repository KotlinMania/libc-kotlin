// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Spwd(
    val spNamp: String?,
    val spPwdp: String?,
    val spLstchg: Long,
    val spMin: Long,
    val spMax: Long,
    val spWarn: Long,
    val spInact: Long,
    val spExpire: Long,
    val spFlag: ULong,
)
