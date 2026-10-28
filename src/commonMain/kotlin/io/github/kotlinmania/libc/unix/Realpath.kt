package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun realpath(pathname: String?, resolved: String?): String?
