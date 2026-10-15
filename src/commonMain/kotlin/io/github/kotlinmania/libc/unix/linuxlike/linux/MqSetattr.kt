// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int
