// sys_bindings.cpp — N-API wrappers for UDS credentials, memory locking, and process syscalls
#include <napi.h>
#include <cerrno>
#include <cstring>

#ifndef _WIN32
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/mman.h>
#include <signal.h>
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/ucred.h>
#endif
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#endif

void RegisterSysBindings(Napi::Env env, Napi::Object exports) {
    // getpeereid(sockfd) -> { uid: number, gid: number }
    exports.Set("getpeereid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "getpeereid requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int sockfd = info[0].As<Napi::Number>().Int32Value();
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__) || defined(__DragonFly__)
        uid_t u = 0;
        gid_t g = 0;
        int res = ::getpeereid(sockfd, &u, &g);
        if (res == 0) {
            Napi::Object out = Napi::Object::New(env);
            out.Set("uid", Napi::Number::New(env, u));
            out.Set("gid", Napi::Number::New(env, g));
            return out;
        }
        return env.Null();
#elif defined(__linux__) && defined(SO_PEERCRED)
        struct ucred cr;
        memset(&cr, 0, sizeof(cr));
        socklen_t len = sizeof(cr);
        int res = ::getsockopt(sockfd, SOL_SOCKET, SO_PEERCRED, &cr, &len);
        if (res == 0) {
            Napi::Object out = Napi::Object::New(env);
            out.Set("uid", Napi::Number::New(env, cr.uid));
            out.Set("gid", Napi::Number::New(env, cr.gid));
            return out;
        }
        return env.Null();
#else
        (void)sockfd;
        return env.Null();
#endif
    }));

    // mlock(addr, len)
    exports.Set("mlock", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "mlock requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        intptr_t addr = static_cast<intptr_t>(info[0].As<Napi::Number>().Int64Value());
        size_t len = static_cast<size_t>(info[1].As<Napi::Number>().Int64Value());
#ifndef _WIN32
        int res = ::mlock((const void*)addr, len);
#else
        int res = VirtualLock((LPVOID)addr, (SIZE_T)len) ? 0 : -1;
#endif
        return Napi::Number::New(env, res);
    }));

    // munlock(addr, len)
    exports.Set("munlock", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "munlock requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        intptr_t addr = static_cast<intptr_t>(info[0].As<Napi::Number>().Int64Value());
        size_t len = static_cast<size_t>(info[1].As<Napi::Number>().Int64Value());
#ifndef _WIN32
        int res = ::munlock((const void*)addr, len);
#else
        int res = VirtualUnlock((LPVOID)addr, (SIZE_T)len) ? 0 : -1;
#endif
        return Napi::Number::New(env, res);
    }));

    // sysconf(name)
    exports.Set("sysconf", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) {
            Napi::TypeError::New(env, "sysconf requires 1 argument").ThrowAsJavaScriptException();
            return env.Null();
        }
        int name = info[0].As<Napi::Number>().Int32Value();
#ifndef _WIN32
        long res = ::sysconf(name);
#else
        SYSTEM_INFO si;
        GetSystemInfo(&si);
        long res = (long)si.dwPageSize;
#endif
        return Napi::Number::New(env, static_cast<double>(res));
    }));

    // geteuid()
    exports.Set("geteuid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        return Napi::Number::New(env, ::geteuid());
#else
        return Napi::Number::New(env, 0);
#endif
    }));

    // getegid()
    exports.Set("getegid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        return Napi::Number::New(env, ::getegid());
#else
        return Napi::Number::New(env, 0);
#endif
    }));

    // getuid()
    exports.Set("getuid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        return Napi::Number::New(env, ::getuid());
#else
        return Napi::Number::New(env, 0);
#endif
    }));

    // getgid()
    exports.Set("getgid", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        return Napi::Number::New(env, ::getgid());
#else
        return Napi::Number::New(env, 0);
#endif
    }));

    // kill(pid, sig)
    exports.Set("kill", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "kill requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        int pid = info[0].As<Napi::Number>().Int32Value();
        int sig = info[1].As<Napi::Number>().Int32Value();
#ifndef _WIN32
        int res = ::kill(static_cast<pid_t>(pid), sig);
#else
        int res = -1;
#endif
        return Napi::Number::New(env, res);
    }));
}
