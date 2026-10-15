// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mqSetattr(mqdes: Int, mqstat: MqAttr?, omqstat: MqAttr?): Int
