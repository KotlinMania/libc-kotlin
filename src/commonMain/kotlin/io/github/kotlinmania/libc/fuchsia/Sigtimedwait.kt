package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int
