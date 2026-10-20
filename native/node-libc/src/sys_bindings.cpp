// sys_bindings.cpp — N-API wrappers for UDS credentials, memory locking, and process syscalls
#include <napi.h>
#include <cerrno>
#include <cstdio>
#include <cstdlib>
#include <cstring>

#ifndef _WIN32
#include <unistd.h>
#include <pwd.h>
#include <sys/utsname.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/mman.h>
#include <signal.h>
#if defined(__APPLE__) || defined(__FreeBSD__) || defined(__NetBSD__) || defined(__OpenBSD__)
#include <sys/ucred.h>
#endif
#include <sys/syscall.h>
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#endif

#ifndef _WIN32
static std::string format_passwd_result(int rc, const struct passwd* res, const struct passwd& pwd) {
    char buf[4096];
    if (rc == 0 && res != nullptr) {
        std::snprintf(
            buf,
            sizeof(buf),
            "0\n1\n%s\n%s\n%u\n%u\n%s\n%s\n%s",
            pwd.pw_name ? pwd.pw_name : "",
            pwd.pw_passwd ? pwd.pw_passwd : "",
            static_cast<unsigned int>(pwd.pw_uid),
            static_cast<unsigned int>(pwd.pw_gid),
            pwd.pw_gecos ? pwd.pw_gecos : "",
            pwd.pw_dir ? pwd.pw_dir : "",
            pwd.pw_shell ? pwd.pw_shell : ""
        );
    } else {
        std::snprintf(buf, sizeof(buf), "%d\n0\n\n\n0\n0\n\n\n", rc);
    }
    return std::string(buf);
}
#endif

void RegisterSysBindings(Napi::Env env, Napi::Object exports) {
    // get_errno()
    exports.Set("get_errno", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        return Napi::Number::New(info.Env(), errno);
    }));

    // uname_fields()
    exports.Set("uname_fields", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        struct utsname u;
        std::memset(&u, 0, sizeof(u));
        if (::uname(&u) != 0) return env.Null();
        char out[2048];
        std::snprintf(out, sizeof(out), "%s\n%s\n%s\n%s\n%s", u.sysname, u.nodename, u.release, u.version, u.machine);
        return Napi::String::New(env, out);
#else
        return env.Null();
#endif
    }));

    // getpwuid_r_str(uid, buflen)
    exports.Set("getpwuid_r_str", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        unsigned int uid = info.Length() > 0 ? static_cast<unsigned int>(info[0].As<Napi::Number>().Int32Value()) : 0;
        size_t len = info.Length() > 1 && info[1].As<Napi::Number>().Int64Value() > 0
            ? static_cast<size_t>(info[1].As<Napi::Number>().Int64Value())
            : 4096;
        char* buf = static_cast<char*>(::malloc(len));
        if (!buf) return Napi::String::New(env, "12\n0\n\n\n0\n0\n\n\n");
        struct passwd pwd;
        std::memset(&pwd, 0, sizeof(pwd));
        struct passwd* res = nullptr;
        int rc = ::getpwuid_r(static_cast<uid_t>(uid), &pwd, buf, len, &res);
        std::string formatted = format_passwd_result(rc, res, pwd);
        ::free(buf);
        return Napi::String::New(env, formatted);
#else
        return Napi::String::New(env, "38\n0\n\n\n0\n0\n\n\n");
#endif
    }));

    // getpwnam_r_str(name, buflen)
    exports.Set("getpwnam_r_str", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
#ifndef _WIN32
        if (info.Length() < 1) return Napi::String::New(env, "22\n0\n\n\n0\n0\n\n\n");
        std::string name = info[0].As<Napi::String>().Utf8Value();
        size_t len = info.Length() > 1 && info[1].As<Napi::Number>().Int64Value() > 0
            ? static_cast<size_t>(info[1].As<Napi::Number>().Int64Value())
            : 4096;
        char* buf = static_cast<char*>(::malloc(len));
        if (!buf) return Napi::String::New(env, "12\n0\n\n\n0\n0\n\n\n");
        struct passwd pwd;
        std::memset(&pwd, 0, sizeof(pwd));
        struct passwd* res = nullptr;
        int rc = ::getpwnam_r(name.c_str(), &pwd, buf, len, &res);
        std::string formatted = format_passwd_result(rc, res, pwd);
        ::free(buf);
        return Napi::String::New(env, formatted);
#else
        return Napi::String::New(env, "38\n0\n\n\n0\n0\n\n\n");
#endif
    }));

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

    // syscall(num, a1, a2, a3, a4, a5, a6)
    exports.Set("syscall", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return Napi::Number::New(env, -1);
        int64_t num = info[0].As<Napi::Number>().Int64Value();
        int64_t a1 = info.Length() > 1 ? info[1].As<Napi::Number>().Int64Value() : 0;
        int64_t a2 = info.Length() > 2 ? info[2].As<Napi::Number>().Int64Value() : 0;
        int64_t a3 = info.Length() > 3 ? info[3].As<Napi::Number>().Int64Value() : 0;
        int64_t a4 = info.Length() > 4 ? info[4].As<Napi::Number>().Int64Value() : 0;
        int64_t a5 = info.Length() > 5 ? info[5].As<Napi::Number>().Int64Value() : 0;
        int64_t a6 = info.Length() > 6 ? info[6].As<Napi::Number>().Int64Value() : 0;
#if defined(__linux__)
        long res = ::syscall((long)num, (long)a1, (long)a2, (long)a3, (long)a4, (long)a5, (long)a6);
        return Napi::Number::New(env, (double)res);
#else
        (void)num; (void)a1; (void)a2; (void)a3; (void)a4; (void)a5; (void)a6;
        errno = ENOSYS;
        return Napi::Number::New(env, -1);
#endif
    }));

    // pidfd_open(pid, flags)
    exports.Set("pidfd_open", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) return Napi::Number::New(env, -1);
        int pid = info[0].As<Napi::Number>().Int32Value();
        int flags = info[1].As<Napi::Number>().Int32Value();
#if defined(__linux__) && defined(SYS_pidfd_open)
        int res = (int)::syscall(SYS_pidfd_open, pid, (unsigned int)flags);
        return Napi::Number::New(env, res);
#else
        (void)pid; (void)flags;
        return Napi::Number::New(env, -1);
#endif
    }));
}
