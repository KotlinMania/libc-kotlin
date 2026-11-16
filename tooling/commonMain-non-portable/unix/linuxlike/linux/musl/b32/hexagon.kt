// port-lint: source unix/linux_like/linux/musl/b32/hexagon.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.BlkcntT
import io.github.kotlinmania.libc.BlksizeT
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DevT
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.KeyT
import io.github.kotlinmania.libc.ModeT
import io.github.kotlinmania.libc.MsglenT
import io.github.kotlinmania.libc.MsgqnumT
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.UidT

public typealias WcharT = UInt

public typealias Stat64 = io.github.kotlinmania.libc.Stat

public open class Stat(
    public var stDev: DevT,
    public var stIno: CUlonglong,
    public var stMode: CUint,
    public var stNlink: CUint,
    public var stUid: CUint,
    public var stGid: CUint,
    public var stRdev: CUlonglong,
    public var stRdevPadding: CUlong,
    public var stSize: CLonglong,
    public var stBlksize: BlksizeT,
    public var stBlksizePadding: CInt,
    public var stBlocks: BlkcntT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var pad0: UInt,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var pad1: UInt,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var pad2: UInt,
    public var unused: List<CInt>,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class IpcPerm(
    public var key: KeyT,
    public var ipcPermKey: KeyT,
    public var uid: UidT,
    public var gid: GidT,
    public var cuid: UidT,
    public var cgid: GidT,
    public var mode: ModeT,
    public var seq: CUshort,
)

public open class ShmidDs(
    public var shmPerm: io.github.kotlinmania.libc.IpcPerm,
    public var shmSegsz: SizeT,
    public var shmAtime: TimeT,
    public var unused1: CInt,
    public var shmDtime: TimeT,
    public var unused2: CInt,
    public var shmCtime: TimeT,
    public var unused3: CInt,
    public var shmCpid: PidT,
    public var shmLpid: PidT,
    public var shmNattch: CUlong,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public open class MsqidDs(
    public var msgPerm: io.github.kotlinmania.libc.IpcPerm,
    public var msgStime: TimeT,
    public var unused1: CInt,
    public var msgRtime: TimeT,
    public var unused2: CInt,
    public var msgCtime: TimeT,
    public var unused3: CInt,
    public var msgCbytes: CUlong,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var pad1: CUlong,
    public var pad2: CUlong,
)

public val AF_FILE: CInt = 1

public val AF_KCM: CInt = 41

public val AF_MAX: CInt = 43

public val AF_QIPCRTR: CInt = 42

public val EADDRINUSE: CInt = 98

public val EADDRNOTAVAIL: CInt = 99

public val EAFNOSUPPORT: CInt = 97

public val EALREADY: CInt = 114

public val EBADE: CInt = 52

public val EBADMSG: CInt = 74

public val EBADR: CInt = 53

public val EBADRQC: CInt = 56

public val EBADSLT: CInt = 57

public val ECANCELED: CInt = 125

public val ECHRNG: CInt = 44

public val ECONNABORTED: CInt = 103

public val ECONNREFUSED: CInt = 111

public val ECONNRESET: CInt = 104

public val EDEADLK: CInt = 35

public val EDEADLOCK: CInt = 35

public val EDESTADDRREQ: CInt = 89

public val EDQUOT: CInt = 122

public val EHOSTDOWN: CInt = 112

public val EHOSTUNREACH: CInt = 113

public val EHWPOISON: CInt = 133

public val EIDRM: CInt = 43

public val EILSEQ: CInt = 84

public val EINPROGRESS: CInt = 115

public val EISCONN: CInt = 106

public val EISNAM: CInt = 120

public val EKEYEXPIRED: CInt = 127

public val EKEYREJECTED: CInt = 129

public val EKEYREVOKED: CInt = 128

public val EL2HLT: CInt = 51

public val EL2NSYNC: CInt = 45

public val EL3HLT: CInt = 46

public val EL3RST: CInt = 47

public val ELIBACC: CInt = 79

public val ELIBBAD: CInt = 80

public val ELIBEXEC: CInt = 83

public val ELIBMAX: CInt = 82

public val ELIBSCN: CInt = 81

public val ELNRNG: CInt = 48

public val ELOOP: CInt = 40

public val EMEDIUMTYPE: CInt = 124

public val EMSGSIZE: CInt = 90

public val EMULTIHOP: CInt = 72

public val ENAMETOOLONG: CInt = 36

public val ENAVAIL: CInt = 119

public val ENETDOWN: CInt = 100

public val ENETRESET: CInt = 102

public val ENETUNREACH: CInt = 101

public val ENOANO: CInt = 55

public val ENOBUFS: CInt = 105

public val ENOCSI: CInt = 50

public val ENOKEY: CInt = 126

public val ENOLCK: CInt = 37

public val ENOMEDIUM: CInt = 123

public val ENOMSG: CInt = 42

public val ENOPROTOOPT: CInt = 92

public val ENOSYS: CInt = 38

public val ENOTCONN: CInt = 107

public val ENOTEMPTY: CInt = 39

public val ENOTNAM: CInt = 118

public val ENOTRECOVERABLE: CInt = 131

public val ENOTSOCK: CInt = 88

public val ENOTSUP: CInt = 95

public val ENOTUNIQ: CInt = 76

public val EOPNOTSUPP: CInt = 95

public val EOVERFLOW: CInt = 75

public val EOWNERDEAD: CInt = 130

public val EPFNOSUPPORT: CInt = 96

public val EREMCHG: CInt = 78

public val ERESTART: CInt = 85

public val ERFKILL: CInt = 132

public val ESHUTDOWN: CInt = 108

public val ESOCKTNOSUPPORT: CInt = 94

public val ESTALE: CInt = 116

public val ESTRPIPE: CInt = 86

public val ETOOMANYREFS: CInt = 109

public val ETIMEDOUT: CInt = 110

public val EUCLEAN: CInt = 117

public val EUNATCH: CInt = 49

public val EUSERS: CInt = 87

public val EXFULL: CInt = 54

public val EXTPROC: CInt = 65536

public val F_EXLCK: CInt = 4

public val F_GETLK: CInt = 12

public val F_GETOWN: CInt = 9

public val F_GETOWNER_UIDS: CInt = 17

public val F_GETOWN_EX: CInt = 16

public val F_GETSIG: CInt = 11

public val F_LINUX_SPECIFIC_BASE: CInt = 1024

public val FLUSHO: CInt = 4096

public val F_OWNER_PGRP: CInt = 2

public val F_OWNER_PID: CInt = 1

public val F_OWNER_TID: CInt = 0

public val F_SETLK: CInt = 13

public val F_SETLKW: CInt = 14

public val F_SETOWN: CInt = 8

public val F_SETOWN_EX: CInt = 15

public val F_SETSIG: CInt = 10

public val F_SHLCK: CInt = 8

public val IEXTEN: CInt = 32768

public val MAP_ANON: CInt = 32

public val MAP_DENYWRITE: CInt = 2048

public val MAP_EXECUTABLE: CInt = 4096

public val MAP_GROWSDOWN: CInt = 256

public val MAP_HUGETLB: CInt = 262144

public val MAP_LOCKED: CInt = 8192

public val MAP_NONBLOCK: CInt = 65536

public val MAP_NORESERVE: CInt = 16384

public val MAP_POPULATE: CInt = 32768

public val MAP_STACK: CInt = 131072

public val MAP_UNINITIALIZED: CInt = 0

public val O_APPEND: CInt = 1024

public val O_ASYNC: CInt = 8192

public val O_CREAT: CInt = 64

public val O_DIRECT: CInt = 16384

public val O_DIRECTORY: CInt = 65536

public val O_DSYNC: CInt = 4096

public val O_EXCL: CInt = 128

public val O_LARGEFILE: CInt = 32768

public val O_NOCTTY: CInt = 256

public val O_NOFOLLOW: CInt = 131072

public val O_NONBLOCK: CInt = 2048

public val O_SYNC: CInt = 1052672

public val PF_FILE: CInt = 1

public val PF_KCM: CInt = 41

public val PF_MAX: CInt = 43

public val PF_QIPCRTR: CInt = 42

public val SA_ONSTACK: CInt = 0x08000000

public val SA_SIGINFO: CInt = 0x00000004

public val SA_NOCLDWAIT: CInt = 0x00000002

public val SIGBUS: CInt = 7

public val SIGCHLD: CInt = 17

public val SIGCONT: CInt = 18

public val SIGIO: CInt = 29

public val SIGPOLL: CInt = 29

public val SIGPROF: CInt = 27

public val SIGPWR: CInt = 30

public val SIGSTKFLT: CInt = 16

public val SIGSTKSZ: SizeT = 8192uL

public val MINSIGSTKSZ: SizeT = 2048uL

public val SIGSTOP: CInt = 19

public val SIGSYS: CInt = 31

public val SIGTSTP: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGURG: CInt = 23

public val SIGUSR1: CInt = 10

public val SIGUSR2: CInt = 12

public val SIGVTALRM: CInt = 26

public val SIGWINCH: CInt = 28

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIG_SETMASK: CInt = 2

// Note(musl) check these
public val SIG_BLOCK: CInt = 0x000000

public val SIG_UNBLOCK: CInt = 0x01

public val SOL_CAIF: CInt = 278

public val SOL_IUCV: CInt = 277

public val SOL_KCM: CInt = 281

public val SOL_NFC: CInt = 280

public val SOL_PNPIPE: CInt = 275

public val SOL_PPPOL2TP: CInt = 273

public val SOL_RDS: CInt = 276

public val SOL_RXRPC: CInt = 272

public val SYS3264_FADVISE64: CInt = 223

public val SYS3264_FCNTL: CInt = 25

public val SYS3264_FSTATAT: CInt = 79

public val SYS3264_FSTAT: CInt = 80

public val SYS3264_FSTATFS: CInt = 44

public val SYS3264_FTRUNCATE: CInt = 46

public val SYS3264_LSEEK: CInt = 62

public val SYS3264_LSTAT: CInt = 1039

public val SYS3264_MMAP: CInt = 222

public val SYS3264_SENDFILE: CInt = 71

public val SYS3264_STAT: CInt = 1038

public val SYS3264_STATFS: CInt = 43

public val SYS3264_TRUNCATE: CInt = 45

public val SYS_ACCEPT4: CInt = 242

public val SYS_ACCEPT: CInt = 202

public val SYS_ACCESS: CInt = 1033

public val SYS_ACCT: CInt = 89

public val SYS_ADD_KEY: CInt = 217

public val SYS_ADJTIMEX: CInt = 171

public val SYS_ALARM: CInt = 1059

public val SYS_ARCH_SPECIFIC_SYSCALL: CInt = 244

public val SYS_BDFLUSH: CInt = 1075

public val SYS_BIND: CInt = 200

public val SYS_BPF: CInt = 280

public val SYS_BRK: CInt = 214

public val SYS_CAPGET: CInt = 90

public val SYS_CAPSET: CInt = 91

public val SYS_CHDIR: CInt = 49

public val SYS_CHMOD: CInt = 1028

public val SYS_CHOWN: CInt = 1029

public val SYS_CHROOT: CInt = 51

public val SYS_CLOCK_ADJTIME: CInt = 266

public val SYS_CLOCK_GETRES: CInt = 114

public val SYS_CLOCK_GETTIME: CInt = 113

public val SYS_CLOCK_NANOSLEEP: CInt = 115

public val SYS_CLOCK_SETTIME: CInt = 112

public val SYS_CLONE: CInt = 220

public val SYS_CLOSE: CInt = 57

public val SYS_CONNECT: CInt = 203

public val SYS_COPY_FILE_RANGE: CInt = -1

// Note(hexagon)
public val SYS_CREAT: CInt = 1064

public val SYS_DELETE_MODULE: CInt = 106

public val SYS_DUP2: CInt = 1041

public val SYS_DUP3: CInt = 24

public val SYS_DUP: CInt = 23

public val SYS_EPOLL_CREATE1: CInt = 20

public val SYS_EPOLL_CREATE: CInt = 1042

public val SYS_EPOLL_CTL: CInt = 21

public val SYS_EPOLL_PWAIT: CInt = 22

public val SYS_EPOLL_WAIT: CInt = 1069

public val SYS_EVENTFD2: CInt = 19

public val SYS_EVENTFD: CInt = 1044

public val SYS_EXECVEAT: CInt = 281

public val SYS_EXECVE: CInt = 221

public val SYS_EXIT: CInt = 93

public val SYS_EXIT_GROUP: CInt = 94

public val SYS_FACCESSAT: CInt = 48

public val SYS_FADVISE64_64: CInt = 223

public val SYS_FALLOCATE: CInt = 47

public val SYS_FANOTIFY_INIT: CInt = 262

public val SYS_FANOTIFY_MARK: CInt = 263

public val SYS_FCHDIR: CInt = 50

public val SYS_FCHMODAT: CInt = 53

public val SYS_FCHMOD: CInt = 52

public val SYS_FCHOWNAT: CInt = 54

public val SYS_FCHOWN: CInt = 55

public val SYS_FCNTL64: CInt = 25

public val SYS_FCNTL: CInt = 25

public val SYS_FDATASYNC: CInt = 83

public val SYS_FGETXATTR: CInt = 10

public val SYS_FINIT_MODULE: CInt = 273

public val SYS_FLISTXATTR: CInt = 13

public val SYS_FLOCK: CInt = 32

public val SYS_FORK: CInt = 1079

public val SYS_FREMOVEXATTR: CInt = 16

public val SYS_FSETXATTR: CInt = 7

public val SYS_FSTAT64: CInt = 80

public val SYS_FSTATAT64: CInt = 79

public val SYS_FSTATFS64: CInt = 44

public val SYS_FSTATFS: CInt = 44

public val SYS_FSYNC: CInt = 82

public val SYS_FTRUNCATE64: CInt = 46

public val SYS_FTRUNCATE: CInt = 46

public val SYS_FUTEX: CInt = 98

public val SYS_FUTIMESAT: CInt = 1066

public val SYS_GETCPU: CInt = 168

public val SYS_GETCWD: CInt = 17

public val SYS_GETDENTS64: CInt = 61

public val SYS_GETDENTS: CInt = 1065

public val SYS_GETEGID: CInt = 177

public val SYS_GETEUID: CInt = 175

public val SYS_GETGID: CInt = 176

public val SYS_GETGROUPS: CInt = 158

public val SYS_GETITIMER: CInt = 102

public val SYS_GET_MEMPOLICY: CInt = 236

public val SYS_GETPEERNAME: CInt = 205

public val SYS_GETPGID: CInt = 155

public val SYS_GETPGRP: CInt = 1060

public val SYS_GETPID: CInt = 172

public val SYS_GETPPID: CInt = 173

public val SYS_GETPRIORITY: CInt = 141

public val SYS_GETRANDOM: CInt = 278

public val SYS_GETRESGID: CInt = 150

public val SYS_GETRESUID: CInt = 148

public val SYS_GETRLIMIT: CInt = 163

public val SYS_GET_ROBUST_LIST: CInt = 100

public val SYS_GETRUSAGE: CInt = 165

public val SYS_GETSID: CInt = 156

public val SYS_GETSOCKNAME: CInt = 204

public val SYS_GETSOCKOPT: CInt = 209

public val SYS_GETTID: CInt = 178

public val SYS_GETTIMEOFDAY: CInt = 169

public val SYS_GETUID: CInt = 174

public val SYS_GETXATTR: CInt = 8

public val SYS_INIT_MODULE: CInt = 105

public val SYS_INOTIFY_ADD_WATCH: CInt = 27

public val SYS_INOTIFY_INIT1: CInt = 26

public val SYS_INOTIFY_INIT: CInt = 1043

public val SYS_INOTIFY_RM_WATCH: CInt = 28

public val SYS_IO_CANCEL: CInt = 3

public val SYS_IOCTL: CInt = 29

public val SYS_IO_DESTROY: CInt = 1

public val SYS_IO_GETEVENTS: CInt = 4

public val SYS_IOPRIO_GET: CInt = 31

public val SYS_IOPRIO_SET: CInt = 30

public val SYS_IO_SETUP: CInt = 0

public val SYS_IO_SUBMIT: CInt = 2

public val SYS_KCMP: CInt = 272

public val SYS_KEXEC_LOAD: CInt = 104

public val SYS_KEYCTL: CInt = 219

public val SYS_KILL: CInt = 129

public val SYS_LCHOWN: CInt = 1032

public val SYS_LGETXATTR: CInt = 9

public val SYS_LINKAT: CInt = 37

public val SYS_LINK: CInt = 1025

public val SYS_LISTEN: CInt = 201

public val SYS_LISTXATTR: CInt = 11

public val SYS_LLISTXATTR: CInt = 12

public val SYS_LLSEEK: CInt = 62

public val SYS_LOOKUP_DCOOKIE: CInt = 18

public val SYS_LREMOVEXATTR: CInt = 15

public val SYS_LSEEK: CInt = 62

public val SYS_LSETXATTR: CInt = 6

public val SYS_LSTAT64: CInt = 1039

public val SYS_LSTAT: CInt = 1039

public val SYS_MADVISE: CInt = 233

public val SYS_MBIND: CInt = 235

public val SYS_MEMFD_CREATE: CInt = 279

public val SYS_MIGRATE_PAGES: CInt = 238

public val SYS_MINCORE: CInt = 232

public val SYS_MKDIRAT: CInt = 34

public val SYS_MKDIR: CInt = 1030

public val SYS_MKNODAT: CInt = 33

public val SYS_MKNOD: CInt = 1027

public val SYS_MLOCKALL: CInt = 230

public val SYS_MLOCK: CInt = 228

public val SYS_MMAP2: CInt = 222

public val SYS_MOUNT: CInt = 40

public val SYS_MOVE_PAGES: CInt = 239

public val SYS_MPROTECT: CInt = 226

public val SYS_MQ_GETSETATTR: CInt = 185

public val SYS_MQ_NOTIFY: CInt = 184

public val SYS_MQ_OPEN: CInt = 180

public val SYS_MQ_TIMEDRECEIVE: CInt = 183

public val SYS_MQ_TIMEDSEND: CInt = 182

public val SYS_MQ_UNLINK: CInt = 181

public val SYS_MREMAP: CInt = 216

public val SYS_MSGCTL: CInt = 187

public val SYS_MSGGET: CInt = 186

public val SYS_MSGRCV: CInt = 188

public val SYS_MSGSND: CInt = 189

public val SYS_MSYNC: CInt = 227

public val SYS_MUNLOCKALL: CInt = 231

public val SYS_MUNLOCK: CInt = 229

public val SYS_MUNMAP: CInt = 215

public val SYS_NAME_TO_HANDLE_AT: CInt = 264

public val SYS_NANOSLEEP: CInt = 101

public val SYS_NEWFSTATAT: CInt = 79

public val SYS_NFSSERVCTL: CInt = 42

public val SYS_OLDWAIT4: CInt = 1072

public val SYS_OPENAT: CInt = 56

public val SYS_OPEN_BY_HANDLE_AT: CInt = 265

public val SYS_OPEN: CInt = 1024

public val SYS_PAUSE: CInt = 1061

public val SYS_PERF_EVENT_OPEN: CInt = 241

public val SYS_PERSONALITY: CInt = 92

public val SYS_PIPE2: CInt = 59

public val SYS_PIPE: CInt = 1040

public val SYS_PIVOT_ROOT: CInt = 41

public val SYS_POLL: CInt = 1068

public val SYS_PPOLL: CInt = 73

public val SYS_PRCTL: CInt = 167

public val SYS_PREAD64: CInt = 67

public val SYS_PREADV: CInt = 69

public val SYS_PRLIMIT64: CInt = 261

public val SYS_PROCESS_VM_READV: CInt = 270

public val SYS_PROCESS_VM_WRITEV: CInt = 271

public val SYS_PSELECT6: CInt = 72

public val SYS_PTRACE: CInt = 117

public val SYS_PWRITE64: CInt = 68

public val SYS_PWRITEV: CInt = 70

public val SYS_QUOTACTL: CInt = 60

public val SYS_READAHEAD: CInt = 213

public val SYS_READ: CInt = 63

public val SYS_READLINKAT: CInt = 78

public val SYS_READLINK: CInt = 1035

public val SYS_READV: CInt = 65

public val SYS_REBOOT: CInt = 142

public val SYS_RECV: CInt = 1073

public val SYS_RECVFROM: CInt = 207

public val SYS_RECVMMSG: CInt = 243

public val SYS_RECVMSG: CInt = 212

public val SYS_REMAP_FILE_PAGES: CInt = 234

public val SYS_REMOVEXATTR: CInt = 14

public val SYS_RENAMEAT2: CInt = 276

public val SYS_RENAMEAT: CInt = 38

public val SYS_RENAME: CInt = 1034

public val SYS_REQUEST_KEY: CInt = 218

public val SYS_RESTART_SYSCALL: CInt = 128

public val SYS_RMDIR: CInt = 1031

public val SYS_RT_SIGACTION: CInt = 134

public val SYS_RT_SIGPENDING: CInt = 136

public val SYS_RT_SIGPROCMASK: CInt = 135

public val SYS_RT_SIGQUEUEINFO: CInt = 138

public val SYS_RT_SIGRETURN: CInt = 139

public val SYS_RT_SIGSUSPEND: CInt = 133

public val SYS_RT_SIGTIMEDWAIT: CInt = 137

public val SYS_RT_TGSIGQUEUEINFO: CInt = 240

public val SYS_SCHED_GETAFFINITY: CInt = 123

public val SYS_SCHED_GETATTR: CInt = 275

public val SYS_SCHED_GETPARAM: CInt = 121

public val SYS_SCHED_GET_PRIORITY_MAX: CInt = 125

public val SYS_SCHED_GET_PRIORITY_MIN: CInt = 126

public val SYS_SCHED_GETSCHEDULER: CInt = 120

public val SYS_SCHED_RR_GET_INTERVAL: CInt = 127

public val SYS_SCHED_SETAFFINITY: CInt = 122

public val SYS_SCHED_SETATTR: CInt = 274

public val SYS_SCHED_SETPARAM: CInt = 118

public val SYS_SCHED_SETSCHEDULER: CInt = 119

public val SYS_SCHED_YIELD: CInt = 124

public val SYS_SECCOMP: CInt = 277

public val SYS_SELECT: CInt = 1067

public val SYS_SEMCTL: CInt = 191

public val SYS_SEMGET: CInt = 190

public val SYS_SEMOP: CInt = 193

public val SYS_SEMTIMEDOP: CInt = 192

public val SYS_SEND: CInt = 1074

public val SYS_SENDFILE64: CInt = 71

public val SYS_SENDFILE: CInt = 71

public val SYS_SENDMMSG: CInt = 269

public val SYS_SENDMSG: CInt = 211

public val SYS_SENDTO: CInt = 206

public val SYS_SETDOMAINNAME: CInt = 162

public val SYS_SETFSGID: CInt = 152

public val SYS_SETFSUID: CInt = 151

public val SYS_SETGID: CInt = 144

public val SYS_SETGROUPS: CInt = 159

public val SYS_SETHOSTNAME: CInt = 161

public val SYS_SETITIMER: CInt = 103

public val SYS_SET_MEMPOLICY: CInt = 237

public val SYS_SETNS: CInt = 268

public val SYS_SETPGID: CInt = 154

public val SYS_SETPRIORITY: CInt = 140

public val SYS_SETREGID: CInt = 143

public val SYS_SETRESGID: CInt = 149

public val SYS_SETRESUID: CInt = 147

public val SYS_SETREUID: CInt = 145

public val SYS_SETRLIMIT: CInt = 164

public val SYS_SET_ROBUST_LIST: CInt = 99

public val SYS_SETSID: CInt = 157

public val SYS_SETSOCKOPT: CInt = 208

public val SYS_SET_TID_ADDRESS: CInt = 96

public val SYS_SETTIMEOFDAY: CInt = 170

public val SYS_SETUID: CInt = 146

public val SYS_SETXATTR: CInt = 5

public val SYS_SHMAT: CInt = 196

public val SYS_SHMCTL: CInt = 195

public val SYS_SHMDT: CInt = 197

public val SYS_SHMGET: CInt = 194

public val SYS_SHUTDOWN: CInt = 210

public val SYS_SIGALTSTACK: CInt = 132

public val SYS_SIGNALFD4: CInt = 74

public val SYS_SIGNALFD: CInt = 1045

public val SYS_SOCKET: CInt = 198

public val SYS_SOCKETPAIR: CInt = 199

public val SYS_SPLICE: CInt = 76

public val SYS_STAT64: CInt = 1038

public val SYS_STAT: CInt = 1038

public val SYS_STATFS64: CInt = 43

public val SYS_SWAPOFF: CInt = 225

public val SYS_SWAPON: CInt = 224

public val SYS_SYMLINKAT: CInt = 36

public val SYS_SYMLINK: CInt = 1036

public val SYS_SYNC: CInt = 81

public val SYS_SYNC_FILE_RANGE2: CInt = 84

public val SYS_SYNC_FILE_RANGE: CInt = 84

public val SYS_SYNCFS: CInt = 267

public val SYS_SYSCALLS: CInt = 1080

public val SYS_SYSCTL: CInt = 1078

public val SYS_SYSINFO: CInt = 179

public val SYS_SYSLOG: CInt = 116

public val SYS_TEE: CInt = 77

public val SYS_TGKILL: CInt = 131

public val SYS_TIME: CInt = 1062

public val SYS_TIMER_CREATE: CInt = 107

public val SYS_TIMER_DELETE: CInt = 111

public val SYS_TIMERFD_CREATE: CInt = 85

public val SYS_TIMERFD_GETTIME: CInt = 87

public val SYS_TIMERFD_SETTIME: CInt = 86

public val SYS_TIMER_GETOVERRUN: CInt = 109

public val SYS_TIMER_GETTIME: CInt = 108

public val SYS_TIMER_SETTIME: CInt = 110

public val SYS_TIMES: CInt = 153

public val SYS_TKILL: CInt = 130

public val SYS_TRUNCATE64: CInt = 45

public val SYS_TRUNCATE: CInt = 45

public val SYS_UMASK: CInt = 166

public val SYS_UMOUNT2: CInt = 39

public val SYS_UMOUNT: CInt = 1076

public val SYS_UNAME: CInt = 160

public val SYS_UNLINKAT: CInt = 35

public val SYS_UNLINK: CInt = 1026

public val SYS_UNSHARE: CInt = 97

public val SYS_USELIB: CInt = 1077

public val SYS_USTAT: CInt = 1070

public val SYS_UTIME: CInt = 1063

public val SYS_UTIMENSAT: CInt = 88

public val SYS_UTIMES: CInt = 1037

public val SYS_VFORK: CInt = 1071

public val SYS_VHANGUP: CInt = 58

public val SYS_VMSPLICE: CInt = 75

public val SYS_WAIT4: CInt = 260

public val SYS_WAITID: CInt = 95

public val SYS_WRITE: CInt = 64

public val SYS_WRITEV: CInt = 66

public val SYS_STATX: CInt = 291

public val SYS_PIDFD_SEND_SIGNAL: CLong = 424L

public val SYS_IO_URING_SETUP: CLong = 425L

public val SYS_IO_URING_ENTER: CLong = 426L

public val SYS_IO_URING_REGISTER: CLong = 427L

public val SYS_OPEN_TREE: CLong = 428L

public val SYS_MOVE_MOUNT: CLong = 429L

public val SYS_FSOPEN: CLong = 430L

public val SYS_FSCONFIG: CLong = 431L

public val SYS_FSMOUNT: CLong = 432L

public val SYS_FSPICK: CLong = 433L

public val SYS_PIDFD_OPEN: CLong = 434L

public val SYS_CLONE3: CLong = 435L

public val SYS_CLOSE_RANGE: CLong = 436L

public val SYS_OPENAT2: CLong = 437L

public val SYS_PIDFD_GETFD: CLong = 438L

public val SYS_FACCESSAT2: CLong = 439L

public val SYS_PROCESS_MADVISE: CLong = 440L

public val SYS_EPOLL_PWAIT2: CLong = 441L

public val SYS_MOUNT_SETATTR: CLong = 442L

public val TIOCM_LOOP: CInt = 32768

public val TIOCM_OUT1: CInt = 8192

public val TIOCM_OUT2: CInt = 16384

public val TIOCSER_TEMT: CInt = 1

public val TOSTOP: CInt = 256

public val VEOF: CInt = 4

public val VEOL2: CInt = 16

public val VEOL: CInt = 11

public val VMIN: CInt = 6
