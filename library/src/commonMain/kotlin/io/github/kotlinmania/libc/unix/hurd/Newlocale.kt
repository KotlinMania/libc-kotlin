package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.unix.hurd.LocaleStruct?): io.github.kotlinmania.libc.unix.hurd.LocaleStruct?
