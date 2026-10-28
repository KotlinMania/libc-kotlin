package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun readdir64(dirp: DIR?): Dirent64?
