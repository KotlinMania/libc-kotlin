// socket_bindings.cpp — N-API wrappers for C socket functions
#include <napi.h>
#include <cerrno>
#include <cstring>

#ifndef _WIN32
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <unistd.h>
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <winsock2.h>
#include <ws2tcpip.h>
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
}
