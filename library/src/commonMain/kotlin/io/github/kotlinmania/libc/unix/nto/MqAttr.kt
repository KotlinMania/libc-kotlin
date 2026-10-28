package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class MqAttr(
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqFlags: Long,
    val mqCurmsgs: Long,
    val mqSendwait: Long,
    val mqRecvwait: Long,
)
