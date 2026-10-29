package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int
