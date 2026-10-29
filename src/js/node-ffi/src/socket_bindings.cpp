// socket_bindings.cpp — N-API wrappers for C socket functions
#include <napi.h>
#include <cerrno>
#include <cstring>

#ifndef _WIN32
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netdb.h>
#include <dlfcn.h>
#include <unistd.h>
#else
#define WIN32_LEAN_AND_MEAN
#include <winsock2.h>
#include <ws2tcpip.h>
#include <windows.h>
#endif

void RegisterSocketBindings(Napi::Env env, Napi::Object exports) {
    // socket(domain, type, protocol)
    exports.Set("socket", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "socket requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int domain = info[0].As<Napi::Number>().Int32Value();
        int type = info[1].As<Napi::Number>().Int32Value();
        int protocol = info[2].As<Napi::Number>().Int32Value();
#ifndef _WIN32
        int res = ::socket(domain, type, protocol);
#else
        SOCKET res = ::socket(domain, type, protocol);
#endif
        return Napi::Number::New(env, res);
    }));

    // bind(fd, addrBuffer)
    exports.Set("bind", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "bind requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        auto addr = info[1].As<Napi::Uint8Array>();
#ifndef _WIN32
        int res = ::bind(fd, (const struct sockaddr*)addr.Data(), (socklen_t)addr.ByteLength());
#else
        int res = ::bind((SOCKET)fd, (const struct sockaddr*)addr.Data(), (int)addr.ByteLength());
#endif
        return Napi::Number::New(env, res);
    }));

    // connect(fd, addrBuffer)
    exports.Set("connect", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "connect requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        auto addr = info[1].As<Napi::Uint8Array>();
#ifndef _WIN32
        int res = ::connect(fd, (const struct sockaddr*)addr.Data(), (socklen_t)addr.ByteLength());
#else
        int res = ::connect((SOCKET)fd, (const struct sockaddr*)addr.Data(), (int)addr.ByteLength());
#endif
        return Napi::Number::New(env, res);
    }));

    // listen(fd, backlog)
    exports.Set("listen", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "listen requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        int backlog = info[1].As<Napi::Number>().Int32Value();
#ifndef _WIN32
        int res = ::listen(fd, backlog);
#else
        int res = ::listen((SOCKET)fd, backlog);
#endif
        return Napi::Number::New(env, res);
    }));

    // accept(fd) -> { fd: number, addr: Uint8Array }
    exports.Set("accept", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "accept requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        uint8_t addrBuf[128];
        memset(addrBuf, 0, sizeof(addrBuf));
#ifndef _WIN32
        socklen_t addrLen = sizeof(addrBuf);
        int clientFd = ::accept(fd, (struct sockaddr*)addrBuf, &addrLen);
#else
        int addrLen = sizeof(addrBuf);
        SOCKET clientFd = ::accept((SOCKET)fd, (struct sockaddr*)addrBuf, &addrLen);
#endif
        Napi::Object out = Napi::Object::New(env);
        out.Set("fd", Napi::Number::New(env, clientFd));
        if (clientFd >= 0 && addrLen > 0) {
            auto arr = Napi::Uint8Array::New(env, addrLen);
            memcpy(arr.Data(), addrBuf, addrLen);
            out.Set("addr", arr);
        } else {
            out.Set("addr", env.Null());
        }
        return out;
    }));

    // getsockopt(fd, level, optname, maxLen) -> Uint8Array
    exports.Set("getsockopt", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "getsockopt requires at least 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        int level = info[1].As<Napi::Number>().Int32Value();
        int optname = info[2].As<Napi::Number>().Int32Value();
        size_t maxLen = info.Length() >= 4 ? info[3].As<Napi::Number>().Int32Value() : 256;
        if (maxLen > 1024) maxLen = 1024;
        uint8_t buf[1024];
        memset(buf, 0, sizeof(buf));
#ifndef _WIN32
        socklen_t optlen = (socklen_t)maxLen;
        int res = ::getsockopt(fd, level, optname, buf, &optlen);
#else
        int optlen = (int)maxLen;
        int res = ::getsockopt((SOCKET)fd, level, optname, (char*)buf, &optlen);
#endif
        if (res != 0) return env.Null();
        auto out = Napi::Uint8Array::New(env, optlen);
        memcpy(out.Data(), buf, optlen);
        return out;
    }));

    // setsockopt(fd, level, optname, optvalBuffer)
    exports.Set("setsockopt", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 4) {
            Napi::TypeError::New(env, "setsockopt requires 4 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        int level = info[1].As<Napi::Number>().Int32Value();
        int optname = info[2].As<Napi::Number>().Int32Value();
        auto val = info[3].As<Napi::Uint8Array>();
#ifndef _WIN32
        int res = ::setsockopt(fd, level, optname, val.Data(), (socklen_t)val.ByteLength());
#else
        int res = ::setsockopt((SOCKET)fd, level, optname, (const char*)val.Data(), (int)val.ByteLength());
#endif
        return Napi::Number::New(env, res);
    }));

    // shutdown(fd, how)
    exports.Set("shutdown", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "shutdown requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        int how = info[1].As<Napi::Number>().Int32Value();
#ifndef _WIN32
        return Napi::Number::New(env, ::shutdown(fd, how));
#else
        return Napi::Number::New(env, ::shutdown((SOCKET)fd, how));
#endif
    }));

    // send(fd, buffer, flags)
    exports.Set("send", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "send requires at least 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        auto buf = info[1].As<Napi::Uint8Array>();
        int flags = info.Length() >= 3 ? info[2].As<Napi::Number>().Int32Value() : 0;
#ifndef _WIN32
        ssize_t res = ::send(fd, buf.Data(), buf.ByteLength(), flags);
#else
        int res = ::send((SOCKET)fd, (const char*)buf.Data(), (int)buf.ByteLength(), flags);
#endif
        return Napi::Number::New(env, static_cast<double>(res));
    }));

    // recv(fd, len, flags) -> Uint8Array
    exports.Set("recv", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "recv requires at least 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int fd = info[0].As<Napi::Number>().Int32Value();
        size_t len = info[1].As<Napi::Number>().Int64Value();
        int flags = info.Length() >= 3 ? info[2].As<Napi::Number>().Int32Value() : 0;
        auto buf = Napi::Uint8Array::New(env, len);
#ifndef _WIN32
        ssize_t res = ::recv(fd, buf.Data(), len, flags);
#else
        int res = ::recv((SOCKET)fd, (char*)buf.Data(), (int)len, flags);
#endif
        if (res < 0) return env.Null();
        if ((size_t)res < len) {
            auto out = Napi::Uint8Array::New(env, res);
            memcpy(out.Data(), buf.Data(), res);
            return out;
        }
        return buf;
    }));

    // socketpair(domain, type, protocol) -> [fd1, fd2]
    exports.Set("socketpair", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 3) {
            Napi::TypeError::New(env, "socketpair requires 3 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int domain = info[0].As<Napi::Number>().Int32Value();
        int type = info[1].As<Napi::Number>().Int32Value();
        int protocol = info[2].As<Napi::Number>().Int32Value();
        int fds[2];
        if (::socketpair(domain, type, protocol, fds) == 0) {
            Napi::Array arr = Napi::Array::New(env, 2);
            arr.Set(uint32_t(0), Napi::Number::New(env, fds[0]));
            arr.Set(uint32_t(1), Napi::Number::New(env, fds[1]));
            return arr;
        }
        return env.Null();
#else
        (void)info;
        return env.Null();
#endif
    }));

    // sendmsg(fd, nameBuffer, iovBuffer, controlBuffer, flags)
    exports.Set("sendmsg", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 5) return Napi::Number::New(env, -1);
        int fd = info[0].As<Napi::Number>().Int32Value();
        int flags = info[4].As<Napi::Number>().Int32Value();
#ifndef _WIN32
        struct msghdr msg;
        memset(&msg, 0, sizeof(msg));
        struct iovec io;
        if (!info[2].IsNull() && !info[2].IsUndefined()) {
            auto iov = info[2].As<Napi::Uint8Array>();
            io.iov_base = iov.Data();
            io.iov_len = iov.ByteLength();
            msg.msg_iov = &io;
            msg.msg_iovlen = 1;
        }
        if (!info[1].IsNull() && !info[1].IsUndefined()) {
            auto name = info[1].As<Napi::Uint8Array>();
            msg.msg_name = name.Data();
            msg.msg_namelen = name.ByteLength();
        }
        if (!info[3].IsNull() && !info[3].IsUndefined()) {
            auto ctl = info[3].As<Napi::Uint8Array>();
            msg.msg_control = ctl.Data();
            msg.msg_controllen = ctl.ByteLength();
        }
        ssize_t res = ::sendmsg(fd, &msg, flags);
        return Napi::Number::New(env, res);
#else
        (void)fd; (void)flags;
        return Napi::Number::New(env, -1);
#endif
    }));

    // recvmsg(fd, nameBuffer, iovBuffer, controlBuffer, flags) -> { bytes, namelen, controllen, flags }
    exports.Set("recvmsg", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 5) return Napi::Number::New(env, -1);
        int fd = info[0].As<Napi::Number>().Int32Value();
        int flags = info[4].As<Napi::Number>().Int32Value();
#ifndef _WIN32
        struct msghdr msg;
        memset(&msg, 0, sizeof(msg));
        struct iovec io;
        if (!info[2].IsNull() && !info[2].IsUndefined()) {
            auto iov = info[2].As<Napi::Uint8Array>();
            io.iov_base = iov.Data();
            io.iov_len = iov.ByteLength();
            msg.msg_iov = &io;
            msg.msg_iovlen = 1;
        }
        if (!info[1].IsNull() && !info[1].IsUndefined()) {
            auto name = info[1].As<Napi::Uint8Array>();
            msg.msg_name = name.Data();
            msg.msg_namelen = name.ByteLength();
        }
        if (!info[3].IsNull() && !info[3].IsUndefined()) {
            auto ctl = info[3].As<Napi::Uint8Array>();
            msg.msg_control = ctl.Data();
            msg.msg_controllen = ctl.ByteLength();
        }
        ssize_t res = ::recvmsg(fd, &msg, flags);
        Napi::Object out = Napi::Object::New(env);
        out.Set("bytes", Napi::Number::New(env, res));
        out.Set("namelen", Napi::Number::New(env, (double)msg.msg_namelen));
        out.Set("controllen", Napi::Number::New(env, (double)msg.msg_controllen));
        out.Set("flags", Napi::Number::New(env, msg.msg_flags));
        return out;
#else
        (void)fd; (void)flags;
        Napi::Object out = Napi::Object::New(env);
        out.Set("bytes", Napi::Number::New(env, -1));
        return out;
#endif
    }));

    // getaddrinfo_str(hasNode, node, hasServ, serv, hasHints, aiFlags, aiFamily, aiSocktype, aiProtocol)
    exports.Set("getaddrinfo_str", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 9) return Napi::String::New(env, "-1\n0");
        int has_node = info[0].As<Napi::Number>().Int32Value();
        std::string node = info[1].As<Napi::String>().Utf8Value();
        int has_serv = info[2].As<Napi::Number>().Int32Value();
        std::string serv = info[3].As<Napi::String>().Utf8Value();
        int has_hints = info[4].As<Napi::Number>().Int32Value();
        int ai_flags = info[5].As<Napi::Number>().Int32Value();
        int ai_family = info[6].As<Napi::Number>().Int32Value();
        int ai_socktype = info[7].As<Napi::Number>().Int32Value();
        int ai_protocol = info[8].As<Napi::Number>().Int32Value();
#ifdef _WIN32
        static int wsa_inited = 0;
        if (!wsa_inited) { WSADATA wsa; if (WSAStartup(MAKEWORD(2, 2), &wsa) == 0) wsa_inited = 1; }
#endif
        struct addrinfo hints;
        memset(&hints, 0, sizeof(hints));
        if (has_hints) {
            hints.ai_flags = ai_flags;
            int fam = ai_family;
            if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) fam = AF_INET6;
            hints.ai_family = fam;
            hints.ai_socktype = ai_socktype;
            hints.ai_protocol = ai_protocol;
        }
        struct addrinfo* res = nullptr;
        int rc = ::getaddrinfo(
            has_node ? node.c_str() : nullptr,
            has_serv ? serv.c_str() : nullptr,
            has_hints ? &hints : nullptr,
            &res
        );
        char out[16384];
        if (rc != 0) {
            snprintf(out, sizeof(out), "%d\n0", rc);
            return Napi::String::New(env, out);
        }
        int count = 0;
        for (struct addrinfo* p = res; p != nullptr && count < 64; p = p->ai_next) count++;
        size_t pos = (size_t)snprintf(out, sizeof(out), "0\n%d\n", count);
        static const char hex_digits[] = "0123456789abcdef";
        int idx = 0;
        for (struct addrinfo* p = res; p != nullptr && idx < count; p = p->ai_next, idx++) {
            char hex[256];
            size_t hex_pos = 0;
            unsigned int sa_fam = (unsigned int)p->ai_family;
            if (p->ai_addr && p->ai_addrlen >= 2) {
                sa_fam = (unsigned int)p->ai_addr->sa_family;
                const unsigned char* raw = ((const unsigned char*)p->ai_addr) + 2;
                size_t raw_len = (size_t)p->ai_addrlen - 2;
                if (raw_len > 120) raw_len = 120;
                for (size_t b = 0; b < raw_len; b++) {
                    hex[hex_pos++] = hex_digits[(raw[b] >> 4) & 0x0F];
                    hex[hex_pos++] = hex_digits[raw[b] & 0x0F];
                }
            }
            hex[hex_pos] = '\0';
            const char* canon = p->ai_canonname ? p->ai_canonname : "";
            if (pos < sizeof(out)) {
                int n = snprintf(
                    out + pos,
                    sizeof(out) - pos,
                    "%d\t%d\t%d\t%d\t%u\t%u\t%s\t%s\n",
                    p->ai_flags, p->ai_family, p->ai_socktype, p->ai_protocol,
                    (unsigned int)p->ai_addrlen, sa_fam, hex, canon
                );
                if (n > 0) pos += (size_t)n;
            }
        }
        ::freeaddrinfo(res);
        return Napi::String::New(env, out);
    }));

    // getnameinfo_str(saFamily, saDataHex, salen, hostlen, servlen, flags)
    exports.Set("getnameinfo_str", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 6) return Napi::String::New(env, "-1\n\n");
        int sa_family = info[0].As<Napi::Number>().Int32Value();
        std::string chex = info[1].As<Napi::String>().Utf8Value();
        int salen = info[2].As<Napi::Number>().Int32Value();
        int hostlen = info[3].As<Napi::Number>().Int32Value();
        int servlen = info[4].As<Napi::Number>().Int32Value();
        int flags = info[5].As<Napi::Number>().Int32Value();
        char out[2048];
        if (sa_family < 0) {
            snprintf(out, sizeof(out), "%d\n\n", EAI_FAIL);
            return Napi::String::New(env, out);
        }
#ifdef _WIN32
        static int wsa_inited = 0;
        if (!wsa_inited) { WSADATA wsa; if (WSAStartup(MAKEWORD(2, 2), &wsa) == 0) wsa_inited = 1; }
#endif
        struct sockaddr_storage ss;
        memset(&ss, 0, sizeof(ss));
        size_t data_len = chex.size() / 2;
        if (data_len > sizeof(ss) - 2) data_len = sizeof(ss) - 2;
        unsigned char* dst = ((unsigned char*)&ss) + 2;
        auto nibble = [](char c) -> unsigned int {
            if (c >= '0' && c <= '9') return (unsigned int)(c - '0');
            if (c >= 'a' && c <= 'f') return (unsigned int)(c - 'a' + 10);
            if (c >= 'A' && c <= 'F') return (unsigned int)(c - 'A' + 10);
            return 0;
        };
        for (size_t i = 0; i < data_len; i++) {
            dst[i] = (unsigned char)((nibble(chex[i * 2]) << 4) | nibble(chex[i * 2 + 1]));
        }
        int fam = sa_family;
        if (fam == 10 || fam == 23 || fam == 24 || fam == 28 || fam == 30) fam = AF_INET6;
        socklen_t total_len = (socklen_t)(2 + data_len);
        if ((socklen_t)salen > total_len && (size_t)salen <= sizeof(ss)) total_len = (socklen_t)salen;
        if (fam == AF_INET && total_len < (socklen_t)sizeof(struct sockaddr_in)) total_len = (socklen_t)sizeof(struct sockaddr_in);
        else if (fam == AF_INET6 && total_len < (socklen_t)sizeof(struct sockaddr_in6)) total_len = (socklen_t)sizeof(struct sockaddr_in6);
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
        ss.ss_len = (uint8_t)total_len;
        ss.ss_family = (sa_family_t)fam;
#else
        ss.ss_family = (unsigned short)fam;
#endif
        char hbuf[1025];
        char sbuf[64];
        memset(hbuf, 0, sizeof(hbuf));
        memset(sbuf, 0, sizeof(sbuf));
        socklen_t hlen = hostlen > 0 ? ((size_t)hostlen < sizeof(hbuf) ? (socklen_t)hostlen : (socklen_t)(sizeof(hbuf) - 1)) : 0;
        socklen_t slen = servlen > 0 ? ((size_t)servlen < sizeof(sbuf) ? (socklen_t)servlen : (socklen_t)(sizeof(sbuf) - 1)) : 0;
        int rc = ::getnameinfo((const struct sockaddr*)&ss, total_len, hlen > 0 ? hbuf : nullptr, hlen, slen > 0 ? sbuf : nullptr, slen, flags);
        snprintf(out, sizeof(out), "%d\n%s\n%s", rc, rc == 0 ? hbuf : "", rc == 0 ? sbuf : "");
        return Napi::String::New(env, out);
    }));

    exports.Set("gai_strerror", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        int e = info.Length() >= 1 ? info[0].As<Napi::Number>().Int32Value() : 0;
#ifdef _WIN32
        const char* s = ::gai_strerrorA(e);
#else
        const char* s = ::gai_strerror(e);
#endif
        return s ? Napi::String::New(env, s) : env.Null();
    }));

    exports.Set("hstrerror", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        int e = info.Length() >= 1 ? info[0].As<Napi::Number>().Int32Value() : 0;
#if !defined(_WIN32) && !defined(__ANDROID__)
        const char* s = ::hstrerror(e);
#else
        const char* s = (e == 0) ? "Resolver Error 0 (no error)" : (e == 1 ? "Unknown host" : "Unknown resolver error");
#endif
        return s ? Napi::String::New(env, s) : env.Null();
    }));

    exports.Set("res_init", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        typedef int (*res_init_fn)(void);
        res_init_fn fn = (res_init_fn)dlsym(RTLD_DEFAULT, "res_init");
        if (!fn) fn = (res_init_fn)dlsym(RTLD_DEFAULT, "__res_init");
        if (fn) return Napi::Number::New(env, fn());
#endif
        return Napi::Number::New(env, 0);
    }));
}
