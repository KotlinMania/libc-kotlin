// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class MqAttr(
    val mqFlags: Long,
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqCurmsgs: Long,
)
