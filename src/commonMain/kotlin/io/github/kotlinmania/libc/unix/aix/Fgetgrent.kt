package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.unix.Group

import io.github.kotlinmania.libc.*

public expect fun fgetgrent(file: FILE?): Group?
