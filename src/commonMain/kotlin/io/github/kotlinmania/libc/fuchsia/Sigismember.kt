package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun sigismember(set: SigsetT?, signum: Int): Int
