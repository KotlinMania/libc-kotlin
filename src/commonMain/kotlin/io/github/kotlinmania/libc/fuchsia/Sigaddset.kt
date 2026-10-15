package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun sigaddset(set: SigsetT?, signum: Int): Int
