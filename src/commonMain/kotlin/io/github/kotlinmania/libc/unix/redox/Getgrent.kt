package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.unix.Group

import io.github.kotlinmania.libc.*

public expect fun getgrent(): Group?
