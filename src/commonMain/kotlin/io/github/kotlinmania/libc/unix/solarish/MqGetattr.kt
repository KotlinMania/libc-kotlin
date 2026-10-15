// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun mqGetattr(mqd: io.github.kotlinmania.libc.COpaquePointer?, attr: MqAttr?): Int
