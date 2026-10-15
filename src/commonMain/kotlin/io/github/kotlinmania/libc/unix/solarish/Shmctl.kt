// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int
