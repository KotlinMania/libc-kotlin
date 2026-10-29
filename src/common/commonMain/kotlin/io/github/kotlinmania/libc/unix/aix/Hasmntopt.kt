package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun hasmntopt(mnt: Mntent?, opt: String?): String?
