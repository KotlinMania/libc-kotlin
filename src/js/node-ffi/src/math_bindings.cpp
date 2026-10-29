// math_bindings.cpp — N-API wrappers for C math.h functions
#include <napi.h>
#include <cmath>

void RegisterMathBindings(Napi::Env env, Napi::Object exports) {
    // ceil
    exports.Set("ceil", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::ceil(x));
    }));

    // floor
    exports.Set("floor", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::floor(x));
    }));

    // round
    exports.Set("round", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::round(x));
    }));

    // sqrt
    exports.Set("sqrt", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::sqrt(x));
    }));

    // pow
    exports.Set("pow", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 2) {
            Napi::TypeError::New(env, "pow requires 2 arguments").ThrowAsJavaScriptException();
            return env.Null();
        }
        double base = info[0].As<Napi::Number>().DoubleValue();
        double exp = info[1].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::pow(base, exp));
    }));

    // abs
    exports.Set("abs", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        int x = info[0].As<Napi::Number>().Int32Value();
        return Napi::Number::New(env, ::abs(x));
    }));

    // fabs
    exports.Set("fabs", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::fabs(x));
    }));

    // sin, cos, tan
    exports.Set("sin", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::sin(x));
    }));

    exports.Set("cos", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::cos(x));
    }));

    exports.Set("tan", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        double x = info[0].As<Napi::Number>().DoubleValue();
        return Napi::Number::New(env, ::tan(x));
    }));

    // ceilf, floorf, roundf (float versions)
    exports.Set("ceilf", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        float x = info[0].As<Napi::Number>().FloatValue();
        return Napi::Number::New(env, ::ceilf(x));
    }));

    exports.Set("floorf", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        float x = info[0].As<Napi::Number>().FloatValue();
        return Napi::Number::New(env, ::floorf(x));
    }));

    exports.Set("roundf", Napi::Function::New(env, [](const Napi::CallbackInfo& info) -> Napi::Value {
        Napi::Env env = info.Env();
        if (info.Length() < 1) return env.Null();
        float x = info[0].As<Napi::Number>().FloatValue();
        return Napi::Number::New(env, ::roundf(x));
    }));
}