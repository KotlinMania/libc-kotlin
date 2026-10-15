// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: Int?, numSelections: Int?, selectGeneration: Long?, currentGeneration: Long, devices: Devstat?, numdevs: Int, matches: DevstatMatch?, numMatches: Int, devSelections: COpaquePointer?, numDevSelections: Int, selectMode: DevstatSelectMode, maxshowdevs: Int, perfSelect: Int): Int
