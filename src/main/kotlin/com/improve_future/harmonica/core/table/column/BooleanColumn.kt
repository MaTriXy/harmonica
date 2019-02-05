package com.improve_future.harmonica.core.table.column


internal class BooleanColumn(name: String) : AbstractColumn(name) {
    override var sqlDefault: String? = null

    var default: Boolean? = null
        set(value) {
            field = value
            sqlDefault = value?.let { if (it) "TRUE" else "FALSE" }
        }
}