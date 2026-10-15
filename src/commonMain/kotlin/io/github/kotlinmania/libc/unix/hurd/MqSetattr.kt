// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int
