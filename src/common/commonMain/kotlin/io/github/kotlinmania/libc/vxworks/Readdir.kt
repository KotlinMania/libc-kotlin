package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun readdir(pDir: DIR?): Dirent?
