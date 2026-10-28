package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class MqAttr(
    val mqFlags: Long,
    val mqMaxmsg: Long,
    val mqMsgsize: Long,
    val mqCurmsgs: Long,
)
