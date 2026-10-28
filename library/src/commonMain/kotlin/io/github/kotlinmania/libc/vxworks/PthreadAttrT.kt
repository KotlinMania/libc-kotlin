package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class PthreadAttrT(
    val threadAttrStatus: Int,
    val threadAttrStacksize: ULong,
    val threadAttrStackaddr: COpaquePointer?,
    val threadAttrGuardsize: ULong,
    val threadAttrDetachstate: Int,
    val threadAttrContentionscope: Int,
    val threadAttrInheritsched: Int,
    val threadAttrSchedpolicy: Int,
    val threadAttrName: String?,
    val threadAttrOptions: Int,
    val threadAttrSchedparam: SchedParam,
)
