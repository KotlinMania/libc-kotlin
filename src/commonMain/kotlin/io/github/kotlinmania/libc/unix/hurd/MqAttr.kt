// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class MqAttr(
    val mqFlags: Long,
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqCurmsgs: Long,
)
