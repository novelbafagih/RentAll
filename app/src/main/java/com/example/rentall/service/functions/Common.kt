package com.example.rentall.service.functions

import com.google.firebase.auth.ktx.auth
import com.google.firebase.functions.FirebaseFunctions
import com.google.firebase.functions.ktx.functions
import com.google.firebase.ktx.Firebase
import java.net.URL


val functions = Firebase.functions
val baseUrl = "https://asia-southeast2-reantalin.cloudfunctions.net"
val user = Firebase.auth.currentUser
fun createEndPoint(endPoint: String): URL {
    return URL(baseUrl + endPoint)
}