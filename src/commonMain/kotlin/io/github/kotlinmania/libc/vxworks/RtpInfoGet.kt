package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun rtpInfoGet(rtpId: Int, rtpStruct: RTPDESC?): Int
