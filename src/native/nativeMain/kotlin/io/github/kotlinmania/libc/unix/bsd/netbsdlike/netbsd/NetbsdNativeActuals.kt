@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdAioCancel
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdAioError
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdAioFsync
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdAioRead
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdAioReturn
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdAioSuspend
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdAioWrite
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdBacktrace
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdChflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdClockNanosleep
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdCpusetClr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdCpusetCreate
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdCpusetDestroy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdCpusetIsset
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdCpusetSet
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdCpusetSize
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdCpusetZero
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdDlauxinfo
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdDlvsym
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdDup3
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdDuplocale
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEasprintf
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEcalloc
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEmalloc
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdErealloc
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEreallocarr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEstrdup
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEstrlcat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEstrlcpy
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEstrndup
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEstrtoi
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEstrtou
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEvasprintf
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEventfd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEventfdRead
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdEventfdWrite
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExplicitMemset
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrGetFd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrGetFile
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrGetLink
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrListFd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrListFile
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrListLink
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrSetFd
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrSetFile
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrSetLink
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdFchflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdFgetxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdFlagsToString
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdFlistxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdForkpty
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdFreelocale
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdFremovexattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdFsetxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetbootfile
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetbyteorder
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetdiskrawname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetfsspecname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetgrentR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetmntinfo
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetnameinfo
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetpwentR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetrandom
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGettimeofday
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetvfsstat
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdGetxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdIconv
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdIconvClose
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdIconvOpen
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdKevent
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdKqueue1
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLchflags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLgetxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLioListio
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdListxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLlistxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLocaleconvL
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLogin
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLoginx
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLogout
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLogoutx
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLogwtmp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLogwtmpx
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLremovexattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLsetxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLutimes
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLwpPark
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLwpSelf
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLwpUnpark
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMemmem
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMount
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMprotect
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqClose
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqGetattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqNotify
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqOpen
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqReceive
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqSend
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqSetattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqTimedreceive
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqTimedsend
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMqUnlink
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdMremap
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdNewlocale
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdOpenpty
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPollts
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPtrace
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdPtsnameR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdQsortR
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdReallocarr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdReboot
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdRemovexattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSchedGetparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSchedSetparam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSecurePath
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSetproctitle
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSettimeofday
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSetxattr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSigtimedwait
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSigwaitinfo
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSnprintb
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSnprintbM
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdStringToFlags
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdStrpct
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdStrspct
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSysctl
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSysctlbyname
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdSysctlnametomib
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerCreate
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerDelete
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerGettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerSettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerfdCreate
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerfdGettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdTimerfdSettime
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.cinterop.libcUnixBsdNetbsdlikeNetbsdUtrace
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun reallocarr(ptr: MutPtr, number: SizeT, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdReallocarr(ptr.rawAddress.toCPointer<ByteVar>(), number, size)

public actual fun chflags(path: ConstPtr, flags: CUlong): CInt =
    libcUnixBsdNetbsdlikeNetbsdChflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    libcUnixBsdNetbsdlikeNetbsdFchflags(fd, flags)

public actual fun lchflags(path: ConstPtr, flags: CUlong): CInt =
    libcUnixBsdNetbsdlikeNetbsdLchflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd, attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrListFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrListLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toCPointer<ByteVar>())

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string.rawAddress.toCPointer<ByteVar>(), attrnamespace.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    libcUnixBsdNetbsdlikeNetbsdForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSysctlbyname(name.rawAddress.toCPointer<ByteVar>(), oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun sysctlnametomib(sname: ConstPtr, name: MutPtr, namelenp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), namelenp.rawAddress.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: SizeT, eventlist: MutPtr, nevents: SizeT, timeout: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdKevent(kq, changelist.rawAddress.toCPointer<ByteVar>(), nchanges, eventlist.rawAddress.toCPointer<ByteVar>(), nevents, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>(), size)

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcUnixBsdNetbsdlikeNetbsdMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqNotify(mqd.toLong().toCPointer<ByteVar>(), notification.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdPtrace(request, pid, addr.rawAddress.toCPointer<ByteVar>(), data)

public actual fun utrace(label: ConstPtr, addr: MutPtr, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdUtrace(label.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadGetnameNp(t: PthreadT, name: MutPtr, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(t: PthreadT, name: ConstPtr, arg: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread.toLong().toCPointer<ByteVar>(), size, set.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread.toLong().toCPointer<ByteVar>(), size, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetCreate(): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdCpusetCreate()?.toLong() ?: 0L)

public actual fun cpusetDestroy(set: MutPtr) {
    libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set.rawAddress.toCPointer<ByteVar>())
}

public actual fun cpusetClr(cpu: CpuidT, set: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSet(cpu: CpuidT, set: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetIsset(cpu: CpuidT, set: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSize(set: ConstPtr): SizeT =
    libcUnixBsdNetbsdlikeNetbsdCpusetSize(set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetZero(set: MutPtr) {
    libcUnixBsdNetbsdlikeNetbsdCpusetZero(set.rawAddress.toCPointer<ByteVar>())
}

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdNetbsdlikeNetbsdFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun localeconvL(loc: LocaleT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdDup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdKqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    libcUnixBsdNetbsdlikeNetbsdLwpSelf()

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun dlauxinfo(): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdDlauxinfo()?.toLong() ?: 0L)

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    libcUnixBsdNetbsdlikeNetbsdIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixBsdNetbsdlikeNetbsdIconvClose(cd.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdDlvsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>(), version.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun explicitMemset(b: MutPtr, c: CInt, len: SizeT) {
    libcUnixBsdNetbsdlikeNetbsdExplicitMemset(b.rawAddress.toCPointer<ByteVar>(), c, len)
}

public actual fun consttimeMemequal(a: ConstPtr, b: ConstPtr, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long) {
    libcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mremap(oldp: MutPtr, oldsize: SizeT, newp: MutPtr, newsize: SizeT, flags: CInt): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdMremap(oldp.rawAddress.toCPointer<ByteVar>(), oldsize, newp.rawAddress.toCPointer<ByteVar>(), newsize, flags)?.toLong() ?: 0L)

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid, t.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pollts(fds: MutPtr, nfds: NfdsT, ts: ConstPtr, sigmask: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdPollts(fds.rawAddress.toCPointer<ByteVar>(), nfds, ts.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun reboot(mode: CInt, bootstr: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdReboot(mode, bootstr.rawAddress.toCPointer<ByteVar>())

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr, unpark: LwpidT, hint: ConstPtr, unparkhint: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdLwpPark(clock, flags, ts.rawAddress.toCPointer<ByteVar>(), unpark, hint.rawAddress.toCPointer<ByteVar>(), unparkhint.rawAddress.toCPointer<ByteVar>())

public actual fun lwpUnpark(lwp: LwpidT, hint: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp, hint.rawAddress.toCPointer<ByteVar>())

public actual fun lwpUnparkAll(targets: ConstPtr, ntargets: SizeT, hint: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets.rawAddress.toCPointer<ByteVar>(), ntargets, hint.rawAddress.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getvfsstat(buf: MutPtr, bufsize: SizeT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf.rawAddress.toCPointer<ByteVar>(), bufsize, flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdEventfd(value, flags)

public actual fun eventfdRead(efd: CInt, valp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdEventfdRead(efd, valp.rawAddress.toCPointer<ByteVar>())

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    libcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd, value)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd, flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    libcUnixBsdNetbsdlikeNetbsdQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun aioRead(aiocbp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun efopen(p: ConstPtr, m: ConstPtr): FILE =
    FILE()

public actual fun emalloc(n: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEmalloc(n)?.toLong() ?: 0L)

public actual fun ecalloc(n: SizeT, c: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEcalloc(n, c)?.toLong() ?: 0L)

public actual fun erealloc(p: MutPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdErealloc(p.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun ereallocarr(p: MutPtr, n: SizeT, s: SizeT) {
    libcUnixBsdNetbsdlikeNetbsdEreallocarr(p.rawAddress.toCPointer<ByteVar>(), n, s)
}

public actual fun estrdup(s: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEstrdup(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun estrndup(s: ConstPtr, len: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEstrndup(s.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun estrlcpy(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT =
    libcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), len)

public actual fun estrlcat(dst: MutPtr, src: ConstPtr, len: SizeT): SizeT =
    libcUnixBsdNetbsdlikeNetbsdEstrlcat(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), len)

public actual fun estrtoi(nptr: ConstPtr, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    libcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr.rawAddress.toCPointer<ByteVar>(), base, lo, hi)

public actual fun estrtou(nptr: ConstPtr, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    libcUnixBsdNetbsdlikeNetbsdEstrtou(nptr.rawAddress.toCPointer<ByteVar>(), base, lo, hi)

public actual fun easprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixBsdNetbsdlikeNetbsdEasprintf(string.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun evasprintf(string: MutPtr, fmt: ConstPtr, vararg variadicArgs: Long): CInt =
    libcUnixBsdNetbsdlikeNetbsdEvasprintf(string.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    null

public actual fun securePath(path: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdSecurePath(path.rawAddress.toCPointer<ByteVar>())

public actual fun snprintb(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong): CInt =
    libcUnixBsdNetbsdlikeNetbsdSnprintb(buf.rawAddress.toCPointer<ByteVar>(), buflen, fmt.rawAddress.toCPointer<ByteVar>(), value)

public actual fun snprintbM(buf: MutPtr, buflen: SizeT, fmt: ConstPtr, value: ULong, max: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSnprintbM(buf.rawAddress.toCPointer<ByteVar>(), buflen, fmt.rawAddress.toCPointer<ByteVar>(), value, max)

public actual fun getbootfile(): ConstPtr =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetbootfile()?.toLong() ?: 0L)

public actual fun getbyteorder(): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetbyteorder()

public actual fun getdiskrawname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf.rawAddress.toCPointer<ByteVar>(), buflen, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getdiskcookedname(buf: MutPtr, buflen: SizeT, name: ConstPtr): ConstPtr =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf.rawAddress.toCPointer<ByteVar>(), buflen, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getfsspecname(buf: MutPtr, buflen: SizeT, spec: ConstPtr): ConstPtr =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf.rawAddress.toCPointer<ByteVar>(), buflen, spec.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strpct(buf: MutPtr, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdStrpct(buf.rawAddress.toCPointer<ByteVar>(), bufsiz, numerator, denominator, precision)?.toLong() ?: 0L)

public actual fun strspct(buf: MutPtr, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdStrspct(buf.rawAddress.toCPointer<ByteVar>(), bufsiz, numerator, denominator, precision)?.toLong() ?: 0L)

public actual fun login(ut: ConstPtr) {
    libcUnixBsdNetbsdlikeNetbsdLogin(ut.rawAddress.toCPointer<ByteVar>())
}

public actual fun loginx(ut: ConstPtr) {
    libcUnixBsdNetbsdlikeNetbsdLoginx(ut.rawAddress.toCPointer<ByteVar>())
}

public actual fun logout(line: ConstPtr) {
    libcUnixBsdNetbsdlikeNetbsdLogout(line.rawAddress.toCPointer<ByteVar>())
}

public actual fun logoutx(line: ConstPtr, status: CInt, tpe: CInt) {
    libcUnixBsdNetbsdlikeNetbsdLogoutx(line.rawAddress.toCPointer<ByteVar>(), status, tpe)
}

public actual fun logwtmp(line: ConstPtr, name: ConstPtr, host: ConstPtr) {
    libcUnixBsdNetbsdlikeNetbsdLogwtmp(line.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())
}

public actual fun logwtmpx(line: ConstPtr, name: ConstPtr, host: ConstPtr, status: CInt, tpe: CInt) {
    libcUnixBsdNetbsdlikeNetbsdLogwtmpx(line.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>(), status, tpe)
}

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdGetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdLgetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdLsetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdListxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdLlistxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes, list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: ConstPtr, name: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdRemovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdLremovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun fremovexattr(fd: CInt, path: ConstPtr, name: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdFremovexattr(fd, path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun stringToFlags(stringP: MutPtr, setp: MutPtr, clrp: MutPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP.rawAddress.toCPointer<ByteVar>(), setp.rawAddress.toCPointer<ByteVar>(), clrp.rawAddress.toCPointer<ByteVar>())

public actual fun flagsToString(flags: CUlong, def: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdFlagsToString(flags, def.rawAddress.toCPointer<ByteVar>())

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid, cntp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun backtrace(addrlist: MutPtr, len: SizeT): SizeT =
    libcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist.rawAddress.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist.rawAddress.toCPointer<ByteVar>(), len, fd)

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr, len: SizeT, fmt: ConstPtr): MutPtr =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist.rawAddress.toCPointer<ByteVar>(), len, fmt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun backtraceSymbolsFdFmt(addrlist: ConstPtr, len: SizeT, fd: CInt, fmt: ConstPtr): CInt =
    libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist.rawAddress.toCPointer<ByteVar>(), len, fd, fmt.rawAddress.toCPointer<ByteVar>())
