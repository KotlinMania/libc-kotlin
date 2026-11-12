@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.netbsd.sys.statvfs.Statvfs
import io.github.kotlinmania.libc.new.netbsd.sys.time.Itimerspec
import io.github.kotlinmania.libc.new.netbsd.sys.types.CpuidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.new.netbsd.sys.types.MqdT
import io.github.kotlinmania.libc.new.netbsd.sys.types.TimerT
import io.github.kotlinmania.libc.new.netbsd.utmp.Utmp
import io.github.kotlinmania.libc.new.netbsd.utmpx.Utmpx
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntmaxT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintmaxT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ClockidT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios
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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdClockNanosleep(clkId, flags, rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())

public actual fun reallocarr(ptr: MutPtr<CVoid>, number: SizeT, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdReallocarr(ptr.rawAddress.toCPointer<ByteVar>(), number, size)

public actual fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    libcUnixBsdNetbsdlikeNetbsdChflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    libcUnixBsdNetbsdlikeNetbsdFchflags(fd, flags)

public actual fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt =
    libcUnixBsdNetbsdlikeNetbsdLchflags(path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrListFd(fd, attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrListFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrListLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrDeleteFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrDeleteLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrGetFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdExtattrGetLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toCPointer<ByteVar>())

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrSetFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrSetLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    libcUnixBsdNetbsdlikeNetbsdExtattrStringToNamespace(string.rawAddress.toCPointer<ByteVar>(), attrnamespace.rawAddress.toCPointer<ByteVar>())

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    libcUnixBsdNetbsdlikeNetbsdOpenpty(amaster.rawAddress.toCPointer<ByteVar>(), aslave.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    libcUnixBsdNetbsdlikeNetbsdForkpty(amaster.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), termp.rawAddress.toCPointer<ByteVar>(), winp.rawAddress.toCPointer<ByteVar>())

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    libcUnixBsdNetbsdlikeNetbsdLutimes(file.rawAddress.toCPointer<ByteVar>(), times.rawAddress.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeNetbsdGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetnameinfo(sa.rawAddress.toCPointer<ByteVar>(), salen, host.rawAddress.toCPointer<ByteVar>(), hostlen, serv.rawAddress.toCPointer<ByteVar>(), servlen, flags)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdMprotect(addr.rawAddress.toCPointer<ByteVar>(), len, prot)

public actual fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSysctl(name.rawAddress.toCPointer<ByteVar>(), namelen, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSysctlbyname(name.rawAddress.toCPointer<ByteVar>(), oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun sysctlnametomib(sname: ConstPtr<CChar>, name: MutPtr<CInt>, namelenp: MutPtr<SizeT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSysctlnametomib(sname.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), namelenp.rawAddress.toCPointer<ByteVar>())

public actual fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: SizeT, eventlist: MutPtr<Kevent>, nevents: SizeT, timeout: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdKevent(kq, changelist.rawAddress.toCPointer<ByteVar>(), nchanges, eventlist.rawAddress.toCPointer<ByteVar>(), nevents, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdMount(src.rawAddress.toCPointer<ByteVar>(), target.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>(), size)

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    (libcUnixBsdNetbsdlikeNetbsdMqOpen(name.rawAddress.toCPointer<ByteVar>(), oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L).toInt()

public actual fun mqClose(mqd: MqdT): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqNotify(mqd.toLong().toCPointer<ByteVar>(), notification.rawAddress.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdMqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr.rawAddress.toCPointer<ByteVar>(), oldattr.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdMqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio.rawAddress.toCPointer<ByteVar>(), absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr.rawAddress.toCPointer<ByteVar>(), msgLen, msgPrio, absTimeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdMqUnlink(name.rawAddress.toCPointer<ByteVar>())

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CVoid>, data: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdPtrace(request, pid, addr.rawAddress.toCPointer<ByteVar>(), data)

public actual fun utrace(label: ConstPtr<CChar>, addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdUtrace(label.rawAddress.toCPointer<ByteVar>(), addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadGetnameNp(t: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadGetnameNp(t.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), len)

public actual fun pthreadSetnameNp(t: PthreadT, name: ConstPtr<CChar>, arg: ConstPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadSetnameNp(t.toLong().toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetNp(thread.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadGetattrNp(native.toLong().toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadGetaffinityNp(thread.toLong().toCPointer<ByteVar>(), size, set.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: MutPtr<CpusetT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPthreadSetaffinityNp(thread.toLong().toCPointer<ByteVar>(), size, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetCreate(): MutPtr<CpusetT> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdCpusetCreate()?.toLong() ?: 0L)

public actual fun cpusetDestroy(set: MutPtr<CpusetT>) {
    libcUnixBsdNetbsdlikeNetbsdCpusetDestroy(set.rawAddress.toCPointer<ByteVar>())
}

public actual fun cpusetClr(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdCpusetClr(cpu, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSet(cpu: CpuidT, set: MutPtr<CpusetT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdCpusetSet(cpu, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetIsset(cpu: CpuidT, set: ConstPtr<CpusetT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdCpusetIsset(cpu, set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSize(set: ConstPtr<CpusetT>): SizeT =
    libcUnixBsdNetbsdlikeNetbsdCpusetSize(set.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetZero(set: MutPtr<CpusetT>) {
    libcUnixBsdNetbsdlikeNetbsdCpusetZero(set.rawAddress.toCPointer<ByteVar>())
}

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSigwaitinfo(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>())

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdDuplocale(base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun freelocale(loc: LocaleT) {
    libcUnixBsdNetbsdlikeNetbsdFreelocale(loc.rawAddress.toCPointer<ByteVar>())
}

public actual fun localeconvL(loc: LocaleT): MutPtr<Lconv> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdLocaleconvL(loc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdNewlocale(mask, locale.rawAddress.toCPointer<ByteVar>(), base.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSettimeofday(tv.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdDup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdKqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    libcUnixBsdNetbsdlikeNetbsdLwpSelf()

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeNetbsdDlIteratePhdr(0L.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun dlauxinfo(): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdDlauxinfo()?.toLong() ?: 0L)

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdIconvOpen(tocode.rawAddress.toCPointer<ByteVar>(), fromcode.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    libcUnixBsdNetbsdlikeNetbsdIconv(cd.rawAddress.toCPointer<ByteVar>(), inbuf.rawAddress.toCPointer<ByteVar>(), inbytesleft.rawAddress.toCPointer<ByteVar>(), outbuf.rawAddress.toCPointer<ByteVar>(), outbytesleft.rawAddress.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    libcUnixBsdNetbsdlikeNetbsdIconvClose(cd.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerCreate(clockid, sevp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerDelete(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerGetoverrun(timerid.toLong().toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerGettime(timerid.toLong().toCPointer<ByteVar>(), currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerSettime(timerid.toLong().toCPointer<ByteVar>(), flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdDlvsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>(), version.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun explicitMemset(b: MutPtr<CVoid>, c: CInt, len: SizeT) {
    libcUnixBsdNetbsdlikeNetbsdExplicitMemset(b.rawAddress.toCPointer<ByteVar>(), c, len)
}

public actual fun consttimeMemequal(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdConsttimeMemequal(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcUnixBsdNetbsdlikeNetbsdSetproctitle(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mremap(oldp: MutPtr<CVoid>, oldsize: SizeT, newp: MutPtr<CVoid>, newsize: SizeT, flags: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdMremap(oldp.rawAddress.toCPointer<ByteVar>(), oldsize, newp.rawAddress.toCPointer<ByteVar>(), newsize, flags)?.toLong() ?: 0L)

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedRrGetInterval(pid, t.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedSetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedGetparam(pid, param.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSchedSetscheduler(pid, policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pollts(fds: MutPtr<Pollfd>, nfds: NfdsT, ts: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdPollts(fds.rawAddress.toCPointer<ByteVar>(), nfds, ts.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun reboot(mode: CInt, bootstr: MutPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdReboot(mode, bootstr.rawAddress.toCPointer<ByteVar>())

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: ConstPtr<Timespec>, unpark: LwpidT, hint: ConstPtr<CVoid>, unparkhint: MutPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeNetbsdLwpPark(clock, flags, ts.rawAddress.toCPointer<ByteVar>(), unpark, hint.rawAddress.toCPointer<ByteVar>(), unparkhint.rawAddress.toCPointer<ByteVar>())

public actual fun lwpUnpark(lwp: LwpidT, hint: ConstPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeNetbsdLwpUnpark(lwp, hint.rawAddress.toCPointer<ByteVar>())

public actual fun lwpUnparkAll(targets: ConstPtr<LwpidT>, ntargets: SizeT, hint: ConstPtr<CVoid>): CInt =
    libcUnixBsdNetbsdlikeNetbsdLwpUnparkAll(targets.rawAddress.toCPointer<ByteVar>(), ntargets, hint.rawAddress.toCPointer<ByteVar>())

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statvfs>>, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetmntinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun getvfsstat(buf: MutPtr<Statvfs>, bufsize: SizeT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetvfsstat(buf.rawAddress.toCPointer<ByteVar>(), bufsize, flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdEventfd(value, flags)

public actual fun eventfdRead(efd: CInt, valp: MutPtr<EventfdT>): CInt =
    libcUnixBsdNetbsdlikeNetbsdEventfdRead(efd, valp.rawAddress.toCPointer<ByteVar>())

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    libcUnixBsdNetbsdlikeNetbsdEventfdWrite(efd, value)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerfdGettime(fd, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdTimerfdSettime(fd, flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    libcUnixBsdNetbsdlikeNetbsdQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdNetbsdlikeNetbsdAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    libcUnixBsdNetbsdlikeNetbsdLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun efopen(p: ConstPtr<CChar>, m: ConstPtr<CChar>): FILE =
    FILE()

public actual fun emalloc(n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEmalloc(n)?.toLong() ?: 0L)

public actual fun ecalloc(n: SizeT, c: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEcalloc(n, c)?.toLong() ?: 0L)

public actual fun erealloc(p: MutPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdErealloc(p.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun ereallocarr(p: MutPtr<CVoid>, n: SizeT, s: SizeT) {
    libcUnixBsdNetbsdlikeNetbsdEreallocarr(p.rawAddress.toCPointer<ByteVar>(), n, s)
}

public actual fun estrdup(s: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEstrdup(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun estrndup(s: ConstPtr<CChar>, len: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdEstrndup(s.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun estrlcpy(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    libcUnixBsdNetbsdlikeNetbsdEstrlcpy(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), len)

public actual fun estrlcat(dst: MutPtr<CChar>, src: ConstPtr<CChar>, len: SizeT): SizeT =
    libcUnixBsdNetbsdlikeNetbsdEstrlcat(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), len)

public actual fun estrtoi(nptr: ConstPtr<CChar>, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    libcUnixBsdNetbsdlikeNetbsdEstrtoi(nptr.rawAddress.toCPointer<ByteVar>(), base, lo, hi)

public actual fun estrtou(nptr: ConstPtr<CChar>, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    libcUnixBsdNetbsdlikeNetbsdEstrtou(nptr.rawAddress.toCPointer<ByteVar>(), base, lo, hi)

public actual fun easprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixBsdNetbsdlikeNetbsdEasprintf(string.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun evasprintf(string: MutPtr<MutPtr<CChar>>, fmt: ConstPtr<CChar>, vararg variadicArgs: Long): CInt =
    libcUnixBsdNetbsdlikeNetbsdEvasprintf(string.rawAddress.toCPointer<ByteVar>(), fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    null

public actual fun securePath(path: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdSecurePath(path.rawAddress.toCPointer<ByteVar>())

public actual fun snprintb(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong): CInt =
    libcUnixBsdNetbsdlikeNetbsdSnprintb(buf.rawAddress.toCPointer<ByteVar>(), buflen, fmt.rawAddress.toCPointer<ByteVar>(), value)

public actual fun snprintbM(buf: MutPtr<CChar>, buflen: SizeT, fmt: ConstPtr<CChar>, value: ULong, max: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSnprintbM(buf.rawAddress.toCPointer<ByteVar>(), buflen, fmt.rawAddress.toCPointer<ByteVar>(), value, max)

public actual fun getbootfile(): ConstPtr<CChar> =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetbootfile()?.toLong() ?: 0L)

public actual fun getbyteorder(): CInt =
    libcUnixBsdNetbsdlikeNetbsdGetbyteorder()

public actual fun getdiskrawname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetdiskrawname(buf.rawAddress.toCPointer<ByteVar>(), buflen, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getdiskcookedname(buf: MutPtr<CChar>, buflen: SizeT, name: ConstPtr<CChar>): ConstPtr<CChar> =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetdiskcookedname(buf.rawAddress.toCPointer<ByteVar>(), buflen, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getfsspecname(buf: MutPtr<CChar>, buflen: SizeT, spec: ConstPtr<CChar>): ConstPtr<CChar> =
    ConstPtr(libcUnixBsdNetbsdlikeNetbsdGetfsspecname(buf.rawAddress.toCPointer<ByteVar>(), buflen, spec.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun strpct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdStrpct(buf.rawAddress.toCPointer<ByteVar>(), bufsiz, numerator, denominator, precision)?.toLong() ?: 0L)

public actual fun strspct(buf: MutPtr<CChar>, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): MutPtr<CChar> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdStrspct(buf.rawAddress.toCPointer<ByteVar>(), bufsiz, numerator, denominator, precision)?.toLong() ?: 0L)

public actual fun login(ut: ConstPtr<Utmp>) {
    libcUnixBsdNetbsdlikeNetbsdLogin(ut.rawAddress.toCPointer<ByteVar>())
}

public actual fun loginx(ut: ConstPtr<Utmpx>) {
    libcUnixBsdNetbsdlikeNetbsdLoginx(ut.rawAddress.toCPointer<ByteVar>())
}

public actual fun logout(line: ConstPtr<CChar>) {
    libcUnixBsdNetbsdlikeNetbsdLogout(line.rawAddress.toCPointer<ByteVar>())
}

public actual fun logoutx(line: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    libcUnixBsdNetbsdlikeNetbsdLogoutx(line.rawAddress.toCPointer<ByteVar>(), status, tpe)
}

public actual fun logwtmp(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>) {
    libcUnixBsdNetbsdlikeNetbsdLogwtmp(line.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>())
}

public actual fun logwtmpx(line: ConstPtr<CChar>, name: ConstPtr<CChar>, host: ConstPtr<CChar>, status: CInt, tpe: CInt) {
    libcUnixBsdNetbsdlikeNetbsdLogwtmpx(line.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), host.rawAddress.toCPointer<ByteVar>(), status, tpe)
}

public actual fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdGetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdLgetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdFgetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdSetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT): CInt =
    libcUnixBsdNetbsdlikeNetbsdLsetxattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdFsetxattr(filedes, name.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>(), size, flags)

public actual fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdListxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdLlistxattr(path.rawAddress.toCPointer<ByteVar>(), list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT =
    libcUnixBsdNetbsdlikeNetbsdFlistxattr(filedes, list.rawAddress.toCPointer<ByteVar>(), size)

public actual fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdRemovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdLremovexattr(path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun fremovexattr(fd: CInt, path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdFremovexattr(fd, path.rawAddress.toCPointer<ByteVar>(), name.rawAddress.toCPointer<ByteVar>())

public actual fun stringToFlags(stringP: MutPtr<MutPtr<CChar>>, setp: MutPtr<CUlong>, clrp: MutPtr<CUlong>): CInt =
    libcUnixBsdNetbsdlikeNetbsdStringToFlags(stringP.rawAddress.toCPointer<ByteVar>(), setp.rawAddress.toCPointer<ByteVar>(), clrp.rawAddress.toCPointer<ByteVar>())

public actual fun flagsToString(flags: CUlong, def: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdFlagsToString(flags, def.rawAddress.toCPointer<ByteVar>())

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<SizeT>): MutPtr<KinfoVmentry> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdKinfoGetvmmap(pid, cntp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT =
    libcUnixBsdNetbsdlikeNetbsdBacktrace(addrlist.rawAddress.toCPointer<ByteVar>(), len)

public actual fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdBacktraceSymbols(addrlist.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt =
    libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFd(addrlist.rawAddress.toCPointer<ByteVar>(), len, fd)

public actual fun backtraceSymbolsFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fmt: ConstPtr<CChar>): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFmt(addrlist.rawAddress.toCPointer<ByteVar>(), len, fmt.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun backtraceSymbolsFdFmt(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt, fmt: ConstPtr<CChar>): CInt =
    libcUnixBsdNetbsdlikeNetbsdBacktraceSymbolsFdFmt(addrlist.rawAddress.toCPointer<ByteVar>(), len, fd, fmt.rawAddress.toCPointer<ByteVar>())
