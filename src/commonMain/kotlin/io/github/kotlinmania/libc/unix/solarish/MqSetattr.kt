package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun mqSetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, newattr: MqAttr?, oldattr: MqAttr?): Int
