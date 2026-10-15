// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int
