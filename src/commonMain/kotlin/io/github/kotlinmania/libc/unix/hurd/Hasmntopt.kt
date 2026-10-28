package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun hasmntopt(mnt: Mntent?, opt: String?): String?
