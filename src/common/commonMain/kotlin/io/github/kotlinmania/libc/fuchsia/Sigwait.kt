package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun sigwait(set: SigsetT?, sig: Int?): Int
