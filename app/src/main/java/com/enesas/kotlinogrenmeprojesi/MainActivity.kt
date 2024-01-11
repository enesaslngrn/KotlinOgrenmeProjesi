package com.enesas.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
        println("lovelove")

        var a = 1
        var b = 2

        println(a*b)

        var name ="Enes"
        var yas = 12

        println(name)
        println(yas)

        var isim: String = "Elif"
        var sayi: Int = 23

        println(isim)
        println(sayi)

        var xd: String
        xd = "Ahmet"
        println(xd)

        val x = 5
        println(x *  sayi)

        val myDouble = 3.14
        val myLetter = 'D'
        val myBoolean = true
        val myFloat = 3.14f

        val k: Int = 5
        val t: Double = k.toDouble()

        println(t)

        val myString : String = "xdxdxd"
        println(myString.length)
        println(myString[0])

        val ad: String = "Enes"
        val soyad: String = "Aslangören"

        println("Bu kişinin adı " + ad + ". Soyadı " + soyad)
        println("Benim adım $ad $soyad")

        val stringToInt: String = "10"
        val newInt: Int = stringToInt.toInt()
        println(stringToInt)
        println(newInt)

        println("5" + stringToInt)
        println(5 * newInt)

        var kullaniciGirdisi = "50"
        var kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

 */

        val myArray = arrayOf("Enes", "Aslangören")
        println(myArray[1])
        println(myArray) // arrayOf bu şekilde basılamaz. [Ljava.lang.String;@6cab470 böyle bir sonuç veriyor.
        myArray[1] = "As"
        println(myArray[1])
        println(myArray.size)

        println(myArray.get(0))

        myArray.set(0, "love")
        println(myArray.get(0))

        val numaraDizisi = arrayOf(1,true,"Enes",4)
        println(numaraDizisi.get(1))
        numaraDizisi.set(1, "loyloyloy")
        println(numaraDizisi.get(1))

        val isimListesi = arrayListOf<String>("Enes","Elif","xdxd")

        isimListesi.add(3,"lol")
        println(isimListesi)

        val karisikArrayList = arrayListOf<Any>("Enes",5,true)
        karisikArrayList.add(false)
        println(karisikArrayList)
        karisikArrayList.set(0,"Aslangören")
        println(karisikArrayList)


        println("index 1'de: ${karisikArrayList.get(1)} var")

        val mySet = setOf<Any>(2,2,2,2,2,4,true,"adasdas",'R')
        println(mySet.size)

        mySet.forEach {
            println(it)
        }

        karisikArrayList.forEach {
            println(it)
        }

        val digerSet = hashSetOf<String>()
        println(digerSet)
        digerSet.add("lol")
        digerSet.add("lol")
        digerSet.add("lol")
        digerSet.add("xd")
        digerSet.add("enes")
        println(digerSet)

        digerSet.forEach {
            println(it)
        }

        val yemekDizisi = arrayOf("elma","et","tavuk","makarna")
        val kaloriDizisi = arrayOf(100,300,400,200)

        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("elma",100)
        yemekKaloriMap.put("et",300)
        println(yemekKaloriMap)

        println(yemekKaloriMap.get("et"))

        val yeniMap = hashMapOf<String,Int>("Enes" to 26, "Elif" to 25)
        println(yeniMap.get("Enes"))

        val skor = 5

        if (skor < 5){
            println("gg")
        } else if (skor >= 0 && skor < 20){
            println("lol")
        } else if (skor >= 10 && skor < 20){
            println("bişey yazdırmaz")
        } else{
            println("wow")
        }

        var notSayisi = 0
        var notStringi = ""

        if (notSayisi == 0){
            notStringi = "Kaldın"
        }else if (notSayisi == 1){
            notStringi = "Geçtin"
        }

        println(notStringi)

        when(notSayisi){
            0 -> notStringi = "Kaldın"
            1 -> notStringi = "Geçtin"
        }
        println(notStringi)


        val yenibirArray = arrayOf(5,10,15,20,25,30)
        val q = yenibirArray[0] / 5 + 3
        println(q)

        for (i in yenibirArray){
            println(i / 5 + 3)
        }

        val ekleArray = arrayListOf<Int>()
        for (i in 0..9){ //range böyle veriliyor
            ekleArray.add(i)
        }
        println(ekleArray)

        var i = 0

        while (i< 10){
            println(i)
            i += 1
        }

    }
}