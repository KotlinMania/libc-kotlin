#include <jni.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

#ifndef _WIN32
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/select.h>
#include <sys/ioctl.h>
#include <sys/mman.h>
#include <termios.h>
#include <poll.h>
#include <signal.h>
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/ucred.h>
#endif
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <winsock2.h>
#include <ws2tcpip.h>
#endif

/* --- Sockets --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_socket(
    JNIEnv* env, jclass clazz, jint domain, jint type, jint protocol) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return socket((int)domain, (int)type, (int)protocol);
#else
    return (jint)socket((int)domain, (int)type, (int)protocol);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_bind(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jint addrlen) {
    (void)clazz;
    if (!addr) return -1;
    jbyte buf[128];
    if (addrlen > (jint)sizeof(buf)) return -1;
    (*env)->GetByteArrayRegion(env, addr, 0, addrlen, buf);
#ifndef _WIN32
    return bind((int)fd, (struct sockaddr*)buf, (socklen_t)addrlen);
#else
    return bind((SOCKET)fd, (struct sockaddr*)buf, (int)addrlen);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_connect(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jint addrlen) {
    (void)clazz;
    if (!addr) return -1;
    jbyte buf[128];
    if (addrlen > (jint)sizeof(buf)) return -1;
    (*env)->GetByteArrayRegion(env, addr, 0, addrlen, buf);
#ifndef _WIN32
    return connect((int)fd, (struct sockaddr*)buf, (socklen_t)addrlen);
#else
    return connect((SOCKET)fd, (struct sockaddr*)buf, (int)addrlen);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_listen(
    JNIEnv* env, jclass clazz, jint fd, jint backlog) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return listen((int)fd, (int)backlog);
#else
    return listen((SOCKET)fd, (int)backlog);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_accept(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    jbyte buf[128];
    jint lenVal = (jint)sizeof(buf);
    if (addrlen) {
        (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    }
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = accept((int)fd, addr ? (struct sockaddr*)buf : NULL, addr ? &slen : NULL);
    if (res >= 0) {
        if (addr) {
            (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        }
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
    return res;
#else
    int slen = (int)lenVal;
    SOCKET res = accept((SOCKET)fd, addr ? (struct sockaddr*)buf : NULL, addr ? &slen : NULL);
    if (res != INVALID_SOCKET) {
        if (addr) {
            (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        }
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
    return (jint)res;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getsockopt(
    JNIEnv* env, jclass clazz, jint fd, jint level, jint optname, jbyteArray optval, jintArray optlen) {
    (void)clazz;
    if (!optval || !optlen) return -1;
    jint lenVal = 0;
    (*env)->GetIntArrayRegion(env, optlen, 0, 1, &lenVal);
    if (lenVal <= 0 || lenVal > 512) return -1;
    jbyte buf[512];
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = getsockopt((int)fd, (int)level, (int)optname, buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, optval, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, optlen, 0, 1, &outLen);
    }
    return res;
#else
    int slen = (int)lenVal;
    int res = getsockopt((SOCKET)fd, (int)level, (int)optname, (char*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, optval, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, optlen, 0, 1, &outLen);
    }
    return res;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_setsockopt(
    JNIEnv* env, jclass clazz, jint fd, jint level, jint optname, jbyteArray optval, jint optlen) {
    (void)clazz;
    if (!optval || optlen <= 0 || optlen > 512) return -1;
    jbyte buf[512];
    (*env)->GetByteArrayRegion(env, optval, 0, optlen, buf);
#ifndef _WIN32
    return setsockopt((int)fd, (int)level, (int)optname, buf, (socklen_t)optlen);
#else
    return setsockopt((SOCKET)fd, (int)level, (int)optname, (const char*)buf, (int)optlen);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getsockname(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    if (!addr || !addrlen) return -1;
    jbyte buf[128];
    jint lenVal = 0;
    (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    if (lenVal <= 0 || lenVal > (jint)sizeof(buf)) lenVal = sizeof(buf);
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = getsockname((int)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#else
    int slen = (int)lenVal;
    int res = getsockname((SOCKET)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpeername(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    if (!addr || !addrlen) return -1;
    jbyte buf[128];
    jint lenVal = 0;
    (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    if (lenVal <= 0 || lenVal > (jint)sizeof(buf)) lenVal = sizeof(buf);
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    int res = getpeername((int)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#else
    int slen = (int)lenVal;
    int res = getpeername((SOCKET)fd, (struct sockaddr*)buf, &slen);
    if (res == 0) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, buf);
        jint outLen = (jint)slen;
        (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
    }
    return res;
#endif
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_send(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
#ifndef _WIN32
    ssize_t res = send((int)fd, bytes + offset, (size_t)len, (int)flags);
#else
    int res = send((SOCKET)fd, (const char*)(bytes + offset), (int)len, (int)flags);
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_recv(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
#ifndef _WIN32
    ssize_t res = recv((int)fd, bytes + offset, (size_t)len, (int)flags);
#else
    int res = recv((SOCKET)fd, (char*)(bytes + offset), (int)len, (int)flags);
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, res > 0 ? 0 : JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_sendto(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags, jbyteArray addr, jint addrlen) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
    jbyte addrBuf[128];
    if (addr && addrlen > 0 && addrlen <= (jint)sizeof(addrBuf)) {
        (*env)->GetByteArrayRegion(env, addr, 0, addrlen, addrBuf);
    }
#ifndef _WIN32
    ssize_t res = sendto((int)fd, bytes + offset, (size_t)len, (int)flags,
                         addr ? (struct sockaddr*)addrBuf : NULL, (socklen_t)addrlen);
#else
    int res = sendto((SOCKET)fd, (const char*)(bytes + offset), (int)len, (int)flags,
                     addr ? (struct sockaddr*)addrBuf : NULL, (int)addrlen);
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_recvfrom(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray buf, jint offset, jint len, jint flags, jbyteArray addr, jintArray addrlen) {
    (void)clazz;
    if (!buf || len < 0) return -1;
    jbyte* bytes = (*env)->GetByteArrayElements(env, buf, NULL);
    if (!bytes) return -1;
    jbyte addrBuf[128];
    jint lenVal = sizeof(addrBuf);
    if (addrlen) {
        (*env)->GetIntArrayRegion(env, addrlen, 0, 1, &lenVal);
    }
#ifndef _WIN32
    socklen_t slen = (socklen_t)lenVal;
    ssize_t res = recvfrom((int)fd, bytes + offset, (size_t)len, (int)flags,
                           addr ? (struct sockaddr*)addrBuf : NULL, addr ? &slen : NULL);
    if (res >= 0 && addr) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, addrBuf);
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
#else
    int slen = (int)lenVal;
    int res = recvfrom((SOCKET)fd, (char*)(bytes + offset), (int)len, (int)flags,
                       addr ? (struct sockaddr*)addrBuf : NULL, addr ? &slen : NULL);
    if (res >= 0 && addr) {
        (*env)->SetByteArrayRegion(env, addr, 0, (jsize)slen, addrBuf);
        if (addrlen) {
            jint outLen = (jint)slen;
            (*env)->SetIntArrayRegion(env, addrlen, 0, 1, &outLen);
        }
    }
#endif
    (*env)->ReleaseByteArrayElements(env, buf, bytes, res > 0 ? 0 : JNI_ABORT);
    return (jlong)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_shutdown(
    JNIEnv* env, jclass clazz, jint fd, jint how) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return shutdown((int)fd, (int)how);
#else
    return shutdown((SOCKET)fd, (int)how);
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_socketpair(
    JNIEnv* env, jclass clazz, jint domain, jint type, jint protocol, jintArray sv) {
    (void)clazz;
#ifndef _WIN32
    if (!sv) return -1;
    int fds[2];
    int res = socketpair((int)domain, (int)type, (int)protocol, fds);
    if (res == 0) {
        jint out[2] = { fds[0], fds[1] };
        (*env)->SetIntArrayRegion(env, sv, 0, 2, out);
    }
    return res;
#else
    (void)env; (void)domain; (void)type; (void)protocol; (void)sv;
    errno = ENOSYS;
    return -1;
#endif
}

/* --- Polling & Select --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_poll(
    JNIEnv* env, jclass clazz, jintArray fds, jshortArray events, jshortArray revents, jint nfds, jint timeout) {
    (void)clazz;
#ifndef _WIN32
    if (nfds <= 0 || !fds || !events || !revents) return -1;
    struct pollfd* pfds = (struct pollfd*)malloc(sizeof(struct pollfd) * nfds);
    if (!pfds) return -1;

    jint* fdsArr = (*env)->GetIntArrayElements(env, fds, NULL);
    jshort* eventsArr = (*env)->GetShortArrayElements(env, events, NULL);

    for (int i = 0; i < nfds; i++) {
        pfds[i].fd = fdsArr[i];
        pfds[i].events = eventsArr[i];
        pfds[i].revents = 0;
    }

    int res = poll(pfds, (nfds_t)nfds, (int)timeout);

    if (res >= 0) {
        jshort* reventsArr = (*env)->GetShortArrayElements(env, revents, NULL);
        for (int i = 0; i < nfds; i++) {
            reventsArr[i] = pfds[i].revents;
        }
        (*env)->ReleaseShortArrayElements(env, revents, reventsArr, 0);
    }

    (*env)->ReleaseIntArrayElements(env, fds, fdsArr, JNI_ABORT);
    (*env)->ReleaseShortArrayElements(env, events, eventsArr, JNI_ABORT);
    free(pfds);
    return res;
#else
    (void)env; (void)fds; (void)events; (void)revents; (void)nfds; (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_select(
    JNIEnv* env, jclass clazz, jint nfds, jintArray readfds, jintArray writefds, jintArray exceptfds, jlong timeoutSec, jlong timeoutUsec) {
    (void)clazz;
#ifndef _WIN32
    fd_set rfds, wfds, efds;
    FD_ZERO(&rfds);
    FD_ZERO(&wfds);
    FD_ZERO(&efds);

    int maxfd = 0;
    if (readfds) {
        jsize count = (*env)->GetArrayLength(env, readfds);
        jint* arr = (*env)->GetIntArrayElements(env, readfds, NULL);
        for (int i = 0; i < count; i++) {
            FD_SET(arr[i], &rfds);
            if (arr[i] > maxfd) maxfd = arr[i];
        }
        (*env)->ReleaseIntArrayElements(env, readfds, arr, JNI_ABORT);
    }
    if (writefds) {
        jsize count = (*env)->GetArrayLength(env, writefds);
        jint* arr = (*env)->GetIntArrayElements(env, writefds, NULL);
        for (int i = 0; i < count; i++) {
            FD_SET(arr[i], &wfds);
            if (arr[i] > maxfd) maxfd = arr[i];
        }
        (*env)->ReleaseIntArrayElements(env, writefds, arr, JNI_ABORT);
    }
    if (exceptfds) {
        jsize count = (*env)->GetArrayLength(env, exceptfds);
        jint* arr = (*env)->GetIntArrayElements(env, exceptfds, NULL);
        for (int i = 0; i < count; i++) {
            FD_SET(arr[i], &efds);
            if (arr[i] > maxfd) maxfd = arr[i];
        }
        (*env)->ReleaseIntArrayElements(env, exceptfds, arr, JNI_ABORT);
    }

    struct timeval tv;
    struct timeval* ptv = NULL;
    if (timeoutSec >= 0 && timeoutUsec >= 0) {
        tv.tv_sec = (time_t)timeoutSec;
        tv.tv_usec = (suseconds_t)timeoutUsec;
        ptv = &tv;
    }

    int res = select(nfds > 0 ? nfds : (maxfd + 1),
                     readfds ? &rfds : NULL,
                     writefds ? &wfds : NULL,
                     exceptfds ? &efds : NULL,
                     ptv);
    return res;
#else
    (void)env; (void)nfds; (void)readfds; (void)writefds; (void)exceptfds; (void)timeoutSec; (void)timeoutUsec;
    errno = ENOSYS;
    return -1;
#endif
}

/* --- Terminal Control & Window Sizing --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_ioctl(
    JNIEnv* env, jclass clazz, jint fd, jlong request, jbyteArray argp) {
    (void)clazz;
#ifndef _WIN32
    if (!argp) {
        return ioctl((int)fd, (unsigned long)request, NULL);
    }
    jbyte* bytes = (*env)->GetByteArrayElements(env, argp, NULL);
    int res = ioctl((int)fd, (unsigned long)request, bytes);
    (*env)->ReleaseByteArrayElements(env, argp, bytes, 0);
    return res;
#else
    (void)env; (void)fd; (void)request; (void)argp;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_ioctlTiocgwinsz(
    JNIEnv* env, jclass clazz, jint fd, jshortArray winsize) {
    (void)clazz;
#if !defined(_WIN32) && defined(TIOCGWINSZ)
    if (!winsize) return -1;
    struct winsize ws;
    memset(&ws, 0, sizeof(ws));
    int res = ioctl((int)fd, TIOCGWINSZ, &ws);
    if (res == 0) {
        jshort out[4] = { (jshort)ws.ws_row, (jshort)ws.ws_col, (jshort)ws.ws_xpixel, (jshort)ws.ws_ypixel };
        (*env)->SetShortArrayRegion(env, winsize, 0, 4, out);
    }
    return res;
#else
    (void)env; (void)fd; (void)winsize;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_tcgetattr(
    JNIEnv* env, jclass clazz, jint fd, jbyteArray termiosBytes) {
    (void)clazz;
#ifndef _WIN32
    if (!termiosBytes) return -1;
    struct termios t;
    int res = tcgetattr((int)fd, &t);
    if (res == 0) {
        jsize len = (*env)->GetArrayLength(env, termiosBytes);
        jsize copyLen = len < (jsize)sizeof(t) ? len : (jsize)sizeof(t);
        (*env)->SetByteArrayRegion(env, termiosBytes, 0, copyLen, (const jbyte*)&t);
    }
    return res;
#else
    (void)env; (void)fd; (void)termiosBytes;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_tcsetattr(
    JNIEnv* env, jclass clazz, jint fd, jint optional_actions, jbyteArray termiosBytes) {
    (void)clazz;
#ifndef _WIN32
    if (!termiosBytes) return -1;
    struct termios t;
    memset(&t, 0, sizeof(t));
    jsize len = (*env)->GetArrayLength(env, termiosBytes);
    jsize copyLen = len < (jsize)sizeof(t) ? len : (jsize)sizeof(t);
    (*env)->GetByteArrayRegion(env, termiosBytes, 0, copyLen, (jbyte*)&t);
    return tcsetattr((int)fd, (int)optional_actions, &t);
#else
    (void)env; (void)fd; (void)optional_actions; (void)termiosBytes;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT void JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_cfmakeraw(
    JNIEnv* env, jclass clazz, jbyteArray termiosBytes) {
    (void)clazz;
#ifndef _WIN32
    if (!termiosBytes) return;
    struct termios t;
    memset(&t, 0, sizeof(t));
    jsize len = (*env)->GetArrayLength(env, termiosBytes);
    jsize copyLen = len < (jsize)sizeof(t) ? len : (jsize)sizeof(t);
    (*env)->GetByteArrayRegion(env, termiosBytes, 0, copyLen, (jbyte*)&t);
    cfmakeraw(&t);
    (*env)->SetByteArrayRegion(env, termiosBytes, 0, copyLen, (const jbyte*)&t);
#else
    (void)env; (void)termiosBytes;
#endif
}

/* --- UDS, Memory Locking & Process Syscalls --- */

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpeereid(
    JNIEnv* env, jclass clazz, jint sockfd, jintArray creds) {
    (void)clazz;
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
    if (!creds) return -1;
    uid_t u = 0;
    gid_t g = 0;
    int res = getpeereid((int)sockfd, &u, &g);
    if (res == 0) {
        jint out[2] = { (jint)u, (jint)g };
        (*env)->SetIntArrayRegion(env, creds, 0, 2, out);
    }
    return res;
#elif defined(__linux__) && defined(SO_PEERCRED)
    if (!creds) return -1;
    struct ucred cr;
    memset(&cr, 0, sizeof(cr));
    socklen_t len = sizeof(cr);
    int res = getsockopt((int)sockfd, SOL_SOCKET, SO_PEERCRED, &cr, &len);
    if (res == 0) {
        jint out[2] = { (jint)cr.uid, (jint)cr.gid };
        (*env)->SetIntArrayRegion(env, creds, 0, 2, out);
    }
    return res;
#else
    (void)env; (void)sockfd; (void)creds;
    errno = ENOSYS;
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_mlock(
    JNIEnv* env, jclass clazz, jlong addr, jlong len) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return mlock((const void*)(uintptr_t)addr, (size_t)len);
#else
    return VirtualLock((LPVOID)(uintptr_t)addr, (SIZE_T)len) ? 0 : -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_munlock(
    JNIEnv* env, jclass clazz, jlong addr, jlong len) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return munlock((const void*)(uintptr_t)addr, (size_t)len);
#else
    return VirtualUnlock((LPVOID)(uintptr_t)addr, (SIZE_T)len) ? 0 : -1;
#endif
}

JNIEXPORT jlong JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_sysconf(
    JNIEnv* env, jclass clazz, jint name) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jlong)sysconf((int)name);
#else
    SYSTEM_INFO si;
    GetSystemInfo(&si);
    return (jlong)si.dwPageSize;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getpid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getpid();
#else
    return (jint)GetCurrentProcessId();
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getppid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getppid();
#else
    return -1;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_geteuid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)geteuid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getegid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getegid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getuid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getuid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getgid(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)getgid();
#else
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_kill(
    JNIEnv* env, jclass clazz, jint pid, jint sig) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return kill((pid_t)pid, (int)sig);
#else
    (void)pid; (void)sig; errno = ENOSYS; return -1;
#endif
}
