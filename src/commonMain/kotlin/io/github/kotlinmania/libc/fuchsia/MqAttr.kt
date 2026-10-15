// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class MqAttr(
    val mqFlags: Long,
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqCurmsgs: Long,
    val mqFlags2: Long,
    val mqMaxmsg2: Long,
    val mqMsgsize2: Long,
    val mqCurmsgs2: Long,
)
