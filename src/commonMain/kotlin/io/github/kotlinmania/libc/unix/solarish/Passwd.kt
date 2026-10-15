// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UInt,
    val pwGid: UInt,
    val pwAge: String?,
    val pwComment: String?,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)
