// FIR_IDENTICAL
// DIAGNOSTICS: -ERROR_SUPPRESSION
// RENDER_ALL_DIAGNOSTICS_FULL_TEXT
// FILE: Function1.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")
package foo.bar.baz

<!EXPORTING_JS_NAME_CLASH!>@JsExport fun test() = 1<!>

// FILE: Function2.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")
package foo.bar

<!EXPORTING_JS_NAME_CLASH!>@JsExport fun baz() = 1<!>

// FILE: Function3.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")

<!EXPORTING_JS_NAME_CLASH!>@JsExport fun foo() = 1<!>

// FILE: Property1.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")
package foo.bar.baz

<!EXPORTING_JS_NAME_CLASH!>@JsExport @JsName("test") fun bar() = 2<!>

// FILE: Property2.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")
package foo

<!EXPORTING_JS_NAME_CLASH!>@JsExport fun bar() = 2<!>

// FILE: Property3.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")

<!EXPORTING_JS_NAME_CLASH!>@JsExport @JsName("foo") fun bar() = 3<!>

// FILE: Package1.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")
package foo.bar.baz.test

@JsExport fun foo1() = 1

// FILE: Package2.kt
@file:Suppress("OPT_IN_USAGE", "JS_NAME_CLASH")
package foo.bar.baz.test.a.b.c

@JsExport fun foo2() = 1
