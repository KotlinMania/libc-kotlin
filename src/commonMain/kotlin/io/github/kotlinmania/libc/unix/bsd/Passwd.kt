package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class Passwd(
    var pwName: String? = null,
    var pwPasswd: String? = null,
    var pwUid: UInt = 0u,
    var pwGid: UInt = 0u,
    var pwChange: Long = 0L,
    var pwClass: String? = null,
    var pwGecos: String? = null,
    var pwDir: String? = null,
    var pwShell: String? = null,
    var pwExpire: Long = 0L,
    var pwFields: Int = 0,
)
