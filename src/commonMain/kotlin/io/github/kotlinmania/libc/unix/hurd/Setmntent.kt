package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun setmntent(filename: String?, ty: String?): FILE?
