// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: Int,
    val pwGid: Int,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)
