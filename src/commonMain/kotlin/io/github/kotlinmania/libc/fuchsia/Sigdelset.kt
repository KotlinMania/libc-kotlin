package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun sigdelset(set: SigsetT?, signum: Int): Int
