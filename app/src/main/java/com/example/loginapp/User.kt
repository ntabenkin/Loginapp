package com.example.loginapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize



//User has
//email
//userName
//password
//

@Parcelize
data class User(
    val email:String,
    val userName:String,
    val password:String,
   // val location:String,
    val binAmount:String,
):Parcelable
