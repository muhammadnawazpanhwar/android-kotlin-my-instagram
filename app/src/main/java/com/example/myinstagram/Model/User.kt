package com.example.myinstagram.Model

class User {
    private var bio: String = " "
    private var fullname: String = " "
    private var image: String = " "
    private var uid: String = " "
    private var username: String = " "

    constructor(bio: String, fullname: String, image: String,uid: String, username: String){
        this.bio = bio
        this.fullname = fullname
        this.image = image
        this.uid = uid
        this.username = username
    }

    fun getBio(): String{
        return bio
    }
    fun setBio(bio: String){
        this.bio = bio
    }

    fun getFullName(): String{
        return fullname
    }
    fun setFullName(fullname: String){
        this.fullname = fullname
    }

    fun getImage(): String{
        return image
    }
    fun setImage(image: String){
        this.image = image
    }

    fun getUID(): String{
        return uid
    }
    fun setUID(uid: String){
        this.uid = uid
    }

    fun getUserName(): String{
        return username
    }
    fun setUserName(username: String){
        this.username = username
    }
}