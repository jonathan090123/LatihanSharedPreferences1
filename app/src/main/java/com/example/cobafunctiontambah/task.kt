package com.example.cobafunctiontambah

data class task(
    var image: String,
    var judul: String,
    var deskripsi: String,
    var date: String,
    var time: String,
    var isStatusStarted: Boolean = false,
    var isStatusEnded: Boolean = false

)
