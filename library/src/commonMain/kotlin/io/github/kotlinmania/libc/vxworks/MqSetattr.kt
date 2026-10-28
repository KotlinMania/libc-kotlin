package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int
