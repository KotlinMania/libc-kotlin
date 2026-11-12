@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioCancel
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioError
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioFsync
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioRead
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioReadv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioReturn
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioSuspend
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioWrite
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdAioWritev
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapEnter
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapGetmode
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsClear
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsContains
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsGet
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsLimit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsMerge
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsRemove
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapRightsSet
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCapSandboxed
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCfmakesane
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCloseRange
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdClosefrom
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCopyFileRange
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCpuset
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCpusetGetid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdCpusetSetid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDallocx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDevnameR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDevstatGetversion
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDlvsym
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdDup3
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdElfAuxInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdError
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdEventfd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdEventfdRead
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdEventfdWrite
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExecvpe
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrGetFd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrGetFile
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrGetLink
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrListFd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrListFile
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrListLink
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrSetFd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrSetFile
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrSetLink
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFdatasync
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFfsl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFfsll
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFhlink
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFhlinkat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFhopen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFhreadlink
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFhstat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFhstatfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFlopen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFlopenat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFls
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFlsl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFlsll
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFspacectl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFstatfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdFtok
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetfh
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetfhat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetfsstat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetlocalbase
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetmntinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetpagesize
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetpagesizes
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdGetutxuser
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdHexdump
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdHumanizeNumber
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdJail
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdJailAttach
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdJailGet
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdJailRemove
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdJailSet
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKcmp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKldIsloaded
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKldLoad
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGetargv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGetcptime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGetenvv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGeterr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGetncpus
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmNative
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmNlist
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmNlist2
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmRead2
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdLgetfh
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdLioListio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMallctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMallctlbymib
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMallctlnametomib
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMallocx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemfdCreate
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemmem
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatGetName
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMemstatStrerror
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMount
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMqGetfdNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMsgctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMsgget
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdMsgsnd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdNallocx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdNmount
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPdfork
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPdgetpid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPdkill
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPidfileClose
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPidfileFileno
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPidfileOpen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPidfileRemove
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPidfileWrite
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatClose
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetargv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetumask
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdPtsnameR
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdRallocx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdRealhostname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdRealhostnameSa
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdReallocarray
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdRecvmmsg
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdRfork
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdRtprioThread
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSallocx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSchedGetcpu
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpBindx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpConnectx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpOptInfo
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpPeeloff
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpRecvv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSctpSendv
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSdallocx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSemctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSemget
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSemop
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSendmmsg
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSetaudit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSetproctitle
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSetproctitleFast
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdSetutxdb
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdShmRename
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdShmat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdShmctl
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdShmdt
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdShmget
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdStatfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdStrchrnul
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdThrKill
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdThrKill2
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdThrSelf
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerCreate
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerDelete
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerGettime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerSettime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerfdCreate
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerfdGettime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimerfdSettime
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdUmtxOp
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdUuidgen
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdWaitid
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdXallocx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.cinterop.libcUnixBsdFreebsdlikeFreebsdXuname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Statfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Vnstat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.b64.Stat
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fhlink(fhp: MutPtr<FhandleT>, to: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFhlink(fhp.rawAddress.toCPointer<ByteVar>(), to.rawAddress.toCPointer<ByteVar>())

public actual fun fhlinkat(fhp: MutPtr<FhandleT>, tofd: CInt, to: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFhlinkat(fhp.rawAddress.toCPointer<ByteVar>(), tofd, to.rawAddress.toCPointer<ByteVar>())

public actual fun fhreadlink(fhp: MutPtr<FhandleT>, buf: MutPtr<CChar>, bufsize: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdFhreadlink(fhp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), bufsize)

public actual fun getfhat(fd: CInt, path: MutPtr<CChar>, fhp: MutPtr<Fhandle>, flag: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdGetfhat(fd, path.rawAddress.toCPointer<ByteVar>(), fhp.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun error(): MutPtr<CInt> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdError()?.toLong() ?: 0L)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioCancel(fd, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioError(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioFsync(op, aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioRead(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReadv(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioReadv(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdAioReturn(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioSuspend(aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioWrite(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun aioWritev(aiocbp: MutPtr<Aiocb>): CInt =
    libcUnixBsdFreebsdlikeFreebsdAioWritev(aiocbp.rawAddress.toCPointer<ByteVar>())

public actual fun copyFileRange(infd: CInt, inoffp: MutPtr<OffT>, outfd: CInt, outoffp: MutPtr<OffT>, len: SizeT, flags: CUint): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdCopyFileRange(infd, inoffp.rawAddress.toCPointer<ByteVar>(), outfd, outoffp.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: CInt): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdDevnameR(dev, mode, buf.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdExtattrDeleteFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdExtattrDeleteLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>())

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrGetFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrGetFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrGetLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrListFd(fd, attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrListFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrListLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrSetFd(fd, attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrSetFile(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdExtattrSetLink(path.rawAddress.toCPointer<ByteVar>(), attrnamespace, attrname.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr<SpacectlRange>, flags: CInt, rmsr: MutPtr<SpacectlRange>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFspacectl(fd, cmd, rqsr.rawAddress.toCPointer<ByteVar>(), flags, rmsr.rawAddress.toCPointer<ByteVar>())

public actual fun jail(jail: MutPtr<Jail>): CInt =
    libcUnixBsdFreebsdlikeFreebsdJail(jail.rawAddress.toCPointer<ByteVar>())

public actual fun jailAttach(jid: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdJailAttach(jid)

public actual fun jailRemove(jid: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdJailRemove(jid)

public actual fun jailGet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdJailGet(iov.rawAddress.toCPointer<ByteVar>(), niov, flags)

public actual fun jailSet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdJailSet(iov.rawAddress.toCPointer<ByteVar>(), niov, flags)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt =
    libcUnixBsdFreebsdlikeFreebsdLioListio(mode, aiocbList.rawAddress.toCPointer<ByteVar>(), nitems, sevp.rawAddress.toCPointer<ByteVar>())

public actual fun getutxuser(user: ConstPtr<CChar>): MutPtr<Utmpx> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdGetutxuser(user.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxdb(type: CInt, file: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSetutxdb(type, file.rawAddress.toCPointer<ByteVar>())

public actual fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdAioWaitcomplete(iocbp.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    libcUnixBsdFreebsdlikeFreebsdMqGetfdNp(mqd.rawAddress.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdWaitid(idtype, id, infop.rawAddress.toCPointer<ByteVar>(), options)

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdPtsnameR(fd, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT =
    libcUnixBsdFreebsdlikeFreebsdFtok(pathname.rawAddress.toCPointer<ByteVar>(), projId)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdShmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdShmat(shmid, shmaddr.rawAddress.toCPointer<ByteVar>(), shmflg)?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    libcUnixBsdFreebsdlikeFreebsdShmdt(shmaddr.rawAddress.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    libcUnixBsdFreebsdlikeFreebsdShmctl(shmid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    libcUnixBsdFreebsdlikeFreebsdSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdSemop(semid, sops.rawAddress.toCPointer<ByteVar>(), nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    libcUnixBsdFreebsdlikeFreebsdMsgctl(msqid, cmd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdMsgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdMsgsnd(msqid, msgp.rawAddress.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun cfmakesane(termios: MutPtr<Termios>) {
    libcUnixBsdFreebsdlikeFreebsdCfmakesane(termios.rawAddress.toCPointer<ByteVar>())
}

public actual fun pdfork(fdp: MutPtr<CInt>, flags: CInt): PidT =
    libcUnixBsdFreebsdlikeFreebsdPdfork(fdp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun pdgetpid(fd: CInt, pidp: MutPtr<PidT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPdgetpid(fd, pidp.rawAddress.toCPointer<ByteVar>())

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdPdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt =
    libcUnixBsdFreebsdlikeFreebsdRtprioThread(function, lwpid, rtp.rawAddress.toCPointer<ByteVar>())

public actual fun uuidgen(store: MutPtr<Uuid>, count: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdUuidgen(store.rawAddress.toCPointer<ByteVar>(), count)

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdThrKill(id, sig)

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdThrKill2(pid, id, sig)

public actual fun thrSelf(tid: MutPtr<CLong>): CInt =
    libcUnixBsdFreebsdlikeFreebsdThrSelf(tid.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetthreadidNp(): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadGetthreadidNp()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr<CpusetT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadGetaffinityNp(td.toLong().toCPointer<ByteVar>(), cpusetsize, cpusetp.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr<CpusetT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadSetaffinityNp(td.toLong().toCPointer<ByteVar>(), cpusetsize, cpusetp.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr<CpusetT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSchedGetaffinity(pid, cpusetsz, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr<CpusetT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSchedSetaffinity(pid, cpusetsz, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun schedGetcpu(): CInt =
    libcUnixBsdFreebsdlikeFreebsdSchedGetcpu()

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadMutexConsistent(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: MutPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrGetrobust(attr.rawAddress.toCPointer<ByteVar>(), robust.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadMutexattrSetrobust(attr.rawAddress.toCPointer<ByteVar>(), robust)

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPthreadTimedjoinNp(thread.toLong().toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    libcUnixBsdFreebsdlikeFreebsdStatfs(path.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFstatfs(fd, buf.rawAddress.toCPointer<ByteVar>())

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdDup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: MutPtr<CVoid>): CInt =
    libcUnixBsdFreebsdlikeFreebsdXuname(nmln, buf.rawAddress.toCPointer<ByteVar>())

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt, timeout: ConstPtr<Timespec>): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdMemmem(haystack.rawAddress.toCPointer<ByteVar>(), haystacklen, needle.rawAddress.toCPointer<ByteVar>(), needlelen)?.toLong() ?: 0L)

public actual fun fhopen(fhp: ConstPtr<FhandleT>, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFhopen(fhp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun fhstat(fhp: ConstPtr<Fhandle>, buf: MutPtr<Stat>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFhstat(fhp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun fhstatfs(fhp: ConstPtr<FhandleT>, buf: MutPtr<Statfs>): CInt =
    libcUnixBsdFreebsdlikeFreebsdFhstatfs(fhp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())

public actual fun getfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdGetfh(path.rawAddress.toCPointer<ByteVar>(), fhp.rawAddress.toCPointer<ByteVar>())

public actual fun lgetfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdLgetfh(path.rawAddress.toCPointer<ByteVar>(), fhp.rawAddress.toCPointer<ByteVar>())

public actual fun getfsstat(buf: MutPtr<Statfs>, bufsize: CLong, mode: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdGetfsstat(buf.rawAddress.toCPointer<ByteVar>(), bufsize, mode)

public actual fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mode: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdGetmntinfo(mntbufp.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun mount(type: ConstPtr<CChar>, dir: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>): CInt =
    libcUnixBsdFreebsdlikeFreebsdMount(type.rawAddress.toCPointer<ByteVar>(), dir.rawAddress.toCPointer<ByteVar>(), flags, data.rawAddress.toCPointer<ByteVar>())

public actual fun nmount(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdNmount(iov.rawAddress.toCPointer<ByteVar>(), niov, flags)

public actual fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcUnixBsdFreebsdlikeFreebsdSetproctitle(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun rfork(flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdRfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<CpusetT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCpusetGetaffinity(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<CpusetT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCpusetSetaffinity(level, which, id, setsize, mask.rawAddress.toCPointer<ByteVar>())

public actual fun cpuset(setid: MutPtr<CpusetidT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCpuset(setid.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr<CpusetidT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCpusetGetid(level, which, id, setid.rawAddress.toCPointer<ByteVar>())

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    libcUnixBsdFreebsdlikeFreebsdCpusetSetid(which, id, setid)

public actual fun capEnter(): CInt =
    libcUnixBsdFreebsdlikeFreebsdCapEnter()

public actual fun capGetmode(modep: MutPtr<CUint>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCapGetmode(modep.rawAddress.toCPointer<ByteVar>())

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr<UInt>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCapFcntlsGet(fd, fcntlrightsp.rawAddress.toCPointer<ByteVar>())

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdCapFcntlsLimit(fd, fcntlrights)

public actual fun capIoctlsGet(fd: CInt, cmds: MutPtr<ULong>, maxcmds: ULong): Long =
    libcUnixBsdFreebsdlikeFreebsdCapIoctlsGet(fd, cmds.rawAddress.toCPointer<ByteVar>(), maxcmds)

public actual fun capIoctlsLimit(fd: CInt, cmds: ConstPtr<ULong>, ncmds: ULong): CInt =
    libcUnixBsdFreebsdlikeFreebsdCapIoctlsLimit(fd, cmds.rawAddress.toCPointer<ByteVar>(), ncmds)

public actual fun capRightsInit(version: CInt, rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdCapRightsInit(version, rights.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr<CapRightsT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCapRightsGet(version, fd, rightsp.rawAddress.toCPointer<ByteVar>())

public actual fun capRightsSet(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdCapRightsSet(rights.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun capRightsClear(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdCapRightsClear(rights.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)?.toLong() ?: 0L)

public actual fun capRightsIsSet(rights: ConstPtr<CapRightsT>, vararg variadicArgs: Long): Boolean =
    libcUnixBsdFreebsdlikeFreebsdCapRightsIsSet(rights.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun capRightsIsValid(rights: ConstPtr<CapRightsT>): Boolean =
    libcUnixBsdFreebsdlikeFreebsdCapRightsIsValid(rights.rawAddress.toCPointer<ByteVar>())

public actual fun capRightsLimit(fd: CInt, rights: ConstPtr<CapRightsT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdCapRightsLimit(fd, rights.rawAddress.toCPointer<ByteVar>())

public actual fun capRightsMerge(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdCapRightsMerge(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun capRightsRemove(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdCapRightsRemove(dst.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun capRightsContains(big: ConstPtr<CapRightsT>, little: ConstPtr<CapRightsT>): Boolean =
    libcUnixBsdFreebsdlikeFreebsdCapRightsContains(big.rawAddress.toCPointer<ByteVar>(), little.rawAddress.toCPointer<ByteVar>())

public actual fun capSandboxed(): Boolean =
    libcUnixBsdFreebsdlikeFreebsdCapSandboxed()

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun ffs(value: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFfs(value)

public actual fun ffsl(value: CLong): CInt =
    libcUnixBsdFreebsdlikeFreebsdFfsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    libcUnixBsdFreebsdlikeFreebsdFfsll(value)

public actual fun fls(value: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFls(value)

public actual fun flsl(value: CLong): CInt =
    libcUnixBsdFreebsdlikeFreebsdFlsl(value)

public actual fun flsll(value: CLonglong): CInt =
    libcUnixBsdFreebsdlikeFreebsdFlsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr<CVoid>, opt: ConstPtr<CChar>) {
    libcUnixBsdFreebsdlikeFreebsdMallocStatsPrint(0L.toCPointer<ByteVar>(), cbopaque.rawAddress.toCPointer<ByteVar>(), opt.rawAddress.toCPointer<ByteVar>())
}

public actual fun mallctl(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdMallctl(name.rawAddress.toCPointer<ByteVar>(), oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun mallctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<SizeT>, miplen: MutPtr<SizeT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdMallctlnametomib(name.rawAddress.toCPointer<ByteVar>(), mibp.rawAddress.toCPointer<ByteVar>(), miplen.rawAddress.toCPointer<ByteVar>())

public actual fun mallctlbymib(mib: ConstPtr<SizeT>, mible: SizeT, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdMallctlbymib(mib.rawAddress.toCPointer<ByteVar>(), mible, oldp.rawAddress.toCPointer<ByteVar>(), oldlenp.rawAddress.toCPointer<ByteVar>(), newp.rawAddress.toCPointer<ByteVar>(), newlen)

public actual fun mallocx(size: SizeT, flags: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdMallocx(size, flags)?.toLong() ?: 0L)

public actual fun rallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdRallocx(ptr.rawAddress.toCPointer<ByteVar>(), size, flags)?.toLong() ?: 0L)

public actual fun xallocx(ptr: MutPtr<CVoid>, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    libcUnixBsdFreebsdlikeFreebsdXallocx(ptr.rawAddress.toCPointer<ByteVar>(), size, extra, flags)

public actual fun sallocx(ptr: ConstPtr<CVoid>, flags: CInt): SizeT =
    libcUnixBsdFreebsdlikeFreebsdSallocx(ptr.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun dallocx(ptr: MutPtr<CVoid>, flags: CInt) {
    libcUnixBsdFreebsdlikeFreebsdDallocx(ptr.rawAddress.toCPointer<ByteVar>(), flags)
}

public actual fun sdallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt) {
    libcUnixBsdFreebsdlikeFreebsdSdallocx(ptr.rawAddress.toCPointer<ByteVar>(), size, flags)
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    libcUnixBsdFreebsdlikeFreebsdNallocx(size, flags)

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcctl(idtype, id, cmd, data.rawAddress.toCPointer<ByteVar>())

public actual fun getpagesize(): CInt =
    libcUnixBsdFreebsdlikeFreebsdGetpagesize()

public actual fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdGetpagesizes(pagesize.rawAddress.toCPointer<ByteVar>(), nelem)

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr<ClockidT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdClockGetcpuclockid2(arg1, arg2, arg3.rawAddress.toCPointer<ByteVar>())

public actual fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdStrchrnul(s.rawAddress.toCPointer<ByteVar>(), c)?.toLong() ?: 0L)

public actual fun shmCreateLargepage(path: ConstPtr<CChar>, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdShmCreateLargepage(path.rawAddress.toCPointer<ByteVar>(), flags, psind, allocPolicy, mode)

public actual fun shmRename(pathFrom: ConstPtr<CChar>, pathTo: ConstPtr<CChar>, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdShmRename(pathFrom.rawAddress.toCPointer<ByteVar>(), pathTo.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixBsdFreebsdlikeFreebsdMemfdCreate(name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun setaudit(auditinfo: ConstPtr<AuditinfoT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSetaudit(auditinfo.rawAddress.toCPointer<ByteVar>())

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdEventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdEventfdRead(fd, value.rawAddress.toCPointer<ByteVar>())

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    libcUnixBsdFreebsdlikeFreebsdEventfdWrite(fd, value)

public actual fun fdatasync(fd: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdFdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdElfAuxInfo(aux, buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun setproctitleFast(fmt: ConstPtr<CChar>, vararg variadicArgs: Long) {
    libcUnixBsdFreebsdlikeFreebsdSetproctitleFast(fmt.rawAddress.toCPointer<ByteVar>(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimingsafeBcmp(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimingsafeMemcmp(a.rawAddress.toCPointer<ByteVar>(), b.rawAddress.toCPointer<ByteVar>(), len)

public actual fun umtxOp(obj: MutPtr<CVoid>, op: CInt, value: CUlong, uaddr: MutPtr<CVoid>, uaddr2: MutPtr<CVoid>): CInt =
    libcUnixBsdFreebsdlikeFreebsdUmtxOp(obj.rawAddress.toCPointer<ByteVar>(), op, value, uaddr.rawAddress.toCPointer<ByteVar>(), uaddr2.rawAddress.toCPointer<ByteVar>())

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    libcUnixBsdFreebsdlikeFreebsdSctpPeeloff(s, id)

public actual fun sctpBindx(s: CInt, addrs: MutPtr<Sockaddr>, num: CInt, tpe: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdSctpBindx(s, addrs.rawAddress.toCPointer<ByteVar>(), num, tpe)

public actual fun sctpConnectx(s: CInt, addrs: ConstPtr<Sockaddr>, addrcnt: CInt, id: MutPtr<SctpAssocT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSctpConnectx(s, addrs.rawAddress.toCPointer<ByteVar>(), addrcnt, id.rawAddress.toCPointer<ByteVar>())

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    libcUnixBsdFreebsdlikeFreebsdSctpGetaddrlen(family)

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSctpGetpaddrs(s, asocid, addrs.rawAddress.toCPointer<ByteVar>())

public actual fun sctpFreepaddrs(addrs: MutPtr<Sockaddr>) {
    libcUnixBsdFreebsdlikeFreebsdSctpFreepaddrs(addrs.rawAddress.toCPointer<ByteVar>())
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSctpGetladdrs(s, asocid, addrs.rawAddress.toCPointer<ByteVar>())

public actual fun sctpFreeladdrs(addrs: MutPtr<Sockaddr>) {
    libcUnixBsdFreebsdlikeFreebsdSctpFreeladdrs(addrs.rawAddress.toCPointer<ByteVar>())
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr<CVoid>, size: MutPtr<SocklenT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdSctpOptInfo(s, id, opt, arg.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun sctpSendv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, addrs: MutPtr<Sockaddr>, addrcnt: CInt, info: MutPtr<CVoid>, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdSctpSendv(sd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, addrs.rawAddress.toCPointer<ByteVar>(), addrcnt, info.rawAddress.toCPointer<ByteVar>(), infolen, infotype, flags)

public actual fun sctpRecvv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<SocklenT>, info: MutPtr<CVoid>, infolen: MutPtr<SocklenT>, infotype: MutPtr<CUint>, flags: MutPtr<CInt>): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdSctpRecvv(sd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, from.rawAddress.toCPointer<ByteVar>(), fromlen.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), infolen.rawAddress.toCPointer<ByteVar>(), infotype.rawAddress.toCPointer<ByteVar>(), flags.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerfdGettime(fd, currValue.rawAddress.toCPointer<ByteVar>())

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerfdSettime(fd, flags, newValue.rawAddress.toCPointer<ByteVar>(), oldValue.rawAddress.toCPointer<ByteVar>())

public actual fun closefrom(lowfd: CInt) {
    libcUnixBsdFreebsdlikeFreebsdClosefrom(lowfd)
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdCloseRange(lowfd, highfd, flags)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    libcUnixBsdFreebsdlikeFreebsdExecvpe(file.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>())

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    libcUnixBsdFreebsdlikeFreebsdKcmp(pid1, pid2, type, idx1, idx2)

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdDlvsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>(), version.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun memstatStrerror(error: CInt): ConstPtr<CChar> =
    ConstPtr(libcUnixBsdFreebsdlikeFreebsdMemstatStrerror(error)?.toLong() ?: 0L)

public actual fun memstatMtlAlloc(): MutPtr<MemoryTypeList> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdMemstatMtlAlloc()?.toLong() ?: 0L)

public actual fun memstatMtlFirst(list: MutPtr<MemoryTypeList>): MutPtr<MemoryType> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdMemstatMtlFirst(list.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun memstatMtlNext(mtp: MutPtr<MemoryType>): MutPtr<MemoryType> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdMemstatMtlNext(mtp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun memstatMtlFind(list: MutPtr<MemoryTypeList>, allocator: CInt, name: ConstPtr<CChar>): MutPtr<MemoryType> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdMemstatMtlFind(list.rawAddress.toCPointer<ByteVar>(), allocator, name.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun memstatMtlFree(list: MutPtr<MemoryTypeList>) {
    libcUnixBsdFreebsdlikeFreebsdMemstatMtlFree(list.rawAddress.toCPointer<ByteVar>())
}

public actual fun memstatMtlGeterror(list: MutPtr<MemoryTypeList>): CInt =
    libcUnixBsdFreebsdlikeFreebsdMemstatMtlGeterror(list.rawAddress.toCPointer<ByteVar>())

public actual fun memstatGetName(mtp: ConstPtr<MemoryType>): ConstPtr<CChar> =
    ConstPtr(libcUnixBsdFreebsdlikeFreebsdMemstatGetName(mtp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kvmDpcpuSetcpu(kd: MutPtr<KvmT>, cpu: CUint): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmDpcpuSetcpu(kd.rawAddress.toCPointer<ByteVar>(), cpu)

public actual fun kvmGetargv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdKvmGetargv(kd.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>(), nchr)?.toLong() ?: 0L)

public actual fun kvmGetcptime(kd: MutPtr<KvmT>, cpTime: MutPtr<CLong>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmGetcptime(kd.rawAddress.toCPointer<ByteVar>(), cpTime.rawAddress.toCPointer<ByteVar>())

public actual fun kvmGetenvv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdKvmGetenvv(kd.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>(), nchr)?.toLong() ?: 0L)

public actual fun kvmGeterr(kd: MutPtr<KvmT>): MutPtr<CChar> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdKvmGeterr(kd.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun kvmGetmaxcpu(kd: MutPtr<KvmT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmGetmaxcpu(kd.rawAddress.toCPointer<ByteVar>())

public actual fun kvmGetncpus(kd: MutPtr<KvmT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmGetncpus(kd.rawAddress.toCPointer<ByteVar>())

public actual fun kvmGetpcpu(kd: MutPtr<KvmT>, cpu: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdKvmGetpcpu(kd.rawAddress.toCPointer<ByteVar>(), cpu)?.toLong() ?: 0L)

public actual fun kvmCounterU64Fetch(kd: MutPtr<KvmT>, base: CUlong): ULong =
    libcUnixBsdFreebsdlikeFreebsdKvmCounterU64Fetch(kd.rawAddress.toCPointer<ByteVar>(), base)

public actual fun kvmGetswapinfo(kd: MutPtr<KvmT>, info: MutPtr<KvmSwap>, maxswap: CInt, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmGetswapinfo(kd.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), maxswap, flags)

public actual fun kvmNative(kd: MutPtr<KvmT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmNative(kd.rawAddress.toCPointer<ByteVar>())

public actual fun kvmNlist(kd: MutPtr<KvmT>, nl: MutPtr<Nlist>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmNlist(kd.rawAddress.toCPointer<ByteVar>(), nl.rawAddress.toCPointer<ByteVar>())

public actual fun kvmNlist2(kd: MutPtr<KvmT>, nl: MutPtr<KvmNlist>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKvmNlist2(kd.rawAddress.toCPointer<ByteVar>(), nl.rawAddress.toCPointer<ByteVar>())

public actual fun kvmReadZpcpu(kd: MutPtr<KvmT>, base: CUlong, buf: MutPtr<CVoid>, size: SizeT, cpu: CInt): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdKvmReadZpcpu(kd.rawAddress.toCPointer<ByteVar>(), base, buf.rawAddress.toCPointer<ByteVar>(), size, cpu)

public actual fun kvmRead2(kd: MutPtr<KvmT>, addr: KvaddrT, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT =
    libcUnixBsdFreebsdlikeFreebsdKvmRead2(kd.rawAddress.toCPointer<ByteVar>(), addr, buf.rawAddress.toCPointer<ByteVar>(), nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt =
    libcUnixBsdFreebsdlikeFreebsdExtattrNamespaceToString(attrnamespace, string.rawAddress.toCPointer<ByteVar>())

public actual fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt =
    libcUnixBsdFreebsdlikeFreebsdExtattrStringToNamespace(string.rawAddress.toCPointer<ByteVar>(), attrnamespace.rawAddress.toCPointer<ByteVar>())

public actual fun realhostname(host: MutPtr<CChar>, hsize: SizeT, ip: ConstPtr<InAddr>): CInt =
    libcUnixBsdFreebsdlikeFreebsdRealhostname(host.rawAddress.toCPointer<ByteVar>(), hsize, ip.rawAddress.toCPointer<ByteVar>())

public actual fun realhostnameSa(host: MutPtr<CChar>, hsize: SizeT, addr: MutPtr<Sockaddr>, addrlen: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdRealhostnameSa(host.rawAddress.toCPointer<ByteVar>(), hsize, addr.rawAddress.toCPointer<ByteVar>(), addrlen)

public actual fun kldIsloaded(name: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKldIsloaded(name.rawAddress.toCPointer<ByteVar>())

public actual fun kldLoad(name: ConstPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdKldLoad(name.rawAddress.toCPointer<ByteVar>())

public actual fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<CInt>): MutPtr<KinfoVmentry> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdKinfoGetvmmap(pid, cntp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hexdump(ptr: ConstPtr<CVoid>, length: CInt, hdr: ConstPtr<CChar>, flags: CInt) {
    libcUnixBsdFreebsdlikeFreebsdHexdump(ptr.rawAddress.toCPointer<ByteVar>(), length, hdr.rawAddress.toCPointer<ByteVar>(), flags)
}

public actual fun humanizeNumber(buf: MutPtr<CChar>, len: SizeT, number: Long, suffix: ConstPtr<CChar>, scale: CInt, flags: CInt): CInt =
    libcUnixBsdFreebsdlikeFreebsdHumanizeNumber(buf.rawAddress.toCPointer<ByteVar>(), len, number, suffix.rawAddress.toCPointer<ByteVar>(), scale, flags)

public actual fun flopen(path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    libcUnixBsdFreebsdlikeFreebsdFlopen(path.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun flopenat(fd: CInt, path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt =
    libcUnixBsdFreebsdlikeFreebsdFlopenat(fd, path.rawAddress.toCPointer<ByteVar>(), flags, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getlocalbase(): ConstPtr<CChar> =
    ConstPtr(libcUnixBsdFreebsdlikeFreebsdGetlocalbase()?.toLong() ?: 0L)

public actual fun pidfileOpen(path: ConstPtr<CChar>, mode: ModeT, pidptr: MutPtr<PidT>): MutPtr<Pidfh> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdPidfileOpen(path.rawAddress.toCPointer<ByteVar>(), mode, pidptr.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pidfileWrite(path: MutPtr<Pidfh>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPidfileWrite(path.rawAddress.toCPointer<ByteVar>())

public actual fun pidfileClose(path: MutPtr<Pidfh>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPidfileClose(path.rawAddress.toCPointer<ByteVar>())

public actual fun pidfileRemove(path: MutPtr<Pidfh>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPidfileRemove(path.rawAddress.toCPointer<ByteVar>())

public actual fun pidfileFileno(path: ConstPtr<Pidfh>): CInt =
    libcUnixBsdFreebsdlikeFreebsdPidfileFileno(path.rawAddress.toCPointer<ByteVar>())

public actual fun procstatOpenSysctl(): MutPtr<Procstat> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatOpenSysctl()?.toLong() ?: 0L)

public actual fun procstatGetfiles(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, mmapped: CInt): MutPtr<FilestatList> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatGetfiles(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), mmapped)?.toLong() ?: 0L)

public actual fun procstatFreefiles(procstat: MutPtr<Procstat>, head: MutPtr<FilestatList>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatFreefiles(procstat.rawAddress.toCPointer<ByteVar>(), head.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatGetprocs(procstat: MutPtr<Procstat>, what: CInt, arg: CInt, count: MutPtr<CUint>): MutPtr<KinfoProc> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatGetprocs(procstat.rawAddress.toCPointer<ByteVar>(), what, arg, count.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun procstatFreeprocs(procstat: MutPtr<Procstat>, p: MutPtr<KinfoProc>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatFreeprocs(procstat.rawAddress.toCPointer<ByteVar>(), p.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatGetvmmap(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<KinfoVmentry> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatGetvmmap(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun procstatFreevmmap(procstat: MutPtr<Procstat>, vmmap: MutPtr<KinfoVmentry>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatFreevmmap(procstat.rawAddress.toCPointer<ByteVar>(), vmmap.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatClose(procstat: MutPtr<Procstat>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatClose(procstat.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatFreeargv(procstat: MutPtr<Procstat>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatFreeargv(procstat.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatFreeenvv(procstat: MutPtr<Procstat>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatFreeenvv(procstat.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatFreegroups(procstat: MutPtr<Procstat>, groups: MutPtr<GidT>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatFreegroups(procstat.rawAddress.toCPointer<ByteVar>(), groups.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatFreeptlwpinfo(procstat: MutPtr<Procstat>, pl: MutPtr<PtraceLwpinfo>) {
    libcUnixBsdFreebsdlikeFreebsdProcstatFreeptlwpinfo(procstat.rawAddress.toCPointer<ByteVar>(), pl.rawAddress.toCPointer<ByteVar>())
}

public actual fun procstatGetargv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatGetargv(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), nchr)?.toLong() ?: 0L)

public actual fun procstatGetenvv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatGetenvv(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), nchr)?.toLong() ?: 0L)

public actual fun procstatGetgroups(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<GidT> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatGetgroups(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), count.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun procstatGetosrel(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, osrelp: MutPtr<CInt>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetosrel(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), osrelp.rawAddress.toCPointer<ByteVar>())

public actual fun procstatGetpathname(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, pathname: MutPtr<CChar>, maxlen: SizeT): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetpathname(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), pathname.rawAddress.toCPointer<ByteVar>(), maxlen)

public actual fun procstatGetrlimit(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, which: CInt, rlimit: MutPtr<Rlimit>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetrlimit(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), which, rlimit.rawAddress.toCPointer<ByteVar>())

public actual fun procstatGetumask(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, maskp: MutPtr<CUshort>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetumask(procstat.rawAddress.toCPointer<ByteVar>(), kp.rawAddress.toCPointer<ByteVar>(), maskp.rawAddress.toCPointer<ByteVar>())

public actual fun procstatOpenCore(filename: ConstPtr<CChar>): MutPtr<Procstat> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatOpenCore(filename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun procstatOpenKvm(nlistf: ConstPtr<CChar>, memf: ConstPtr<CChar>): MutPtr<Procstat> =
    MutPtr(libcUnixBsdFreebsdlikeFreebsdProcstatOpenKvm(nlistf.rawAddress.toCPointer<ByteVar>(), memf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun procstatGetSocketInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, sock: MutPtr<Sockstat>, errbuf: MutPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetSocketInfo(proc.rawAddress.toCPointer<ByteVar>(), fst.rawAddress.toCPointer<ByteVar>(), sock.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>())

public actual fun procstatGetVnodeInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, vn: MutPtr<Vnstat>, errbuf: MutPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetVnodeInfo(proc.rawAddress.toCPointer<ByteVar>(), fst.rawAddress.toCPointer<ByteVar>(), vn.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>())

public actual fun procstatGetPtsInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, pts: MutPtr<Ptsstat>, errbuf: MutPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetPtsInfo(proc.rawAddress.toCPointer<ByteVar>(), fst.rawAddress.toCPointer<ByteVar>(), pts.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>())

public actual fun procstatGetShmInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, shm: MutPtr<Shmstat>, errbuf: MutPtr<CChar>): CInt =
    libcUnixBsdFreebsdlikeFreebsdProcstatGetShmInfo(proc.rawAddress.toCPointer<ByteVar>(), fst.rawAddress.toCPointer<ByteVar>(), shm.rawAddress.toCPointer<ByteVar>(), errbuf.rawAddress.toCPointer<ByteVar>())

public actual fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerCreate(clockId, evp.rawAddress.toCPointer<ByteVar>(), timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerDelete(timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerGetoverrun(timerid.rawAddress.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerGettime(timerid.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt =
    libcUnixBsdFreebsdlikeFreebsdTimerSettime(timerid.rawAddress.toCPointer<ByteVar>(), flags, value.rawAddress.toCPointer<ByteVar>(), ovalue.rawAddress.toCPointer<ByteVar>())

public actual fun devstatGetnumdevs(kd: MutPtr<KvmT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdDevstatGetnumdevs(kd.rawAddress.toCPointer<ByteVar>())

public actual fun devstatGetgeneration(kd: MutPtr<KvmT>): CLong =
    libcUnixBsdFreebsdlikeFreebsdDevstatGetgeneration(kd.rawAddress.toCPointer<ByteVar>())

public actual fun devstatGetversion(kd: MutPtr<KvmT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdDevstatGetversion(kd.rawAddress.toCPointer<ByteVar>())

public actual fun devstatCheckversion(kd: MutPtr<KvmT>): CInt =
    libcUnixBsdFreebsdlikeFreebsdDevstatCheckversion(kd.rawAddress.toCPointer<ByteVar>())

public actual fun devstatSelectdevs(devSelect: MutPtr<MutPtr<DeviceSelection>>, numSelected: MutPtr<CInt>, numSelections: MutPtr<CInt>, selectGeneration: MutPtr<CLong>, currentGeneration: CLong, devices: MutPtr<Devstat>, numdevs: CInt, matches: MutPtr<DevstatMatch>, numMatches: CInt, devSelections: MutPtr<MutPtr<CChar>>, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    0

public actual fun devstatBuildmatch(matchStr: MutPtr<CChar>, matches: MutPtr<MutPtr<DevstatMatch>>, numMatches: MutPtr<CInt>): CInt =
    libcUnixBsdFreebsdlikeFreebsdDevstatBuildmatch(matchStr.rawAddress.toCPointer<ByteVar>(), matches.rawAddress.toCPointer<ByteVar>(), numMatches.rawAddress.toCPointer<ByteVar>())
