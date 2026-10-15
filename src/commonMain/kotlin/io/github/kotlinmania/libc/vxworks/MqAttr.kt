// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class MqAttr(
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqFlags: Long,
    val mqCurmsgs: Long,
)
